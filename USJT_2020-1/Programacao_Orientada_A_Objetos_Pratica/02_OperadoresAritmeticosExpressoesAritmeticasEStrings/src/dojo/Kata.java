package dojo;

import javax.swing.JOptionPane;

public class Kata {

	public static void main(String[] args) {
		
		Kata kata = new Kata();
		
		kata.atividade1();
		
		kata.atividade1A();
		
		kata.atividade1B();
		
		kata.atividade1C();
		
		kata.atividade2();
		
		System.exit(0);

	}
	
	/* ATIVIDADE 1
	 * 
	 * Crie um algoritmo para ler 2 números inteiros, calcular e imprimir a soma deles.
	 * 
	 */
	
	public void atividade1() {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
	}
	
	/* ATIVIDADE 1.A
	 * 
	 * Faça uma solução atribuindo a soma a uma variável e imprimindo o resultado via System.out.println (só o número, sem concatenar texto).
	 * 
	 */
	
	public void atividade1A() {
		
		int numero1 = 2020;
		int numero2 = 1993;
		
		int soma = numero1 + numero2;
		
		System.out.println(soma);
		
	}
	
	/* ATIVIDADE 1.B
	 * 
	 * Faça outra solução imprimindo a soma diretamente no System.out.println (só o número, sem concatenar texto).
	 * 
	 */
	
	public void atividade1B() {
		
		int numero1 = 1500;
		int numero2 = 2020;
		
		System.out.println(numero1 + numero2);
		
	}
	
	/* ATIVIDADE 1.C
	 * 
	 * Faça mais uma solução, desta vez concatenando uma mensagem, como "O resultado é: " e imprimindo o resultado via System.out.println.
	 * 
	 */
	
	public void atividade1C() {
		
		int numero1 = 600;
		int numero2 = 400;
		
		int soma = numero1 + numero2;
		
		System.out.println("O resultado é: " + soma);
		
	}
	
	/* ATIVIDADE 2
	 * 
	 * Crie um algoritmo que leia uma string, divida-a ao meio, concatene a segunda metade com a primeira e imprima o resultado.
	 * 
	 */
	
	public void atividade2() {
		
		String algoritmo = ("Olá, Mundo!");
		
		String parte1 = algoritmo.substring(0,5);
		String parte2 = algoritmo.substring(5,10);
		
		System.out.println(parte2 + parte1);
		
	}
}
