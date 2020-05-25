package aula04;

import javax.swing.JOptionPane;

public class Exe01_While {

	public static void main(String[] args) {
		
		/*
		 * O loop while(enquanto) primeiro testa condição lógica; 
		 * se ela for verdadeira, executa o código que está dentro do loop e testa a condição lógica de novo; 
		 * se for verdadeira, executa de novo; e assim secessivamente até que a condição lógica se torne falsa.
		 * 
		 * Usando principalmente quando o número de execuções do loop é desconhecido.
		 * 
		 * Leia inteiros digitados pelo usuário até que ele digite -1
		 * 
		 */
		
		int x = 0;
		
		while (x != -1) {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			
		}	

	}

}
