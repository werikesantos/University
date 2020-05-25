package aula01;

public class Exe04_Concatenacao {

	public static void main(String[] args) {
		
		//CONCATENAÇÃO DE STRING
		int g = 10;
		String x = "Bom";
		
		x = x + " Dia"; //o conteúdo de x agora é "Bom Dia"
		
		x = x + ", " + g; //agora x vale "Bom Dia, 10"
		
		//MOSTRANDO O RESULTADO NO CONSOLE
		System.out.println(x);

	}

}
