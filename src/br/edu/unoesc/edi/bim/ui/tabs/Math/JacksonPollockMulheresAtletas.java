/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class JacksonPollockMulheresAtletas {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Jackson Pollock para Mulheres atletas.
	 * 
	 * @param triceps
	 * @param coxa
	 * @param age
	 * @return Retorna um Double.
	 */
	public static double densidadeCorporal(Float triceps, Float coxa, Integer age) {
		return (1.09095 - 0.0006952 * (triceps + coxa) + 0.0000011 * (triceps + coxa) * (triceps + coxa)
				- 0.0000714 * age);
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Jackson Pollock para Mulheres atletas.
	 * 
	 * @param densidadeCorporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((5.01 / densidadeCorporal) - 4.57) * 100);
	}

	/**
	 * Cálcula o peso gordura, baseando se nas metódologias dispostas por
	 * Jackson Pollock para Mulheres atletas.
	 * 
	 * @param percentualGordura
	 * @param peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return ((peso * percentualGordura) / 100);
	}

	/**
	 * Cálcula o peso magro, baseando se nas metódologias dispostas por Jackson
	 * Pollock para Mulheres atletas.
	 * 
	 * @param peso
	 * @param pesoGordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return (peso - pesoGordura);
	}
}
