package aula02;

import javax.swing.JOptionPane;

public class Exe03_RaizQuadrada {

	public static void main(String[] args) {
		
		/* EXERCICIO 03
		 * 
		 * Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o método
		 * double Math.pow(base, expoente), onde base e expoente são número reais.
		 * 
		 */
		
		String sNumero = JOptionPane.showInputDialog("Digite um valor inteiro:");
		
		int numero = Integer.parseInt(sNumero);
		
		double elevado = Math.pow(numero, 2);
		
		JOptionPane.showMessageDialog(null, "O número digitado, eleve ao quadrado é igual: "+elevado);
	}

}
