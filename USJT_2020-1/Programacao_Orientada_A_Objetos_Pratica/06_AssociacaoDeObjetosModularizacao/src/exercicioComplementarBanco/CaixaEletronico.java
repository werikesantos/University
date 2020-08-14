package exercicioComplementarBanco;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		/*
		 * e) Para testar faça uma classe CaixaEletronico, que irá conter o método main. 
		 * No main instancie um cliente com os seguintes dados:
		 * 
		 * Nome: Ademar Apior
		 * CPF: 123231518-12
		 * Conta Corrente: 1234 Dígito: 4
		 * Agencia: 7890 Dígito: 5
		 * Saldo Inicial: 150.00
		 * Operações:
		 * - sacar 140.0 (sucesso)
		 * - consultar saldo (resultado é 10.0)
		 * - sacar 200.0 (falha)
		 * - consultar saldo (resultado é 10.0)
		 * - depositar 25.45 (sucesso)
		 * - imprimir saldo (além dos dados de cliente, conta e agencia, o saldo deve ser 35.45)
		 * 
		 */
		
		Agencia agencia = new Agencia("Bradesco ",7890, 5);
		
		ContaCorrente contaCorrente = new ContaCorrente(1234, 4, agencia, 150);
		
		Cliente cliente = new Cliente("Ademar Apior", "123231518-12", contaCorrente);
		
		System.out.println("Cliente: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nConta Corrente: " + contaCorrente.getNumero() + " Dígito: " + contaCorrente.getDigito() + "\nAgencia: " + agencia.getNumero() + " Dígito: " + agencia.getDigito() + "\n\n*Operações*\nSaldo Inicial: " + contaCorrente.getSaldo());
		
		//MÉTODO DE SAQUE DE DINHEIRO
		System.out.println(contaCorrente.sacar(140));
		//MÉTODO DE CONSULTAR O SALDO EM CONTA
		System.out.println("Consultar Saldo: R$" + contaCorrente.consultarSaldo());		
		//MÉTODO DE SAQUE DE DINHEIRO COM ERRO!
		System.out.println(contaCorrente.sacar(200));
		//MÉTODO DE SAQUE DE DINHEIRO COM ERRO!
		System.out.println("Consultar Saldo: R$" + contaCorrente.consultarSaldo());	
		//MÉTODO DE DEPOSITO
		System.out.println(contaCorrente.depositar(25.45));
		System.out.println("Consultar Saldo: R$" + contaCorrente.consultarSaldo());
	
	}
	

}
