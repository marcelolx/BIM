/**
 * 
 */
package br.edu.unoesc.edi.bim.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author Marcelo
 *
 */
@DatabaseTable(tableName = "groups")
public class Groups {
	private static final String GROUP_FIELD_ID = "ID";
	private static final String GROUP_FIELD_NAME = "NAME";
	
	@DatabaseField(generatedId = true, columnName = GROUP_FIELD_ID)
	private Integer ID;
	@DatabaseField(canBeNull = false, columnName = GROUP_FIELD_NAME)
	private String name;
	
	public Groups(){
		
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
