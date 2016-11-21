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
	 * C�lcula o percentual de gordura, baseando se nas m�todologias dispostas
	 * por Gon�alves Mulheres Idosas.
	 * 
	 * @param weight
	 * @param pescoco
	 * @param cintura
	 * @param quadril
	 * @return Retorna um Double.
	 */
	public static double percentualGordura(Float weight, Float pescoco, Float cintura, Float quadril) {
		return (-0.242 * weight - (0.745 * pescoco) + (0.425 * cintura) + (0.464 * quadril));
	}

	/**
	 * C�lcula o percentual de gordura, baseando se nas m�todologias dispostas
	 * por Gon�alves Mulheres Idosas.
	 * 
	 * @param weight
	 * @param height
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * C�lcula o percentual de gordura, baseando se nas m�todologias dispostas
	 * por Gon�alves Mulheres Idosas.
	 * 
	 * @param cintura
	 * @param quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
