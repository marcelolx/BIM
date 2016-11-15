package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

import br.edu.unoesc.edi.bim.actions.ActionJlabelGroups;
import br.edu.unoesc.edi.bim.actions.ActionJlabelReports;
import br.edu.unoesc.edi.bim.db.dao.DAOManager;
import br.edu.unoesc.edi.bim.db.model.Groups;
import br.edu.unoesc.edi.bim.db.model.Students;
import br.edu.unoesc.edi.bim.ui.tabs.TabSingUpStudent;
import br.edu.unoesc.edi.bim.util.StringReturner;

/**
 * 
 * @author Marcelo TODO Classe que precisa ser refeita para trabalhar com a base
 *         de dados, no momento sï¿½ para exemplo
 *
 */
public class JScrollBarAdder {

	private static JScrollPane scrollPaneGroups;
	private static JScrollPane scrollPaneReports;
	private static JScrollPane scrollPaneGroupsRadioButton;
	private static JScrollPane scrollPaneStudents;
	private static JScrollPane scrollPaneStudentsNewGroup;
	private static JScrollPane scrollPaneListStudents;
	private static JPanel panelGroups;
	private static JPanel panelReports;
	private static JPanel panelGroupsRadioButton;
	private static JPanel panelStudents;
	private static JPanel panelStudentsNewGroup;
	private static JPanel panelTabStudents;

	private static JLabel[] group;
	private static JLabel[] reports = new JLabel[50];
	private static JRadioButton[] groupList;
	private static JRadioButton[] students = new JRadioButton[50];
	private static JRadioButton[] newGroupStudents;
	private static JPanel[] listaAlunos;

	// private static JButton[] buttonViewProfile;

	private static int i = 0;
	private static List<Students> especificStudents;

	public static JScrollPane getScrollPaneGroups() {
		if (scrollPaneGroups == null) {
			scrollPaneGroups = new JScrollPane();
			scrollPaneGroups.setViewportView(getPanelGroups());
		}
		return scrollPaneGroups;
	}

	private static JPanel getPanelGroups() {
		if (panelGroups == null) {
			panelGroups = new JPanel();
			panelGroups.setLayout(new BoxLayout(panelGroups, BoxLayout.Y_AXIS));
			panelGroups.setBackground(Color.white);
		}
		return panelGroups;
	}

	public static JScrollPane getScrollPaneReports() {
		if (scrollPaneReports == null) {
			scrollPaneReports = new JScrollPane();
			scrollPaneReports.setViewportView(getPanelReports());
		}
		return scrollPaneReports;
	}

	private static JPanel getPanelReports() {
		if (panelReports == null) {
			panelReports = new JPanel();
			panelReports.setLayout(new BoxLayout(panelReports, BoxLayout.Y_AXIS));
			panelReports.setBackground(Color.white);
		}
		return panelReports;
	}

	public static JScrollPane getScrollPaneGroupsRadioButton() {
		if (scrollPaneGroupsRadioButton == null) {
			scrollPaneGroupsRadioButton = new JScrollPane();
			scrollPaneGroupsRadioButton.setViewportView(getPanelGroupsRadioButton());
		}
		return scrollPaneGroupsRadioButton;
	}

	private static JPanel getPanelGroupsRadioButton() {
		if (panelGroupsRadioButton == null) {
			panelGroupsRadioButton = new JPanel();
			panelGroupsRadioButton.setLayout(new BoxLayout(panelGroupsRadioButton, BoxLayout.Y_AXIS));
			panelGroupsRadioButton.setBackground(Color.white);
		}
		return panelGroupsRadioButton;
	}

	public static JScrollPane getScrollPaneStudents() {
		if (scrollPaneStudents == null) {
			scrollPaneStudents = new JScrollPane();
			scrollPaneStudents.setViewportView(getPanelStudents());
		}
		return scrollPaneStudents;
	}

	private static JPanel getPanelStudents() {
		if (panelStudents == null) {
			panelStudents = new JPanel();
			panelStudents.setLayout(new BoxLayout(panelStudents, BoxLayout.Y_AXIS));
			panelStudents.setBackground(Color.white);
		}
		return panelStudents;
	}

