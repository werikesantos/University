package exercicioComplementarBanco;

import javax.swing.JOptionPane;

public class ContaCorrente {
	
	/* B.
	 * 
	 * A classe ContaCorrente tem os atributos numero e digito, ambos inteiros, o atributo
	 * agencia do tipo Agencia e o atributo saldo do tipo double. 
	 * 
	 * Crie um construtor que recebe os atributos como parametros e os métodos de acesso e os modificadores. 
	 * 
	 * Crie também um método depositar que receba um parametro double com o valor do depósito e aumente o
	 * saldo da conta. 
	 * 
	 * Crie também um método sacar que receba um parametro double com o valor
	 * do saque e diminua o saldo da conta. 
	 * 
	 * A conta não pode ficar negativa. Neste caso, deve ser
	 * dada uma mensagem que o saque não foi efetuado e o retorno deve ser zero. Caso contrário
	 * o retorno deve ser o valor sacado. 
	 * 
	 * Crie também um método consultarSaldo que não recebe
	 * parametros e retorne o saldo. 
	 * 
	 * Crie, finalmente, um método imprimirSaldo que imprima o
	 * numero da conta corrente com dígito, o número da agência com dígito e o saldo da conta
	 * corrente.
	 * 
	 * 
	 * C.
	 * 
	 * Ainda na classe ContaCorrente, o numero da conta deve ter no máximo 4 dígitos e ser
	 * positivo. 
	 * 
	 * O digito da conta deve ser validado a partir do seguinte algoritmo de módulo 11:
	 * multiplique o primeiro dígito da conta por 4, o segundo por 6, o terceiro por 8 e o quarto por 2; 
	 * some tudo e calcule o resto da divisão (módulo) da soma por 11. Este é o valor do dígito.
	 * Obs: se o resultado for 10 o dígito é 0.
	 * 
	 * D.
	 * 
	 * A classe Agencia tem os atributos nome do tipo String, numero e digito do tipo int. 
	 * Crie um construtor que recebe os atributos como par‚metros e os métodos de acesso e os modificadores. 
	 * O numero e o digito da Agencia devem seguir os mesmos padrões do número e do dígito da conta corrente.
	 * 
	 * e) Para testar faça uma classe CaixaEletronico, que irá conter o método main. No main instancie um cliente com os seguintes dados:
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
	
	//ATRIBUTOS
	private int numero;
	private int digito;
	private Agencia agencia;
	private double saldo;
	
	//CONSTRUTOR
	public ContaCorrente(int numero, int digito, Agencia agencia, float saldo) {
		
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		
	}
	
	public ContaCorrente() {
		
		
		
	}
	
	//MÉTODOS
	
	//MÉTODO DEPOSITAR - TESTADO E FUNCIONANDO!
	public double depositar(double valorDeposito) {
		
		saldo = saldo + valorDeposito;
		
		return saldo;
		
	}
	
	//MÉTODO SACAR - TESTADO E FUNCIONANDO! 
	public double sacar(double valorSaque) {
			
		if(valorSaque > saldo) {	
			
			JOptionPane.showMessageDialog(null, "O saque não será efetuado.\nSaldo insuficiente!!!");
			
			//return 0;
			
		}else {
			
			saldo = saldo - valorSaque;
			
		}
		
		return saldo;
	}
	
	//MÉTODO CONSULTAR DADOS - TESTADO E FUNCIONANDO!
	public double consultarSaldo() {
		
		return saldo;
		
	}
	
	//MÉTODO IMPRIMIR SALDO - TESTADO E FUNCIONANDO!
	public void imprimirSaldo() {
		
		System.out.println("\nConta Corrente:\nNúmero = " + numero + " - Dígito = " + digito + "\n\nAgência = " + agencia + "\n\nSaldo = " + saldo);

	}
	
	//GETTER AND SETTER
	public int getNumero() {
		return numero;
	}
	
	//MÉTODO QUE TESTA O TAMANHO DOS D�?GITOS (M�?X.4) E SE É POSITIVO, PARA GUARDAR NA V�?RIAVEL O VALOR RECEBIDO! - TESTADO E FUNCIONANDO!
	public void setNumero(int numero) {
	
		String numero1 = Integer.toString(numero);	
		
		if((numero1.length() == 4) && (numero > 0)) {	
			this.numero = numero;	
		}else {	
			System.out.println("ERRO!!!");
		}
	}
	
	//GETTER AND SETTER
	public int getDigito() {
		return digito;
	}
	
	
	//RECEBE 4 NÚMEROS DA CONTA E GERA UM "DIGITO" PARA A CONTA! - TESTADO E FUNCIONANDO!
	public void setDigito(int digitos) {
		
			String dig = Integer.toString(digitos);
		
			int primeiro = ((Integer.parseInt(dig.substring(0,1))) * 4);		
			int segundo = (Integer.parseInt(dig.substring(1,2)) * 6);
			int terceiro = (Integer.parseInt(dig.substring(2,3)) * 8);
			int quarto = (Integer.parseInt(dig.substring(3,4)) * 2);
			
			int total = ((primeiro + segundo + terceiro + quarto) % 11);
			
			if(total == 10) {
				
				total = 0;
				
			}
			
			this.digito = total;
			
	}
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
