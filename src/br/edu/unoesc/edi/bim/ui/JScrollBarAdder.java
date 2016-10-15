package br.edu.unoesc.edi.bim.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import br.edu.unoesc.edi.bim.actions.ActionJlabelGroups;
import br.edu.unoesc.edi.bim.actions.ActionJlabelReports;

/**
 * 
 * @author Marcelo
 * TODO 
 * 	Classe que precisa ser refeita para trabalhar com a base de dados, no momento s� para exemplo
 *
 */
public class JScrollBarAdder {

	private static JScrollPane scrollPaneGroups;
	private static JScrollPane scrollPaneReports;
	private static JScrollPane scrollPaneGroupsRadioButton;
	private static JScrollPane scrollPaneStudents;
	private static JScrollPane scrollPaneStudentsNewGroup;
	private static JPanel panelGroups;
	private static JPanel panelReports;
	private static JPanel panelGroupsRadioButton;
	private static JPanel panelStudents;
	private static JPanel panelStudentsNewGroup;
	
	private static JLabel[] group = new JLabel[100];
	private static JLabel[] reports = new JLabel[100];
	private static JRadioButton[] groupList = new JRadioButton[100];
	private static JRadioButton[] students = new JRadioButton[100];
	private static JRadioButton[] newGroupStudents = new JRadioButton[100];

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
			panelStudentsNewGroup= new JPanel();
			panelStudentsNewGroup.setLayout(new BoxLayout(panelStudentsNewGroup, BoxLayout.Y_AXIS));
			panelStudentsNewGroup.setBackground(Color.white);
		}
		return panelStudentsNewGroup;
	}
	
	/*
	 * M�todo para listar todos os grupos de alunos cadastrados 
	 * TODO Necess�rio pegar todos os grupos do DB ainda e listar.
	 */
	public static void listGroupsLabels() {
		for (int i = 0; i < 50; i++) {
			group[i] = new JLabel();
			group[i].setForeground(Color.black);
			group[i].setFont(new Font("BankGothic Md BT", Font.BOLD, 14));
			group[i].setText("Group " + i);
			group[i].addMouseListener(new ActionJlabelGroups());
			panelGroups.add(group[i]);
			panelGroups.updateUI();
			panelGroups.repaint();
			panelGroups.revalidate();
		}
	}

	public static void listGroupsRadioButtons() {
		for (int i = 0; i < 50; i++) {
			groupList[i] = new JRadioButton();
			groupList[i].setForeground(Color.gray);
			groupList[i].setBackground(Color.white);
			groupList[i].setFont(new Font("Sans Serif", Font.PLAIN, 13));
			groupList[i].setText("Group " + i);
			panelGroupsRadioButton.add(groupList[i]);
			panelGroupsRadioButton.updateUI();
			panelGroupsRadioButton.repaint();
			panelGroupsRadioButton.revalidate();
		}
	}

	public static void listTypeOfReports() {
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

}