package aula05_00;

public class CanetaMain {
	
	/* Problemas Propostos:
	 * 
	 * Kata
	 * 
	 * 1) Criar a classe Caneta com os atributos tipo e cor, ambos String. Faça o construtor que
	 * receba o tipo e a cor como parâmetros, os métodos de acesso e os modificadores. Crie uma
	 * classe CanetaMain com o método main( ) que instancie um objeto Caneta e imprima seus atributos.
	 *
	 */
	
	public static void main(String[] args) {
		
		Caneta caneta0 = new Caneta("Hidrográfica","Vermelha");
		
		caneta0.imprimir();
		
		System.exit(0);
	}

}
