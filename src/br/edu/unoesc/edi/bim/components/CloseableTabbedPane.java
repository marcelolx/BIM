package br.edu.unoesc.edi.bim.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.edu.unoesc.edi.bim.ui.TabAluno;

public class CloseableTabbedPane {
	public JComponent makeUI(Rectangle maxBounds) {
		UIManager.put("TabbedPane.tabInsets", new Insets(2, 2, 2, 50));
		final JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(232, 57, maxBounds.width - 238, maxBounds.height - 78);
		


		JPanel p = new JPanel(new BorderLayout());
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setBounds(232, 57, maxBounds.width - 238, maxBounds.height - 78);
		p.add(new JLayer<JTabbedPane>(tabbedPane, new CloseableTabbedPaneLayerUI()));
		/*p.add(new JButton(new AbstractAction("add tab") {
			@Override
			public void actionPerformed(ActionEvent e) {
				tabbedPane.addTab("test", new JPanel());
			}
		}), BorderLayout.SOUTH);*/
		
		TabAluno.tabAluno(tabbedPane);
		
		return p;
	}

	
	
}
