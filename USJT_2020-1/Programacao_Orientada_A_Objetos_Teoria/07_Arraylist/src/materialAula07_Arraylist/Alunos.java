package materialAula07_Arraylist;

public class Alunos {
	
	private String nome;
	private int idade;
	private int ra;
	
	public Alunos()
	{
		nome = "Hamilton";
		idade = 38;
		ra = 123456;
	}
	
	public Alunos(String nome, int id, int r)
	{
		this.nome = nome;
		idade = id;
		ra = r;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setIdade(int id)
	{
		idade = id;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public void setRA(int r)
	{
		ra = r;
	}
	public int getRA()
	{
		return ra;
	}
	public void imprirDados() {
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nRA: "+ra);
	}
}
