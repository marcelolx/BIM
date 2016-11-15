package br.edu.unoesc.edi.bim.util;

import javax.swing.JRadioButton;

/**
 * @author Marcelo
 *
 */
public class StringReturner {
	
	private static String groups = new String();
	private static JRadioButton[] groupList; 
	private static JRadioButton[] studentListForRegisterGroups; 
	private static JRadioButton[] studentListForRegisterNewGroups;

	/**
	 * Return String with the name of selected JRadioButton at the groups listed on register students frame.
	 * @return
	 */
	public static String returnSelectedGroups(){
		groups = "";
		for (int i = 0; i < groupList.length; i++) {
			if(groupList[i].isSelected()){
				groups += groupList[i].getText() + "-";
				//groupList[i].setSelected(false);
			}
		}
		return groups;
	}
	
	/**
	 * Set selected groups to "not-selected" if new user/student are created.
	 */
	public static void setSelectedGroupsOff(){
		for (int i = 0; i < groupList.length; i++) {
			if(groupList[i].isSelected()){
				groupList[i].setSelected(false);
			}
		}
	}
	
	/**
	 * Get list of JRadioButtons added at table of register students frame.
	 * 
	 * @param groupList
	 */
	public static void getGroupsAtTabSingUpStudent(JRadioButton[] groupList) {
		StringReturner.groupList = groupList;
	}
	/**
	 * Seta como selected os grupos que o estudante participa quando abrir a aba Cadastro Estudandte
	 * 
	 * @param listOfGroups Array com os nomes do grupos a qual o aluno participa
	 */
	public static void setGroups(String[] listOfGroups){
		for (int i = 0; i < groupList.length; i++) {
			for (int j = 0; j < listOfGroups.length; j++) {
				if(groupList[i].getText().equals(listOfGroups[j])){
					groupList[i].setSelected(true);
				}
					
			}
			
		}
	}
	/**
	 * Quebra a String contendo todos os nomes dos grupos e retorna um array com os nomes.
	 * 
	 * @param groups String com o nome dos grupos a qual aluno participa. 
	 * @return retorna um array de string com os nomes.
	 */
	public static String [] breakString(String groups){
		String groupsVet[] = groups.split("-", -1);
		return groupsVet;
	}
	
	/**
	 * Get list of JRadioButtons added at table of register students frame. 
	 * @param groupList 
	 */
	public static void getStudentsAtTabRegisterGroups(JRadioButton[] groupList){
		studentListForRegisterGroups = groupList;
	}
	
	public static JRadioButton[] returnSelectedStudents(){
		int cont=0;
		
		for (int i = 0; i < studentListForRegisterGroups.length; i++) {
			if(studentListForRegisterGroups[i].isSelected()){
				cont++;
			}
		}
		
		JRadioButton[] selecteds = new JRadioButton[cont];
		int aux=0;
		
		for (int i = 0; i < studentListForRegisterGroups.length; i++) {
			if(studentListForRegisterGroups[i].isSelected()){
				selecteds[aux] = new JRadioButton();
				selecteds[aux].setText(studentListForRegisterGroups[i].getText());
				selecteds[aux].setToolTipText(studentListForRegisterGroups[i].getToolTipText());
				aux++;
				studentListForRegisterGroups[i].setSelected(false);
			}
		}
		return selecteds;
	}
	
	public static void getStudentsAtTabRegisterGroupsForNewGroup(JRadioButton[] groupList){
		studentListForRegisterNewGroups = groupList;
	}
	
	public static JRadioButton[] returnNewGroupForStudents(){
		return studentListForRegisterNewGroups;
	}
}
