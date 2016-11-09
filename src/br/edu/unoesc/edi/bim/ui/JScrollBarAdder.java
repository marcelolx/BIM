package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
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
 *         de dados, no momento s� para exemplo
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
	private static JRadioButton[] newGroupStudents = new JRadioButton[50];
	private static JPanel[] listaAlunos;

	// private static JButton[] buttonViewProfile;

	private static int i = 0;

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
	 * M�todo para listar todos os grupos de alunos cadastrados TODO Necess�rio
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
		StringReturner.getGroups(groupList);
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
		for (int i = 0; i < 50; i++) {
			students[i] = new JRadioButton();
			students[i].setForeground(Color.gray);
			students[i].setBackground(Color.white);
			students[i].setFont(new Font("Sans Serif", Font.PLAIN, 13));
			students[i].setText("Report " + i);
			panelStudents.add(students[i]);
			panelStudents.updateUI();
			panelStudents.repaint();
			panelStudents.revalidate();
		}
	}

	/**
	 * Remove todos os JRadioButtons exibidos no painel de novos grupos (Tela cadastro
	 * de grupos)
	 */
	public static void removeStudentsRadioButtons() {
		panelStudents.removeAll();
		panelStudents.updateUI();
		panelStudents.repaint();
		panelStudents.revalidate();
	}
	
	public static void listStudentsNewGroup() {
		for (int i = 0; i < 50; i++) {
			newGroupStudents[i] = new JRadioButton();
			newGroupStudents[i].setForeground(Color.gray);
			newGroupStudents[i].setBackground(Color.white);
			newGroupStudents[i].setFont(new Font("Sans Serif", Font.PLAIN, 13));
			newGroupStudents[i].setText("Report " + i);
			panelStudentsNewGroup.add(newGroupStudents[i]);
			panelStudentsNewGroup.updateUI();
			panelStudentsNewGroup.repaint();
			panelStudentsNewGroup.revalidate();
		}
	}

	public static void listStudentsAtTabStudents(Rectangle maxBounds, JTabbedPane tabbedPane) {
		try {
			List<Students> students = DAOManager.studentsDAO.queryForAll();
			listaAlunos = new JPanel[students.size()];
			for (i = 0; i < students.size(); i++) {
				listaAlunos[i] = new JPanel();
				listaAlunos[i].setLayout(null);
				listaAlunos[i].setBounds(0, i * 55, maxBounds.width - 247, 55);
				listaAlunos[i]
						.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void removeTabStudentsPanels() {
		panelTabStudents.removeAll();
		panelTabStudents.updateUI();
		panelTabStudents.repaint();
		panelTabStudents.revalidate();
	}
	
	public static void removeListGroupsLabels() {
		panelGroups.removeAll();
		panelGroups.updateUI();
		panelGroups.repaint();
		panelGroups.revalidate();
	}
}
