package aula02;

import javax.swing.JOptionPane;

public class Exe17_AreaTriangulo {

	public static void main(String[] args) {

		/* EXERCÍCIO 17
		 * 
		 * Criar um algoritmo que calcule e imprime a área de um triângulo.
		 * 
		 */
		
		int base = 12;
		int altura = 8;
		
		int area = ((base * altura) / 2);
		
		JOptionPane.showMessageDialog(null, "A área do triagunlo é: " + area + "cm²");
	}

}
