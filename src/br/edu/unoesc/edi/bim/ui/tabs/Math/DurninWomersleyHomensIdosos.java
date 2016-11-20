/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class DurninWomersleyHomensIdosos {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Durnin e Womersley para homens idosos.
	 * 
	 * @param bicipital
	 * @param supraIliaca
	 * @return Retorna um Double
	 */
	public static double densidadeCorporal(Integer bicipital, Integer supraIliaca) {
		return (1.1765 - 0.0744 * Math.log10(bicipital + supraIliaca));
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Durnin e Womersley para homens idosos
	 * 
	 * @param densidadeCorporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Cálcula o peso gordura, baseando se nas metódologias dispostas por Durnin
	 * e Womersley para homens idosos
	 * 
	 * @param percentualGordura
	 * @param peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return (peso * percentualGordura / 100);
	}

	/**
	 * Cálcula o peso magro, baseando se nas metódologias dispostas por Durnin e
	 * Womersley para homens idosos
	 * 
	 * @param peso
	 * @param pesoGordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * Cálcula o peso Ideal, baseando se nas metódologias dispostas por Durnin e
	 * Womersley para homens idosos
	 * 
	 * @param pesoMagro
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.85;
	}

	/**
	 * Cálcula o índice de massa corporal, baseando se nas metódologias
	 * dispostas por Durnin e Womersley para homens idosos
	 * 
	 * @param weight
	 * @param height
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * Cálcula a razão cintura quadril, baseando se nas metódologias dispostas
	 * por Durnin e Womersley para homens idosos.
	 * 
	 * @param cintura
	 * @param quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
