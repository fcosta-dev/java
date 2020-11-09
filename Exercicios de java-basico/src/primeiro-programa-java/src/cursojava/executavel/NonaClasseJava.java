package cursojava.executavel;

import javax.swing.JOptionPane;


public class NonaClasseJava {
	
	public static void main(String[] args) {

		/*JOptionPane.showInputDialog = Entrada de dados */
		/*JOptionPane.showMessageDialog = Sa�da de dados */
		/*JOptionPane.showConfirmDialog = Confirma��o de dados */

	
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

		System.out.println("Quantidade de carros: " + carros);
		System.out.println("Quantidade de pessoas: " + pessoas);

		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		System.out.println("Quantidade de carros (convertido): " + carroNumero);
		System.out.println("Quantidade de pessoas (convertido): " + pessoaNumero);

		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		/*JOptionPane.showConfirmDialog = Sim = 0 : N�o = 1 : Cancelar = 2*/
		if (resposta == 0) {
			/* Resposta no console: */
			System.out.println("Divis�o para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
			/* Resposta em mensagem de dialogo: */
			JOptionPane.showMessageDialog(null,
					"Divis�o para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
		} else {
			System.out.println("N�o quis ver a divis�o");
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divis�o �: " + resto);
		}else {
			System.out.println("N�o quis ver o resto");
		}
		
		/* Resposta no console: */
		System.out.println("Divis�o para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
		/* Resposta em mensagem de dialogo: */
		JOptionPane.showMessageDialog(null,
				"Divis�o para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
		
	}
}
