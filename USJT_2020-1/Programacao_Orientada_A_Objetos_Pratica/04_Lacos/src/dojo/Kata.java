package dojo;

import javax.swing.JOptionPane;

public class Kata {

	public static void main(String[] args) {
		
		/* ATIVIDADE 1
		 * 
		 * Imprimir na tela os quadrados dos números inteiros de 1 a 20.
		 * 
		 */
		
		Kata kata1 = new Kata();
		
		kata1._while_atividade1();
		
		kata1.do_while_atividade1();
		
		kata1._for_atividade1();
		
		
		/* ATIVIDADE 2
		 * 
		 * Entrar com números e imprimir o triplo de cada número. O algoritmo acaba quando entrar o número -999.
		 * 
		 */
		
		Kata kata2 = new Kata();
		
		kata2._while_ImprimirTriplo();
		
		kata2.do_while_ImprimirTriplo();
		
		kata2._for_ImprimirTriplo();
		
		
		System.exit(0);
		
	}
	
	
	//MÉTODO: O QUADRADO DE NÚMEROS INTEIROS DO 1 AO 20 - 'while'
	public void _while_atividade1() {
			
		int a = 1;
		int quadrado = 0;
		
		while(a <= 20) {
			
			quadrado = a * a;
			
			System.out.println(quadrado);
			
			a++;
			
		}
	}
	
	//MÉTODO: O QUADRADO DE NÚMEROS INTEIROS DO 1 AO 20 - 'do_while'
	public void do_while_atividade1() {
		
		int a = 1;
		int quadrado = 0;
		
		do {
			
			quadrado = a * a;
			
			System.out.println(quadrado);
			
			a++;
			
		}while(a <= 20);
		
	}
	
	//MÉTODO: O QUADRADO DE NÚMEROS INTEIROS DO 1 AO 20 - 'for'
	public void _for_atividade1() {
		
		int quadrado;
		
		for(int a = 1; a <= 20; a++){
			
			quadrado = a * a;
			
			System.out.println(quadrado);
			
		}
		
	}
	
	//MÉTODO: O TRIPLO DE NÚMEROS INTEIROS - 'while'
	public void _while_ImprimirTriplo() {
	
		int a;
		int triplo;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));
		
		while(a != -999) {
			
			triplo = a * 3;
			
			JOptionPane.showMessageDialog(null, "O triplo do número digitado é: " + triplo);
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			
		}
	}
	
	//MÉTODO: O TRIPLO DE NÚMEROS INTEIROS - 'do_while'
	public void do_while_ImprimirTriplo() {
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));
		
		if(a != -999) {
			
			do {
				
				JOptionPane.showMessageDialog(null, "O triplo do número digitado é: " + a * 3);
				
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));		
			
			}while(a != -999);
		
		}
		
		JOptionPane.showMessageDialog(null, "Programa Finalizado!");
		
	}
	
	//MÉTODO: O TRIPLO DE NÚMEROS INTEIROS - 'for'
	public void _for_ImprimirTriplo() {

		for(int a = 0; a != -999;) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite -999 para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));
			
			JOptionPane.showMessageDialog(null, "O triplo do número digitado é: " + a * 3);
				
		}
		
	}
	
}
