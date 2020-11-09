package cursojava.executavel;

public class QuintaClasseJava {

	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Primeiro Exemplo - Condi��es L�gicas com IF e ELSE */
		double mediaAluno = 70;
		String nome = "Fernando";
		if (mediaAluno >= 70 && nome.equals("Fernando")) {/*Se maior ou igual 70 e o nome � Fernando */
			System.out.println("Primeiro Exemplo: Parabens voc� est� aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Primeiro Exemplo: Voc� est� reprovado");
		} else {
			System.out.println("Primeiro Exemplo: Aluno n�o encontrado");
		}

		/* Segundo Exemplo - Condi��es L�gicas com IF e ELSE */
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 90;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4)/4;
		if (media >= 70){
			 System.out.println("Segundo Exemplo: Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			 System.out.println("Segundo Exemplo: Aluno em recupera��o: " + media);
		} else {
			 System.out.println("Segundo Exemplo: Aluno reprovado: " + media);
		}
		
		/* Terceiro Exemplo - Operadores Tern�rios - S�o para micro valida��es(em uma linha)*/
		String saidaResultado;
		/* Exemplo 01 */
		saidaResultado = (media >= 70) ? "Terceiro/01 Exemplo: Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(saidaResultado);
		/* Exemplo 02 */
		saidaResultado = (media >= 70) ? "Terceiro/02 Exemplo: Aluno Aprovado" : (media >= 40 && media <= 69) ? "Terceiro/02 Exemplo: Aluno em recupera��o" : "Terceiro/02 Exemplo: Aluno Reprovado";
		System.out.println(saidaResultado);
		
		
		/* Quarto Exemplo - Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es */
		if (media >=50) {
			if(media >=70) {
				if (media > 90) {
					System.out.println("Quarto Exemplo: Aluno est� aprovado direto - Parabens " + media);
				} else {
				    System.out.println("Quarto Exemplo: Aluno est� aprovado direto " + media);
				}    
			} else {
				System.out.println("Quarto Exemplo: Aluno est� em recupera��o " + media);
			}
		} else {
			System.out.println("Quarto Exemplo: Aluno reprovado direto " + media);
		}
		
		
		/* Quinto Exemplo - SWITCH CASE: Opera��es exatas */
		int dia = 3;
		switch (dia) {
		case 1:
			System.out.println("Quinto exemplo: domingo");
			break;
		case 2:	
			System.out.println("Quinto exemplo: segunda-feira");
			break;
		case 3:	
			System.out.println("Quinto exemplo: ter�a-feira");
			break;			
			
		default: System.out.println("Quinto exemplo: Outro dia qualquer");
			break;
		}
		
		
	}		
}
