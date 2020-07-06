package dojo;

import javax.swing.JOptionPane;

public class Randori {

	public static void main(String[] args) {

		Randori randori = new Randori();
		
		randori.atividade2();
		
		randori.atividade3();
		
		randori.atividade4Aninhado();
		
		randori.atividade4SemAninhar();
		
		System.exit(0);
		
	}
		
	public void atividade2() {
		
		/* ATIVIDADE 2
		 * 
		 * Entrar com um número e imprimi-lo caso seja maior que 20 (não faça nada se não for).
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso em quilogramas:"));
		
		if(numero > 20) {
			
			JOptionPane.showMessageDialog(null, "O número digitado é maior que 20:\n" + numero);
			
		}
	}
	
	public void atividade3() {
		
		/* ATIVIDADE 3
		 * 
		 * Ler um número e imprimir se ele é par ou ímpar.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		int impar = numero % 2;
		
		if(impar > 0) {
			
			JOptionPane.showMessageDialog(null, String.format("O número %d é ímpar.",numero));
			
		}else {
			
			JOptionPane.showMessageDialog(null, String.format("O número %d é par.",numero));
			
		}
		
	}
	
	public void atividade4Aninhado() {
		
		/* ATIVIDADE 4 - ANINHADO
		 * 
		 * Escreva um algoritmo que leia 3 números inteiros e diga qual é o maior. 
		 * Resolva usando if-else aninhados. Se houver tempo, resolva novamente com if-else if.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			JOptionPane.showMessageDialog(null, String.format("O número %d é maior.",numero1));
			
		}else {
			
			if((numero2 > numero1) && (numero2 > numero3)) {
				
				JOptionPane.showMessageDialog(null, String.format("O número %d é maior.",numero2));
				
			}else {
				
				JOptionPane.showMessageDialog(null, String.format("O número %d é maior.",numero3));
				
			}
		}
	}
	
	public void atividade4SemAninhar() {
		
		/* ATIVIDADE 4 - SEM ANINHAR
		 * 
		 * Escreva um algoritmo que leia 3 números inteiros e diga qual é o maior. 
		 * Resolva usando if-else aninhados. (Se houver tempo, resolva novamente com if-else if.)
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			JOptionPane.showMessageDialog(null, String.format("O número %d é maior.",numero1));
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
				
				JOptionPane.showMessageDialog(null, String.format("O número %d é maior.",numero2));
				
			}else {
				
				JOptionPane.showMessageDialog(null, String.format("O número %d é maior.",numero3));
				
			}		
	}

}
