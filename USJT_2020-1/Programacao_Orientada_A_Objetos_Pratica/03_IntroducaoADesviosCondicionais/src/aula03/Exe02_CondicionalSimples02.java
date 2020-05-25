package aula03;

import javax.swing.JOptionPane;

public class Exe02_CondicionalSimples02 {

	public static void main(String[] args) {

		/* EXERCÍCIO 02
		 * 
		 * 2) Construir um algoritmo que leia dois números e efetue a adição. 
		 * Caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
		 * 
		 */
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		
		int z = x + y;
		
		if(z <= 20) {
			
			JOptionPane.showMessageDialog(null, "Maior ou igual a 20 o resultado será subtraido por 5: \n"+(z-5));
			
		}

	}

}
