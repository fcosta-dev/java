package cursojava.executavel;

public class SetimaClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repeti��o While */
		int numero = 0;
		while (numero <= 3) { /* Verifica e depois executa o codigo */
			System.out.println("While: O numero atual �: " + numero);
			numero++;
		}

		/* Estrutura de repeti��o Do */
		int numero2 = 0;
		do {/* Primeiro executa e depois verifica */
			System.out.println("Do: O numero atual �: " + numero2);
			numero2++;
		} while (numero2 <= 3);

		/* Estrutura de repeti��o For */
		int numero3 = 0;
		for (numero3 = 0; numero3 <= 3; numero3++) { /* Crescente */
			System.out.println("For 0 � 3: O numero atual �: " + numero3);
		}
		for (numero3 = 3; numero3 >= 0; numero3--) {
			System.out.println("For 3 � 0: O numero atual �: " + numero3);
		}

		/* Estrutura de repeti��o For com Break(Parada) */
		int numero4 = 0;
		for (numero4 = 0; numero4 <= 3; numero4++) { /* Decrescente */
			System.out.println("For com Break: O numero atual �: " + numero4);
			if (numero4 == 2) {
				System.out.println("For com Break: Obaa encontrei o numero " + numero4);
				System.out.println("For com Break: Estou parando de executar...");
				break;
			}
		}

		/* Estrutura de repeti��o For e Continue */
		for (int numero5 = 0; numero5 <= 10; numero5++) {
			System.out.println("For com Continue: O numero atual �: " + numero5);
			if (numero5 == 2 || numero5 == 6 || numero5 == 9) {
				System.out.println("For com Continue: Obaa encontrei o numero " + numero5);
				System.out.println("For com Continue: Estou continuando a executar...");
				continue; /* Pula os pr�ximos passos ou c�digos que est�o abaixo e volta ao For */
			}
			System.out.println("For com Continue: Processando la�o de repeti��o");
		}

	}
}
