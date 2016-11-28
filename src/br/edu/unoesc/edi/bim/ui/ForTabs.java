/**
 * 
 */
package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.util.FillTabInputFields;
import br.edu.unoesc.edi.bim.util.SearchStudent;
import br.edu.unoesc.edi.bim.util.StudentIdForProcedures;

/**
 * @author Marcelo/Jonathan
 *
 */
public class ForTabs {

	private static JSearchField txtSearch;

	public static void componentsForStudentInfos(JTabbedPane mainPane, JPanel centerPanel, JLabel lblStudentId,
			JSearchField txtName, JTextField txtBirthday, JTextField txtAge, JRadioButton rbGenreMale,
			JRadioButton rbGenreFemale, JTextField txtWeight, JTextField txtHeight) {
		
		
		JLabel lblid = new JLabel("ID ");
		lblid.setBounds(calcPaneWidthSizeToSetComponents(mainPane) / 20, 10, 30, 22);
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setForeground(Color.gray);
		lblid.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblid);

		lblStudentId.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 20) + 35, 10, 25, 22);
		lblStudentId.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentId.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		lblStudentId.setForeground(Color.gray);
		centerPanel.add(lblStudentId);

		JLabel lblSearch = new JLabel("Search ");
		lblSearch.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 20) + 138, 10, 60, 22);
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setForeground(Color.gray);
		lblSearch.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblSearch);

		txtSearch = new JSearchField();
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SearchStudent.listSearchedStudents(txtSearch.getText(), lblStudentId, txtName, txtBirthday, txtAge, rbGenreMale, rbGenreFemale, txtWeight, txtHeight);
			}
		});
		txtSearch.setBounds(((calcPaneWidthSizeToSetComponents(mainPane) / 20)) + 197, 10, 200, 22);
		txtSearch.setEmptyText("Pesquise pelo nome/sobrenome");
		txtSearch.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtSearch.setForeground(Color.gray);
		centerPanel.add(txtSearch);

		JLabel lblName = new JLabel("Nome *");
		lblName.setBounds(calcPaneWidthSizeToSetComponents(mainPane) / 20, 50, 60, 22);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.gray);
		lblName.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblName);

		txtName.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 20) + 57, 50, 340, 22);
		txtName.setEmptyText("Nome completo sem abreviações");
		txtName.setEditable(false);
		txtName.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtName.setForeground(Color.gray);
		centerPanel.add(txtName);

		JLabel lblBirthday = new JLabel("Data Nascimento*");
		lblBirthday.setBounds(calcPaneWidthSizeToSetComponents(mainPane) / 20, 92, 120, 22);
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setForeground(Color.gray);
		lblBirthday.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblBirthday);
		/*
		try {
			javax.swing.text.MaskFormatter birthday = new javax.swing.text.MaskFormatter("##/##/####");
			txtBirthday = new javax.swing.JFormattedTextField(birthday);
		} catch (Exception e) {
		}*/
		txtBirthday.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 20) + 125, 90, 170, 22);
		txtBirthday.setEditable(false);
		txtBirthday.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtBirthday.setForeground(Color.gray);
		centerPanel.add(txtBirthday);

		JLabel lblAge = new JLabel("Idade*");
		lblAge.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 20) + 293, 90, 60, 22);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(Color.gray);
		lblAge.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblAge);

		txtAge.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 20) + 352, 90, 45, 22);
		txtAge.setEditable(false);
		txtAge.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtAge.setForeground(Color.gray);
		centerPanel.add(txtAge);

		JLabel lblGenre = new JLabel("Gênero*");
		lblGenre.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 5) + 5, 124, 60, 22);
		lblGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenre.setForeground(Color.gray);
		lblGenre.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblGenre);

		rbGenreMale.setEnabled(false);
		rbGenreMale.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 5) + 62, 124, 109, 22);
		rbGenreMale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreMale.setBackground(Color.white);
		rbGenreMale.setForeground(Color.gray);
		centerPanel.add(rbGenreMale);

		rbGenreFemale.setEnabled(false);
		rbGenreFemale.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 5) + 173, 124, 109, 22);
		rbGenreFemale.setFont(new Font("Sans Serif", Font.BOLD, 13));
		rbGenreFemale.setBackground(Color.white);
		rbGenreFemale.setForeground(Color.gray);
		centerPanel.add(rbGenreFemale);

		JLabel lblWeight = new JLabel("Peso(kg)*");
		lblWeight.setBounds(calcPaneWidthSizeToSetComponents(mainPane) / 5, 158, 60, 22);
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight.setForeground(Color.gray);
		lblWeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblWeight);

		txtWeight.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 5) + 65, 158, 45, 22);
		txtWeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtWeight.setForeground(Color.gray);
		centerPanel.add(txtWeight);

		JLabel lblHeight = new JLabel("Altura(cm)*");
		lblHeight.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 5) + 137, 158, 70, 22);
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setForeground(Color.gray);
		lblHeight.setFont(new Font("Sans Serif", Font.BOLD, 13));
		centerPanel.add(lblHeight);

		/*
		try {
			javax.swing.text.MaskFormatter height = new javax.swing.text.MaskFormatter("###");
			txtHeight = new javax.swing.JFormattedTextField(height);
		} catch (Exception e) {
		}*/
		txtHeight.setBounds((calcPaneWidthSizeToSetComponents(mainPane) / 5) + 217, 158, 45, 22);
		txtHeight.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		txtHeight.setForeground(Color.gray);
		centerPanel.add(txtHeight);

		// Prenche os campos se o usuário abriu pelo tablistProcedures//ou pela
		// menu lateral procedures
		Integer id = StudentIdForProcedures.getId();
		if (!(id == 0)) {
			FillTabInputFields.fillInputFields(id, lblStudentId, txtName, txtBirthday, txtAge, rbGenreMale,
					rbGenreFemale, txtWeight, txtHeight);
		}
	}

	/**
	 * Cálcula o centro do painel passado.
	 * 
	 * @param mainPane TabbedPane princípal
	 * @return retorna o ponto central na horizontal do painel
	 */
	public static int calcPaneWidthSizeToSetComponents(JTabbedPane mainPane) {
		return (mainPane.getWidth() / 2);
	}

	/**
	 * Dívide o ponto central do painel na horizontal o número (mid) de vezes
	 * que for informado.
	 * 
	 * @param mainPane TabbedPane princípal
	 * @param mid número de vezes a dívidir
	 * @return retorna o novo ponto central.
	 */
	public static int calcMid(JTabbedPane mainPane, int mid) {
		return calcPaneWidthSizeToSetComponents(mainPane) / mid;
	}

	/**
	 * Pega o meio do JTabbedPane, desconta a largura total dos botões e soma o
	 * que sobra na primeira metade.
	 * 
	 * @param mainPane
	 *            JTabbedPane para pegar a largura disponível.
	 * @param buttonsSize
	 *            largura de todos os botões alinhados horizontalmente.
	 * @return Inteiro setando a posição do primeiro botão.
	 */
	public static int calcButtonPosition(JTabbedPane mainPane, int buttonsSize) {
		int midSize = calcPaneWidthSizeToSetComponents(mainPane);
		int aux = midSize - buttonsSize;
		return midSize + aux;
	}
}
