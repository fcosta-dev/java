package cursojava.executavel;

public class PrimeiraClasseJava {

	/*Vari�vel Global � acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*Main � um m�todo auto executavel em Java */
	public static void main(String[] args) {
		
		/*Vari�veis local porque pertence somente a esse m�todo e o valor fica dentro do metodo*/
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		
		System.out.println("Valor vari�vel local = " + maiorIdade);
		metodo2();
		
		
		/*Escreve texto no console */
		System.out.println("Meu primeiro programa em Java");
		System.out.println("Linha 2 do programa");		
		System.out.println("Java � orientado a objetos");
		System.out.println("Maior idade � = " + maiorIdade);
		System.out.println("Idoso idade � = " + idosoIdade);
	}
	public static void metodo2 () {
		int mediaAno = 50;
		System.out.println("Valor da vari�vel Global = " + maiorIdadeGlobal);
	}

}
