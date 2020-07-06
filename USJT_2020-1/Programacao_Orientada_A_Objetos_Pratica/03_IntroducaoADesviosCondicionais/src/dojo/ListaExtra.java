package dojo;

import javax.swing.JOptionPane;

public class ListaExtra {

	public static void main(String[] args) {
		
		ListaExtra listaExtra = new ListaExtra();
		
		listaExtra.atividade1();
		
		listaExtra.atividade2();
		
		listaExtra.atividade3();
		
		listaExtra.atividade4();
		
		listaExtra.atividade5();
	
		listaExtra.atividade6();
		
		System.exit(0);
		
	}
	
	public void atividade1() {
		
		/* ATIVIDADE 1
		 * 
		 * Construir um algoritmo que leia três números e imprima se eles podem ou não ser lados de um triângulo. 
		 * Lembrando que, para ser um triângulo, a soma de dois lados quaisquer deve ser sempre maior que o lado que ficou de fora da soma.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		
		int dado1 = numero1 + numero2;
		int dado2 = numero2 + numero3;
		int dado3 = numero1 + numero3;
		
		if(dado1 > numero3) {
			
			JOptionPane.showMessageDialog(null, String.format("A soma do primeiro e segundo número é igual a %d.\nQue é maior que o terceiro número digitado %d.\nNeste caso, pode ser um triângulo.", dado1, numero3));
			
		}else if(dado2 > numero1) {
			
			JOptionPane.showMessageDialog(null, String.format("A soma do segundo e terceiro número é igual a %d.\nQue é maior que o primeiro número digitado %d.\nNeste caso, pode ser um triângulo.", dado2, numero1));
			
		}else if(dado3 > numero2) {
			
			JOptionPane.showMessageDialog(null, String.format("A soma do primeiro e terceiro número é igual a %d.\nQue é maior que o segundo número digitado %d.\nNeste caso, pode ser um triângulo.", dado3, numero2));
			
		}
	}
	
	public void atividade2() {
		
		/* ATIVIDADE 2
		 * 
		 * Construir um algoritmo que leia três números que representam os lados de um triângulo
		 * e que imprima se o triângulo é equilátero (três lados iguais), 
		 * isósceles (dois lados iguais) ou escaleno (três lados diferentes). 
		 * Antes, não se esqueça de testar se os três lados realmente formam um triângulo. 
		 * 
		 * Informe o usuário caso não formem.
		 * 
		 */
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		
		if(numero1 == numero2 && numero2 == numero3 && numero1 == numero3) {
			
			JOptionPane.showMessageDialog(null, String.format("É um triângulo equilátero (TRÊS lados IGUAIS.)\n%d\n%d\n%d", numero1,numero2,numero3));
			
		}else if((numero1 == numero2) || (numero2 == numero3) || (numero3 == numero1)) {
			
			JOptionPane.showMessageDialog(null, String.format("É um triângulo isósceles (DOIS lados IGUAIS.)\n%d\n%d\n%d", numero1,numero2,numero3));
			
		}else if(numero1 != numero2){
			
			JOptionPane.showMessageDialog(null, String.format("É um triângulo escaleno (TRÊS LADOS DIFERENTES.)\n%d\n%d\n%d", numero1,numero2,numero3));
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Não formou um triângulo!");
			
		}
		
	}
	
	public void atividade3() {
		
		/* ATIVIDADE 3
		 * 
		 * Entrar com um verbo no infinitivo e imprimir se o verbo é da 1ª conjugação (terminados em ar), 
		 * da 2ª conjugação (terminados em er), da 3ª conjugação (terminados em ir), se não está no infinitivo (não termina em r) 
		 * ou se provavelmente nem é verbo no infinitivo (termina em or ou em ur).
		 * 
		 */
		
		String verbo = JOptionPane.showInputDialog("Digite um VERBO no INFINITIVO:");
		
		String infinitivo = verbo.substring(verbo.length() - 2);
		
		if(infinitivo.equalsIgnoreCase("ar")) {
			
			JOptionPane.showMessageDialog(null, "Verbo da 1ª conjugação (terminado em ar):\nVerbo digitado: " + verbo + "\nInfinitivo: " + infinitivo);
			
		}else if(infinitivo.equalsIgnoreCase("er")) {
			
			JOptionPane.showMessageDialog(null, "Verbo da 2ª conjugação (terminado em er):\nVerbo digitado: " + verbo + "\nInfinitivo: " + infinitivo);
			
		}else if(infinitivo.equalsIgnoreCase("ir")) {
			
			JOptionPane.showMessageDialog(null, "Verbo da 3ª conjugação (terminado em ir):\nVerbo digitado: " + verbo + "\nInfinitivo: " + infinitivo);
			
		}else if((infinitivo.equalsIgnoreCase("or")) || (infinitivo.equals("ur"))) {
			
			JOptionPane.showMessageDialog(null, "Não é verbo no infinitivo (terminados em 'or' ou em 'ur'):\nVerbo digitado: " + verbo + "\nInfinitivo: -" );
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Não é um verbo no infinitivo (não termina em 'r')." );
			
		}
	}
	
