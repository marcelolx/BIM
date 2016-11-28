/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class DurninWomersleyMulheresIdosas {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Durnin e Womersley para mulheres idosas.
	 * 
	 * @param bicipital Medida em mm do Biciptal
	 * @param supraIliaca Medida em mm da supra ilíaca
	 * @return Retorna um Double
	 */
	public static double densidadeCorporal(Float bicipital, Float supraIliaca) {
		return (1.1567 - 0.0717 * Math.log10(bicipital + supraIliaca));
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Durnin e Womersley para mulheres idosas
	 * 
	 * @param densidadeCorporal Densidade corporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Cálcula o peso gordura, baseando se nas metódologias dispostas por Durnin
	 * e Womersley para mulheres idosas
	 * 
	 * @param percentualGordura Percentual gordura
	 * @param peso Peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return (peso * percentualGordura / 100);
	}

	/**
	 * Cálcula o peso magro, baseando se nas metódologias dispostas por Durnin e
	 * Womersley para mulheres idosas
	 * 
	 * @param peso Peso
	 * @param pesoGordura Peso gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * Cálcula o peso Ideal, baseando se nas metódologias dispostas por Durnin e
	 * Womersley para mulheres idosas
	 * 
	 * @param pesoMagro Peso Magro
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.75;
	}

	/**
	 * Cálcula o índice de massa corporal, baseando se nas metódologias
	 * dispostas por Durnin e Womersley para mulheres idosas
	 * 
	 * @param weight Peso
	 * @param height Altura em cm
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * Cálcula a razão cintura quadril, baseando se nas metódologias dispostas
	 * por Durnin e Womersley para mulheres idosas.
	 * 
	 * @param cintura Cintura
	 * @param quadril Quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
