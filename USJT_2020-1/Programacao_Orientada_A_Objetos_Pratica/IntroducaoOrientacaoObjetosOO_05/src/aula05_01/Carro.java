package aula05_01;

import javax.swing.JOptionPane;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private int anoDeFabricacao;
	private double preco;
	private boolean zero;
	
	//construtor
	public Carro(String ma,String mo,String c,int a,double p,boolean z) {
		this.marca = ma;
		this.modelo = mo;
		this.cor = c;
		this.anoDeFabricacao = a;
		this.preco = p;
		this.zero = z;
	}
	
	//Acessor Marca
	public String getMarca() {
		return this.marca;
	}
	
	//Modificador Marca
	public void setMarca(String ma) {
		this.marca = ma;
	}
	
	//Acessor Modelo
	public String getModelo() {
		return this.modelo;
	}
	
	//Modificador Modelo
	public void setModelo(String mo) {
		this.modelo = mo;
	}
	
	//Acessor cor
	public String getCor() {
		return this.cor;
	}
	
	//Modificador cor
	public void setCor(String c) {
		this.cor = c;
	}
	
	//Acessor anoDeFabricacao
	public int getAnoDeFabricacao() {
		return this.anoDeFabricacao;
	}
	
	//Modificador anoDeFabricacao
	public void setAnoDeFabricacao(int a) {
		this.anoDeFabricacao = a;
	}
	
	//Acesor preço
	public double getPreco() {
		return this.preco;
	}
	
	//Modificador preço
	public void setPreco(double p) {
		this.preco = p;
	}
	
	//Acesso zero
	public boolean getZero() {
		return this.zero;
	}
	
	//Modificador zero
	public void setZero(boolean z) {
		this.zero = z;
				
	}
		
	//metodo imprimir
	public void imprimir() {
		System.out.println(getMarca()+"\n"+getModelo()+"\n"+getCor()+"\n"+getAnoDeFabricacao()+"\n"+getPreco()+"\n"+getZero());
	}
	
}
