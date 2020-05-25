//NÃO FINALIZADO!!!!

package aula04;

import javax.swing.JOptionPane;

public class Exe06_ImprimirMedia {

	public static void main(String[] args) {

		/* EXERCÍCIO 3 
		 * 
		 * 3) Entrar com vários números positivos e imprimir a média dos números
		 * digitados.
		 * 
		 */
		
		int i;
		int a = 0;
		int b = 0;
		
		i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		
		while(i != 0) {
			
			a = i;
					
			i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
			
		}
		
	}

}
