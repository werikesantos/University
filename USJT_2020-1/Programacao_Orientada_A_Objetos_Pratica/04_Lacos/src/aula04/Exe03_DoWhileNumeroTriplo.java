package aula04;

import javax.swing.JOptionPane;

public class Exe03_DoWhileNumeroTriplo {

	public static void main(String[] args) {

		//O PROGRAMA SE ENCERRARÁ QUANDO FOR DIGITADO O NÚMERO -999, CASO CONTRÁRIO ELE APRESENTARÁ O TRIPLO DO NÚMERO DIGITADO E REPETIRÁ TODA A AÇÃO.
		
		//'do - while'
		int i;
		
		do {
			
			String numero = JOptionPane.showInputDialog(null, "Digite um número desde que não seja -999", "KATA 2", JOptionPane.QUESTION_MESSAGE);
			
			i = Integer.parseInt(numero);
			
			JOptionPane.showMessageDialog(null, "O triplo de " + i + " é = " + (3 * i), "Kata 2", JOptionPane.PLAIN_MESSAGE);
			
		}while(i != -999);
		
		System.exit(0);
	}

}
