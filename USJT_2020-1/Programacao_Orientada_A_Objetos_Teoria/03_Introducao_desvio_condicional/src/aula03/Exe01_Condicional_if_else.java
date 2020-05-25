package aula03;

import javax.swing.JOptionPane;

public class Exe01_Condicional_if_else {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		
		if (x > 0) 
			JOptionPane.showMessageDialog(null, "O número é positivo");
		else //NÃO SENDO UMA CONDIÇÃO VERDADEIRA, ESTA LINHA É APRESENTADA AO USUÁRIO
			JOptionPane.showMessageDialog(null, "O número é negativo ou nulo");

	}

}
