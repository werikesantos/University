package aula06_00;

public class Disciplina {
	
	private String nomeDisciplina;
	private boolean pratica;
	
	//CONSTRUTOR
	public Disciplina(String nomeDisciplina,boolean pratica) {
		this.nomeDisciplina = nomeDisciplina;
		this.pratica = pratica;
	}
	
	//SETTER
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public void setPratica(boolean pratica) {
		this.pratica = pratica;
	}
	
	//GETTER
	public String getNomeDisciplina() {
		return this.nomeDisciplina;
	}
	
	public boolean getPratica() {
		return this.pratica;
	}
	
	//MÉTODOS
	public String getDados() {
		return ("Disciplina: "+getNomeDisciplina()+"\n"+"Prática: "+getPratica()+"\n");
	}
}