	public static JScrollPane getScrollPaneStudentsNewGroup() {
		if (scrollPaneStudentsNewGroup == null) {
			scrollPaneStudentsNewGroup = new JScrollPane();
			scrollPaneStudentsNewGroup.setViewportView(getPanelStudentsNewGroup());
		}
		return scrollPaneStudentsNewGroup;
	}

	private static JPanel getPanelStudentsNewGroup() {
		if (panelStudentsNewGroup == null) {
			panelStudentsNewGroup = new JPanel();
			panelStudentsNewGroup.setLayout(new BoxLayout(panelStudentsNewGroup, BoxLayout.Y_AXIS));
			panelStudentsNewGroup.setBackground(Color.white);
		}
		return panelStudentsNewGroup;
	}

	public static JScrollPane getScrollPaneTabStudents() {
		if (scrollPaneListStudents == null) {
			scrollPaneListStudents = new JScrollPane();
			scrollPaneListStudents.setViewportView(getPanelTabStudents());
		}
		return scrollPaneListStudents;
	}

	private static JPanel getPanelTabStudents() {
		if (panelTabStudents == null) {
			panelTabStudents = new JPanel();
			panelTabStudents.setLayout(new BoxLayout(panelTabStudents, BoxLayout.Y_AXIS));
			panelTabStudents.setBackground(Color.white);
		}
		return panelTabStudents;
	}

