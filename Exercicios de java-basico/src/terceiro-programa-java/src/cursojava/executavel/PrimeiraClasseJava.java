package cursojava.executavel;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

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

		/*Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		aluno1.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(97);
		aluno1.getDisciplinas().add(disciplina4);*/
		
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		
		System.out.println(aluno1.toString()); /* Descrição do objeto na memoria */
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}