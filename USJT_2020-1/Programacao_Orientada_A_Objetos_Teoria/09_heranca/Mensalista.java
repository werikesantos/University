package heranca;

public class Mensalista extends Empregado{
	private double salario;
	public Mensalista(String nome, double salario)
	{
		super(nome);
		this.salario = salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}

	public double salario()
	{
		return this.salario;
	}
	
}
