package aula03;

import javax.swing.JOptionPane;

public class Exe02_Condicional_if_elseif_else {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
		
		if (x > 0) {
		
			JOptionPane.showMessageDialog(null, "O número é positivo");
		//NA LINHA ABAIXO ESTÁ APRESENTANDO UMA OUTRA CONDIÇÃO, QUE SE CASO VERDADEIRA APRESENTA A MENSAGEM.
		}else if (x < 0){
			
			JOptionPane.showMessageDialog(null, "O número é negativo");
		
		}else {
			
			JOptionPane.showMessageDialog(null, "O número é nulo");
			
		}
	}

}
