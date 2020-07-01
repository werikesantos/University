package exemploPOO2;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 1) Crie um algoritmo que leia três palavras, separadamente, e as apresenta na tela na ordem
		 * contrária em que foram digitadas, separadas por espaço.
		 * 
		 */
		
		Atividade atividade1 = new Atividade();
		atividade1.ordemContraria();
		
		/*
		 * 2) Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do tipo int e
		 * depois escreva na tela: “O valor do número digitado é: ” e o valor do número.
		 * 
		 */
	
		Atividade atividade2 = new Atividade();		
		atividade2.imprimir1();
		
		/*
		 * 3) Crie um algoritmo que leia 3 números que representem uma data, respectivamente dia,
		 * mês e ano. Depois imprima a data usando o formato dia/mês/ano.
		 * 
		 */
		
		Atividade atividade3 = new Atividade();		
		atividade3.data();
		
		/*
		 * 4) Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso 
		 * informado foi “ + peso + “ kg.”.
		 * 
		 */
		
		Atividade atividade4 = new Atividade();	
		atividade4.seuPeso();
		
		/*
		 * 5) Ler dez caracteres e imprimir a palavra formada por eles.
		 * 
		 */
		
		Atividade atividade5 = new Atividade();		
		atividade5.imprimirPalavra();
		
		/*
		 * 6) Leia 4 números inteiros, representando milhar, centena, dezena e unidade. Use o tipo
		 * caractere para garantir que não seja digitado mais de um número por vez. Depois concatene
		 * estes caracteres armazenando-os em uma String (lembre-se de que o jeito mais fácil de
		 * transformar algo em String é concatenando-o com uma String vazia “”). Imprima o resultado.
		 * 
		 */
		
		Atividade atividade6 = new Atividade();		
		atividade6.imprimir2();
	}
}
