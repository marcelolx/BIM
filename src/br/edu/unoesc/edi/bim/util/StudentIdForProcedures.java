package br.edu.unoesc.edi.bim.util;

/**
 * 
 * @author Marcelo
 * A princípio só tem a função de getters and setters
 */
public class StudentIdForProcedures {
	
	private static Integer id=0;
	
	public static Integer getId() {
		return id;
	}

	public static void setId(Integer idP) {
		id = idP;
	}
}
