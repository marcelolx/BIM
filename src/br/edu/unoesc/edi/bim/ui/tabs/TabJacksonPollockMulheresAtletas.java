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


/**
 * 
 * @author Marcelo
 *
 */
public class TabJacksonPollockMulheresAtletas {

	private static JLabel lblStudentId;
	private static JSearchField txtName;
	private static JSearchField txtBirthday;
	private static JTextField txtAge;
	private static JRadioButton rbGenreMale;
	private static JRadioButton rbGenreFemale;
	private static JTextField txtWeight;
	private static JTextField txtHeight;
	private static JTextField txtTriceps;
	private static JTextField txtAbdomen;
	private static JTextField txtCoxa;
	private static JTextField txtSupraIliaca;
	private static JTextField txtCintura;
	private static JTextField txtQuadril;
	private static JTextField txtDensidadeCorporal;
	private static JTextField txtPorcentagemGordura;
	private static JTextField txtPesoGordura;
	private static JTextField txtPesoMagro;
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

		JLabel lbltabName = new JLabel("Jackson Pollock Mulheres Atletas");
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

		JLabel lblid = new JLabel("ID ");
		lblid.setBounds(calcPaneWidthSizeToSetComponents(mainPane)/20, 10, 30, 22);
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setForeground(Color.gray);
		lblid.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblid);

		lblStudentId = new JLabel("0");
		lblStudentId.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/20)+35, 10, 90, 22);
		lblStudentId.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentId.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		lblStudentId.setForeground(Color.gray);
		centerPanel.add(lblStudentId);

		JLabel lblName = new JLabel("Nome *");
		lblName.setBounds(calcPaneWidthSizeToSetComponents(mainPane)/20, 50, 60, 22);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.gray);
		lblName.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblName);

		txtName = new JSearchField();
		txtName.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/20)+57, 50, 340, 22);
		txtName.setEmptyText("Nome completo sem abrevia��es");
		txtName.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtName.setForeground(Color.gray);
		centerPanel.add(txtName);

		JLabel lblBirthday = new JLabel("Data Nascimento*");
		lblBirthday.setBounds(calcPaneWidthSizeToSetComponents(mainPane)/20, 92, 120, 22);
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setForeground(Color.gray);
		lblBirthday.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblBirthday);

		txtBirthday = new JSearchField();
		txtBirthday.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/20)+125, 90, 170, 22);
		txtBirthday.setEmptyText("00/00/0000");
		txtBirthday.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtBirthday.setForeground(Color.gray);
		centerPanel.add(txtBirthday);

		JLabel lblAge = new JLabel("Idade*");
		lblAge.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/20)+287, 90, 60, 22);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(Color.gray);
		lblAge.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAge);

		txtAge = new JTextField();
		txtAge.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/20)+352, 90, 45, 22);
		txtAge.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAge.setForeground(Color.gray);
		centerPanel.add(txtAge);

		JLabel lblGenre = new JLabel("G�nero*");
		lblGenre.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/5)+5, 124, 60, 22);
		lblGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenre.setForeground(Color.gray);
		lblGenre.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblGenre);

		rbGenreMale = new JRadioButton("Masculino");
		rbGenreMale.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/5)+62, 124, 109, 22);
		rbGenreMale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreMale.setBackground(Color.white);
		rbGenreMale.setForeground(Color.gray);
		centerPanel.add(rbGenreMale);

		rbGenreFemale = new JRadioButton("Feminino");
		rbGenreFemale.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/5)+173, 124, 109, 22);
		rbGenreFemale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreFemale.setBackground(Color.white);
		rbGenreFemale.setForeground(Color.gray);
		centerPanel.add(rbGenreFemale);

		JLabel lblWeight = new JLabel("Peso(kg)*");
		lblWeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane)/5, 158, 60, 22);
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight.setForeground(Color.gray);
		lblWeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblWeight);

		txtWeight = new JTextField();
		txtWeight.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/5)+60, 158, 45, 22);
		txtWeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtWeight.setForeground(Color.gray);
		centerPanel.add(txtWeight);

		JLabel lblHeight = new JLabel("Altura(cm)*");
		lblHeight.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/5)+137, 158, 70, 22);
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setForeground(Color.gray);
		lblHeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblHeight);

		txtHeight = new JTextField();
		txtHeight.setBounds((calcPaneWidthSizeToSetComponents(mainPane)/5)+217, 158, 45, 22);
		txtHeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtHeight.setForeground(Color.gray);
		centerPanel.add(txtHeight);
		 
		JLabel lblDobrasCutaneas = new JLabel("DOBRAS CUTANEAS");
		lblDobrasCutaneas.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 4), 10, 180, 22);
		lblDobrasCutaneas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobrasCutaneas.setForeground(Color.black);
		lblDobrasCutaneas.setFont(new Font("Base 02", Font.BOLD, 16));
		centerPanel.add(lblDobrasCutaneas);

		JLabel lblTriceps = new JLabel("Tr�ceps(mm)*");
		lblTriceps.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 7), 40, 90, 22);
		lblTriceps.setHorizontalAlignment(SwingConstants.CENTER);
		lblTriceps.setForeground(Color.gray);
		lblTriceps.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblTriceps);

		txtTriceps = new JTextField();
		txtTriceps.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+100+calcMid(mainPane, 7), 40, 45, 22);
		txtTriceps.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtTriceps.setForeground(Color.gray);
		centerPanel.add(txtTriceps);
		
		JLabel lblAbdomen = new JLabel("Abd�men(mm)*");
		lblAbdomen.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+160+calcMid(mainPane, 7), 40, 110, 22);
		lblAbdomen.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbdomen.setForeground(Color.gray);
		lblAbdomen.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAbdomen);

		txtAbdomen = new JTextField();
		txtAbdomen.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+275+calcMid(mainPane, 7), 40, 45, 22);
		txtAbdomen.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAbdomen.setForeground(Color.gray);
		centerPanel.add(txtAbdomen);

		JLabel lblSupraIliaca = new JLabel("Supra Il�aca(mm)*");
		lblSupraIliaca.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 7)-35, 82, 120, 22);
		lblSupraIliaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupraIliaca.setForeground(Color.gray);
		lblSupraIliaca.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblSupraIliaca);

		txtSupraIliaca = new JTextField();
		txtSupraIliaca.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+100+calcMid(mainPane, 7), 82, 45, 22);
		txtSupraIliaca.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtSupraIliaca.setForeground(Color.gray);
		centerPanel.add(txtSupraIliaca);
		
		JLabel lblCoxa = new JLabel("Coxa(mm)*");
		lblCoxa.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 7)+150, 82, 120, 22);
		lblCoxa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoxa.setForeground(Color.gray);
		lblCoxa.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblCoxa);

		txtCoxa = new JTextField();
		txtCoxa.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 7)+275, 82, 45, 22);
		txtCoxa.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtCoxa.setForeground(Color.gray);
		centerPanel.add(txtCoxa);
		
		JLabel lblCircunferencias = new JLabel("CIRCUNFERENCIAS");
		lblCircunferencias.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 4), 130, 190, 30);
		lblCircunferencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircunferencias.setForeground(Color.black);
		lblCircunferencias.setFont(new Font("Base 02", Font.BOLD, 18));
		centerPanel.add(lblCircunferencias);
		
		JLabel lblCintura = new JLabel("Cintura(cm)*");
		lblCintura.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+calcMid(mainPane, 7), 165, 90, 22);
		lblCintura.setHorizontalAlignment(SwingConstants.CENTER);
		lblCintura.setForeground(Color.gray);
		lblCintura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblCintura);

		txtCintura = new JTextField();
		txtCintura.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+100+calcMid(mainPane, 7), 165, 45, 22);
		txtCintura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtCintura.setForeground(Color.gray);
		centerPanel.add(txtCintura);
		
		JLabel lblQuadril = new JLabel("Quadril(cm)*");
		lblQuadril.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+160+calcMid(mainPane, 7), 165, 110, 22);
		lblQuadril.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuadril.setForeground(Color.gray);
		lblQuadril.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblQuadril);

		txtQuadril = new JTextField();
		txtQuadril.setBounds(calcPaneWidthSizeToSetComponents(mainPane)+275+calcMid(mainPane, 7), 165, 45, 22);
		txtQuadril.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtQuadril.setForeground(Color.gray);
		centerPanel.add(txtQuadril);
		
		JPanel separator = new JPanel();
		separator.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		separator.setBounds(0, 200, centerPanel.getWidth(), 3);
		centerPanel.add(separator);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(calcPaneWidthSizeToSetComponents(mainPane)-110, 210, 220, 30);
		lblResultados.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultados.setForeground(Color.black);
		lblResultados.setFont(new Font("Base 02", Font.BOLD, 20));
		centerPanel.add(lblResultados);
		
		JLabel lblDensidadeCorporal = new JLabel("Densidade Corporal");
		lblDensidadeCorporal.setBounds(calcMid(mainPane, 2)-100, 275, 130, 22);
		lblDensidadeCorporal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDensidadeCorporal.setForeground(Color.gray);
		lblDensidadeCorporal.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblDensidadeCorporal);

		txtDensidadeCorporal = new JTextField();
		txtDensidadeCorporal.setBounds(calcMid(mainPane, 2)+35, 275, 45, 22);
		txtDensidadeCorporal.setEditable(false);
		txtDensidadeCorporal.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtDensidadeCorporal.setForeground(Color.gray);
		centerPanel.add(txtDensidadeCorporal);
		
		JLabel lblPorcentagemGordura = new JLabel("Gordura(%)");
		lblPorcentagemGordura.setBounds(calcMid(mainPane, 2)+100, 275, 75, 22);
		lblPorcentagemGordura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcentagemGordura.setForeground(Color.gray);
		lblPorcentagemGordura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPorcentagemGordura);

		txtPorcentagemGordura = new JTextField();
		txtPorcentagemGordura.setEditable(false);
		txtPorcentagemGordura.setBounds(calcMid(mainPane, 2)+180, 275, 45, 22);
		txtPorcentagemGordura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPorcentagemGordura.setForeground(Color.gray);
		centerPanel.add(txtPorcentagemGordura);
		
		JLabel lblPesoGordura = new JLabel("Peso Gordura ");
		lblPesoGordura.setBounds(calcMid(mainPane, 2)+230, 275, 110, 22);
		lblPesoGordura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoGordura.setForeground(Color.gray);
		lblPesoGordura.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoGordura);

		txtPesoGordura = new JTextField();
		txtPesoGordura.setBounds(calcMid(mainPane, 2)+340, 275, 45, 22);
		txtPesoGordura.setEditable(false);
		txtPesoGordura.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoGordura.setForeground(Color.gray);
		centerPanel.add(txtPesoGordura);
		
		JLabel lblPesoMagro = new JLabel("Peso Magro");
		lblPesoMagro.setBounds(calcMid(mainPane, 2)+390, 275, 90, 22);
		lblPesoMagro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoMagro.setForeground(Color.gray);
		lblPesoMagro.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblPesoMagro);

		txtPesoMagro = new JTextField();
		txtPesoMagro.setBounds(calcMid(mainPane, 2)+480, 275, 45, 22);
		txtPesoMagro.setEditable(false);
		txtPesoMagro.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtPesoMagro.setForeground(Color.gray);
		centerPanel.add(txtPesoMagro);
		
		JLabel lblNivel = new JLabel("N�vel/Idade: ");
		lblNivel.setBounds(calcMid(mainPane, 2)+75, 315, 160, 22);
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setForeground(Color.gray);
		lblNivel.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblNivel);

		txtNivel = new JTextField();
		txtNivel.setBounds(calcMid(mainPane, 2)+197, 315, 150, 22);
		txtNivel.setEditable(false);
		txtNivel.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtNivel.setForeground(Color.red);
		centerPanel.add(txtNivel);
		
		JLabel btnReset = new JLabel("Limpar");
		btnReset.setForeground(Color.white);
		btnReset.setOpaque(true);
		btnReset.setBackground(new Color(35, 164, 240));
		btnReset.setHorizontalAlignment(SwingConstants.CENTER);
		btnReset.setBounds(calcButtonPosition(mainPane, 305), 452, 95, 44);
		centerPanel.add(btnReset);
		
		JLabel btnReport = new JLabel("Gerar Relat�rio");
		btnReport.setForeground(Color.white);
		btnReport.setOpaque(true);
		btnReport.setBackground(new Color(35, 164, 240));
		btnReport.setHorizontalAlignment(SwingConstants.CENTER);
		btnReport.setBounds(calcButtonPosition(mainPane, 305)+97, 452, 95, 44);
		centerPanel.add(btnReport);

		JLabel btnSave = new JLabel("Calcular/Salvar");
		btnSave.setForeground(Color.white);
		btnSave.setOpaque(true);
		btnSave.setBackground(new Color(35, 164, 240));
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnSave.setBounds(calcButtonPosition(mainPane, 305)+194, 452, 95, 44);
		centerPanel.add(btnSave);

		pane.add(northPane);
		pane.add(centerPanel);
		pane.setVisible(true);

		
		if (mainPane.getTabCount() == 2) {
			mainPane.removeTabAt(mainPane.getTabCount() - 1);
			mainPane.addTab("Durnin e Womersley Mulheres Idosas", pane);
		} else {
			mainPane.addTab("Durnin e Womersley Mulheres Idosas", pane);
		}
	}
	/**
	 * C�lcula o centro do painel passado.
	 * @param mainPane
	 * @return retorna o ponto central na horizontal do painel
	 */
	private static int calcPaneWidthSizeToSetComponents(JTabbedPane mainPane) {
		return (mainPane.getWidth() / 2);
	}
	/**
	 * D�vide o ponto central do painel na horizontal o n�mero (mid) de vezes que for informado.
	 * 
	 * @param mainPane
	 * @param mid n�mero de vezes a d�vidir
	 * @return retorna o novo ponto central.
	 */
	private static int calcMid(JTabbedPane mainPane, int mid){
		return calcPaneWidthSizeToSetComponents(mainPane)/mid;
	}
	/**
	 * Pega o meio do JTabbedPane, desconta a largura total dos bot�es e soma o que sobra na primeira metade.
	 * 
	 * @param mainPane JTabbedPane para pegar a largura dispon�vel.
	 * @param buttonsSize largura de todos os bot�es alinhados horizontalmente. 
	 * @return Inteiro setando a posi��o do primeiro bot�o.
	 */
	private static int calcButtonPosition(JTabbedPane mainPane, int buttonsSize){
		int midSize = calcPaneWidthSizeToSetComponents(mainPane);
		int aux = midSize -  buttonsSize;
		return midSize + aux;
	}
}
