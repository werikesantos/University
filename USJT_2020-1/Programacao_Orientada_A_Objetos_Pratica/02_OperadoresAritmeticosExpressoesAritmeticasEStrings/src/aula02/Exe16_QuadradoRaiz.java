package aula02;

import javax.swing.JOptionPane;

public class Exe16_QuadradoRaiz {

	public static void main(String[] args) {

		/* EXERCÍCIO 16
		 * 
		 * Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		double quadrado = Math.pow(numero,2);
		double raiz = Math.sqrt(numero);
		
		JOptionPane.showMessageDialog(null, "O número digitado é: " + numero + "\nElevado ao quadrado é: " + quadrado + "\nA raiz quadrada é: " + raiz);
		
	}

}
