package br.edu.unoesc.edi.bim.ui.tabs;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

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
import br.edu.unoesc.edi.bim.ui.tabs.Math.AllAuthorUse;
import br.edu.unoesc.edi.bim.ui.tabs.Math.GoncalvesMulheresIdosas;
import br.edu.unoesc.edi.bim.ui.tabs.Math.GuedesHomens;
import br.edu.unoesc.edi.bim.util.ProceduresSplitter;

/**
 * 
 * @author Marcelo
 *
 */
public class TabGoncalvesMulheresIdosas {

	private static JLabel lblStudentId = new JLabel("0");;
	private static JSearchField txtName = new JSearchField();;
	private static JTextField txtBirthday = new JTextField();;
	private static JTextField txtAge = new JTextField();;
	private static JRadioButton rbGenreMale = new JRadioButton("Masculino");
	private static JRadioButton rbGenreFemale = new JRadioButton("Feminino");
	private static JTextField txtWeight = new JTextField();
	private static JTextField txtHeight = new JTextField();
	private static JTextField txtCintura;
	private static JTextField txtQuadril;
	private static JTextField txtPescoço;
	private static JTextField txtIMC;
	private static JTextField txtPorcentagemGordura;
	private static JTextField txtRazaoCinturaQuadril;
	private static JTextField txtSituacao;

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

		JLabel lbltabName = new JLabel("Gonçalves Mulheres Idosas");
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

