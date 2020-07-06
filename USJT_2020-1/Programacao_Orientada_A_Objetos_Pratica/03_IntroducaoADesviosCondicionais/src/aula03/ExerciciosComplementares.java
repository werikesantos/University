package aula03;

import javax.swing.JOptionPane;

public class ExerciciosComplementares {

	public static void main(String[] args) {
			
		ExerciciosComplementares exerciciosComplementares= new ExerciciosComplementares();
		
		exerciciosComplementares.atividade5();
		
		exerciciosComplementares.atividade6();
		
		exerciciosComplementares.atividade7();
		
		exerciciosComplementares.atividade8();
		
		exerciciosComplementares.atividade9();
		
		exerciciosComplementares.atividade10();
		
		exerciciosComplementares.atividade11();
		
		exerciciosComplementares.atividade12();
		
		exerciciosComplementares.atividade13();
		
		exerciciosComplementares.atividade14();
		
		System.exit(0);
	}
	
	public void atividade5() {
		
		/* ATIVIDADE 5
		 * 
		 * Construir um algoritmo que indique se o número digitado está compreendido entre 20 e 90 ou não.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número número:"));
		
		if((numero >= 20) && (numero <= 90)) {
			
			JOptionPane.showMessageDialog(null, "Está contido entre 20 e 90:\n" + numero);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "NÃO está contido entre 20 e 90!\n" + numero);
			
		}
		
	}
	
	public void atividade6() {
		
		/* ATIVIDADE 6
		 * 
		 * Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou menor do que 20.
		 * 
		 */
		
		int maior;
		int igual;
		int menor;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número número:"));
		
		if(numero > 20) {
			
			maior = numero;
			
			JOptionPane.showMessageDialog(null, "O número digitado é MAIOR que 20.\n" + maior);
			
		}else if(numero == 20) {
			
			igual = numero;
			
			JOptionPane.showMessageDialog(null, "O número digitado é IGUAL a 20.\n" + igual);
			
		}else if(numero < 20) {
			
			menor = numero;
			
			JOptionPane.showMessageDialog(null, "O número digitado é MENOR que 20.\n" + menor);
			
		}
	}
	
	public void atividade7() {
		
		/* ATIVIDADE 7
		 * 
		 * Entrar com o nome, sexo e idade de uma pessoa. 
		 * Se a pessoa for do sexo feminino e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. 
		 * Caso contrário, imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)
		 * 
		 */
	
		String nome = JOptionPane.showInputDialog("Digite o seu nome:");
		String sexo = Character.toString(JOptionPane.showInputDialog("Digite o seu sexo: M/F").charAt(0));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if((sexo.equalsIgnoreCase("F")) && (idade > 25)) {
			
			System.out.println("Nome: "+nome+"\n===========\n"+"ACEITA!");
			
		}else {
			
			System.out.println("Nome: "+nome+"\n===========\n"+"NÃO ACEITA!");
			
		}
	}
	
	public void atividade8() {
		
		/* ATIVIDADE 8
		 * 
		 * Entrar com dois números e imprimir o maior número (suponha números diferentes).
		 * 
		 */
		
		int maior = 0;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		//ACHAR O MAIOR NÚMERO
		if(numero1 > numero2) {
			
			maior = numero1;
			
		}else if(numero2 > numero1) {
			
			maior = numero2;
			
		}
		
		JOptionPane.showMessageDialog(null, "Os números digitados foram: " + numero1 + " - " + numero2 +"\nO número maior é: " + maior);
		
	}
	
	public void atividade9() {
		
		/* ATIVIDADE 9
		 * 
		 * Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		int multiplo = numero % 3;
		
		if(multiplo == 0) {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nEle é múltiplo de 3");
			
		}
		
		JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nNÃO é múltiplo de 3");
		
	}
	
	public void atividade10() {
		
		/* ATIVIDADE 10
		 * 
		 * Entrar com um número e informar se ele é ou não divisível por 5.
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		int divisivel = numero % 5;
		
		if(divisivel == 0) {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nEle é divisível por 5.");
			
		}
		
		JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nNÃO é divisível por 5.");
	}
	
	public void atividade11() {
		
		/* ATIVIDADE 11
		 * 
		 * Entrar com um número e informar se ele é divisível por 3 e por 7.
		 * 
		 * EXEMPLOS: 
		 * 
		 * 21 - 42 - 63...n (21+21=42 - 42+21=63 - 63+21=84...n...)
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		int divisivel3 = numero % 3;
		int divisivel7 = numero % 7;
		
		if((divisivel3 == 0) && (divisivel7 == 0)) {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nEle é divisível por 3 e 7.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nNÃO é divisível por 3 e 7.");
			
		}
		
	}
	
	public void atividade12() {
		
		/* ATIVIDADE 12
		 * 
		 * Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é divisível por nenhum destes.
		 * 
		 * 10 - 20 - 30...n (Qualquer número divisível por 10, é divisível por 5 e 2.)
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		int divisivel10 = numero % 10;
		int divisivel5 = numero % 5;
		int divisivel2 = numero % 2;
		
		if((divisivel10 == 0) && (divisivel5 == 0) && (divisivel2 == 0)) {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nEle é divisível por 10, por 5, e por 2.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nNÃO é divisível por 10, por 5, e por 2.");
			
		}
		
	}
	
	public void atividade13() {
		
		/* ATIVIDADE 13
		 * 
		 * Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das dezenas é par ou ímpar.
		 * 
		 */
		
		String numero = JOptionPane.showInputDialog("Digite um número inteiro de 3 casas decimais:");
		
		int dezena = (Integer.parseInt(numero.substring(1,2)) % 2);
		
		if(dezena == 0) {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nO algarismo da casa das dezenas, é um número PAR.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nO algarismo da casa das dezenas, é um número ÍMPAR.");
			
		}
	}
	
	public void atividade14() {
		
		/* ATIVIDADE 14
		 * 
		 * Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro 
		 * o número formado pelos algarismos que estão nas casas das unidades de milhar e das centenas.
		 * 
		 */
		
		String numero = JOptionPane.showInputDialog("Digite números de tipos inteiros, com 4 casas decimais:");
		
		int unidade = (Integer.parseInt(numero.substring(3,4)) % 4);
		int centena = (Integer.parseInt(numero.substring(1,2)) % 4);
		int milhar = (Integer.parseInt(numero.substring(0,1)) % 4);
		
		if((unidade == 0) && (centena == 0) && (milhar == 0)) {
			
			JOptionPane.showMessageDialog(null, "Os números digitados foram: " + numero + "\nOs algarismos das casas das UNIDADES, CENTENA e MILHAR, SÃO números MÚLTIPLOS de 4.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Os números digitados foram: " + numero + "\nOs algarismos das casas das UNIDADES, CENTENAS e MILHAR, NÃO SÃO NÚMEROS MÚLTIPLOS de 4.");
			
		}
		
	}

}
