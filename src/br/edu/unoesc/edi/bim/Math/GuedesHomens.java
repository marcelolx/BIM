/**
 * 
 */
package br.edu.unoesc.edi.bim.Math;

/**
 * @author Marcelo
 *
 */
public class GuedesHomens {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Guedes para Homens.
	 * 
	 * @param triceps
	 * @param abdomen
	 * @param supraIliaca
	 * @return
	 */
	public static double densidadeCorporal(Integer triceps, Integer abdomen, Integer supraIliaca) {
		return 1.1714 - 0.06718 * Math.log10(triceps + abdomen + supraIliaca);
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Guedes para Homens
	 * 
	 * @param densidadeCorporal
	 * @return
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5)) * 100;
	}

	/**
	 * Cálcula o peso gordura, baseando se nas metódologias dispostas por Guedes
	 * para Homens.
	 * 
	 * @param percentualGordura
	 * @param peso
	 * @return
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return (percentualGordura / 100) * peso;
	}
	
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso-pesoGordura;
	}
	
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro/0.85;
	}
	
	public static float iMC(Float weight, Float height) {
		return (weight/((height/100) * (height/100)));
	}
	
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura/quadril);
	}
}
