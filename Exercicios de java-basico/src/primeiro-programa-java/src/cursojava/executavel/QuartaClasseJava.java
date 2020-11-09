package cursojava.executavel;

public class QuartaClasseJava {

	/*Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
		
		/*String no Java sempre será um texto de tamanho qualquer */
		/*Concatenação = Unir ou juntar dados*/
		String nome = "Fernando Gosuen da Costa";
		String cpf = "000-000-000-12";
		String telefone = "99194-4370";
		String endereco = "Rua das Couves, n4";
		int idade = 39;
		
		System.out.println("Nome nome é: " + nome + ", e o CPF: " + 
		cpf + ", e o meu contato é: " + 
		telefone + ", e eu moro em: "+ endereco + ", e minha idade é: " + idade + ".");
		
		String saida = "Nome nome é: " + nome + ", e o CPF: " + 
				cpf + ", e o meu contato é: " + 
				telefone + ", e eu moro em: "+ endereco + ", e minha idade é: " + idade + ".";
				
		System.out.println(saida);
		
	}
	
}