	/*
	 * Método para listar todos os grupos de alunos cadastrados TODO Necessário
	 * pegar todos os grupos do DB ainda e listar.
	 */
	public static void listGroupsLabels() {
		removeListGroupsLabels();
		try {
			List<Groups> listOfGroups = DAOManager.groupsDAO.queryForAll();
			group = new JLabel[listOfGroups.size()];
			for (int i = 0; i < listOfGroups.size(); i++) {
				group[i] = new JLabel();
				group[i].setForeground(Color.black);
				group[i].setFont(new Font("BankGothic Md BT", Font.BOLD, 14));
				group[i].setText(listOfGroups.get(i).getName());
				group[i].addMouseListener(new ActionJlabelGroups());
				panelGroups.add(group[i]);
				panelGroups.updateUI();
				panelGroups.repaint();
				panelGroups.revalidate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void listGroupsRadioButtons() {
		try {
			List<Groups> listOfGroups = DAOManager.groupsDAO.queryForAll();
			groupList = new JRadioButton[listOfGroups.size()];

			for (int i = 0; i < listOfGroups.size(); i++) {
				groupList[i] = new JRadioButton();
				groupList[i].setForeground(Color.gray);
				groupList[i].setBackground(Color.white);
				groupList[i].setFont(new Font("Sans Serif", Font.PLAIN, 13));
				groupList[i].setText(listOfGroups.get(i).getName());
				panelGroupsRadioButton.add(groupList[i]);
				panelGroupsRadioButton.updateUI();
				panelGroupsRadioButton.repaint();
				panelGroupsRadioButton.revalidate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringReturner.getGroupsAtTabSingUpStudent(groupList);
	}

	/**
	 * Remove todos os JRadioButtons exibidos no painel de grupos (Tela cadastro
	 * de alunos)
	 */
	public static void removeGroupsRadioButtons() {
		panelGroupsRadioButton.removeAll();
		panelGroupsRadioButton.updateUI();
		panelGroupsRadioButton.repaint();
		panelGroupsRadioButton.revalidate();
	}

	public static void listReportsLabels() {
		for (int i = 0; i < 50; i++) {
			reports[i] = new JLabel();
			reports[i].setForeground(Color.black);
			reports[i].setFont(new Font("BankGothic Md BT", Font.BOLD, 14));
			reports[i].setText("Report " + i);
			reports[i].addMouseListener(new ActionJlabelReports());
			panelReports.add(reports[i]);
			panelReports.updateUI();
			panelReports.repaint();
			panelReports.revalidate();
		}
	}

	public static void listStudents() {
		students = new JRadioButton[especificStudents.size()];
		for (int i = 0; i < especificStudents.size(); i++) {
			students[i] = new JRadioButton();
			students[i].setForeground(Color.gray);
			students[i].setBackground(Color.white);
			students[i].setFont(new Font("Sans Serif", Font.PLAIN, 13));
			students[i].setText(especificStudents.get(i).getName());
			students[i].setToolTipText(especificStudents.get(i).getStudentId().toString());
			panelStudents.add(students[i]);
			panelStudents.updateUI();
			panelStudents.repaint();
			panelStudents.revalidate();
		}
		StringReturner.getStudentsAtTabRegisterGroups(students);
	}

	public static void listStudentsNewGroup() {
		JRadioButton[] returnedRadButton = StringReturner.returnSelectedStudents();
		newGroupStudents = new JRadioButton[returnedRadButton.length];
		for (int i = 0; i < returnedRadButton.length; i++) {
			newGroupStudents[i] = new JRadioButton();
			newGroupStudents[i].setForeground(Color.gray);
			newGroupStudents[i].setBackground(Color.white);
			newGroupStudents[i].setFont(new Font("Sans Serif", Font.PLAIN, 13));
			newGroupStudents[i].setText(returnedRadButton[i].getText());
			newGroupStudents[i].setToolTipText(returnedRadButton[i].getToolTipText());
			newGroupStudents[i].setSelected(false);
			panelStudentsNewGroup.add(newGroupStudents[i]);
			panelStudentsNewGroup.updateUI();
			panelStudentsNewGroup.repaint();
			panelStudentsNewGroup.revalidate();
		}
		StringReturner.getStudentsAtTabRegisterGroupsForNewGroup(newGroupStudents);
	}

	/**
	 * Remove todos os JRadioButtons exibidos no painel de alunos para novos
	 * grupos (Tela cadastro de grupos)
	 */
	public static void removeStudentsForNewGroupRadioButtons() {
		panelStudentsNewGroup.removeAll();
		panelStudentsNewGroup.updateUI();
		panelStudentsNewGroup.repaint();
		panelStudentsNewGroup.revalidate();
	}

	/**
	 * Método que lista todos os estudantes cadastrados na Tab inicial.
	 * 
	 * São listados em JPanels, onde suas informações são listadas.
	 * 
	 * @param maxBounds
	 * @param tabbedPane
	 */
	public static void listStudentsAtTabStudents(Rectangle maxBounds, JTabbedPane tabbedPane) {
		try {
			List<Students> students = DAOManager.studentsDAO.queryForAll();
			getListOfStudents(students);// passa a lista para esse método,
										// para que quando uma pesquisa for
										// efetuada, já se tenha a lista de
										// estudantes
			int sizeList = students.size();
			abstractPanelsForListStudents(sizeList, students, maxBounds, tabbedPane);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Pega a lista de estudantes toda vez que o método
	 * listStudentsAtTabStudents é chamado, para te-la sempre atualizada e não
	 * fazer novas chamadas ao banco.
	 * 
	 * @param students
	 */
	public static void getListOfStudents(List<Students> students) {
		especificStudents = students;
	}

	/**
	 * Faz a pesquisa na base de dados dos estudantes pesquisados na TabStudents
	 * e chama o método para listar os estudantes em JPanels.
	 * 
	 * @param maxBounds
	 *            Tamanho da tela disponpivel
	 * @param tabbedPane
	 *            JTabbed para adicionar os componentes
	 * @param nameSearched
	 *            String contendo os caracteres sendo pesquisados
	 */
	public static void listSearchedStudents(Rectangle maxBounds, JTabbedPane tabbedPane, String nameSearched) {
		List<Integer> ids = new ArrayList<Integer>();// para salvar os ids dos
														// nomes que contem os
														// caracteres
														// pesquisados
		// Percorrimento da lista a procura dos nomes que contem os caracteres
		// específicos pesquisados e salvando seus ids
		for (int i = 0; i < especificStudents.size(); i++) {
			if (especificStudents.get(i).getName().contains(nameSearched)) {
				ids.add(especificStudents.get(i).getStudentId());
			}
		}

		List<Students> studentsFound = new ArrayList<Students>();
		for (int i = 0; i < ids.size(); i++) {
			try {
				studentsFound.add(DAOManager.studentsDAO.queryForId(ids.get(i)));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int sizeList = studentsFound.size();
		removeTabStudentsPanels();
		abstractPanelsForListStudents(sizeList, studentsFound, maxBounds, tabbedPane);
	}

	/**
	 * Método com a função de adicionar o número de paineis necessários para
	 * listar os alunos cadastrados e/ou os procurados
	 * 
	 * @param sizeList
	 *            Tamanho da lista(Consequentemente, número de paineis)
	 * @param students
	 *            Lista de estudantes
	 * @param maxBounds
	 *            Tamanho disponível da tela
	 * @param tabbedPane
	 *            JTabbedPane ao qual os paineis serão adicionados.
	 */
	public static void abstractPanelsForListStudents(Integer sizeList, List<Students> students, Rectangle maxBounds,
			JTabbedPane tabbedPane) {
		listaAlunos = new JPanel[sizeList];
		for (i = 0; i < sizeList; i++) {
			listaAlunos[i] = new JPanel();
			listaAlunos[i].setLayout(null);
			listaAlunos[i].setBounds(0, i * 55, maxBounds.width - 247, 55);
			listaAlunos[i].setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			listaAlunos[i].setPreferredSize(new Dimension(maxBounds.width - 267, 55));
			if (i % 2 == 0) {
				listaAlunos[i].setBackground(Color.WHITE);
			}
			listaAlunos[i].setForeground(Color.BLACK);
			listaAlunos[i].setOpaque(true);

			JLabel name = new JLabel("Nome: " + students.get(i).getName());
			name.setBounds(2, 4, (maxBounds.width - 255) / 2, 23);
			name.setFont(new Font("Tahoma", Font.PLAIN, 14));
			JLabel mail = new JLabel("Email: " + students.get(i).getEmail());
			mail.setBounds(2, 29, (maxBounds.width - 255) / 2, 23);
			mail.setFont(new Font("Tahoma", Font.PLAIN, 14));
			JLabel age = new JLabel("Idade: " + students.get(i).getAge());
			age.setBounds((maxBounds.width - 247) / 2, 4, (maxBounds.width - 255) / 2, 23);
			age.setFont(new Font("Tahoma", Font.PLAIN, 14));
			JButton id = new JButton();
			id.setText("Sobre");
			id.setToolTipText(students.get(i).getStudentId().toString());
			id.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					if (!FrmMain.firstOpenedStudents) {
						TabSingUpStudent.init(tabbedPane);
						TabSingUpStudent.fillInputFields(Integer.parseInt(id.getToolTipText()));
						tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
						FrmMain.firstOpenedStudents = true;
					} else {
						JScrollBarAdder.removeGroupsRadioButtons();
						TabSingUpStudent.init(tabbedPane);
						TabSingUpStudent.fillInputFields(Integer.parseInt(id.getToolTipText()));
						tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
					}
				}
			});
			id.setBounds((maxBounds.width - 247) / 2, 29, 80, 23);
			id.setFont(new Font("Tahoma", Font.PLAIN, 14));

			listaAlunos[i].add(name);
			listaAlunos[i].add(mail);
			listaAlunos[i].add(age);
			listaAlunos[i].add(id);
			panelTabStudents.add(listaAlunos[i]);
			panelTabStudents.updateUI();
			panelTabStudents.repaint();
			panelTabStudents.revalidate();
		}
	}

	/**
	 * Remove todos os paineis do painel que lista os estudantes.
	 */
	public static void removeTabStudentsPanels() {
		panelTabStudents.removeAll();
		panelTabStudents.updateUI();
		panelTabStudents.repaint();
		panelTabStudents.revalidate();
	}

	/**
	 * Remove todos os JLabels do painel Groups.
	 */
	public static void removeListGroupsLabels() {
		panelGroups.removeAll();
		panelGroups.updateUI();
		panelGroups.repaint();
		panelGroups.revalidate();
	}
}
