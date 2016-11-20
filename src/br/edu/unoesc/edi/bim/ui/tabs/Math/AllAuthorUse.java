/**
 * 
 */
package br.edu.unoesc.edi.bim.ui.tabs.Math;

/**
 * @author Marcelo
 *
 */
public class AllAuthorUse {
	
	public static String situacaoMulheres(Double percentualGordura, Integer age) {
		String result = null;
		if ((age >= 18) && (age < 26)) {
			// 18 a 25
			if ((percentualGordura >= 13) && (percentualGordura < 17)) {
				result = "Excelente";
			} else if (percentualGordura < 20) {
				result = "Bom";
			} else if (percentualGordura < 23) {
				result = "Acima da média";
			} else if (percentualGordura < 26) {
				result = "Média";
			} else if (percentualGordura < 29) {
				result = "Abaixo da média";
			} else if (percentualGordura < 33) {
				result = "Ruim";
			} else if (percentualGordura < 44) {
				result = "Muito ruim";
			} else {
				return "No result";
			}
		} else if (age < 36) {
			// 26 a 35
			if ((percentualGordura >= 14) && (percentualGordura < 18)) {
				result = "Excelente";
			} else if (percentualGordura < 21) {
				result = "Bom";
			} else if (percentualGordura < 24) {
				result = "Acima da média";
			} else if (percentualGordura < 27) {
				result = "Média";
			} else if (percentualGordura < 31) {
				result = "Abaixo da média";
			} else if (percentualGordura < 36) {
				result = "Ruim";
			} else if (percentualGordura < 50) {
				result = "Muito ruim";
			} else {
				return "No result";
			}
		} else if (age < 46) {
			// 36 a 45
			if ((percentualGordura >= 16) && (percentualGordura < 20)) {
				result = "Excelente";
			} else if (percentualGordura < 24) {
				result = "Bom";
			} else if (percentualGordura < 27) {
				result = "Acima da média";
			} else if (percentualGordura < 30) {
				result = "Média";
			} else if (percentualGordura < 33) {
				result = "Abaixo da média";
			} else if (percentualGordura < 38) {
				result = "Ruim";
			} else if (percentualGordura < 49) {
				result = "Muito ruim";
			} else {
				return "No result";
			}
		} else if (age < 56) {
			// 46 a 55
			if ((percentualGordura >= 17) && (percentualGordura < 23)) {
				result = "Excelente";
			} else if (percentualGordura < 26) {
				result = "Bom";
			} else if (percentualGordura < 29) {
				result = "Acima da média";
			} else if (percentualGordura < 32) {
				result = "Média";
			} else if (percentualGordura < 35) {
				result = "Abaixo da média";
			} else if (percentualGordura < 39) {
				result = "Ruim";
			} else if (percentualGordura < 51) {
				result = "Muito ruim";
			} else {
				return "No result";
			}
		} else if (age < 66) {
			// 56 a 65
			if ((percentualGordura >= 18) && (percentualGordura < 24)) {
				result = "Excelente";
			} else if (percentualGordura < 27) {
				result = "Bom";
			} else if (percentualGordura < 30) {
				result = "Acima da média";
			} else if (percentualGordura < 33) {
				result = "Média";
			} else if (percentualGordura < 36) {
				result = "Abaixo da média";
			} else if (percentualGordura < 39) {
				result = "Ruim";
			} else if (percentualGordura < 50) {
				result = "Muito ruim";
			} else {
				return "No result";
			}
		} else if (age > 65) {
			// maior que 65
			if ((percentualGordura >= 16) && (percentualGordura < 22)) {
				result = "Excelente";
			} else if (percentualGordura < 27) {
				result = "Bom";
			} else if (percentualGordura < 30) {
				result = "Acima da média";
			} else if (percentualGordura < 32) {
				result = "Média";
			} else if (percentualGordura < 35) {
				result = "Abaixo da média";
			} else if (percentualGordura < 38) {
				result = "Ruim";
			} else if (percentualGordura < 42) {
				result = "Muito ruim";
			} else {
				return "No result";
			}
		} else {
			result = "No result";
		}
		return result;

	}
}
