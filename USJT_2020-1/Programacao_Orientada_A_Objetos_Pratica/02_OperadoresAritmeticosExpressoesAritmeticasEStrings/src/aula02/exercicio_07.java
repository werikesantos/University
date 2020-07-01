package aula02;

import javax.swing.JOptionPane;

public class exercicio_07 {

	public static void main(String[] args) {

		/* EXERCÍCIO O7
		 * 
		 * NÃO FINALIZADO!!!
		 * Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante, cossecante e cotangente.
		 * 
		 */
		
		String dado = JOptionPane.showInputDialog("Digite o ângulo em graus:");
		
		Double valor = Double.parseDouble(dado);
		
		Double angulo = Math.sin(Math.PI/2);
		
		System.out.println(angulo);
	}

}
