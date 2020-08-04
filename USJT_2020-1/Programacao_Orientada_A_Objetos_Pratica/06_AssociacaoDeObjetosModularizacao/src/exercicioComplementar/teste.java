package exercicioComplementar;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		
		/*
		contaCorrente.depositar(10.0);
		contaCorrente.depositar(30.0);
		contaCorrente.depositar(10.0);
		
		System.out.println(contaCorrente.getSaldo());
		
		contaCorrente.sacar(10);
		
		System.out.println(contaCorrente.getSaldo());
		
		contaCorrente.imprimirSaldo();
		
		JOptionPane.showMessageDialog(null, contaCorrente.consultarSaldo());
			
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os números da sua conta:", "A sua conta possuí apenas 4 digítos!!!",JOptionPane.PLAIN_MESSAGE));
			
		contaCorrente.setNumero(numero);
		
		System.out.println(contaCorrente.getNumero());*/
		
		int digitos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 4 números"));
		contaCorrente.setDigito(digitos);
		System.out.println(contaCorrente.getDigito());
		
		
			
		
		
		
		
		
		
		
	}

}
