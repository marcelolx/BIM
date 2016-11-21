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
	 * Calcula a densidade Corporal, se baseando nas m�todologias dispostas por
	 * Jackson Pollock para Homens atletas.
	 * 
	 * @param peitoral
	 * @param coxa
	 * @param age
	 * @return Retorna um Double.
	 */
	public static double densidadeCorporal(Float peitoral, Float coxa, Integer age) {
		return (1.112 - 0.00043499 * (peitoral + coxa) + 0.00000055 * (peitoral * coxa) * (peitoral + coxa)
				- 0.00028826 * age);
	}

	/**
	 * C�lcula o percentual de gordura, baseando se nas m�todologias dispostas
	 * por Jackson Pollock para Homens atletas.
	 * 
	 * @param densidadeCorporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.94 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * C�lcula o peso gordura, baseando se nas met�dologias dispostas por
	 * Jackson Pollock para Homens atletas.
	 * 
	 * @param percentualGordura
	 * @param peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return ((peso * percentualGordura) / 100);
	}

	/**
	 * C�lcula o peso magro, baseando se nas met�dologias dispostas por Jackson
	 * Pollock para Homens atletas.
	 * 
	 * @param peso
	 * @param pesoGordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return (peso - pesoGordura);
	}
}
