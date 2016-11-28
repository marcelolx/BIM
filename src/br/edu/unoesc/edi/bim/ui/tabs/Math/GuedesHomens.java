/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class GuedesHomens {
	/**
	 * Calcula a densidade Corporal, se baseando nas m�todologias dispostas por
	 * Guedes para Homens.
	 * 
	 * @param triceps Medida em mm do Tr�ceps
	 * @param abdomen Medida em mm do Abd�men
	 * @param supraIliaca Medida em mm da Supra il�aca
	 * @return Retorna um Double
	 */
	public static double densidadeCorporal(Integer triceps, Integer abdomen, Integer supraIliaca) {
		return 1.1714 - 0.06718 * Math.log10(triceps + abdomen + supraIliaca);
	}

	/**
	 * C�lcula o percentual de gordura, baseando se nas m�todologias dispostas
	 * por Guedes para Homens
	 * 
	 * @param densidadeCorporal Densidade corporal.
	 * @return Retorna um Double
	 */
	public static double percentualGordura(Double densidadeCorporal) {
		return (((4.95 / densidadeCorporal) - 4.5)) * 100;
	}

	/**
	 * C�lcula o peso gordura, baseando se nas met�dologias dispostas por Guedes
	 * para Homens.
	 * 
	 * @param percentualGordura Percentual gordura
	 * @param peso Peso
	 * @return Retorna um Double
	 */
	public static double pesoGordura(Double percentualGordura, Float peso) {
		return (percentualGordura / 100) * peso;
	}

	/**
	 * C�lcula o peso magro, baseando se nas met�dologias dispostas por Guedes
	 * para homens
	 * 
	 * @param peso Peso
	 * @param pesoGordura Peso Gordura
	 * @return Retorna um Double
	 */
	public static double pesoMagro(Float peso, Double pesoGordura) {
		return peso - pesoGordura;
	}

	/**
	 * C�lcula o peso Ideal, baseando se nas met�dologias dispostas por Guedes
	 * para homens.
	 * 
	 * @param pesoMagro Peso Magro
	 * @return Retorna um Double.
	 */
	public static double pesoIdeal(Double pesoMagro) {
		return pesoMagro / 0.85;
	}

	/**
	 * C�lcula o �ndice de massa corporal, baseando se nas met�dologias
	 * dispostas por Guedes para homens.
	 * 
	 * @param weight Peso
	 * @param height Altura em cm.
	 * @return Retorna um Float.
	 */
	public static float iMC(Float weight, Float height) {
		return (weight / ((height / 100) * (height / 100)));
	}

	/**
	 * C�lcula a raz�o cintura quadril, baseando se nas met�dologias dispostas
	 * por Guedes para homens.
	 * 
	 * @param cintura Medida em cm da Cintura
	 * @param quadril Medida em cm do Quadril
	 * @return Retorna um Float.
	 */
	public static float razaoCinturaQuadril(float cintura, float quadril) {
		return (cintura / quadril);
	}
}
