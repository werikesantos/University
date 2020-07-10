package dojo;

import javax.swing.JOptionPane;

public class Randori {

	public static void main(String[] args) {
		
		/* ATIVIDADE 3
		 * 
		 * Entrar com inteiros enquanto forem maiores que zero e imprimir quantos números foram digitados.
		 * 
		 */
		
		Randori randori1 = new Randori();
		
		randori1._while_atividade3();
		
		randori1._do_while_atividade3();
		
		randori1._for_atividade3();
		
		
		/* ATIVIDADE 4
		 * 
		 * Faça um algoritmo que mostre na tela a tabuada de um número qualquer digitado pelo usuário.
		 * 
		 */
		
		Randori randori2 = new Randori();
		
		randori2._while_atividade4();
		
		randori2._do_while_atividade4();
		
		randori2._for_atividade4();
		
		
		/* ATIVIDADE 5
		 * 
		 * Dado um país A, com 5 milhões de habitantes e taxa de natalidade de 3% ao ano, e um país B, com 7 milhões de habitantes 
		 * e taxa de natalidade de 2% ano, calcule e imprima o tempo necessário, em anos, para que a população do país A ultrapasse a do país B.
		 * 
		 */
		
		Randori randori3 = new Randori();
		
		randori3._do_while_atividade5();
		
		
		System.exit(0);
		
	}

	//MÉTODO: CONTAR NÚMEROS DIGITADOS - 'while'
	public void _while_atividade3() {

		int a = 1;
		
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite 0 (zero) para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));	
		
		while(b > 0) {
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
			
			a++;
			
		}
		
		System.out.println(a + " números foram digitados!");
		
	}
	
	//MÉTODO: CONTAR NÚMEROS DIGITADOS - 'do_while'
	public void _do_while_atividade3() {
		
		int a = 0;
		int b = 0;
		
		do {
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", "Digite 0 (zero) para finalizar o programa!", JOptionPane.PLAIN_MESSAGE));	

			a++;
			
			
		}while(b > 0);
		
		System.out.println(a + " números foram digitados!");
		
	}
	
	//MÉTODO: CONTAR NÚMEROS DIGITADOS - 'for'
	public void _for_atividade3() {
		
		int a;
		int b = 0;
		
		for(a = 1; a > 0; b++) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
	
		}
		
		System.out.println(b + " números foram digitados!");
		
	}
	
	//MÉTODO: TABUADA - 'while'
	public void _while_atividade4() {

		int a;
		int b = 0;
		int tabuada = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		
		while(b <= 10) {
			
			tabuada = a * b;
			
			System.out.println(tabuada);
			
			b++;
			
		}
		
		System.out.println("\nTabuada do número: " + a);
		
	}
	
	//MÉTODO: TABUADA - 'do_while'
	public void _do_while_atividade4() {
		
		int b = 0;
		int tabuada = 0;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		
		do {
				
			tabuada = a * b;
			
			System.out.println(tabuada);
			
			b++;
			
		}while(b <= 10);
		
		System.out.println("\nTabuada do número: " + a);
		
	}
	
	//MÉTODO: TABUADA - 'for'
	public void _for_atividade4() {
		
		int tabuada = 0;
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		
		for(int b = 0; b <= 10; b++) {
			
			tabuada = a * b;
			
			System.out.println(tabuada);
			
		}
		
		System.out.println("\nTabuada do número: " + a);
		
	}
	
	//MÉTODO: NATALIDADE DE UM PAÍS - 'while'
	public void _do_while_atividade5() {
		
		double a = 5000000, b = 7000000;

		int ano = 0;

		do {

		a = a + (a * 0.03); 

		b = b + (b * 0.02);
		
		ano++;

		}while (a <= b);

		JOptionPane.showMessageDialog(null, ano + " Anos");
		
	}
	
}
