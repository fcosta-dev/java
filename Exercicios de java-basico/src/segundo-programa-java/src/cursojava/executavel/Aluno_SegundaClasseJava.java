package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Aluno_SegundaClasseJava {

	public static void main(String[] args) {

		/* O new abaixo chama o construtor "public Aluno()" */
		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da Mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data de Matricula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a serie?");
		String nomeEscola = JOptionPane.showInputDialog("Qual a Escola?");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina1?");
		String nota1 = JOptionPane.showInputDialog("Qual a Nota 1?");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina2?");
		String nota2 = JOptionPane.showInputDialog("Qual a Nota 2?");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina3?");
		String nota3 = JOptionPane.showInputDialog("Qual a Nota 3?");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina4?");
		String nota4 = JOptionPane.showInputDialog("Qual a Nota 4?");

		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);

		System.out.println(aluno1.toString()); /*Descrição do objeto na memoria*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	}

}
