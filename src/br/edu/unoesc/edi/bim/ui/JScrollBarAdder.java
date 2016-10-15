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
 *
 */
public class JScrollBarAdder {

	private static JScrollPane scrollPaneGroups;
	private static JScrollPane scrollPaneReports;
	private static JScrollPane scrollPaneGroupsRadioButton;
	private static JPanel panelGroups;
	private static JPanel panelReports;
	private static JPanel panelGroupsRadioButton;

	private static JLabel[] group = new JLabel[100];
	private static JLabel[] reports = new JLabel[100];
	private static JRadioButton[] groupList = new JRadioButton[100];

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

	/*
	 * Método para listar todos os grupos de alunos cadastrados TODO Necessário
	 * pegar todos os grupos do DB ainda e listar.
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

}
