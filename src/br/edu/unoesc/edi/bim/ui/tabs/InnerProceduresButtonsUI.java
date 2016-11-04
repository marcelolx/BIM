/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 * Classe que adiciona os JLabel (Botões) no painel de procedimentos.
 * 
 * @author Marcelo
 *
 */
public class InnerProceduresButtonsUI {
	public static void init(JPanel panelLeftSideProcedures, JTabbedPane tabbedPane) {
		JLabel GuedesHomensEspecifica = new JLabel();
		GuedesHomensEspecifica.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				TabGuedesHomens.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		GuedesHomensEspecifica.setText("Guedes Homens Especifica");
		GuedesHomensEspecifica.setBounds(3, 2, panelLeftSideProcedures.getWidth() - 6,
				getleftProceduresPanelsHeight(panelLeftSideProcedures));
		GuedesHomensEspecifica.setOpaque(true);
		GuedesHomensEspecifica.setHorizontalAlignment(SwingConstants.CENTER);
		GuedesHomensEspecifica
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GuedesHomensEspecifica.setVisible(true);

		JLabel GuedesMulheresEspecifica = new JLabel();
		GuedesMulheresEspecifica.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				TabGuedesMulheres.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		GuedesMulheresEspecifica.setText("Guedes Mulheres Especifica");
		GuedesMulheresEspecifica.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, GuedesHomensEspecifica),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		GuedesMulheresEspecifica.setOpaque(true);
		GuedesMulheresEspecifica.setHorizontalAlignment(SwingConstants.CENTER);
		GuedesMulheresEspecifica
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GuedesMulheresEspecifica.setVisible(true);

