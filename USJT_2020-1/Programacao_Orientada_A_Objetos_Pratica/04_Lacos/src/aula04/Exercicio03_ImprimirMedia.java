package aula04;

import javax.swing.JOptionPane;

public class Exercicio03_ImprimirMedia {

	public static void main(String[] args) {
		
		/* EXERCÍCIO 3 
		 * 
		 * Entrar com vários números positivos e imprimir a média dos números digitados.
		 * 
		 */
		
		Exercicio03_ImprimirMedia exercicio03_ImprimirMedia = new Exercicio03_ImprimirMedia();
		
		exercicio03_ImprimirMedia._while_ImprimirMedia();
		
		exercicio03_ImprimirMedia._do_while_ImprimirMedia();
		
		exercicio03_ImprimirMedia._for_ImprimirMedia();
		
		System.exit(0);
		
	}
	
	public void _while_ImprimirMedia() {
				
		int a = 0;
		int b = 0;
		int c = -1;
		
		JOptionPane.showMessageDialog(null, "Laço 'while'", "EXERCÍCIO 3", JOptionPane.PLAIN_MESSAGE);

		while(a >= 0) {
			
			//RECEBE E GUARDA VALORES EM OUTRA VARIÁVEL 
			b = b + a;
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite números positivos para achar a média total:"));
			
			//CONTADORA DE PROCESSOS
			c++;
			
		}
		
		int media = b / c;
		
		JOptionPane.showMessageDialog(null, "A média dos número digitados é:\n" + media); 
		
	}
	
	public void _do_while_ImprimirMedia() {
		
		int a = 0;
		int b = 0;
		int c = -1;
		
		JOptionPane.showMessageDialog(null, "Laço 'do - while'", "EXERCÍCIO 3", JOptionPane.PLAIN_MESSAGE);
		
		do {
			
			//RECEBE E GUARDA VALORES EM OUTRA VARIÁVEL 
			b = b + a;
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite números positivos para achar a média total:"));
			
			//CONTADORA DE PROCESSOS
			c++;
			
			
		}while(a >= 0);
		
		int media = b / c;
		
		JOptionPane.showMessageDialog(null, "A média dos número digitados é:\n" + media); 
		
	}
	
	public void _for_ImprimirMedia() {
		
		int b = 0;
		int c = -1;
		
		for(int a = 0; a >= 0; c++) {
			
			//RECEBE E GUARDA VALORES EM OUTRA VARIÁVEL 
			b = b + a;
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite números positivos para achar a média total:"));

		}
		
		int media = b / c;
		
		JOptionPane.showMessageDialog(null, "A média dos número digitados é:\n" + media); 
		
	}
}
