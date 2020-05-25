package aula04;

import javax.swing.JOptionPane;

public class Exe06_ForAteZero {

	public static void main(String[] args) {

		/* FOR
		 * 
		 * for(para): é dividido em 3 partes(A; B; C)
		 * 
		 * A) declaração da variável 
		 * B) condição lógica de parada
		 * C) incremento da variável contadora.
		 * 
		 */
		
		for (int i = 10; i >= 0; i--) {
			
			JOptionPane.showMessageDialog(null, i);
			
		}

	}

}
