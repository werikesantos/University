package aula05_03;

public class Turma {
	
	/* Resolva os exercícios desta seção para conquistar 0,5 ponto
	 * 
	 * 1) Crie a classe Turma com seu construtor, métodos de acesso e modificadores e os
	 * atributos privados nome, do tipo String, curso, do tipo String, quantidadeDeAlunos, do tipo int, serie, do tipo int.
	 * 
	 */
	
	private String nome; 
	private String curso;
	private int quantidadeDeAlunos;
	private int serie;
	
	//==============# CONSTRUTOR #===================
	public Turma(String nome,String curso, int quantidadeDeAlunos,int serie) {
		this.nome = nome;
		this.curso = curso;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.serie = serie;
	}
	//===============# MÉTODOS #=====================
	public String imprimir() {
		return "Aluno: "+nome+"\nCurso: "+curso+"\nQuantidade: "+quantidadeDeAlunos+"\nSerie: "+serie;
	}
	
	
	//===============# SETTER_GETTER #===============
	//Acessor
	public String getNome() {
		return this.nome;
	}
	
	//Modificador
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//===============================================
	//Acessor
	public String getCurso() {
		return this.curso;
	}
	
	//Modificador
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//===============================================
	//Acessor
	public int getQuantidadeDeAlunos() {
		return this.quantidadeDeAlunos;
	}
	
	//Modificador
	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}
	
	//===============================================
	//Acessor
	public int getSerie() {
		return this.serie;
	}
	
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
}
