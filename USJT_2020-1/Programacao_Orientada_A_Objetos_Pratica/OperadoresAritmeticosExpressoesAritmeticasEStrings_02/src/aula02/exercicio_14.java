package aula02;

import javax.swing.JOptionPane;

public class exercicio_14 {

	public static void main(String[] args) {
		
		/* EXERCICIO 14
		 * 
		 * Crie um algoritmo para calcular a área de um círculo, com base no seu raio 
		 * (Área = PI*raio*raio, onde PI = 3.14159). Use variáveis reais.
		 * 
		 */
		
		String sRaio = JOptionPane.showInputDialog("Digite o valor do raio:");
		
		double raio = Double.parseDouble(sRaio);
		double π = 3.14159;
		double area = (π * Math.pow(raio, 2));

		JOptionPane.showMessageDialog(null, "A área de um círculo, com base no seu raio é igual:\n\n"+area);
	}

}
