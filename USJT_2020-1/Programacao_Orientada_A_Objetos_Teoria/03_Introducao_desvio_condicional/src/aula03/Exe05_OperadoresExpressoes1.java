package aula03;

import javax.swing.JOptionPane;

public class Exe05_OperadoresExpressoes1 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para (a):"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para (b)"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para (c)"));
		
		//EXEMPLO DE COMO UTILIZAR EXPRESSÕES LÓGICAS DENTRO DE UM CONDICIONAL:
		if (a > b && a > c) {
			JOptionPane.showMessageDialog(null, "O maior é o a");
		} else if (b > a && b > c) {
			JOptionPane.showMessageDialog(null, "O maior é o b");
		} else {
			JOptionPane.showMessageDialog(null, "O maior é o c");
		}

	}

}
