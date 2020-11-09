package cursojava.executavel;

public class QuintaClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		/* Primeiro Exemplo - Condições Lógicas com IF e ELSE */
		double mediaAluno = 70;
		String nome = "Fernando";
		if (mediaAluno >= 70 && nome.equals("Fernando")) {/*Se maior ou igual 70 e o nome é Fernando */
			System.out.println("Primeiro Exemplo: Parabens você está aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Primeiro Exemplo: Você está reprovado");
		} else {
			System.out.println("Primeiro Exemplo: Aluno não encontrado");
		}

		/* Segundo Exemplo - Condições Lógicas com IF e ELSE */
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 90;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4)/4;
		if (media >= 70){
			 System.out.println("Segundo Exemplo: Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			 System.out.println("Segundo Exemplo: Aluno em recuperação: " + media);
		} else {
			 System.out.println("Segundo Exemplo: Aluno reprovado: " + media);
		}
		
		/* Terceiro Exemplo - Operadores Ternários - São para micro validações(em uma linha)*/
		String saidaResultado;
		/* Exemplo 01 */
		saidaResultado = (media >= 70) ? "Terceiro/01 Exemplo: Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(saidaResultado);
		/* Exemplo 02 */
		saidaResultado = (media >= 70) ? "Terceiro/02 Exemplo: Aluno Aprovado" : (media >= 40 && media <= 69) ? "Terceiro/02 Exemplo: Aluno em recuperação" : "Terceiro/02 Exemplo: Aluno Reprovado";
		System.out.println(saidaResultado);
		
		
		/* Quarto Exemplo - Operações lógicas aninhadas: São operações dentro de operações */
		if (media >=50) {
			if(media >=70) {
				if (media > 90) {
					System.out.println("Quarto Exemplo: Aluno está aprovado direto - Parabens " + media);
				} else {
				    System.out.println("Quarto Exemplo: Aluno está aprovado direto " + media);
				}    
			} else {
				System.out.println("Quarto Exemplo: Aluno está em recuperação " + media);
			}
		} else {
			System.out.println("Quarto Exemplo: Aluno reprovado direto " + media);
		}
		
		
		/* Quinto Exemplo - SWITCH CASE: Operações exatas */
		int dia = 3;
		switch (dia) {
		case 1:
			System.out.println("Quinto exemplo: domingo");
			break;
		case 2:	
			System.out.println("Quinto exemplo: segunda-feira");
			break;
		case 3:	
			System.out.println("Quinto exemplo: terça-feira");
			break;			
			
		default: System.out.println("Quinto exemplo: Outro dia qualquer");
			break;
		}
		
		
	}		
}
