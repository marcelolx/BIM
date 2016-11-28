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
	 * Calcula a densidade Corporal, se baseando nas m�todologias dispostas por
	 * Durnin e Womersley para homens idosos.
	 * 
	 * @param bicipital Medida em mm do Biciptal
	 * @param supraIliaca Medida em mm da Supra Il�aca
	 * @return Retorna um Double
	 */
	public static double densidadeCorporal(Integer bicipital, Integer supraIliaca) {
		return (1.1765 - 0.0744 * Math.log10(bicipital + supraIliaca));
	}

	/**
	 * C�lcula o percentual de gordura, baseando se nas m�todologias dispostas
	 * por Durnin e Womersley para homens idosos
	 * 
	 * @param densidadeCorporal Medida da Densidade Corporal
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5) * 100);
	}

	/**
	 * C�lcula o peso gordura, baseando se nas met�dologias dispostas por Durnin
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
	 * C�lcula o peso magro, baseando se nas met�dologias dispostas por Durnin e
	 * Womersley para homens idosos
	 * 
	 * @param peso Peso em Kg
	 * @param pesoGordura Resultado do c�lculo de peso gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * C�lcula o peso Ideal, baseando se nas met�dologias dispostas por Durnin e
	 * Womersley para homens idosos
	 * 
	 * @param pesoMagro Valor do peso Magro.
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.85;
	}

	/**
	 * C�lcula o �ndice de massa corporal, baseando se nas met�dologias
	 * dispostas por Durnin e Womersley para homens idosos
	 * 
	 * @param weight Peso em Kg
	 * @param height Altura em cent�metros
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * C�lcula a raz�o cintura quadril, baseando se nas met�dologias dispostas
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
