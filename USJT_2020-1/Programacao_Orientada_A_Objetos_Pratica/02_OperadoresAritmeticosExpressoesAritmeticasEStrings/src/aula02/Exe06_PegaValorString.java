package aula02;

import javax.swing.JOptionPane;

public class Exe06_PegaValorString {

	public static void main(String[] args) {
			
		/* EXERCICIO 06
		 * 
		 * Entrar com um número inteiro, e 3 casas decimais e imprimir o algarismo da casa das dezenas.
		 * 
		 */
		
		String sCasas = JOptionPane.showInputDialog("Digite um número inteiro, e 3 casas decimais:");
		
		String dezena = (sCasas.substring(3,4));
		
		JOptionPane.showMessageDialog(null, dezena);
	}

}
