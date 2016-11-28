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
	 * @param bicipital Medida em mm do Biciptal
	 * @param supraIliaca Medida em mm da Supra Ilíaca
	 * @return Retorna um Double
	 */
	public static double densidadeCorporal(Integer bicipital, Integer supraIliaca) {
		return (1.1765 - 0.0744 * Math.log10(bicipital + supraIliaca));
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Durnin e Womersley para homens idosos
	 * 
	 * @param densidadeCorporal Medida da Densidade Corporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Cálcula o peso gordura, baseando se nas metódologias dispostas por Durnin
	 * e Womersley para homens idosos
	 * 
	 * @param percentualGordura Medida do percentual de gordura
	 * @param peso Peso em KG
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return (peso * percentualGordura / 100);
	}

	/**
	 * Cálcula o peso magro, baseando se nas metódologias dispostas por Durnin e
	 * Womersley para homens idosos
	 * 
	 * @param peso Peso em Kg
	 * @param pesoGordura Resultado do cálculo de peso gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * Cálcula o peso Ideal, baseando se nas metódologias dispostas por Durnin e
	 * Womersley para homens idosos
	 * 
	 * @param pesoMagro Valor do peso Magro.
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.85;
	}

	/**
	 * Cálcula o índice de massa corporal, baseando se nas metódologias
	 * dispostas por Durnin e Womersley para homens idosos
	 * 
	 * @param weight Peso em Kg
	 * @param height Altura em centímetros
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * Cálcula a razão cintura quadril, baseando se nas metódologias dispostas
	 * por Durnin e Womersley para homens idosos.
	 * 
	 * @param cintura Medida em cm da Cintura
	 * @param quadril Medida em cm do Quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
