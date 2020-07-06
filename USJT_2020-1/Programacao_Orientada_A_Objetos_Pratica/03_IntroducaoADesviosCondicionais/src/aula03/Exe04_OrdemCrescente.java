package aula03;

import javax.swing.JOptionPane;

public class Exe04_OrdemCrescente {

	public static void main(String[] args) {

		/* EXERCÍCIO 4
		 * 
		 * 4) Ler três números e escrevê-los em ordem crescente (suponha números diferentes).
		 * 
		 */
		
		int maior = 0;
		int intermediario = 0;
		int menor = 0;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		
		//ACHANDO O MAIOR NÚMERO
		if((numero1 > numero2) && (numero1 > numero3)) {
			
			maior = numero1;
			
		}else if((numero2 > numero1) && (numero2 > numero3)) {
			
			maior =  numero2;
			
		}else if((numero3 > numero1) && (numero3 > numero2)) {
			
			maior =  numero3;
			
		}
				
		//ACHANDO O NÚMERO INTERMEDIÁRIO
		if((numero1 > numero2) && (numero1 < numero3)) {
			
			intermediario = numero1;
			
		}else if((numero2 < numero1) && (numero2 > numero3)) {
			
			intermediario = numero2;
			
		}else if((numero3 > numero1) && (numero3 < numero2)) {
			
			intermediario = numero3;

		}
		
		//ACHANDO O MENOR NÚMERO
		if((numero1 < numero2) && (numero1 < numero3)) {
			
			menor = numero1;

		}else if((numero2 < numero1) && (numero2 < numero3)) {
			
			menor = numero2;
			
		}else if((numero3 < numero1) && (numero3 < numero2)) {
			
			menor = numero3;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os números digitados foram:\n" + numero1 + " - " + numero2 + " - " + numero3 + "\nOrdem CRESCENTE:\n" +menor+" - "+intermediario+" - "+maior);
		
	}

}
