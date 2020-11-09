package cursojava.executavel;

public class PrimeiraClasseJava {

	/*Variável Global é acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um método auto executavel em Java */
	public static void main(String[] args) {
		
		/*Variáveis local porque pertence somente a esse método e o valor fica dentro do metodo*/
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		
		System.out.println("Valor variável local = " + maiorIdade);
		metodo2();
		
		
		/*Escreve texto no console */
		System.out.println("Meu primeiro programa em Java");
		System.out.println("Linha 2 do programa");		
		System.out.println("Java é orientado a objetos");
		System.out.println("Maior idade é = " + maiorIdade);
		System.out.println("Idoso idade é = " + idosoIdade);
	}
	public static void metodo2 () {
		int mediaAno = 50;
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}

}
