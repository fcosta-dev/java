package cursojava.executavel;

public class QuartaClasseJava {

	/*Main � um metodo auto executavel em Java */
	public static void main(String[] args) {
		
		/*String no Java sempre ser� um texto de tamanho qualquer */
		/*Concatena��o = Unir ou juntar dados*/
		String nome = "Fernando Gosuen da Costa";
		String cpf = "000-000-000-12";
		String telefone = "99194-4370";
		String endereco = "Rua das Couves, n4";
		int idade = 39;
		
		System.out.println("Nome nome �: " + nome + ", e o CPF: " + 
		cpf + ", e o meu contato �: " + 
		telefone + ", e eu moro em: "+ endereco + ", e minha idade �: " + idade + ".");
		
		String saida = "Nome nome �: " + nome + ", e o CPF: " + 
				cpf + ", e o meu contato �: " + 
				telefone + ", e eu moro em: "+ endereco + ", e minha idade �: " + idade + ".";
				
		System.out.println(saida);
		
	}
	
}