	public void atividade4() {
		
		/* ATIVIDADE 4
		 * 
		 * Ajude a universidade a montar as divisões do laboratório de programação. 
		 * Para isso, escreva um algoritmo que leia o nome do aluno e diga em qual divisão ele está respeitando a regra abaixo:
		 * - alunos cujo nome começa com as letras de A a K estão na D1;
		 * - alunos cujo nome começa com as letras de L a N estão na D2;
		 * - alunos cujo nome começa com as letras de O a Z estão na D3.
		 * Dica: use o método charAt(posição).
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		
		String letra = nome.substring(0,1);
				
		if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F") || letra.equalsIgnoreCase("G") || letra.equalsIgnoreCase("H") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("J") || letra.equalsIgnoreCase("K")) {
			
			JOptionPane.showMessageDialog(null, "Laboratório: D1\nNome: " + nome + "\nLetra inicial: " + letra);
			
		}else if(letra.equalsIgnoreCase("L") || letra.equalsIgnoreCase("M") || letra.equalsIgnoreCase("N")) {
			
			JOptionPane.showMessageDialog(null, "Laboratório: D2\nNome: " + nome + "\nLetra inicial: " + letra);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Laboratório: D3\nNome: " + nome + "\nLetra inicial: " + letra);
			
		}
	
	}
	
	public void atividade5() {
		
		/* ATIVIDADE 5 - NÃO FINALIZADO
		 * 
		 * Ler três números e armazená-los em três variáveis com os seguintes nomes, de acordo com seus valores relativos: 
		 * maior, intermediário e menor (suponha números diferentes).
		 * 
		 */
		
		int maior;
		int intermediario;
		int menor;
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número:", "SOMENTE NÚMEROS ALEATÓRIOS", JOptionPane.INFORMATION_MESSAGE));	
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:", "SOMENTE NÚMEROS ALEATÓRIOS", JOptionPane.INFORMATION_MESSAGE));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número:", "SOMENTE NÚMEROS ALEATÓRIOS", JOptionPane.INFORMATION_MESSAGE));
		
		if((numero1 > numero2 && numero1 > numero3) && (numero2 < numero1 && numero2 > numero3) && (numero3 < numero1 && numero3 < numero2)) {

			maior = numero1;
			intermediario = numero2;
			menor = numero3;
			
			JOptionPane.showMessageDialog(null, "1º = "+numero1+"\n2º = "+numero2+"\n3º = "+numero3+"\n=========\nO PRIMEIRO número digitado é o MAIOR de todos:\n" + maior + "\nO SEGUNDO número digitado é o INTERMEDIÁRIO:\n" + intermediario + "\nO TERCEIRO número digitado é o MENOR de todos:\n" + menor);
			
			
		}else if((numero2 > numero1 && numero2 > numero3) && (numero3 < numero2 && numero3 > numero1) && (numero1 < numero2 && numero1 < numero3)) {
			
			maior = numero2;
			intermediario = numero3;
			menor = numero1;
			
			JOptionPane.showMessageDialog(null, "1º = "+numero1+"\n2º = "+numero2+"\n3º = "+numero3+"\n=========\nO SEGUNDO número digitado é o MAIOR de todos:\n" + maior + "\nO TERCEIRO número digitado é o INTERMEDIÁRIO:\n" + intermediario + "\nO PRIMEIRO número digitado é o MENOR de todos:\n" + menor);
			
		}else if((numero3 > numero1 && numero3 > numero2) && (numero1 > numero2 && numero1 < numero3) && (numero2 < numero1 && numero2 < numero3)) {
			
			maior = numero3;
			intermediario = numero1;
			menor = numero2;
			
			JOptionPane.showMessageDialog(null, "1º = "+numero1+"\n2º = "+numero2+"\n3º = "+numero3+"\n=========\nO TERCEIRO número digitado é o MAIOR de todos:\n" + maior + "\nO PRIMEIRO número digitado é o INTERMEDIÁRIO:\n" + intermediario + "\nO SEGUNDO número digitado é o MENOR de todos:\n" + menor);
			
		}
	}
	
	public void atividade6() {
		
		/* ATIVIDADE 6
		 * 
		 * Ler cinco números e identificar o maior e o menor de todos (NÃO suponha números diferentes).
		 * 
		 */
		
		int maior = 0;
		int menor = 0;
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número:"));
		int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quinto número:"));
		
		//ACHANDO O 'MAIOR' NÚMERO
		if((n1 > n2) && (n1 > n3) && (n1 > n4) && (n1 > n5)) {

			maior = n1;
			
		}else if((n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5)) {
			
			maior = n2;
			
		}else if((n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5)) {
		
			maior = n3;
			
		}else if((n4 > n1) && (n4 > n2) && (n4 > n3) && (n4 > n5)) {
			
			maior = n4;
	
		}else if((n5 > n1) && (n5 > n2) && (n5 > n3) && (n5 > n4)) {
			
			maior = n5;
			
		}
		
		//ACHANDO O 'MENOR' NÚMERO
		if((n1 < n2) && (n1 < n3) && (n1 < n4) && (n1 < n5)) {
			
			menor = n1;
			
		}else if((n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5)) {
			
			menor = n2;
			
		}else if((n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5)) {
			
			menor = n3;
			
		}else if((n4 < n1) && (n4 < n2) && (n4 < n3) && (n4 < n5)) {
			
			menor = n4;
			
		}else if((n5 < n1) && (n5 < n2) && (n5 < n3) && (n5 < n4)) {
			
			menor = n5;
			
		}
		
		//IMPRIMINDO SOMENTO O MAIOR E MENOR NÚMERO!
		JOptionPane.showMessageDialog(null, "O MAIOR número de todos os que foram digitados:\n" + maior + "\nO MENOR número de todos os que foram digitados:\n" + menor);
		
	}
	

}
