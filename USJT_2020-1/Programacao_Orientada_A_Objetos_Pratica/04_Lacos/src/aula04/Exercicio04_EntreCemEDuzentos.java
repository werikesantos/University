package aula04;

import javax.swing.JOptionPane;

public class Exercicio04_EntreCemEDuzentos {

	public static void main(String[] args) {

		/* EXERCÍCIO 4
		 * 
		 * Ler vários números e informar quantos números entre 100 e 200 foram digitados. 
		 * Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.
		 * 
		 */
		
		Exercicio04_EntreCemEDuzentos exercicio04_EntreCemEDuzentos = new Exercicio04_EntreCemEDuzentos();
		
		exercicio04_EntreCemEDuzentos._while_EntreCemEDuzentos();
		
		exercicio04_EntreCemEDuzentos._do_while_EntreCemEDuzentos();
		
		exercicio04_EntreCemEDuzentos._for_EntreCemEDuzentos();
	
	}
	
	public void _while_EntreCemEDuzentos() {
		
		int a;
		int b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		
		while(a != 0) {
			
			if((a >= 100) && (a <= 200)) {
				
				//VARIÁVEL CONTADORA DE PROCESSOS
				b++;

			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			
		}

		JOptionPane.showMessageDialog(null, "Total de vezes em que números entre 100 e 200 foram digitados:\n " + b);
		
	}
	
	public void _do_while_EntreCemEDuzentos() {

		int a;
		int b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite zero (0) para finalizar!", JOptionPane.PLAIN_MESSAGE));
		
		if(a != 0) {
			
			do {
			
				if((a >= 100) && (a <= 200)) {
				
					b++;
				
				}
			
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));		
			
			}while(a > 0);
		
			JOptionPane.showMessageDialog(null, "Total de vezes em que números entre 100 e 200 foram digitados:\n" + b);
		
		}
		
			JOptionPane.showMessageDialog(null, "O Processo é finalizado ao digitar o número zero (0)!");
	
	}
	
	public void _for_EntreCemEDuzentos() {
		
		int b = 0;
		int c;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite zero (0) para finalizar!", JOptionPane.PLAIN_MESSAGE));
		
		for(c = 1; a != 0; c++) {
			
			if((a >= 100) && (a <= 200)) {
				
				//VARIÁVEL CONTADORA DE PROCESSOS
				b++;

			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			
		}
		
		System.out.println("Foram digitados um total de " + c +" números." + "\nTotal de vezes em que números entre 100 e 200 foram digitados:\n" + b);
		
	}

}
