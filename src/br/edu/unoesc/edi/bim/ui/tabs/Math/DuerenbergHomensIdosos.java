/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class DuerenbergHomensIdosos {
	/**
	 * C�lcula o �ndice de massa corporal, baseando se nas met�dologias
	 * dispostas por Duerenberg para homens idosos.
	 * 
	 * @param imc
	 * @param weight
	 * @return Retorna um Double.
	 */
	public static double percentualGordura(Float imc, Integer age) {
		return ((1.2 * imc) + (0.23 * age) - (10.8 * 1) - 5.4);
	}

	/**
	 * C�lcula o �ndice de massa corporal, baseando se nas met�dologias
	 * dispostas por Duerenberg para homens idosos.
	 * 
	 * @param weight
	 * @param height
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * C�lcula a raz�o cintura quadril, baseando se nas met�dologias dispostas
	 * por Duerenberg para homens idosos.
	 * 
	 * @param cintura
	 * @param quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
