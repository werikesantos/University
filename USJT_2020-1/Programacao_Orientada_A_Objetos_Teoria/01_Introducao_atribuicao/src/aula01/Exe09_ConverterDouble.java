package aula01;

import javax.swing.JOptionPane;

public class Exe09_ConverterDouble {

	public static void main(String[] args) {

		//CONVERTENDO A STRING PARA UM DOUBLE:
		double Y = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor REAL:"));
				
		//MOSTRANDO O RESULTADO:
		JOptionPane.showMessageDialog(null, "Resultado: " + Y);

	}

}
