package aula03;

//propositalmente sem acentos 
import javax.swing.JOptionPane;

public class Exe00_CreditoFuncionario {

	public static void main(String[] args) {
		
		/* Problema Resolvido:
		 * 
		 * A prefeitura de Rio dos Grilos abriu uma linha de crédito para os funcionários. 
		 * O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
		 * Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo
		 * pode ou não ser concedido.
		 */
		
		//LER OS VALORES DO SALÁRIO E DO EMPRESTIMO
		String sSalario = JOptionPane.showInputDialog("Digite o valor do salario: ");
		String sPrestacao = JOptionPane.showInputDialog("Digite o valor da prestacao: ");
		
		//CONVERTER PARA REAL
		Double salario = Double.parseDouble(sSalario);
		Double prestacao = Double.parseDouble(sPrestacao);
		
		//CALCULAR RELAÇÃO ENTRE PRESTAÇÃO E SALÁRIO E IMPRIMIR
		Double relacao = 100.0 * prestacao / salario;
		JOptionPane.showMessageDialog(null, "Relacao entre parcela e salário: " + relacao + "%");
		
		//TESTAR A CONDIÇÃO E INFORMAR O RESULTADO
		if (relacao > 30) {
			
			JOptionPane.showMessageDialog(null, "O valor de parcela excede 30% do" + " salario");
			JOptionPane.showMessageDialog(null, "Emprestimo negado.");
			
		}else
			
			JOptionPane.showMessageDialog(null, "Emprestimo concedido.");
	}

}
