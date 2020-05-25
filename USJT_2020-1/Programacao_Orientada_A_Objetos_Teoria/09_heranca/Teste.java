package heranca;

public class Teste {
	public static void main(String args[])
	{		
		Empregado emp = new Empregado("Hamilton");	
		System.out.println("Nome: "+emp.getNome());
		System.out.println("Salario: "+emp.salario());
		
		Mensalista emp1 = new Mensalista("Arthur", 1000.00);
		System.out.println("Nome: "+emp1.getNome());
		System.out.println("Salario: "+emp1.salario()); 
		
		Comissionado emp3 = new Comissionado("Aniele", 1500.00,2000.00);
		System.out.println("Nome: "+emp3.getNome());
		System.out.println("Salario: "+emp3.salario());
			
	      } 
	}
}
