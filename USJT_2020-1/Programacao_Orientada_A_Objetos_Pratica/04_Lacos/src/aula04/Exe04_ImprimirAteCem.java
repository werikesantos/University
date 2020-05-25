package aula04;

import javax.swing.JOptionPane;

public class Exe04_ImprimirAteCem {

	public static void main(String[] args) {

		/* EXERCÍCIO 1
		 * 1) Imprimir na tela todos os números de 100 a 1 (contagem regressiva). 
		 *  
		 * 4) Ler vários números e informar quantos números entre 100 e 200
		 * foram digitados. Quando o valor 0 (zero) for lido o algoritmo deverá cessar
		 * sua execução.
		 * 
		 */
		
		int i;
		
		//LAÇO 'while'
		JOptionPane.showMessageDialog(null, "Laço 'while'", "EXERCÍCIO 1", JOptionPane.PLAIN_MESSAGE);
		
		i = 1;
		while(i <= 100) {
			
			System.out.println(i);
			
			i++; //i = i + 1;	
		}
		
		
		//LAÇO 'do - while'
		i = 1;
		JOptionPane.showMessageDialog(null, "Laço 'do - while'", "EXERCÍCIO 1", JOptionPane.PLAIN_MESSAGE);
		
		do{
			
			System.out.println(i);
			i++; //i = i +1;
			
		}while(i <= 100);
		
		
		//LAÇO 'for' 
		JOptionPane.showMessageDialog(null, "Laço 'for'", "EXERCÍCIO 1", JOptionPane.PLAIN_MESSAGE);
		for(i = 1; i <= 100; i++) {
			
			System.out.println(i);
			
		}
	}

}
