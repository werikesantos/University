package dojo;

import javax.swing.JOptionPane;

public class Randori {

	public static void main(String[] args) {

		Randori randori = new Randori();
		
		randori.atividade3();
		
		randori.atividade4();
		
		randori.atividade5();
		
		System.exit(0);

	}
	
	/* ATIVIDADE 3
	 * 
	 * Crie um algoritmo para ler 2 números inteiros e calcular a divisão e o resto da divisão deles. 
	 * Não precisa testar a divisão por zero, pois os alunos ainda não aprenderam desvio condicional.
	 * 
	 */
	
	public void atividade3() {
		
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
	
	int divisao = numero1 / numero2;
	int resto = numero1 % numero2;
	
	JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + divisao + "\nO resto da divisão é: " + resto);
	
	}
	
	/* ATIVIDADE 4
	 * 
	 * Crie um algoritmo que leia um número inteiro e calcule a sua raiz quadrada.
	 * 
	 */
	
	public void atividade4() {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		double raiz = Math.sqrt(numero1);
		
		JOptionPane.showMessageDialog(null, "A raiz quadrada do número " + numero1 + " é: " + raiz);
	}
	
	/* ATIVIDADE 5
	 * 
	 * Para gerar o nome de usuário de rede de um novo empregado uma empresa usa o seguinte algoritmo: 
	 * pega as três primeiras letras do nome e as três últimas letras do sobrenome da pessoa os concatena. 
	 * Implemente este algoritmo, lendo o nome completo da pessoa e imprimindo o resultado.
	 * 
	 */
	
	public void atividade5() {

	String nome = JOptionPane.showInputDialog("Digite o nome completo do usuário:");
	
	String nomeUsr = nome.substring(0,3);
	String sobrenomeUsr = nome.substring(nome.length() - 3);
	
	String novoUsr = (nomeUsr + sobrenomeUsr);

	JOptionPane.showMessageDialog(null, "O nome de usuário de rede é: " + novoUsr);
	
	}
}
