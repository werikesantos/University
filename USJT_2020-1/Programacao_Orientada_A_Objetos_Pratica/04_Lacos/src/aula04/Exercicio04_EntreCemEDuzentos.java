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

	}
	
	public void _while_EntreCemEDuzentos() {
		
		int a = 0;
		int b = 1;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		
		while(a > 0) {
			
			if((a >= 100) && (a <= 200)) {
				
				//VARIÁVEL CONTADORA DE PROCESSOS
				b++;
				
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));

			}
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			
		}

		JOptionPane.showMessageDialog(null, "Total de vezes em que números entre 100 e 200 foram digitados:\n " + b);
		
	}

}
