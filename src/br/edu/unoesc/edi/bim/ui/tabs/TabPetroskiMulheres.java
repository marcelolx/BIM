package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.ui.ForTabs;

/**
 * 
 * @author Marcelo
 *
 */
public class TabPetroskiMulheres {

	private static JLabel lblStudentId = new JLabel("0");;
	private static JSearchField txtName = new JSearchField();;
	private static JTextField txtBirthday = new JTextField();;
	private static JTextField txtAge = new JTextField();;
	private static JRadioButton rbGenreMale = new JRadioButton("Masculino");
	private static JRadioButton rbGenreFemale = new JRadioButton("Feminino");
	private static JTextField txtWeight = new JTextField();
	private static JTextField txtHeight = new JTextField();
	private static JTextField txtAxilarMedia;
	private static JTextField txtPanturrilha;
	private static JTextField txtSupraIliaca;
	private static JTextField txtCoxa;
	private static JTextField txtCintura;
	private static JTextField txtQuadril;
	private static JTextField txtDensidadeCorporal;
	private static JTextField txtPorcentagemGordura;
	private static JTextField txtPesoGordura;
	private static JTextField txtPesoMagro;
	private static JTextField txtPesoIdeal;
	private static JTextField txtIndiceMassaCorporal;
	private static JTextField txtRazaoCinturaQuadril;
	private static JTextField txtNivel;

