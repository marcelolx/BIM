/**
 * 
 */
package br.edu.unoesc.edi.bim.util;

/**
 * @author Marcelo
 *
 *	�nica fun��o de splittar os resultados para um padr�o adotado.
 */
public class ProceduresSplitter {
	public static String split(Double value) {
		return value.toString().substring(0, 5);
	}
	
	public static String split(Float value) {
		return value.toString().substring(0, 5);
	}
}
