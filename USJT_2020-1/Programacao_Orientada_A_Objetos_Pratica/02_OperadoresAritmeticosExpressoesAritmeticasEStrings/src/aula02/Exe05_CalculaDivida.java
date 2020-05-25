package aula02;

import javax.swing.JOptionPane;

public class Exe05_CalculaDivida {

	public static void main(String[] args) {
		
		/* EXERCICIO 05
		 * 
		 * Crie um algoritmo que calcule o valor de uma divida, submetida a juros compostos:
		 * Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros (em %) e N representa
		 * o número de meses Responda: se você deve para o cartão de crédito R$ 100,00, a  taxa de
		 * juros de 10%, quanto deverá depois de 8 meses?
		 * 
		 */
		
		String sValor_Inicial = JOptionPane.showInputDialog("Digite o valor da divida:");
		String sJ = JOptionPane.showInputDialog("Digite o valor da taxa de juros:");
		String sN = JOptionPane.showInputDialog("Digite a quantidade de meses, para saber o valor final:");
		
		double J = Double.parseDouble(sJ);
		double N = Double.parseDouble(sN);
		double valor_Inicial = Double.parseDouble(sValor_Inicial);
		
		double Valor_Final = (((valor_Inicial * (J/100)) * N) + valor_Inicial);
		
		JOptionPane.showMessageDialog(null, "Se você deve para o cartão de crédito R$ " +valor_Inicial+ " a  taxa de juros de "+J+"%, deverá depois de "+N+" meses: \n"+"R$"+Valor_Final);
	}

}