		JLabel DuerenbergHomensIdososGordura = new JLabel();
		DuerenbergHomensIdososGordura.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				TabDuerenbergGorduraHomensIdosos.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		DuerenbergHomensIdososGordura.setText("Duerenberg %Gordura Homens Idosos");
		DuerenbergHomensIdososGordura.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, GuedesMulheresEspecifica),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		DuerenbergHomensIdososGordura.setOpaque(true);
		DuerenbergHomensIdososGordura.setHorizontalAlignment(SwingConstants.CENTER);
		DuerenbergHomensIdososGordura
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		DuerenbergHomensIdososGordura.setVisible(true);

		JLabel DurninEWomersleyHomensIdosos = new JLabel();
		DurninEWomersleyHomensIdosos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				TabDurninWomersleyHomensIdosos.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		DurninEWomersleyHomensIdosos.setText("Durnin e Womersley Homens Idosos");
		DurninEWomersleyHomensIdosos.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, DuerenbergHomensIdososGordura),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		DurninEWomersleyHomensIdosos.setOpaque(true);
		DurninEWomersleyHomensIdosos.setHorizontalAlignment(SwingConstants.CENTER);
		DurninEWomersleyHomensIdosos
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		DurninEWomersleyHomensIdosos.setVisible(true);

		JLabel DurninEWomersleyMulheresIdosas = new JLabel();
		DurninEWomersleyMulheresIdosas.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				TabDurninWomersleyMulheresIdosas.init(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);
			}
		});
		DurninEWomersleyMulheresIdosas.setText("Durnin e Womersley Mulheres Idosas");
		DurninEWomersleyMulheresIdosas.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, DurninEWomersleyHomensIdosos),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		DurninEWomersleyMulheresIdosas.setOpaque(true);
		DurninEWomersleyMulheresIdosas.setHorizontalAlignment(SwingConstants.CENTER);
		DurninEWomersleyMulheresIdosas
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		DurninEWomersleyMulheresIdosas.setVisible(true);

		JLabel JacksonPollockHomensAtletas = new JLabel();
		JacksonPollockHomensAtletas.setText("Jackson Pollock Homens atletas 7 DC");
		JacksonPollockHomensAtletas.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, DurninEWomersleyMulheresIdosas),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		JacksonPollockHomensAtletas.setOpaque(true);
		JacksonPollockHomensAtletas.setHorizontalAlignment(SwingConstants.CENTER);
		JacksonPollockHomensAtletas
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JacksonPollockHomensAtletas.setVisible(true);

		JLabel JacksonPollockMulheresAtletas = new JLabel();
		JacksonPollockMulheresAtletas.setText("Jackson Pollock Mulheres atletas 4 DC");
		JacksonPollockMulheresAtletas.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, JacksonPollockHomensAtletas),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		JacksonPollockMulheresAtletas.setOpaque(true);
		JacksonPollockMulheresAtletas.setHorizontalAlignment(SwingConstants.CENTER);
		JacksonPollockMulheresAtletas
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JacksonPollockMulheresAtletas.setVisible(true);

		JLabel GoncalvesMulheresIdosasGordura = new JLabel();
		GoncalvesMulheresIdosasGordura.setText("Gonçalves Mulheres Idosas %Gordura Perimetria");
		GoncalvesMulheresIdosasGordura.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, JacksonPollockMulheresAtletas),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		GoncalvesMulheresIdosasGordura.setOpaque(true);
		GoncalvesMulheresIdosasGordura.setHorizontalAlignment(SwingConstants.CENTER);
		GoncalvesMulheresIdosasGordura
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GoncalvesMulheresIdosasGordura.setVisible(true);

		JLabel PetroskiHomens18a66anos = new JLabel();
		PetroskiHomens18a66anos.setText("Petroski Homens 18 a 66 anos");
		PetroskiHomens18a66anos.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, GoncalvesMulheresIdosasGordura),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		PetroskiHomens18a66anos.setOpaque(true);
		PetroskiHomens18a66anos.setHorizontalAlignment(SwingConstants.CENTER);
		PetroskiHomens18a66anos
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PetroskiHomens18a66anos.setVisible(true);

		JLabel PetroskiMulheresGeneralizada = new JLabel();
		PetroskiMulheresGeneralizada.setText("Petroski Mulheres Generalizada");
		PetroskiMulheresGeneralizada.setBounds(3,
				setProceduresButtonsPosition(panelLeftSideProcedures, PetroskiHomens18a66anos),
				panelLeftSideProcedures.getWidth() - 6, getleftProceduresPanelsHeight(panelLeftSideProcedures));
		PetroskiMulheresGeneralizada.setOpaque(true);
		PetroskiMulheresGeneralizada.setHorizontalAlignment(SwingConstants.CENTER);
		PetroskiMulheresGeneralizada
				.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PetroskiMulheresGeneralizada.setVisible(true);

		panelLeftSideProcedures.add(GuedesHomensEspecifica);
		panelLeftSideProcedures.add(GuedesMulheresEspecifica);
		panelLeftSideProcedures.add(DuerenbergHomensIdososGordura);
		panelLeftSideProcedures.add(DurninEWomersleyHomensIdosos);
		panelLeftSideProcedures.add(DurninEWomersleyMulheresIdosas);
		panelLeftSideProcedures.add(JacksonPollockHomensAtletas);
		panelLeftSideProcedures.add(JacksonPollockMulheresAtletas);
		panelLeftSideProcedures.add(GoncalvesMulheresIdosasGordura);
		panelLeftSideProcedures.add(PetroskiHomens18a66anos);
		panelLeftSideProcedures.add(PetroskiMulheresGeneralizada);
	}

	/**
	 * Get height of panel and return size
	 * 
	 * @param panel
	 * @return
	 */
	private static int getleftProceduresPanelsHeight(JPanel panel) {
		int height = panel.getHeight();
		height /= 11;
		return height;
	}

	/**
	 * Retorna a posição de cada JLabel pegando a posição de cada JLabel soma
	 * com a altura disponibilizada para os botões, mais o espaçamento entre os
	 * mesmos
	 * 
	 * @param panel
	 * @param button
	 * @return
	 */
	private static int setProceduresButtonsPosition(JPanel panel, JLabel button) {
		int buttonPosition = button.getLocation().y;
		int height = getleftProceduresPanelsHeight(panel);

		return buttonPosition + height + 4;
	}
}
