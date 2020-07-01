package aula02;

import javax.swing.JOptionPane;

public class Exe11_FormatarData {

	public static void main(String[] args) {

		/* EXERCÍCIO 11
		 * 
		 * Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e imprimir dia, mês e ano separados.
		 * 
		 */
		
		int data = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia, mês e ano. \nSem acrescentar espaços:"));
		
		String dado = Integer.toString(data);	
		
		String dia = dado.substring(0,2);
		String mes = dado.substring(2,4);
		String ano = dado.substring(4,8);
		
		System.out.println("Dia: " + dia + "|" + "Mês: " + mes + "|" + "Ano: " + ano);
		
	}

}
