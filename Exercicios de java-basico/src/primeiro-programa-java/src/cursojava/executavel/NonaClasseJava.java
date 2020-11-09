package cursojava.executavel;

import javax.swing.JOptionPane;


public class NonaClasseJava {
	
	public static void main(String[] args) {

		/*JOptionPane.showInputDialog = Entrada de dados */
		/*JOptionPane.showMessageDialog = Saída de dados */
		/*JOptionPane.showConfirmDialog = Confirmação de dados */

	
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

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		/*JOptionPane.showConfirmDialog = Sim = 0 : Não = 1 : Cancelar = 2*/
		if (resposta == 0) {
			/* Resposta no console: */
			System.out.println("Divisão para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
			/* Resposta em mensagem de dialogo: */
			JOptionPane.showMessageDialog(null,
					"Divisão para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
		} else {
			System.out.println("Não quis ver a divisão");
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
		}else {
			System.out.println("Não quis ver o resto");
		}
		
		/* Resposta no console: */
		System.out.println("Divisão para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
		/* Resposta em mensagem de dialogo: */
		JOptionPane.showMessageDialog(null,
				"Divisão para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros.");
		
	}
}
