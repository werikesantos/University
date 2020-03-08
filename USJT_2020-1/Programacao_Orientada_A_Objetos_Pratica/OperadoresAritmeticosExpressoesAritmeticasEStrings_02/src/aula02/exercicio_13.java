package aula02;

import javax.swing.JOptionPane;

public class exercicio_13 {

	public static void main(String[] args) {
		
		/* EXERCICIO 13
		 * 
		 * Escrever um algoritmo que lê três números reais (a, b e c), calcula e escreve o resultado
		 * da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5.
		 * 
		 */
		
		String sA = JOptionPane.showInputDialog("Digite um valor para (a):");
		String sB = JOptionPane.showInputDialog("Digite um valor para (b):");
		String sC = JOptionPane.showInputDialog("Digite um valor para (c):");
		
		double a = Integer.parseInt(sA);
		double b = Integer.parseInt(sB);
		double c = Integer.parseInt(sC);
		
		double x = 2 * ((a - c) / 8) - b * 5;

		JOptionPane.showMessageDialog(null, "O resultado da expressão X = 2 * ( ( a – c ) / 8 ) – b * 5 é igual:\n\n"+x);
	}

}
