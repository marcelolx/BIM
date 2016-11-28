package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.db.dao.DAOManager;
import br.edu.unoesc.edi.bim.db.model.Procedures;
import br.edu.unoesc.edi.bim.ui.ForTabs;
import br.edu.unoesc.edi.bim.ui.InnerReportsButtonsUI;
import br.edu.unoesc.edi.bim.ui.tabs.Math.AllAuthorUse;
import br.edu.unoesc.edi.bim.ui.tabs.Math.GuedesHomens;
import br.edu.unoesc.edi.bim.util.ProceduresSplitter;
import br.edu.unoesc.edi.bim.util.ReportGenerator;
import net.sf.jasperreports.engine.JRException;

/**
 * 
 * @author Marcelo
 *
 */
public class TabGuedesHomens {

	private static JLabel lblStudentId = new JLabel("0");;
	private static JSearchField txtName = new JSearchField();;
	private static JFormattedTextField txtBirthday = new JFormattedTextField();;
	private static JTextField txtAge = new JTextField();;
	private static JRadioButton rbGenreMale = new JRadioButton("Masculino");
	private static JRadioButton rbGenreFemale = new JRadioButton("Feminino");
	private static JTextField txtWeight = new JTextField();
	private static JTextField txtHeight = new JTextField();
	private static JTextField txtTriceps;
	private static JTextField txtAbdomen;
	private static JTextField txtSupraIliaca;
	private static JTextField txtCintura;
	private static JTextField txtQuadril;
	private static JTextField txtDensidadeCorporal;
	private static JTextField txtPorcentagemGordura;
	private static JTextField txtPesoGordura;
	private static JTextField txtPesoMagro;
	private static JTextField txtPesoIdeal;
	private static JTextField txtIndiceMassaCorporal;
	private static JTextField txtRazaoCinturaQuadril;
	private static JTextField txtSituacao;

