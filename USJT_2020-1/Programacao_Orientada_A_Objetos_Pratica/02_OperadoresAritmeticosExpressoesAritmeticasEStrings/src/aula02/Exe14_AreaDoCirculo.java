package aula02;

import javax.swing.JOptionPane;

public class Exe14_AreaDoCirculo {

	public static void main(String[] args) {
		
		/* EXERCÍCIO 14
		 * 
		 * Crie um algoritmo para calcular a área de um circulo, com base no seu raio 
		 * (área = PI*raio*raio, onde PI = 3.14159). Use variáveis reais.
		 * 
		 */
		
		String sRaio = JOptionPane.showInputDialog("Digite o valor do raio:");
		
		double raio = Double.parseDouble(sRaio);
		double PI = 3.14159;
		double area = (PI * Math.pow(raio, 2));
	
		JOptionPane.showMessageDialog(null, "A área de um circulo, com base no seu raio é igual:\n\n"+area);
	}
}

