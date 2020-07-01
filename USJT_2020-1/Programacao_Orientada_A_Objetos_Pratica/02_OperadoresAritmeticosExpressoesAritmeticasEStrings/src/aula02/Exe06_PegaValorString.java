package aula02;

import javax.swing.JOptionPane;

public class Exe06_PegaValorString {

	public static void main(String[] args) {
			
		/* EXERCÍCIO 06
		 * 
		 * Entrar com um número inteiro, e 3 casas decimais e imprimir o algarismo da casa das dezenas.
		 * 
		 */
		
		String sCasas = JOptionPane.showInputDialog("Digite 4 casas decimais, e será imprimido o algarismo da casa das dezenas:");
		
		String dezena = (sCasas.substring(2,3));
		
		JOptionPane.showMessageDialog(null, dezena);
	}

}
