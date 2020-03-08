package aula02;

import javax.swing.JOptionPane;

public class exemplo01 {

	public static void main(String[] args) {
		
		//lendo os dados
		String sPeso = JOptionPane.showInputDialog("Digite seu peso em kilogramas:");
		String sAltura = JOptionPane.showInputDialog("Digite sua altura em metros:");
		
		//convertendo para reais
		double peso = Double.parseDouble(sPeso);
		double altura = Double.parseDouble(sAltura);
		
		//calculando o imc
		double imc = peso / (altura * altura);
		
		//apresentando o resultado
		JOptionPane.showMessageDialog(null, "IMC = " + imc);

	}

}
