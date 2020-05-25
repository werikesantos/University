package heranca;

public class Comissionado extends Mensalista{
	private double comissao;
	public Comissionado(String nome, double salario, double comissao)
	{
		super(nome,salario);
		this.comissao = comissao;
	}
	
	public void setComissao(double comissao)
	{
		this.comissao = comissao;
	}
	public double getComissao() {
		return comissao;
	}
	public double salario()
	{
		return super.salario() + comissao;
	}
}
