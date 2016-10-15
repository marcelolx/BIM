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
@DatabaseTable(tableName = "students")
public class Students {
	private static final String STUDENT_FIELD_ID = "ID";
	private static final String STUDENT_FIELD_NAME = "NAME";
	private static final String STUDENT_FIELD_EMAIL = "EMAIL";
	private static final String STUDENT_FIELD_PHONE = "PHONE";
	private static final String STUDENT_FIELD_BIRTHDAY = "BIRTHDAY";
	private static final String STUDENT_FIELD_AGE = "AGE";
	private static final String STUDENT_FIELD_GENRE = "GENRE";
	private static final String STUDENT_FIELD_WEIGHT = "WEIGHT";
	private static final String STUDENT_FIELD_HEIGHT = "HEIGHT";
	private static final String STUDENT_FIELD_GROUPS = "GROUPS";

	@DatabaseField(generatedId = true, columnName = STUDENT_FIELD_ID)
	private Integer studentId;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_NAME)
	private String name;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_EMAIL)
	private String email;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_PHONE)
	private Integer phone;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_BIRTHDAY)
	private Integer birthday;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_AGE)
	private Integer age;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_GENRE)
	private Character genre;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_WEIGHT)
	private Float weight;
	@DatabaseField(canBeNull = false, columnName = STUDENT_FIELD_HEIGHT)
	private Float height;
	@DatabaseField(canBeNull = true, columnName = STUDENT_FIELD_GROUPS)
	private String groups;

	public Students() {

	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getGenre() {
		return genre;
	}

	public void setGenre(Character genre) {
		this.genre = genre;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

}
