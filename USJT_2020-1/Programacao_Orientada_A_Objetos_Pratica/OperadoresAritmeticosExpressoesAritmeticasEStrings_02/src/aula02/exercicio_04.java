package aula02;

import javax.swing.JOptionPane;

public class exercicio_04 {

	public static void main(String[] args) {
		
		/* EXERCICIO 04
		 * 
		 * Crie um algoritmo que leia três strings por meio do JOptionPane e escreva a soma do
		 * comprimento destas strings.
		 * 
		 */
		
		// Solicitando informações ao ususario
		String um = JOptionPane.showInputDialog("1º) Digite algo:");
		String dois = JOptionPane.showInputDialog("2º) Digite algo:");
		String tres = JOptionPane.showInputDialog("3º) Digite algo:");
		
		//O comando abaixo ".length()" realiza a contagem de quantos caracteres possui a String.
		int soma1 = um.length();
		int soma2 = dois.length();
		int soma3 = tres.length();
		
		JOptionPane.showMessageDialog(null, soma1+"\n"+soma2+"\n"+soma3);
	}

}
