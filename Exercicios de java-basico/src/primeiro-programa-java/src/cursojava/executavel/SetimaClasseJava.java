package cursojava.executavel;

public class SetimaClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição While */
		int numero = 0;
		while (numero <= 3) { /* Verifica e depois executa o codigo */
			System.out.println("While: O numero atual é: " + numero);
			numero++;
		}

		/* Estrutura de repetição Do */
		int numero2 = 0;
		do {/* Primeiro executa e depois verifica */
			System.out.println("Do: O numero atual é: " + numero2);
			numero2++;
		} while (numero2 <= 3);

		/* Estrutura de repetição For */
		int numero3 = 0;
		for (numero3 = 0; numero3 <= 3; numero3++) { /* Crescente */
			System.out.println("For 0 à 3: O numero atual é: " + numero3);
		}
		for (numero3 = 3; numero3 >= 0; numero3--) {
			System.out.println("For 3 à 0: O numero atual é: " + numero3);
		}

		/* Estrutura de repetição For com Break(Parada) */
		int numero4 = 0;
		for (numero4 = 0; numero4 <= 3; numero4++) { /* Decrescente */
			System.out.println("For com Break: O numero atual é: " + numero4);
			if (numero4 == 2) {
				System.out.println("For com Break: Obaa encontrei o numero " + numero4);
				System.out.println("For com Break: Estou parando de executar...");
				break;
			}
		}

		/* Estrutura de repetição For e Continue */
		for (int numero5 = 0; numero5 <= 10; numero5++) {
			System.out.println("For com Continue: O numero atual é: " + numero5);
			if (numero5 == 2 || numero5 == 6 || numero5 == 9) {
				System.out.println("For com Continue: Obaa encontrei o numero " + numero5);
				System.out.println("For com Continue: Estou continuando a executar...");
				continue; /* Pula os próximos passos ou códigos que estão abaixo e volta ao For */
			}
			System.out.println("For com Continue: Processando laço de repetição");
		}

	}
}
