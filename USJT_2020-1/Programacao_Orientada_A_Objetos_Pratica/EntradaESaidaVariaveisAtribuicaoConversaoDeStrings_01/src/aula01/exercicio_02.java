package aula01;

import javax.swing.JOptionPane;

public class exercicio_02 {

	public static void main(String[] args) {
		
		/* EXERCICIO 02
		 * 
		 * Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do tipo int e
		 * depois escreva na tela: “O valor do número digitado é: ” e o valor do número.
		 * 
		 */
		
		//Solicita ao usuario que digite um valor
		String sNumero = JOptionPane.showInputDialog("Digite um número:");
		
		//Convertendo a variavel String para int
		int numero = Integer.parseInt(sNumero);
		
		//Exibindo ao usuario o resultado
		JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + numero);

	}

}
