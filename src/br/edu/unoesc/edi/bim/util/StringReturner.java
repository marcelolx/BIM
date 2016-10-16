/**
 * 
 */
package br.edu.unoesc.edi.bim.util;

import javax.swing.JRadioButton;

/**
 * @author Marcelo
 *
 */
public class StringReturner {
	
	private static String groups = new String();
	private static JRadioButton[] groupList; 

	/**
	 * Return String with the name of selected JRadioButton at the groups listed on register students frame.
	 * @return
	 */
	public static String returnSelectedGroups(){
		for (int i = 0; i < groupList.length; i++) {
			if(groupList[i].isSelected()){
				groups += groupList[i].getText() + "-";
				groupList[i].setSelected(false);
			}
		}
		return groups;
	}
	
	/**
	 * Get list of JRadioButtons added at table of register students frame. 
	 * @param groupList 
	 */
	public static void getGroups(JRadioButton[] groupList){
		StringReturner.groupList = groupList;
	}
	
}
