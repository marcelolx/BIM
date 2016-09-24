/**
 * 
 */
package br.edu.unoesc.edi.bim.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Table users on my database.<br>
 * Contains tree fields GeneratedID(Auto-increment and primary Key), User name and password.
 * @author Marcelo
 *
 */

@DatabaseTable(tableName = "users")
public class Users {
	private static final String PASSWORD_FIELD_NAME = "password";

	private static final String USER_FIELD_NAME = "user";

	@DatabaseField(generatedId = true)
	private Integer userID;

	@DatabaseField(canBeNull = false, columnName = USER_FIELD_NAME) 
	private String userName;
	@DatabaseField(canBeNull = false, columnName = PASSWORD_FIELD_NAME) 
	private String userPass; 
	
	public Users() {
		
	}
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
}

