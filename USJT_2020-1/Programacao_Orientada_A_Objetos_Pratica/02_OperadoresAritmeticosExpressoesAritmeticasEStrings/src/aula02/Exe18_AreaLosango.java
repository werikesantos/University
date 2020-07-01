package aula02;

import javax.swing.JOptionPane;

public class Exe18_AreaLosango {

	public static void main(String[] args) {

		/* EXERCÍCIO 18
		 * 
		 * Criar um algoritmo que calcule e imprime a área de um losango.
		 * 
		 */
		
		int diagonalMaior = 10;
		int diagonalMenor = 7;
		
		double area = ((diagonalMaior * diagonalMenor) / 2);
		
		JOptionPane.showMessageDialog(null, "O losango apresenta " + area + "cm² de área.");
	}

}
