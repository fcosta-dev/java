package cursojava.executavel;

public class SextaClasseJava {

	
	/* Main � um metodo auto executavel em Java */
	public static void main(String[] args) {
		
		int nota1 = 91;
		int nota2 = 90;
		
		if (nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		} else  if (nota1 != nota2){
			System.out.println("As notas s�o diferentes");
		}
		
		if (nota1 <= nota2 ) {
			System.out.println("nota1 � maior e igual");
		} else {
			System.out.println("nota2 � menor que a nota1");
		}
	}
}
