package br.edu.unoesc.edi.bim.components;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Marcelo
 *
 */
public class CloseableTabbedPane {
	/**
	 * 
	 * @param maxBounds Screens size to set JPanel size
	 * @param tabbedPane A esse tabbedpane será setado a opção de fechar o tabbedpane
	 * @return retorna o Panel com o X
	 */
	public JComponent makeUI(Rectangle maxBounds, JTabbedPane tabbedPane) {
		

		JPanel p = new JPanel(new BorderLayout());
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setBounds(232, 57, maxBounds.width - 238, maxBounds.height - 78);
		p.add(new JLayer<JTabbedPane>(tabbedPane, new CloseableTabbedPaneLayerUI()));
		
		return p;
	}

}
