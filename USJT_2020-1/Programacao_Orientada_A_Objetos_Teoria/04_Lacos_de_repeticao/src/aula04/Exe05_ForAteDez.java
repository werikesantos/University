package aula04;

import javax.swing.JOptionPane;

public class Exe05_ForAteDez {

	public static void main(String[] args) {

		/* FOR
		 * 
		 * for(para): é dividido em 3 partes(A; B; C)
		 * 
		 * A) declaração da variável 
		 * B) condição lógica de parada
		 * C) incremento da variável contadora.
		 * 
		 ****USADO QUANDO SE CONHECE O NÚMERO DE VOLTAS QUE SERÁ DADE NO LOOP. 
		 * 
		 */
		
		for (int i = 0; i <= 10; i++) {
			
			JOptionPane.showMessageDialog(null, i);
			
		}
		
	}

}
