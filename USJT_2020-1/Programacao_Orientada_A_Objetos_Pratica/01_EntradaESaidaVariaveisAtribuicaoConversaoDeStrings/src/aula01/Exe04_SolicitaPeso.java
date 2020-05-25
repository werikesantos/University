package aula01;

import javax.swing.JOptionPane;

public class Exe04_SolicitaPeso {

	public static void main(String[] args) {
		
		/* EXERCICIO 04
		 * 
		 * Solicite ao usuário que digite seu peso no formato real. Depois imprima o peso
		 * informado foi 80.0 + peso + kg.
		 * 
		 */
		
		//Solicitando dados ao usuario
		String sPeso = JOptionPane.showInputDialog("Digite o seu peso:");
		
		//Convertendo a variavel String para int
		float peso = Float.parseFloat(sPeso);
		
		//Exibindo ao usuario o resultado
		JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg");

	}

}
