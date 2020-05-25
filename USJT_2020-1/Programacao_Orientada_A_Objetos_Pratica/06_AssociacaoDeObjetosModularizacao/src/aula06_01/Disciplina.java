package aula06_01;

public class Disciplina {
	
	private String nome;
	private boolean pratica;
	
	//CONSTRUTOR
	public Disciplina(String nome,boolean pratica) {
		this.nome = nome;
		this.pratica = pratica;
	}
	
	//SETTER
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPratica(boolean pratica) {
		this.pratica = pratica;
	}
	
	//GETTER
	public String getNome() {
		return this.nome;
	}
	
	public boolean getPratica() {
		return this.pratica;
	}
	
	//MÉTODOS
	public String getDados() {
		return ("Disciplina: "+getNome()+"\n"+"Prática: "+getPratica()+"\n");
	}
}
