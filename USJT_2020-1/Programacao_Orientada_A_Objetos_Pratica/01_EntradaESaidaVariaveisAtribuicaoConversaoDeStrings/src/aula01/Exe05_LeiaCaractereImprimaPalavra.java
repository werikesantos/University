package aula01;

import javax.swing.JOptionPane;

public class Exe05_LeiaCaractereImprimaPalavra {

	public static void main(String[] args) {
		
		/* EXERCICIO 05
		 * 
		 * Ler dez caracteres e imprimir a palavra formada por eles.
		 * 
		 */
		
		//Solicitando dados ao usuario
		String sCaractere01 = JOptionPane.showInputDialog("Digite o primeiro caractere:");    
		String sCaractere02 = JOptionPane.showInputDialog("Digite o segundo caractere:"); 
		String sCaractere03 = JOptionPane.showInputDialog("Digite o terceiro caractere:");
		String sCaractere04 = JOptionPane.showInputDialog("Digite o quarto caractere:");
		String sCaractere05 = JOptionPane.showInputDialog("Digite o quinto caractere:");
		String sCaractere06 = JOptionPane.showInputDialog("Digite o sexto caractere:");
		String sCaractere07 = JOptionPane.showInputDialog("Digite o sétimo caractere:");
		String sCaractere08 = JOptionPane.showInputDialog("Digite o oitavo caractere:");
		String sCaractere09 = JOptionPane.showInputDialog("Digite o nono caractere:");
		String sCaractere10 = JOptionPane.showInputDialog("Digite o décimo caractere:");
		
		//Processando os dados (convertendo String para um caractere)
		char caractere01 = (char)sCaractere01.charAt(0);
		char caractere02 = (char)sCaractere02.charAt(0);
		char caractere03 = (char)sCaractere03.charAt(0);
		char caractere04 = (char)sCaractere04.charAt(0);
		char caractere05 = (char)sCaractere05.charAt(0);
		char caractere06 = (char)sCaractere06.charAt(0);
		char caractere07 = (char)sCaractere07.charAt(0);
		char caractere08 = (char)sCaractere08.charAt(0);
		char caractere09 = (char)sCaractere09.charAt(0);
		char caractere10 = (char)sCaractere10.charAt(0);
		
		//Exibido o resultado final ao usuario
		JOptionPane.showMessageDialog(null, caractere01+""+caractere02+""+caractere03+""+caractere04+""+caractere05+""+caractere06+""+caractere07+""+caractere08
+""+caractere09+""+caractere10);
		
	}

}
