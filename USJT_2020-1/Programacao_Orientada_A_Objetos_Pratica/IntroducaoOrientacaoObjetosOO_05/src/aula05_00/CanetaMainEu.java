package aula05_00;

public class CanetaMainEu {

	public static void main(String[] args) {

		Caneta caneta0 = new Caneta("Esferográfica", "Azul");
		Caneta caneta1 = new Caneta("Hidrográfica", "Preta");
		Caneta caneta2 = new Caneta("Marca texto", "vermelho");
		
		caneta0.status();
		caneta1.status();
		caneta2.status();
	}

}
