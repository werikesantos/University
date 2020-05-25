package aula03;

import javax.swing.JOptionPane;

public class Exe03_RaizQuadrada {

	public static void main(String[] args) {

		/* EXERCÍCIO 3
		 * 
		 * 3) Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o quadrado do número caso seja negativo.
		 * 
		 */
			
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor:"));
		
		double raiz = Math.sqrt(x);
		
		if(raiz > 0) {
			
			JOptionPane.showMessageDialog(null, "Raiz quadrada de número positivo: \n" + "√"+x+" = "+raiz);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Quadrado do número negativo: \n" + x +"² = "+ Math.pow(x, 2));
			
		}
		
	}

}
