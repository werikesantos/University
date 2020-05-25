package aula01;

import javax.swing.JOptionPane;

public class Exe11_ConverterCaracter {

	public static void main(String[] args) {

		//PEGANDO UM CARACTER NA STRING:
		char w = JOptionPane.showInputDialog("Digite uma palavra:").charAt(1);
								
		//MOSTRANDO O RESULTADO:
		JOptionPane.showMessageDialog(null, "Caracter na posição (1): " + w);

	}

}
