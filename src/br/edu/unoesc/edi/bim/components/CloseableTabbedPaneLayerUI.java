/**
 * 
 */
package br.edu.unoesc.edi.bim.components;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.LayerUI;

/**
 * @author Marcelo
 *
 */
public class CloseableTabbedPaneLayerUI extends LayerUI<JTabbedPane> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel p = new JPanel();
	private final Point pt = new Point(-100, -100);
	private final JButton button = new JButton() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(16, 16);
		}
	};
	

	public CloseableTabbedPaneLayerUI() {
		super();
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setFocusPainted(false);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setRolloverEnabled(false);
		button.setIcon(new ImageIcon(CloseableTabbedPane.class.getResource("/images/Delete-16.png")));
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		super.paint(g, c);
		if (c instanceof JLayer) {
			JLayer jlayer = (JLayer) c;
			JTabbedPane tabPane = (JTabbedPane) jlayer.getView();
			for (int i = 0; i < tabPane.getTabCount(); i++) {
				Rectangle rect = tabPane.getBoundsAt(i);
				Dimension d = button.getPreferredSize();
				int x = rect.x + rect.width - d.width - 2;
				int y = rect.y + (rect.height - d.height) / 2;
				Rectangle r = new Rectangle(x, y, d.width, d.height);
				button.setForeground(r.contains(pt) ? Color.RED : Color.BLACK);
				SwingUtilities.paintComponent(g, button, p, r);
			}
		}
	}

	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		((JLayer) c).setLayerEventMask(AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
	}

	@Override
	public void uninstallUI(JComponent c) {
		((JLayer) c).setLayerEventMask(0);
		super.uninstallUI(c);
	}

	@Override
	protected void processMouseEvent(MouseEvent e, JLayer<? extends JTabbedPane> l) {
		if (e.getID() == MouseEvent.MOUSE_CLICKED) {
			pt.setLocation(e.getPoint());
			JTabbedPane tabbedPane = (JTabbedPane) l.getView();
			int index = tabbedPane.indexAtLocation(pt.x, pt.y);
			if (index >= 1) {
				Rectangle rect = tabbedPane.getBoundsAt(index);
				Dimension d = button.getPreferredSize();
				int x = rect.x + rect.width - d.width - 2;
				int y = rect.y + (rect.height - d.height) / 2;
				Rectangle r = new Rectangle(x, y, d.width, d.height);
				if (r.contains(pt)) {
					tabbedPane.removeTabAt(index);
				}
			}
			l.getView().repaint();
		}
	}

	@Override
	protected void processMouseMotionEvent(MouseEvent e, JLayer<? extends JTabbedPane> l) {
		pt.setLocation(e.getPoint());
		JTabbedPane tabbedPane = (JTabbedPane) l.getView();
		int index = tabbedPane.indexAtLocation(pt.x, pt.y);
		if (index >= 0) {
			tabbedPane.repaint(tabbedPane.getBoundsAt(index));
		} else {
			tabbedPane.repaint();
		}
	}
}