		JLabel lblCircunferencias = new JLabel("CIRCUNFERENCIAS");
		lblCircunferencias.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 4),
				20, 190, 30);
		lblCircunferencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircunferencias.setForeground(Color.black);
		lblCircunferencias.setFont(new Font("Base 02", Font.BOLD, 18));
		centerPanel.add(lblCircunferencias);

		JLabel lblCintura = new JLabel("Cintura(cm)*");
		lblCintura.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + ForTabs.calcMid(mainPane, 7), 85, 90,
				22);
		lblCintura.setHorizontalAlignment(SwingConstants.CENTER);
		lblCintura.setForeground(Color.gray);
		lblCintura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblCintura);

		txtCintura = new JTextField();
		txtCintura.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 100 + ForTabs.calcMid(mainPane, 7),
				85, 45, 22);
		txtCintura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtCintura.setForeground(Color.gray);
		centerPanel.add(txtCintura);

		JLabel lblQuadril = new JLabel("Quadril(cm)*");
		lblQuadril.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 160 + ForTabs.calcMid(mainPane, 7),
				85, 110, 22);
		lblQuadril.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuadril.setForeground(Color.gray);
		lblQuadril.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblQuadril);

		txtQuadril = new JTextField();
		txtQuadril.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 275 + ForTabs.calcMid(mainPane, 7),
				85, 45, 22);
		txtQuadril.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtQuadril.setForeground(Color.gray);
		centerPanel.add(txtQuadril);

		JLabel lblPescoco = new JLabel("Pescoço(cm)*");
		lblPescoco.setBounds(
				ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 80 + ForTabs.calcMid(mainPane, 7) - 15, 110, 140,
				22);
		lblPescoco.setHorizontalAlignment(SwingConstants.CENTER);
		lblPescoco.setForeground(Color.gray);
		lblPescoco.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPescoco);

		txtPescoço = new JTextField();
		txtPescoço.setBounds(ForTabs.calcPaneWidthSizeToSetComponents(mainPane) + 190 + ForTabs.calcMid(mainPane, 7),
				110, 45, 22);
		txtPescoço.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPescoço.setForeground(Color.gray);
		centerPanel.add(txtPescoço);

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

		JLabel lblIMC = new JLabel("IMC");
		lblIMC.setBounds(ForTabs.calcMid(mainPane, 2) - 40, 275, 130, 22);
		lblIMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblIMC.setForeground(Color.gray);
		lblIMC.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblIMC);

		txtIMC = new JTextField();
		txtIMC.setBounds(ForTabs.calcMid(mainPane, 2) + 45, 275, 45, 22);
		txtIMC.setEditable(false);
		txtIMC.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtIMC.setForeground(Color.gray);
		centerPanel.add(txtIMC);

		JLabel lblPorcentagemGordura = new JLabel("Gordura(%)");
		lblPorcentagemGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 100, 275, 75, 22);
		lblPorcentagemGordura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcentagemGordura.setForeground(Color.gray);
		lblPorcentagemGordura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPorcentagemGordura);

		txtPorcentagemGordura = new JTextField();
		txtPorcentagemGordura.setEditable(false);
		txtPorcentagemGordura.setBounds(ForTabs.calcMid(mainPane, 2) + 180, 275, 45, 22);
		txtPorcentagemGordura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPorcentagemGordura.setForeground(Color.gray);
		centerPanel.add(txtPorcentagemGordura);

		JLabel lblRazaoCinturaQuadril = new JLabel("Razão Cintura Quadril");
		lblRazaoCinturaQuadril.setBounds(ForTabs.calcMid(mainPane, 2) + 230, 275, 150, 22);
		lblRazaoCinturaQuadril.setHorizontalAlignment(SwingConstants.CENTER);
		lblRazaoCinturaQuadril.setForeground(Color.gray);
		lblRazaoCinturaQuadril.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblRazaoCinturaQuadril);

		txtRazaoCinturaQuadril = new JTextField();
		txtRazaoCinturaQuadril.setBounds(ForTabs.calcMid(mainPane, 2) + 380, 275, 45, 22);
		txtRazaoCinturaQuadril.setEditable(false);
		txtRazaoCinturaQuadril.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtRazaoCinturaQuadril.setForeground(Color.gray);
		centerPanel.add(txtRazaoCinturaQuadril);

		JLabel lblNivel = new JLabel("Situação: ");
		lblNivel.setBounds(ForTabs.calcMid(mainPane, 2) + 75, 315, 160, 22);
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setForeground(Color.gray);
		lblNivel.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblNivel);

		txtSituacao = new JTextField();
		txtSituacao.setBounds(ForTabs.calcMid(mainPane, 2) + 197, 315, 150, 22);
		txtSituacao.setEditable(false);
		txtSituacao.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtSituacao.setForeground(Color.red);
		centerPanel.add(txtSituacao);

		JLabel btnReset = new JLabel("Limpar");
		btnReset.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				txtPescoço.setText("");
				txtCintura.setText("");
				txtQuadril.setText("");
				txtPorcentagemGordura.setText("");
				txtIMC.setText("");
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
		btnReport.setForeground(Color.white);
		btnReport.setOpaque(true);
		btnReport.setBackground(new Color(35, 164, 240));
		btnReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnReport.setBounds(ForTabs.calcButtonPosition(mainPane, 305) + 97, 452, 95, 44);
		centerPanel.add(btnReport);

		JLabel btnSave = new JLabel("Calcular/Salvar");
		btnSave.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				if ((!txtWeight.getText().trim().equals("")) && (!txtPescoço.getText().trim().equals(""))
						&& (!txtHeight.getText().trim().equals("")) && (!txtAge.getText().trim().equals(""))
						&& (!txtCintura.getText().trim().equals("")) && (!txtQuadril.getText().trim().equals(""))) {

					double imc = GoncalvesMulheresIdosas.iMC(Float.parseFloat(txtWeight.getText()),
							Float.parseFloat(txtHeight.getText()));
					txtIMC.setText(ProceduresSplitter.split(imc));
					double percentualGordura = GoncalvesMulheresIdosas.percentualGordura(
							Float.parseFloat(txtWeight.getText()), Float.parseFloat(txtPescoço.getText()),
							Float.parseFloat(txtCintura.getText()), Float.parseFloat(txtQuadril.getText()));
					txtPorcentagemGordura.setText(ProceduresSplitter.split(percentualGordura));
					float razaoCinturaQuadril = GuedesHomens.razaoCinturaQuadril(Float.parseFloat(txtCintura.getText()),
							Float.parseFloat(txtQuadril.getText()));
					txtRazaoCinturaQuadril.setText(ProceduresSplitter.split(razaoCinturaQuadril));
					txtSituacao.setText(
							AllAuthorUse.situacaoMulheres(percentualGordura, Integer.parseInt(txtAge.getText())));
					// Create a model to save the results at database for
					// reports
					Procedures procedures = new Procedures();
					procedures.setIdOfStudent(Integer.parseInt(lblStudentId.getText()));
					procedures.setTypeOfProcedure(8);
					procedures.setAge(Integer.parseInt(txtAge.getText()));
					procedures.setWeight(Float.parseFloat(txtWeight.getText()));
					procedures.setHeight(Integer.parseInt(txtHeight.getText()));
					procedures.setCintura(Float.parseFloat(txtCintura.getText()));
					procedures.setQuadril(Float.parseFloat(txtQuadril.getText()));
					procedures.setPescoco(Float.parseFloat(txtPescoço.getText()));
					procedures.setImc((float) imc);
					procedures.setPercentualGordura((float) percentualGordura);
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
					if (txtPescoço.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Você esqueceu de preencher o campo Pescoço!");
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
			mainPane.addTab("Gonçalves Mulheres Idosas", pane);
		} else {
			mainPane.addTab("Gonçalves Mulheres Idosas", pane);
		}
	}

}
