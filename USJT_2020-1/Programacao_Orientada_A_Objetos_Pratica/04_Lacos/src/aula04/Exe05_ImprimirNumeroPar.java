package aula04;

import javax.swing.JOptionPane;

public class Exe05_ImprimirNumeroPar {

	public static void main(String[] args) {
		
		
		/* EXERCÍCIO 2
		 * 
		 * 2) Imprimir na tela os 100 primeiros números pares. Exercícios intermediários:
		 * valor 0,5 ponto Resolva os exercícios desta seção para conquistar mais 0,5 ponto
		 * 
		 */

		int i;

		// LAÇO 'while'
		JOptionPane.showMessageDialog(null, "Laço 'while'", "EXERCÍCIO 2", JOptionPane.PLAIN_MESSAGE);

		i = 0;
		while (i <= 50) {
			
			//NESTA LINHA 'SOMENTE' IMPRIME O RESULTADO DE UMA OPERAÇÃO!
			System.out.println(i * 2);
			
			//NESTA LINHA É SOMADO +1 NA VARIÁVEL. SOMENTE AQUI É ACRESCENTADO UMA SOMA +1.
			i++;
			
		}

		
		//LAÇO 'do - while'
		i = 0;
		JOptionPane.showMessageDialog(null, "Laço 'do - while'", "EXERCÍCIO 2", JOptionPane.PLAIN_MESSAGE);

		do {

			System.out.println(i * 2);
			i++; // i = i +1;

		} while (i <= 50);

		
		// LAÇO 'for'd
		JOptionPane.showMessageDialog(null, "Laço 'for'", "EXERCÍCIO 2", JOptionPane.PLAIN_MESSAGE);
		for (i = 0; i <= 50; i++) {

			System.out.println(i * 2);

		}

	}

}
