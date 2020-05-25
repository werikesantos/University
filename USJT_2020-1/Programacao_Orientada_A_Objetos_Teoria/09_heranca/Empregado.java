package heranca;

public class Empregado {
	private String nome;
	
	public Empregado(String nome)
	{
		this.nome = nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
	public double salario() {
		return 0.0;
	}
}
