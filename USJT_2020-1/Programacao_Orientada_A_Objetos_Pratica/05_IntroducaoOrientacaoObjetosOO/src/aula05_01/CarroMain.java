package aula05_01;

public class CarroMain {
	
	/* Randori
	 * 
	 * 2) Criar a classe Carro com os atributos marca, modelo e cor, todos String. E também um
	 * atributo anoDeFabricacao, do tipo int, um atributo preço, do tipo double e outro do tipo
	 * boolean chamado zero (que indica se o carro é zero ou usado). Faça o construtor que receba
	 * todos os parâmetros para se instanciar um carro, os métodos de acesso e os modificadores.
	 * Crie uma classe CarroMain com o método main que instancie um objeto Carro e imprima seus atributos.
	 * 
	 */
	
	public static void main(String[] args) {

		Carro carro = new Carro("Hyundai","HB20","Prata",2020,70.999,true);
		
		carro.imprimir();
		
		carro.status();
		
		//===========================================================================
		
		Carro carro0 = new Carro("Toyota","Corolla","Azul",2020,102.990,false);
		
		carro0.imprimir();
		
		carro0.status();

		
		System.exit(0);
	}

}
