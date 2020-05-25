package aula07_00;

public class Caixa {
	
	private String cliente;
	private Carrinho carrinho;
	
	
	//CONSTRUTOR
	public Caixa(String cliente, Carrinho carrinho) {
	
		this.setCliente(cliente);
		this.setCarrinho(new Carrinho());
		
	}
	
	
	//IMPRIMIR DADOS
	public String imprimirCompra() {
		
		return ""+cliente;
		
	}
	
	
	
	
	
	
	
	//GETTER E SETTER
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	
}
