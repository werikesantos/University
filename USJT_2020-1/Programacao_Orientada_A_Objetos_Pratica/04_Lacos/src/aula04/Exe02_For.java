package aula04;

import javax.swing.JOptionPane;

public class Exe02_For {

	public static void main(String[] args) {

		// RESOLUÇÃO DO EXERCÍCIO PROPOSTO DO KATA 1, UTILIZANDO OS 3 LAÇOS 'while','do-while' E 'for'

		// LAÇO 'for'
		int i;
		
		JOptionPane.showMessageDialog(null, "Resultado do Quadrado de números do 1 ao 20:", "Kata 1",JOptionPane.PLAIN_MESSAGE);
		
		for (i = 1; i <= 20; i++) { //i = i + 1
			
			JOptionPane.showMessageDialog(null, "Número: " + i + " ao quadrado é = " + (i * i), "Kata 1", JOptionPane.PLAIN_MESSAGE);
		
		}

		System.exit(0);

	}

}
