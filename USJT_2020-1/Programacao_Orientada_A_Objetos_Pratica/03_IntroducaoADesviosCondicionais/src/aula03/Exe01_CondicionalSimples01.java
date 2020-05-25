package aula03;

import javax.swing.JOptionPane;

public class Exe01_CondicionalSimples01 {

	public static void main(String[] args) {

		/* EXERCÍCIO 01
		 * 
		 * 1) Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição; 
		 * caso o resultado seja maior que 10, apresentá-lo.
		 * 
		 */
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		
		int z = x + y;
		
		if(z > 10) {
			
			JOptionPane.showMessageDialog(null, z);
			
		}

	}

}
