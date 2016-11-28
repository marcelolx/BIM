/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class JacksonPollockHomensAtletas {
	/**
	 * Calcula a densidade Corporal, se baseando nas métodologias dispostas por
	 * Jackson Pollock para Homens atletas.
	 * 
	 * @param peitoral Medida em mm do Peitoral
	 * @param coxa Medida em mm da Coxa
	 * @param age Idade
	 * @return Retorna um Double.
	 */
	public static double densidadeCorporal(Float peitoral, Float coxa, Integer age) {
		return (1.112 - 0.00043499 * (peitoral + coxa) + 0.00000055 * (peitoral * coxa) * (peitoral + coxa)
				- 0.00028826 * age);
	}

	/**
	 * Cálcula o percentual de gordura, baseando se nas métodologias dispostas
	 * por Jackson Pollock para Homens atletas.
	 * 
	 * @param densidadeCorporal Densidade corporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.94 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * Cálcula o peso gordura, baseando se nas metódologias dispostas por
	 * Jackson Pollock para Homens atletas.
	 * 
	 * @param percentualGordura Percentual Gordura
	 * @param peso Peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return ((peso * percentualGordura) / 100);
	}

	/**
	 * Cálcula o peso magro, baseando se nas metódologias dispostas por Jackson
	 * Pollock para Homens atletas.
	 * 
	 * @param peso Peso
	 * @param pesoGordura Peso Gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return (peso - pesoGordura);
	}
}
