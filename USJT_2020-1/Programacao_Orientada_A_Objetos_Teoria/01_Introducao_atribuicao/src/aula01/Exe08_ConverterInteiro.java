package aula01;

import javax.swing.JOptionPane;

public class Exe08_ConverterInteiro {

	public static void main(String[] args) {
		
		//CONVERTENDO 'JOptionPane' (QUE GUARDA SOMENTE VARIÁVEIS DO TIPO STRING) PARA UM TIPO INTEIRO (int).
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor INTEIRO:"));
		
		//MOSTRANDO O RESULTADO:
		JOptionPane.showMessageDialog(null, "Resultado: " + x);
		
	}

}
