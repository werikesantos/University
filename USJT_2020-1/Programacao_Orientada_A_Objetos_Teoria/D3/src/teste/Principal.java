package teste;

/* DESAFIO:
 * 
 * Escreva um método que imprima todos os caracteres de uma String de maneira separada, 
 * e um método que imprima a quantidade de caracteres que de uma String, ambos por meio de System.out.println().
 * 
 */

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
		
		System.out.println("Palavra digitada: \n" + palavra + "\n\nCaracteres da palavra:");
		
		Teste teste = new Teste(palavra);
		
		teste.caracterSeparado();
		
		teste.quatidadeCaracter();
		
		teste.caracterSeparadoUsr();

	}

}
