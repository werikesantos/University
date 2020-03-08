package aula01;

import javax.swing.JOptionPane;

public class exercicio_04 {

	public static void main(String[] args) {
		
		/* EXERCICIO 04
		 * 
		 * Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso
		 * informado foi “ + peso + “ kg.”.
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
