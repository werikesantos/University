package aula05_01;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private int anoDeFabricacao;
	private double preco;
	private boolean zero;
	
	//==============# CONSTRUTOR #===================
	public Carro(String marca,String modelo,String cor,int anoDeFabricacao,double preco,boolean zero) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.preco = preco;
		this.zero = zero;
	}
	
	//===============# MÉTODOS #=====================
	//Método IMPRIMIR
	public void imprimir() {
		System.out.println("======$-CARROS_À_VENDA-$=======\n"+"Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nCor: "+getCor()+"\nAno: "+getAnoDeFabricacao()+"\nPreço: R$ "+getPreco()+"\n");
	}
	
	//Método Status
	public void status() {
		
		if(zero == true) {
			System.out.println("O carro é novo!\n===============================\n");
		}else {
			System.out.println("O carro é usado!\n===============================\n");
		}
	}
	
	//===============# SETTER_GETTER #===============
	//Acessor MARCA
	public String getMarca() {
		return this.marca;
	}
	
	//Modificador MARCA
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//===============================================
	//Acessor MODELO
	public String getModelo() {
		return this.modelo;
	}
	
	//Modificador MODELO
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//===============================================
	//Acessor COR
	public String getCor() {
		return this.cor;
	}
	
	//Modificador COR
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//===============================================
	//Acessor ANO DE FABRICAÇÃO
	public int getAnoDeFabricacao() {
		return this.anoDeFabricacao;
	}
	
	//Modificador ANO DE FABRICAÇÃO
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	//===============================================
	//Acesor PREÇO
	public double getPreco() {
		return this.preco;
	}
	
	//Modificador PREÇO
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//===============================================
	//Acesso ZERO
	public boolean getZero() {
		return this.zero;
	}
	
	//Modificador ZERO
	public void setZero(boolean zero) {
		this.zero = zero;			
	}
	
}
