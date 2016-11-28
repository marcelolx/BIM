/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class PetroskiHomens {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Homens.
	 * 
	 * @param subescapular Medida em mm do Subescapular
	 * @param panturrilha Medida em mm da panturrilha
	 * @param age Idade
	 * @return Return's Double.
	 */
	public static double densidadeCorporal(Float subescapular, Float panturrilha, Integer age) {
		return (1.10726863 - 0.00081201 * (subescapular + panturrilha)
				+ 0.00000212 * (subescapular + panturrilha) * (subescapular + panturrilha) - 0.00041761 * age);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Homens.
	 * 
	 * @param densidadeCorporal Densidade corporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Homens.
	 * 
	 * @param percentualGordura Percentual gordura
	 * @param peso Peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return ((percentualGordura * peso) / 100);
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Homens.
	 * 
	 * @param peso Peso
	 * @param pesoGordura Peso gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Homens.
	 * 
	 * @param pesoMagro Peso Magro
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.85;
	}

	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Petroski para Homens.
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
	 * Petroski para Homens.
	 * 
	 * @param cintura Cintura em cm.
	 * @param quadril Quadril em cm.
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
