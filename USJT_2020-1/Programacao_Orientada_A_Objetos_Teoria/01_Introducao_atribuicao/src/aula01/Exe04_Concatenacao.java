package aula01;

public class Exe04_Concatenacao {

	public static void main(String[] args) {
		
		//CONCATENAÇÃO DE STRING
		int g = 10;
		String x = "Bom";
		
		x = x + " Dia"; //O CONTEÚDO DE 'x' AGORA É "Bom Dia"
		
		x = x + ", " + g; //AGORA 'x' VALE "Bom Dia, 10"
		
		//MOSTRANDO O RESULTADO NO CONSOLE
		System.out.println(x);

	}

}
