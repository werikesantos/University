package aula02;

import javax.swing.JOptionPane;

public class exercicio_02 {

	public static void main(String[] args) {
		
		/* EXERCICIO 02
		 * 
		 * Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de sua base e de sua altura.
		 * 
		 */
		
		String sBase = JOptionPane.showInputDialog("Digite o valor da base:");
		String sAltura = JOptionPane.showInputDialog("Digite o valor da altura:");
		
		int base = Integer.parseInt(sBase);
		int altura = Integer.parseInt(sAltura);
		
		int area = base * altura;
		
		JOptionPane.showMessageDialog(null, "O valor da área é: "+area+"cm²");
	}

}
