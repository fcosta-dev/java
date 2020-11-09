package cursojava.executavel;

public class SextaClasseJava {

	
	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
		
		int nota1 = 91;
		int nota2 = 90;
		
		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		} else  if (nota1 != nota2){
			System.out.println("As notas são diferentes");
		}
		
		if (nota1 <= nota2 ) {
			System.out.println("nota1 é maior e igual");
		} else {
			System.out.println("nota2 é menor que a nota1");
		}
	}
}
