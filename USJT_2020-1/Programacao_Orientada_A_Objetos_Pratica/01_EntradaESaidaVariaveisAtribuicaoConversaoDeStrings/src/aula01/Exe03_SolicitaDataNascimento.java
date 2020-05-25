package aula01;

import javax.swing.JOptionPane;

public class Exe03_SolicitaDataNascimento {

	public static void main(String[] args) {
		
		/* EXERCICIO 03
		 * 
		 * Crie um algoritmo que leia 3 número que representem uma data, respectivamente dia,
		 * mês e ano. Depois imprima a data usando o formato dia/mês/ano.
		 * 
		 */
		
		//Solicitando ao usuario que digite as datas
		String sDia = JOptionPane.showInputDialog("Dia:");
		String sMes = JOptionPane.showInputDialog("Mês:");
		String sAno = JOptionPane.showInputDialog("Ano:");
		
		//Convertendo a variavel String para int
		int dia = Integer.parseInt(sDia);
		int mes = Integer.parseInt(sMes);
		int ano = Integer.parseInt(sAno);
		
		//Exibindo ao usuario o resultado
		JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
	}

}
