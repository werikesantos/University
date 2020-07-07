package aula04;

import javax.swing.JOptionPane;

public class Exercicio02_ImprimirNumeroPar {

	public static void main(String[] args) {
				
		/* EXERCÍCIO 2
		 * 
		 * Imprimir na tela os 100 primeiros números pares.
		 * 
		 */
		
		Exercicio02_ImprimirNumeroPar exercicio02_ImprimirNumeroPar = new Exercicio02_ImprimirNumeroPar();
		
		exercicio02_ImprimirNumeroPar._while_ImprimirNumeroPar();
		
		exercicio02_ImprimirNumeroPar._do_while_ImprimirNumeroPar();
		
		exercicio02_ImprimirNumeroPar._for_ImprimirNumeroPar();
		
		System.exit(0);
		
	}
	
	public void _while_ImprimirNumeroPar() {
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
	}
	
	public void _do_while_ImprimirNumeroPar() {
		
		//LAÇO 'do - while'
		int i = 0;
		JOptionPane.showMessageDialog(null, "Laço 'do - while'", "EXERCÍCIO 2", JOptionPane.PLAIN_MESSAGE);

		do {

			System.out.println(i * 2);
			i++; // i = i +1;

		} while (i <= 50);

	}
	
	public void _for_ImprimirNumeroPar() {
		
		// LAÇO 'for'
		JOptionPane.showMessageDialog(null, "Laço 'for'", "EXERCÍCIO 2", JOptionPane.PLAIN_MESSAGE);
		
		for (int i = 0; i <= 50; i++) {

			System.out.println(i * 2);

		}

	}

}
