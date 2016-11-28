/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class GoncalvesMulheresIdosas {
	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Gonçalves Mulheres Idosas.
	 * 
	 * @param weight Peso
	 * @param pescoco Medida em mm do Pescoço
	 * @param cintura Medida em cm da cintura
	 * @param quadril Medida em cm do quadril
	 * @return Retorna um Double.
	 */
	public static double percentualGordura(Float weight, Float pescoco, Float cintura, Float quadril) {
		return (-0.242 * weight - (0.745 * pescoco) + (0.425 * cintura) + (0.464 * quadril));
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Gonçalves Mulheres Idosas.
	 * 
	 * @param weight Peso
	 * @param height Altura em cm
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Gonçalves Mulheres Idosas.
	 * 
	 * @param cintura Medida em cm da cintura
	 * @param quadril Medida em cm do quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