	// TODO
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void init(JTabbedPane mainPane) {
		JPanel pane = new JPanel();
		pane.setLayout(null);
		pane.setBackground(Color.white);

		JPanel northPane = new JPanel();
		northPane.setLayout(null);
		northPane.setBounds(1, 0, mainPane.getWidth() - 9, 76);
		northPane.setBackground(Color.white);
		northPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lbltabName = new JLabel("Guedes Homens");
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

		ForTabs.componentsForStudentInfos(mainPane, centerPanel, lblStudentId, txtName, txtBirthday, txtAge,
				rbGenreMale, rbGenreFemale, txtWeight, txtHeight);

		JLabel lblDobrasCutaneas = new JLabel("DOBRAS CUTANEAS");
		lblDobrasCutaneas.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 4),
				10, 180, 22);
		lblDobrasCutaneas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobrasCutaneas.setForeground(Color.black);
		lblDobrasCutaneas.setFont(new Font("Base 02", Font.BOLD, 16));
		centerPanel.add(lblDobrasCutaneas);

		JLabel lblTiceps = new JLabel("Tríceps(mm)*");
		lblTiceps.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7), 40, 90,
				22);
		lblTiceps.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiceps.setForeground(Color.gray);
		lblTiceps.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblTiceps);

		txtTriceps = new JTextField();
		txtTriceps.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 100 + ForTabs.calcMid(mainPane, 7),
				40, 45, 22);
		txtTriceps.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtTriceps.setForeground(Color.gray);
		centerPanel.add(txtTriceps);

		JLabel lblAbdomen = new JLabel("Abdomen(mm)*");
		lblAbdomen.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 160 + ForTabs.calcMid(mainPane, 7),
				40, 110, 22);
		lblAbdomen.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbdomen.setForeground(Color.gray);
		lblAbdomen.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAbdomen);

		txtAbdomen = new JTextField();
		txtAbdomen.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 275 + ForTabs.calcMid(mainPane, 7),
				40, 45, 22);
		txtAbdomen.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAbdomen.setForeground(Color.gray);
		centerPanel.add(txtAbdomen);

		JLabel lblSupraIliaca = new JLabel("Supra Ilíaca(mm)*");
		lblSupraIliaca.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 4), 72,
				120, 22);
		lblSupraIliaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupraIliaca.setForeground(Color.gray);
		lblSupraIliaca.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblSupraIliaca);

		txtSupraIliaca = new JTextField();
		txtSupraIliaca.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 125 + ForTabs.calcMid(mainPane, 4), 72, 45, 22);
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

		JLabel lblPesoGordura = new JLabel("Peso Gordura(Kg) ");
		lblPesoGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 230, 255, 120, 22);
		lblPesoGordura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoGordura.setForeground(Color.gray);
		lblPesoGordura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoGordura);

		txtPesoGordura = new JTextField();
		txtPesoGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 350, 255, 45, 22);
		txtPesoGordura.setEditable(false);
		txtPesoGordura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoGordura.setForeground(Color.gray);
		centerPanel.add(txtPesoGordura);

		JLabel lblPesoMagro = new JLabel("Peso Magro(Kg)");
		lblPesoMagro.setBounds(ForTabs.calcMid(mainPane, 2) + 400, 255, 100, 22);
		lblPesoMagro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoMagro.setForeground(Color.gray);
		lblPesoMagro.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoMagro);

		txtPesoMagro = new JTextField();
		txtPesoMagro.setBounds(ForTabs.calcMid(mainPane, 2) + 503, 255, 45, 22);
		txtPesoMagro.setEditable(false);
		txtPesoMagro.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoMagro.setForeground(Color.gray);
		centerPanel.add(txtPesoMagro);

		JLabel lblPesoIdeal = new JLabel("Peso Ideal(Kg)");
		lblPesoIdeal.setBounds(ForTabs.calcMid(mainPane, 2) - 75, 290, 95, 22);
		lblPesoIdeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoIdeal.setForeground(Color.gray);
		lblPesoIdeal.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoIdeal);

		txtPesoIdeal = new JTextField();
		txtPesoIdeal.setBounds(ForTabs.calcMid(mainPane, 2) + 23, 290, 45, 22);
		txtPesoIdeal.setEditable(false);
		txtPesoIdeal.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoIdeal.setForeground(Color.gray);
		centerPanel.add(txtPesoIdeal);

		JLabel lblIndiceMassaCorporal = new JLabel("Índice Massa Corporal(Kg/m²)");
		lblIndiceMassaCorporal.setBounds(ForTabs.calcMid(mainPane, 2) + 75, 290, 190, 22);
		lblIndiceMassaCorporal.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndiceMassaCorporal.setForeground(Color.gray);
		lblIndiceMassaCorporal.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblIndiceMassaCorporal);

		txtIndiceMassaCorporal = new JTextField();
		txtIndiceMassaCorporal.setBounds(ForTabs.calcMid(mainPane, 2) + 269, 290, 45, 22);
		txtIndiceMassaCorporal.setEditable(false);
		txtIndiceMassaCorporal.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtIndiceMassaCorporal.setForeground(Color.gray);
		centerPanel.add(txtIndiceMassaCorporal);

		JLabel lblRazaoCinturaQuadril = new JLabel("Razão Cintura Quadril");
		lblRazaoCinturaQuadril.setBounds(ForTabs.calcMid(mainPane, 2) + 315, 290, 160, 22);
		lblRazaoCinturaQuadril.setHorizontalAlignment(SwingConstants.CENTER);
		lblRazaoCinturaQuadril.setForeground(Color.gray);
		lblRazaoCinturaQuadril.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblRazaoCinturaQuadril);

		txtRazaoCinturaQuadril = new JTextField();
		txtRazaoCinturaQuadril.setBounds(ForTabs.calcMid(mainPane, 2) + 470, 290, 45, 22);
		txtRazaoCinturaQuadril.setEditable(false);
		txtRazaoCinturaQuadril.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtRazaoCinturaQuadril.setForeground(Color.gray);
		centerPanel.add(txtRazaoCinturaQuadril);

		JLabel lblNivel = new JLabel("Situação: ");
		lblNivel.setBounds(ForTabs.calcMid(mainPane, 2) + 75, 335, 160, 22);
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setForeground(Color.gray);
		lblNivel.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblNivel);

		txtSituacao = new JTextField();
		txtSituacao.setBounds(ForTabs.calcMid(mainPane, 2) + 197, 335, 150, 22);
		txtSituacao.setEditable(false);
		txtSituacao.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtSituacao.setForeground(Color.red);
		centerPanel.add(txtSituacao);

		JLabel btnReset = new JLabel("Limpar");
		btnReset.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				txtTriceps.setText("");
				txtAbdomen.setText("");
				txtSupraIliaca.setText("");
				txtCintura.setText("");
				txtQuadril.setText("");
				txtDensidadeCorporal.setText("");
				txtPorcentagemGordura.setText("");
				txtPesoGordura.setText("");
				txtPesoMagro.setText("");
				txtPesoIdeal.setText("");
				txtIndiceMassaCorporal.setText("");
				txtRazaoCinturaQuadril.setText("");
				txtSituacao.setText("");
			}
		});
		btnReset.setForeground(Color.white);
		btnReset.setOpaque(true);
		btnReset.setBackground(new Color(35, 164, 240));
		btnReset.setHorizontalAlignment(SwingConstants.CENTER);
		btnReset.setBounds(ForTabs.calcButtonPosition(mainPane, 305), 452, 95, 44);
		centerPanel.add(btnReset);

		JLabel btnReport = new JLabel("Gerar Relatório");
		btnReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					ReportGenerator.gerador("GuedesHomensEspecífica.jasper","select procedures.DENSIDADE_CORPORAL, procedures.PERCENTUAL_GORDURA, procedures.PESO_GORDURA,  procedures.PESO_MAGRO,  procedures. PESO_IDEAL,  procedures.IMC,  procedures.RAZAO_CINTURA_QUADRIL,  procedures.SITUACAO from procedures");
				} catch (ClassNotFoundException | SQLException | JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnReport.setForeground(Color.white);
		btnReport.setOpaque(true);
		btnReport.setBackground(new Color(35, 164, 240));
		btnReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnReport.setBounds(ForTabs.calcButtonPosition(mainPane, 305) + 97, 452, 95, 44);
		centerPanel.add(btnReport);

		JLabel btnSave = new JLabel("Calcular/Salvar");
		btnSave.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				if ((!txtTriceps.getText().trim().equals("")) && (!txtAbdomen.getText().trim().equals(""))
						&& (!txtSupraIliaca.getText().trim().equals("")) && (!txtWeight.getText().trim().equals(""))
						&& (!txtHeight.getText().trim().equals("")) && (!txtAge.getText().trim().equals(""))
						&& (!txtCintura.getText().trim().equals("")) && (!txtQuadril.getText().trim().equals(""))) {

					double densidadeCorporal = GuedesHomens.densidadeCorporal(Integer.parseInt(txtTriceps.getText()),
							Integer.parseInt(txtAbdomen.getText()), Integer.parseInt(txtSupraIliaca.getText()));
					txtDensidadeCorporal.setText(ProceduresSplitter.split(densidadeCorporal));
					double percentualGordura = GuedesHomens.percentualGordura(densidadeCorporal);
					txtPorcentagemGordura.setText(ProceduresSplitter.split(percentualGordura));
					double pesoGordura = GuedesHomens.pesoGordura(percentualGordura,
							Float.parseFloat(txtWeight.getText()));
					txtPesoGordura.setText(ProceduresSplitter.split(pesoGordura));
					double pesoMagro = GuedesHomens.pesoMagro(Float.parseFloat(txtWeight.getText()), pesoGordura);
					txtPesoMagro.setText(ProceduresSplitter.split(pesoMagro));
					double pesoIdeal = GuedesHomens.pesoIdeal(pesoMagro);
					txtPesoIdeal.setText(ProceduresSplitter.split(pesoIdeal));
					float imc = GuedesHomens.iMC(Float.parseFloat(txtWeight.getText()),
							Float.parseFloat(txtHeight.getText()));
					txtIndiceMassaCorporal.setText(ProceduresSplitter.split(imc));
					float razaoCinturaQuadril = GuedesHomens.razaoCinturaQuadril(Float.parseFloat(txtCintura.getText()),
							Float.parseFloat(txtQuadril.getText()));
					txtRazaoCinturaQuadril.setText(ProceduresSplitter.split(razaoCinturaQuadril));
					txtSituacao.setText(AllAuthorUse.situacaoHomens(percentualGordura, Integer.parseInt(txtAge.getText())));
					// Create a model to save the results at database for
					// reports
					Procedures procedures = new Procedures();
					procedures.setIdOfStudent(Integer.parseInt(lblStudentId.getText()));
					procedures.setTypeOfProcedure(1);
					procedures.setAge(Integer.parseInt(txtAge.getText()));
					procedures.setWeight(Float.parseFloat(txtWeight.getText()));
					procedures.setHeight(Integer.parseInt(txtHeight.getText()));
					procedures.setTriceps(Float.parseFloat(txtTriceps.getText()));
					procedures.setAbdomen(Float.parseFloat(txtAbdomen.getText()));
					procedures.setSupraIliaca(Float.parseFloat(txtSupraIliaca.getText()));
					procedures.setCintura(Float.parseFloat(txtCintura.getText()));
					procedures.setQuadril(Float.parseFloat(txtQuadril.getText()));
					procedures.setDensidadeCorporal((float) densidadeCorporal);
					procedures.setPercentualGordura((float) percentualGordura);
					procedures.setPesoGordura((float) pesoGordura);
					procedures.setPesoMagro((float) pesoMagro);
					procedures.setPesoIdeal((float) pesoIdeal);
					procedures.setImc(imc);
					procedures.setRazaoCinturaQuadril(razaoCinturaQuadril);
					procedures.setSituacao(txtSituacao.getText());
					// procedures.setNivelIdade(Integer.parseInt(txtSituacao.getText()));
					try {
						int create = DAOManager.proceduresDAO.create(procedures);
						if (create == 1)
							JOptionPane.showMessageDialog(null, "Cálculado e salvo com sucesso!");
						else
							JOptionPane.showMessageDialog(null, "Houve algum imprevisto, ao salvar os dados.");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					if (txtTriceps.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Tríceps!");
					} else if (txtSupraIliaca.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Supra Ilíaca!");
					} else if (txtAbdomen.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Abdômen!");
					} else if (txtCintura.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Cintura!");
					} else if (txtAge.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Idade!");
					} else if (txtWeight.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Peso!");
					} else if (txtHeight.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Altura!");
					} else if (txtQuadril.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Quadril!");
					}
				}
			}
		});
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
			mainPane.addTab("GUEDES Homens Específica", pane);
		} else {
			mainPane.addTab("GUEDES Homens Específica", pane);
		}

	}
}
