/**
 * 
 */
package br.edu.unoesc.edi.bim.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.db.model.Students;
import br.edu.unoesc.edi.bim.ui.JScrollBarAdder;

/**
 * @author Marcelo
 *
 */
public class SearchStudent {
	public static void listSearchedStudents(String nameSearched,  JLabel lblStudentId,
			JSearchField txtName, JTextField txtBirthday, JTextField txtAge, JRadioButton rbGenreMale,
			JRadioButton rbGenreFemale, JTextField txtWeight, JTextField txtHeight) {
		List<Students> students = new ArrayList<Students>();
		students = JScrollBarAdder.setListOfStudents();
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().contains(nameSearched)) {
				int id = students.get(i).getStudentId(); 
				FillTabInputFields.fillInputFields(id, lblStudentId, txtName, txtBirthday, txtAge, rbGenreMale, rbGenreFemale, txtWeight, txtHeight);
			}
		}

	}
}
