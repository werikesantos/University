package aula02;

import javax.swing.JOptionPane;

public class exercicio_08 {

	public static void main(String[] args) {
			
		/* EXERCICIO 07 - FAZENDO!!!
		 * 
		 * Entrar com um número e imprimir o logaritmo desse número na base 10.
		 * 
		 */
		
		String sAngulo = JOptionPane.showInputDialog("Digite um angulo em graus:");
		
		int angulo = Integer.parseInt(sAngulo);
		
		double a = Math.toRadians(angulo);

		double seno = Math.sin(a);
		double cosseno = Math.cos(a);
		double tangente = Math.tan(a);
		
		JOptionPane.showMessageDialog(null, seno+"\n"+cosseno+"\n"+tangente);
	}

}
