package aula01;

import javax.swing.JOptionPane;

public class Exe06_InteiroFormaDecimal {

	public static void main(String[] args) {
		
		/* EXERCICIO 06
		 * 
		 * Leia 4 número inteiros, representando milhar, centena, dezena e unidade. Use o tipo
		 * caractere para garantir que nÃ£o seja digitado mais de um nÃºmero por vez. Depois concatene
		 * estes caracteres armazenando-os em uma String (lembre-se de que o jeito mais fácil de
		 * transformar algo em String concatenando-o com uma String vazia). Imprima o resultado.
		 * 
		 */

		String sNumero1 = JOptionPane.showInputDialog("Digite quatro número inteiros:"); 
		
		char numero1 = (char)sNumero1.charAt(0);
		char numero2 = (char)sNumero1.charAt(1);
		char numero3 = (char)sNumero1.charAt(2);
		char numero4 = (char)sNumero1.charAt(3);
		
		JOptionPane.showMessageDialog(null, numero1 +"000\n"+ numero2 +"00\n"+ numero3 +"0\n"+ numero4);
		
		
	}

}
