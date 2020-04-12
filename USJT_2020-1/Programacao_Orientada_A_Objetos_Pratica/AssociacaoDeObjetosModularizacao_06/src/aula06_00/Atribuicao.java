package aula06_00;

public class Atribuicao {
	
	private Professor professor;
	private Disciplina disciplina;
	
	
	//CONSTRUTOR
	public Atribuicao(Professor professor,Disciplina disciplina) {
		this.professor = professor;
		this.disciplina = disciplina;	
	}
	
	//SETTER
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	//GETTER
	public Professor getProfessor() {
		return this.professor;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
	//MÉTODOS
	public String setDados() {
		String nome = professor.getNome();
		int idade = professor.getIdade();
		String nomeDisciplina = disciplina.getNomeDisciplina();
		boolean pratica = disciplina.getPratica();
		return ("Nome: "+nome+"\nIdade: "+idade+"\nDisciplina: "+nomeDisciplina+"\nPrática: "+pratica);
	}
}
