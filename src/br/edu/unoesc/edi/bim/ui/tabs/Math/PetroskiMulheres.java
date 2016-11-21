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
	 * @param axilarMeida
	 * @param panturrilha
	 * @param age
	 * @param weight
	 * @param height
	 * @return Return's a Double.
	 */
	public static double densidadeCorporal(Float axilarMeida, Float panturrilha, Integer age, Float weight,
			Integer height) {
		return (1.02902361 - 0.00067159 * (axilarMeida + panturrilha)
				+ 0.00000242 * (axilarMeida + panturrilha) * (axilarMeida + panturrilha) - 0.00026073 * age
				- 0.00056009 * weight + 0.00054649 * height);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param densidadeCorporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.94 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param percentualGordura
	 * @param peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return ((percentualGordura * peso) / 100);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param peso
	 * @param pesoGordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param pesoMagro
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.75;
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param weight
	 * @param height
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Mulheres.
	 * 
	 * @param cintura
	 * @param quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
