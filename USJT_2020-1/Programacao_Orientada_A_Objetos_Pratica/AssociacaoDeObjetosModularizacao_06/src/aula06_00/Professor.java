package aula06_00;

public class Professor {
	
	private String nome;
	private int idade;
	
	//CONSTRUTOR
	public Professor(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//SETTER
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//GETTER
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	//MÉTODOS
	public String getDados() {
		return ("Nome: "+getNome()+"\n"+"Idade: "+getIdade()+"\n");
	}
}
