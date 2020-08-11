package exercicioComplementarBanco;

public class Agencia {

	private String nome;
	private int numero;
	private int digito;
	
	//CONSTRUTOR QUE RECEBE OS ATRIBUTOS COMO PARAMETROS
	public Agencia(String nome, int numero, int digito){
		
		this.nome = nome;
		this.numero = numero;
		this.digito = digito;
		
	}
	
	//GETTER AND SETTER
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	//MÉTODO QUE TESTA O TAMANHO DOS DÍGITOS (MÁX.4) E SE É POSITIVO, PARA GUARDAR NA VÁRIAVEL O VALOR RECEBIDO! - TESTADO E FUNCIONANDO! 
	//OBS: MÉTODO COPIADO DA CLASSE "ContaCorrente".
	public void setNumero(int numero) {
		
		String numero1 = Integer.toString(numero);	
		
		if((numero1.length() == 4) && (numero > 0)) {	
			this.numero = numero;	
		}else {	
			System.out.println("ERRO!!!");
		}
		
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digitos) {
		
		String dig = Integer.toString(digitos);
		
		int primeiro = ((Integer.parseInt(dig.substring(0,1))) * 4);		
		int segundo = (Integer.parseInt(dig.substring(1,2)) * 6);
		int terceiro = (Integer.parseInt(dig.substring(2,3)) * 8);
		int quarto = (Integer.parseInt(dig.substring(3,4)) * 2);
		
		int total = ((primeiro + segundo + terceiro + quarto) % 11);
		
		if(total == 10) {
			
			total = 0;
			
		}
		
		this.digito = total;
		
	}
	
}
