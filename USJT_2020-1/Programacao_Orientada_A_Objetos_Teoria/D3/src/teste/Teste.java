package teste;

public class Teste {
	
	//ATRIBUTO
	private String palavra;
	private int caracter;
	
	//CONTRUTOR
	public Teste(String palavra) {
		
		this.palavra = palavra;
		
	}
	
	//MÉTODO CARACTERES SEPARADOS - USUÁRIO
	public void caracterSeparado() {
		
	    setCaracter(getPalavra().length());
	    
		for(int i = 0; i < getCaracter(); i++)
			
	    System.out.print(getPalavra().charAt(i) + " ");
		
	}
	
	//MÉTODO QUANTIDADE DE CARACTERES - USUÁRIO
	public void quatidadeCaracter() {
		
		setCaracter(getPalavra().length());
		
		System.out.println("\n\nTotal de caracteres: \n" + getCaracter());
		
	}
	
	////MÉTODO CARACTERES SEPARADOS - SISTEMA
	public void caracterSeparadoUsr() {
		
		setPalavra("Samuel Oliveira Santos");
		String sam = getPalavra().substring(0,6);
		String oli = getPalavra().substring(7,15);
		String san = getPalavra().substring(16,22);
		
		int s = sam.length();
		int o = oli.length();
		int sa = san.length();
		
		System.out.println("====================\nPalavra(s) digitada(s): \n" + getPalavra() + "\n\nCaracteres da palavra:");
		
		setCaracter(getPalavra().length());
		
		for(int i = 0; i < this.caracter; i++)
			
		    System.out.print(getPalavra().charAt(i) + " ");
		
		setCaracter(s + o + sa);
		
		System.out.println("\n\nTotal de caracteres: \n" + getCaracter());
		
	}
	
	//GETTER AND SETTER
	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public int getCaracter() {
		return caracter;
	}

	public void setCaracter(int caracter) {
		this.caracter = caracter;
	}
	
}
