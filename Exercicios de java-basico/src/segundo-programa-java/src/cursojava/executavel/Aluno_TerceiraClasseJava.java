package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Aluno_TerceiraClasseJava {

	public static void main(String[] args) {

		/* Equals e hashcode (Diferenciar e comparar objetos */

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNome("123");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNome("123");
		
		if (aluno1.equals(aluno2)) {
			System.out.println(aluno1.getNome() + " e " + aluno2.getNome() + " - Alunos são iguais");
		} else {
			System.out.println(aluno1.getNome() + " e " + aluno2.getNome() + " - Alunos não são iguais");
		}

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Alex");
		aluno3.setNome("123");
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Fernando");
		aluno4.setNome("456");
		
		if (aluno3.equals(aluno4)) {
			System.out.println(aluno3.getNome() + " e " + aluno4.getNome() + " - Alunos são iguais");
		} else {
			System.out.println(aluno3.getNome() + " e " + aluno4.getNome() + " - Alunos não são iguais");
		}		
			
		
	}
}
