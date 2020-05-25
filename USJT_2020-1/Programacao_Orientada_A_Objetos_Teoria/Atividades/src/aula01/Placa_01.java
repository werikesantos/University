package aula01;
import javax.swing.JOptionPane;

public class Placa_01 {

	public static void main(String[] args) {
	
	/* ATIVIDADE 01
	*
	* Faça um algoritmo que receba em uma única variável do tipo inteiro os 4 digitos numéricos de uma placa. 
	* Calcule e exiba o dia do seu rodizio.
	*
	* Sabendo que os rodizios de placas finais 12 são segunda, 34 na terça, 56
	* na quarta, 78 na quinta e 90 na sexta.
	*
	*/

	String sPlaca = JOptionPane.showInputDialog("Digite os 4 números da sua placa:");
	
	int placa = Integer.parseInt(sPlaca);
	placa = (((placa % 1000) % 100) % 10);

	if (placa == 1 || placa == 2)
	JOptionPane.showMessageDialog(null, "ATENÇÃO:\n\nPlacas com finais 1 e 2 não podem circular na segunda - feira!\n\n");
	else if(placa == 3 || placa == 4)
	JOptionPane.showMessageDialog(null, "ATENÇÃO:\n\nPlacas com finais 3 e 4 não podem circular na terça - feira!\n\n");
	else if(placa == 5 || placa == 6)
	JOptionPane.showMessageDialog(null, "ATENÇÃO:\n\nPlacas com finais 5 e 6 não podem circular na quarta - feira!\n\n");
	else if(placa == 7 || placa == 8)
	JOptionPane.showMessageDialog(null, "ATENÇÃO:\n\nPlacas com finais 7 e 8 não podem circular na quinta - feira!\n\n");
	else if(placa == 9 || placa == 0)
	JOptionPane.showMessageDialog(null, "ATENÇÃO:\n\nPlacas com finais 9 e 0 não podem circular na sexta - feira!\n\n");

	}
}