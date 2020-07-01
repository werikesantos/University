package aula02;

import javax.swing.JOptionPane;

public class Exe15_DividendoDivisorQuocienteResto {

	public static void main(String[] args) {

		/* EXERCÍCIO 15
		 * 
		 * Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto.
		 * 
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número do tipo inteiro:")); // DIVIDENDO
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número do tipo inteiro:")); // DIVISOR
		
		int dado1 = (numero1 / numero2); // QUOCIENTE
		int dado2 = numero1 % numero2; // RESTO
		
		JOptionPane.showMessageDialog(null, "O seu dividendo é: " + numero1 + "\nO seu divisor é: " + numero2);
		JOptionPane.showMessageDialog(null, "O seu quociente é: " + dado1 + "\nO resto desta operação é: " + dado2);
		
	}

}
