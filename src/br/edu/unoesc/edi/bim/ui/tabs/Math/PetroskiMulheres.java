/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class PetroskiMulheres {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param axilarMedia Medida em mm da axilar média
	 * @param panturrilha Medida em mm da panturrilha
	 * @param age idade
	 * @param weight Peso
	 * @param height Altura em cm
	 * @return Return's a Double.
	 */
	public static double densidadeCorporal(Float axilarMedia, Float panturrilha, Integer age, Float weight,
			Integer height) {
		return (1.02902361 - 0.00067159 * (axilarMedia + panturrilha)
				+ 0.00000242 * (axilarMedia + panturrilha) * (axilarMedia + panturrilha) - 0.00026073 * age
				- 0.00056009 * weight + 0.00054649 * height);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param densidadeCorporal Densidade corporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.94 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param percentualGordura Percentual de gordura
	 * @param peso Peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return ((percentualGordura * peso) / 100);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param peso Peso Peso
	 * @param pesoGordura Peso Gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param pesoMagro Peso magro
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.75;
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param weight Peso
	 * @param height Altura
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param cintura Medida em cm da cintura
	 * @param quadril Medida em cm do quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
