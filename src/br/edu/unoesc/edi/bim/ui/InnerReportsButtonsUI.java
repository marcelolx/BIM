/**
 * 
 */
package br.edu.unoesc.edi.bim.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.ui.tabs.TabStudentsReport;

/**
 * Classe que adiciona os JLabel (Bot�es) no painel de relat�rios.
 * 
 * @author Jonathan
 *
 */
public class InnerReportsButtonsUI {
	public static void init(JPanel panelLeftSideReports, JTabbedPane tabbedPane) {
		JLabel relatorioAlunos = new JLabel();
		relatorioAlunos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				TabStudentsReport.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		relatorioAlunos.setText("Relat�rio de Alunos Cadastrados");
		relatorioAlunos.setBounds(3, 2, panelLeftSideReports.getWidth() - 6,
				getleftReportsPanelsHeight(panelLeftSideReports));
		relatorioAlunos.setOpaque(true);
		relatorioAlunos.setHorizontalAlignment(SwingConstants.CENTER);
		relatorioAlunos
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		relatorioAlunos.setVisible(true);

		panelLeftSideReports.add(relatorioAlunos);
	}

	/**
	 * Get height of panel and return size
	 * 
	 * @param panel
	 * @return
	 */
	private static int getleftReportsPanelsHeight(JPanel panel) {
		int height = panel.getHeight();
		height /= 11;
		return height;
	}

	/**
	 * Retorna a posi��o de cada JLabel pegando a posi��o de cada JLabel soma
	 * com a altura disponibilizada para os bot�es, mais o espa�amento entre os
	 * mesmos
	 * 
	 * @param panel
	 * @param button
	 * @return
	 */
	private static int setReportsButtonsPosition(JPanel panel, JLabel button) {
		int buttonPosition = button.getLocation().y;
		int height = getleftReportsPanelsHeight(panel);

		return buttonPosition + height + 4;
	}
}
