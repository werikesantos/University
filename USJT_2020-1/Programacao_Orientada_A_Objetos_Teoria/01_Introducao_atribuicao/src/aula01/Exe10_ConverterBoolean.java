package aula01;

import javax.swing.JOptionPane;

public class Exe10_ConverterBoolean {

	public static void main(String[] args) {

		// CONVERTENDO A STRING PARA O TIPO BOOLEAN:
		boolean z = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite 'true' ou 'false':"));

		// MOSTRANDO O RESULTADO:
		JOptionPane.showMessageDialog(null, "Resultado: " + z);

	}

}
