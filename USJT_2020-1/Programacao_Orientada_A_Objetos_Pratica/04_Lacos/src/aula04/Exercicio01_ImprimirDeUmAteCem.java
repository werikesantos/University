package aula04;

import javax.swing.JOptionPane;

public class Exercicio01_ImprimirDeUmAteCem {

	public static void main(String[] args) {

		/* EXERCÍCIO 1
		 * 
		 * Imprimir na tela todos os números de 100 a 1 (contagem regressiva).
		 * 
		 */
		
		Exercicio01_ImprimirDeUmAteCem exercicio01_ImprimirDeUmAteCem = new Exercicio01_ImprimirDeUmAteCem();
		
		exercicio01_ImprimirDeUmAteCem._while_DeUmAteCem();
		
		exercicio01_ImprimirDeUmAteCem._do_while_DeUmAteCem();
		
		exercicio01_ImprimirDeUmAteCem._for_DeUmAteCem();
		
		System.exit(0);
		
	}
	
	public void _while_DeUmAteCem() {
		
		int i;
		
		//LAÇO 'while'
		JOptionPane.showMessageDialog(null, "Laço 'while'", "EXERCÍCIO 1", JOptionPane.PLAIN_MESSAGE);
		
		i = 100;
		while(i >= 1) {
			
			System.out.println(i);
			
			i--; //i = i + 1;	
		}
		
	}
		
	public void _do_while_DeUmAteCem() {
		
		//LAÇO 'do - while'
		JOptionPane.showMessageDialog(null, "Laço 'do - while'", "EXERCÍCIO 1", JOptionPane.PLAIN_MESSAGE);
		
		int i = 100;
		
		do{
					
			System.out.println(i);
			i--; //i = i +1;
					
		}while(i >= 1);
		
	}
	
	public void _for_DeUmAteCem() {

		//LAÇO 'for' 
		JOptionPane.showMessageDialog(null, "Laço 'for'", "EXERCÍCIO 1", JOptionPane.PLAIN_MESSAGE);
		for(int i = 100; i >= 1; i--) {
			
			System.out.println(i);
			
		}
		
	}
}
