/**
 * 
 */
package br.edu.unoesc.edi.bim.actions;

import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.edu.unoesc.edi.bim.components.JSearchField;
import br.edu.unoesc.edi.bim.db.dao.DAOManager;
import br.edu.unoesc.edi.bim.db.model.Students;
/**
 * @author Marcelo
 *
 */
public class FillTabInputFields {
	public static void fillInputFields(Integer id,  JLabel lblStudentId,
			JSearchField txtName, JTextField txtBirthday, JTextField txtAge, JRadioButton rbGenreMale,
			JRadioButton rbGenreFemale, JTextField txtWeight, JTextField txtHeight) {
		try {
			
			Students student = DAOManager.studentsDAO.queryForId(id);
			lblStudentId.setText(id.toString());
			txtName.setText(student.getName());
			txtBirthday.setText(student.getBirthday().toString());
			txtAge.setText(student.getAge().toString());
			txtWeight.setText(student.getWeight().toString());
			txtHeight.setText(student.getHeight().toString());
			
			char sex = student.getGenre();
			if (sex == 'F') {
				rbGenreFemale.setSelected(true);
				rbGenreMale.setSelected(false);
			} else {
				rbGenreFemale.setSelected(false);
				rbGenreMale.setSelected(true);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
