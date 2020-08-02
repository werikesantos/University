package exercicioComplementar;

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
	 */
	
	//ATRIBUTOS
	private int numero;
	private int digito;
	private Agencia agencia;
	private double saldo;
	
	//CONSTRUTOR
	public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) {
		
		
		
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
			
			return 0;
			
		}else {
			
			saldo = saldo - valorSaque;
			
			return saldo;
			
		}
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
	
	//MÉTODO QUE TESTA O TAMANHO DOS DÍGITOS (MÁX.4) E SE É POSITIVO, PARA GUARDAR NA VÁRIAVEL O VALOR RECEBIDO! - TESTADO E FUNCIONANDO!
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

	public void setDigito(int digito) {
		
		/*
		 * O digito da conta deve ser validado a partir do seguinte algoritmo de módulo 11:
		 * multiplique o primeiro dígito da conta por 4, o segundo por 6, o terceiro por 8 e o quarto por 2; 
		 * some tudo e calcule o resto da divisão (módulo) da soma por 11. Este é o valor do dígito.
		 * Obs: se o resultado for 10 o dígito é 0.
		*/
		
		String digito1 = Integer.toString(digito);
		
		//System.out.println("digito"+digito1);
		/*
		if(digito1.substring(0,1) == "0") {	
			
			int primeiro = Integer.parseInt(Integer.toString(digito).substring(0,1));
			System.out.println("Primeiro"+primeiro);
			int pri = (primeiro * 4);
			System.out.println("multiplo"+pri);}
			
			System.out.println("pri"+pri);*/
			
			int primeiro = Integer.parseInt(digito1.substring(0,1));
			int pri = (primeiro * 4);
			System.out.println("pri"+pri);
			
			int segundo = Integer.parseInt(digito1.substring(1,2));
			int seg = (segundo * 6);
			System.out.println("seg"+seg);
			
			int terceiro = Integer.parseInt(digito1.substring(2,3));
			int ter = (terceiro * 8);
			System.out.println("ter"+ter);
			
			int quarto = Integer.parseInt(digito1.substring(3,4));
			int qua = (quarto * 2);
			System.out.println("qua"+qua);
			
			int soma = (pri + seg + ter + qua);
			System.out.println("SOMA: "+soma);
			int mod = soma % 11;
			System.out.println("MOD: "+mod);
			
			
			this.digito = digito;
		
		
		
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