	// TODO
	public static void init(JTabbedPane mainPane) {
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		JPanel northPane = new JPanel();
		northPane.setLayout(null);
		northPane.setBounds(1, 0, mainPane.getWidth() - 9, 76);
		northPane.setBackground(Color.white);
		northPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lbltabName = new JLabel("Petroski Mulheres");
		lbltabName.setFont(new Font("Base 02", Font.PLAIN, 22));
		lbltabName.setHorizontalAlignment(SwingConstants.CENTER);
		lbltabName.setBounds(1, 1, mainPane.getWidth() - 11, 35);
		lbltabName.setVisible(true);
		northPane.add(lbltabName);

		JLabel lblCadastroNorth = new JLabel("COMPOSICAO CORPORAL E INDICADORES DE GORDURA");
		lblCadastroNorth.setFont(new Font("Base 02", Font.PLAIN, 18));
		lblCadastroNorth.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroNorth.setBounds(1, 32, mainPane.getWidth() - 11, 40);
		lblCadastroNorth.setVisible(true);
		northPane.add(lblCadastroNorth);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		centerPanel.setBounds(1, 78, mainPane.getWidth() - 9, mainPane.getHeight() - 110);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		// TODO
		ForTabs.componentsForStudentInfos(mainPane, centerPanel, lblStudentId, txtName, txtBirthday, txtAge,
				rbGenreMale, rbGenreFemale, txtWeight, txtHeight);

		JLabel lblDobrasCutaneas = new JLabel("DOBRAS CUTANEAS");
		lblDobrasCutaneas.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 4),
				10, 180, 22);
		lblDobrasCutaneas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobrasCutaneas.setForeground(Color.black);
		lblDobrasCutaneas.setFont(new Font("Base 02", Font.BOLD, 16));
		centerPanel.add(lblDobrasCutaneas);

		JLabel lblAxilarMedia = new JLabel("Axilar Média(mm)*");
		lblAxilarMedia.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7) - 25,
				40, 120, 22);
		lblAxilarMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAxilarMedia.setForeground(Color.gray);
		lblAxilarMedia.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAxilarMedia);

		txtAxilarMedia = new JTextField();
		txtAxilarMedia.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 100 + ForTabs.calcMid(mainPane, 7), 40, 45, 22);
		txtAxilarMedia.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAxilarMedia.setForeground(Color.gray);
		centerPanel.add(txtAxilarMedia);

		JLabel lblPanturrilha = new JLabel("Panturrilha(mm)*");
		lblPanturrilha.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 160 + ForTabs.calcMid(mainPane, 7), 40, 110, 22);
		lblPanturrilha.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanturrilha.setForeground(Color.gray);
		lblPanturrilha.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPanturrilha);

		txtPanturrilha = new JTextField();
		txtPanturrilha.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 275 + ForTabs.calcMid(mainPane, 7), 40, 45, 22);
		txtPanturrilha.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPanturrilha.setForeground(Color.gray);
		centerPanel.add(txtPanturrilha);

		JLabel lblCoxa = new JLabel("Coxa(mm)*");
		lblCoxa.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7) - 2, 72,
				124, 22);
		lblCoxa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoxa.setForeground(Color.gray);
		lblCoxa.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblCoxa);

		txtCoxa = new JTextField();
		txtCoxa.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 100 + ForTabs.calcMid(mainPane, 7), 72,
				45, 22);
		txtCoxa.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtCoxa.setForeground(Color.gray);
		centerPanel.add(txtCoxa);

		JLabel lblSupraIliaca = new JLabel("Supra Ilíaca(mm)*");
		lblSupraIliaca.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7) + 150, 72, 120, 22);
		lblSupraIliaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupraIliaca.setForeground(Color.gray);
		lblSupraIliaca.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblSupraIliaca);

		txtSupraIliaca = new JTextField();
		txtSupraIliaca.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7) + 275, 72, 45, 22);
		txtSupraIliaca.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtSupraIliaca.setForeground(Color.gray);
		centerPanel.add(txtSupraIliaca);

		JLabel lblCircunferencias = new JLabel("CIRCUNFERENCIAS");
		lblCircunferencias.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 4),
				130, 190, 30);
		lblCircunferencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircunferencias.setForeground(Color.black);
		lblCircunferencias.setFont(new Font("Base 02", Font.BOLD, 18));
		centerPanel.add(lblCircunferencias);

		JLabel lblCintura = new JLabel("Cintura(cm)*");
		lblCintura.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7), 165, 90,
				22);
		lblCintura.setHorizontalAlignment(SwingConstants.CENTER);
		lblCintura.setForeground(Color.gray);
		lblCintura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblCintura);

		txtCintura = new JTextField();
		txtCintura.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 100 + ForTabs.calcMid(mainPane, 7),
				165, 45, 22);
		txtCintura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtCintura.setForeground(Color.gray);
		centerPanel.add(txtCintura);

		JLabel lblQuadril = new JLabel("Quadril(cm)*");
		lblQuadril.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 160 + ForTabs.calcMid(mainPane, 7),
				165, 110, 22);
		lblQuadril.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuadril.setForeground(Color.gray);
		lblQuadril.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblQuadril);

		txtQuadril = new JTextField();
		txtQuadril.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 275 + ForTabs.calcMid(mainPane, 7),
				165, 45, 22);
		txtQuadril.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtQuadril.setForeground(Color.gray);
		centerPanel.add(txtQuadril);

		JPanel separator = new JPanel();
		separator.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		separator.setBounds(0, 200, centerPanel.getWidth(), 3);
		centerPanel.add(separator);

		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) - 110, 210, 220, 30);
		lblResultados.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultados.setForeground(Color.black);
		lblResultados.setFont(new Font("Base 02", Font.BOLD, 20));
		centerPanel.add(lblResultados);

		JLabel lblDensidadeCorporal = new JLabel("Densidade Corporal");
		lblDensidadeCorporal.setBounds(ForTabs.calcMid(mainPane, 2) - 100, 255, 130, 22);
		lblDensidadeCorporal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDensidadeCorporal.setForeground(Color.gray);
		lblDensidadeCorporal.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblDensidadeCorporal);

		txtDensidadeCorporal = new JTextField();
		txtDensidadeCorporal.setBounds(ForTabs.calcMid(mainPane, 2) + 35, 255, 45, 22);
		txtDensidadeCorporal.setEditable(false);
		txtDensidadeCorporal.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtDensidadeCorporal.setForeground(Color.gray);
		centerPanel.add(txtDensidadeCorporal);

		JLabel lblPorcentagemGordura = new JLabel("Gordura(%)");
		lblPorcentagemGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 100, 255, 75, 22);
		lblPorcentagemGordura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcentagemGordura.setForeground(Color.gray);
		lblPorcentagemGordura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPorcentagemGordura);

		txtPorcentagemGordura = new JTextField();
		txtPorcentagemGordura.setEditable(false);
		txtPorcentagemGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 180, 255, 45, 22);
		txtPorcentagemGordura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPorcentagemGordura.setForeground(Color.gray);
		centerPanel.add(txtPorcentagemGordura);

		JLabel lblPesoGordura = new JLabel("Peso Gordura ");
		lblPesoGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 230, 255, 110, 22);
		lblPesoGordura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoGordura.setForeground(Color.gray);
		lblPesoGordura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoGordura);

		txtPesoGordura = new JTextField();
		txtPesoGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 340, 255, 45, 22);
		txtPesoGordura.setEditable(false);
		txtPesoGordura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoGordura.setForeground(Color.gray);
		centerPanel.add(txtPesoGordura);

		JLabel lblPesoMagro = new JLabel("Peso Magro");
		lblPesoMagro.setBounds(ForTabs.calcMid(mainPane, 2) + 390, 255, 90, 22);
		lblPesoMagro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoMagro.setForeground(Color.gray);
		lblPesoMagro.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoMagro);

		txtPesoMagro = new JTextField();
		txtPesoMagro.setBounds(ForTabs.calcMid(mainPane, 2) + 480, 255, 45, 22);
		txtPesoMagro.setEditable(false);
		txtPesoMagro.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoMagro.setForeground(Color.gray);
		centerPanel.add(txtPesoMagro);

		JLabel lblPesoIdeal = new JLabel("Peso Ideal");
		lblPesoIdeal.setBounds(ForTabs.calcMid(mainPane, 2) - 65, 290, 75, 22);
		lblPesoIdeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoIdeal.setForeground(Color.gray);
		lblPesoIdeal.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoIdeal);

		txtPesoIdeal = new JTextField();
		txtPesoIdeal.setBounds(ForTabs.calcMid(mainPane, 2) + 15, 290, 45, 22);
		txtPesoIdeal.setEditable(false);
		txtPesoIdeal.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoIdeal.setForeground(Color.gray);
		centerPanel.add(txtPesoIdeal);

		JLabel lblIndiceMassaCorporal = new JLabel("Índice Massa Corporal");
		lblIndiceMassaCorporal.setBounds(ForTabs.calcMid(mainPane, 2) + 65, 290, 160, 22);
		lblIndiceMassaCorporal.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndiceMassaCorporal.setForeground(Color.gray);
		lblIndiceMassaCorporal.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblIndiceMassaCorporal);

		txtIndiceMassaCorporal = new JTextField();
		txtIndiceMassaCorporal.setBounds(ForTabs.calcMid(mainPane, 2) + 225, 290, 45, 22);
		txtIndiceMassaCorporal.setEditable(false);
		txtIndiceMassaCorporal.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtIndiceMassaCorporal.setForeground(Color.gray);
		centerPanel.add(txtIndiceMassaCorporal);

		JLabel lblRazaoCinturaQuadril = new JLabel("Razão Cintura Quadril");
		lblRazaoCinturaQuadril.setBounds(ForTabs.calcMid(mainPane, 2) + 275, 290, 160, 22);
		lblRazaoCinturaQuadril.setHorizontalAlignment(SwingConstants.CENTER);
		lblRazaoCinturaQuadril.setForeground(Color.gray);
		lblRazaoCinturaQuadril.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblRazaoCinturaQuadril);

		txtRazaoCinturaQuadril = new JTextField();
		txtRazaoCinturaQuadril.setBounds(ForTabs.calcMid(mainPane, 2) + 435, 290, 45, 22);
		txtRazaoCinturaQuadril.setEditable(false);
		txtRazaoCinturaQuadril.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtRazaoCinturaQuadril.setForeground(Color.gray);
		centerPanel.add(txtRazaoCinturaQuadril);

		JLabel lblNivel = new JLabel("Nível/Idade: ");
		lblNivel.setBounds(ForTabs.calcMid(mainPane, 2) + 75, 335, 160, 22);
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setForeground(Color.gray);
		lblNivel.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblNivel);

		txtNivel = new JTextField();
		txtNivel.setBounds(ForTabs.calcMid(mainPane, 2) + 197, 335, 150, 22);
		txtNivel.setEditable(false);
		txtNivel.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtNivel.setForeground(Color.red);
		centerPanel.add(txtNivel);

		JLabel btnReset = new JLabel("Limpar");
		btnReset.setForeground(Color.white);
		btnReset.setOpaque(true);
		btnReset.setBackground(new Color(35, 164, 240));
		btnReset.setHorizontalAlignment(SwingConstants.CENTER);
		btnReset.setBounds(ForTabs.calcButtonPosition(mainPane, 305), 452, 95, 44);
		centerPanel.add(btnReset);

		JLabel btnReport = new JLabel("Gerar Relatório");
		btnReport.setForeground(Color.white);
		btnReport.setOpaque(true);
		btnReport.setBackground(new Color(35, 164, 240));
		btnReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnReport.setBounds(ForTabs.calcButtonPosition(mainPane, 305) + 97, 452, 95, 44);
		centerPanel.add(btnReport);

		JLabel btnSave = new JLabel("Calcular/Salvar");
		btnSave.setForeground(Color.white);
		btnSave.setOpaque(true);
		btnSave.setBackground(new Color(35, 164, 240));
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setBounds(ForTabs.calcButtonPosition(mainPane, 305) + 194, 452, 95, 44);
		centerPanel.add(btnSave);

		pane.add(northPane);
		pane.add(centerPanel);
		pane.setVisible(true);

		if (mainPane.getTabCount() == 2) {
			mainPane.removeTabAt(mainPane.getTabCount() - 1);
			mainPane.addTab("Petroski Mulheres", pane);
		} else {
			mainPane.addTab("Petroski Mulheres", pane);
		}
	}

}
