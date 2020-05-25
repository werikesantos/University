package aula04;

import javax.swing.JOptionPane;

public class Exe03_DoWhile {

	public static void main(String[] args) {
		
		//TEM QUE DECLACAR A VARIÁVEL ANTES POIS O 'while' SOLICITA
		int x;
		
		//'do' PEDE PARA (FAZER) ESTA AÇÃO.
		do {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número maior que zero:"));
		
		//'while' (ENQUANTO) A VARIÁVEL 'x' FOR MENOR QUE ZERO (0)
		}while (x >= 0); //OBS: DENTRO DA CONDIÇÃO 'while' EXE:.(x < 0), PODEMOS PERCEBER QUE QUE A VARIÁVEL PRECISA OBTER UM VALOR, ONDE É DECLARADO NO 'do'.

	}

}
