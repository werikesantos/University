package aula03;

import javax.swing.JOptionPane;

public class Exe04_ {

	public static void main(String[] args) {

		/* AINDA NÃO FINALIZADO!!!
		 * 
		 * EXERCÍCIO 4
		 * 
		 * 4) Ler três números e escrevê-los em ordem crescente (suponha números diferentes).
		 * 
		 */

		String numeros = JOptionPane.showInputDialog(null, "Digite três números:");
		//String y = JOptionPane.showInputDialog(null, "2º Digite um número:");
		//String z = JOptionPane.showInputDialog(null, "3º Digite um número:");

		int x = Integer.parseInt((numeros.substring(0,1)));
		int y = Integer.parseInt((numeros.substring(1,2)));
		int z = Integer.parseInt((numeros.substring(2,3)));
		
		if ((x < y) && (y < z)) {
			
			JOptionPane.showMessageDialog(null, x +"-"+ y +"-"+z);
	
		}else if ((z < x) && (x < y)){
			
			JOptionPane.showMessageDialog(null, z +"-"+ x +"-"+y);
			
		}
		
		
	}

}
