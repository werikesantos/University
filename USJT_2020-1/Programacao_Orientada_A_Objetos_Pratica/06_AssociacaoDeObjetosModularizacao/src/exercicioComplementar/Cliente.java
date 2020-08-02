package exercicioComplementar;

public class Cliente {

	/* A.
	 * 
	 * A classe Cliente possui os atributos nome e cpf, ambos do tipo String, e um atributo conta
	 * do tipo ContaCorrente. Crie um construtor que recebe os atributos como parametros e os
	 * métodos de acesso e os modificadores.
	 * 
	 */
	
	//ATRIBUTOS
	private String nome;
	private String cpf;
	private ContaCorrente conta;
	
	//CONTRUTOR
	public Cliente(String nome, String cpf, ContaCorrente conta) {
		
		
		
	}

	
	//GETTER AND SETTER
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
}
