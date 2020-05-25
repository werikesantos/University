package aula04;

import javax.swing.JOptionPane;

public class Exe04_DoWhilePrintAteDez {

	public static void main(String[] args) {

		//PRINT DO 1 ATÉ 10 C0M 'do' 'while'
		int i = 0;
		
		do {
			
			JOptionPane.showMessageDialog(null, i);
			i = i + 1; //i++
			
		}while(i <= 10);
		
	}

}
