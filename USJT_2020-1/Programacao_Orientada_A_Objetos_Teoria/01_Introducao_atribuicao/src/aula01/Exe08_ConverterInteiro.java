package aula01;

import javax.swing.JOptionPane;

public class Exe08_ConverterInteiro {

	public static void main(String[] args) {
		
		//CONVERTENDO A STRING PARA UM INTEIRO:
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor INTEIRO:"));
		
		//MOSTRANDO O RESULTADO:
		JOptionPane.showMessageDialog(null, "Resultado: " + x);
		
	}

}
