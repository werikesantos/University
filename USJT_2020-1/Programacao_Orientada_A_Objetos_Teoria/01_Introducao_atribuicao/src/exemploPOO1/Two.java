package exemploPOO1;

import javax.swing.JOptionPane;

public class Two {

	int numero;

	//CONSTRUTOR
	public Two() {
		
		
		
	}
	
	//MÉTODO: LEIA UM NÚMERO INTEIRO E IMPRIMA: “O valor do número digitado é: ” 
	public void imprimir() {
		
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:")));
		
		JOptionPane.showMessageDialog(null, "O valor do número digitado é: \n" + getNumero());
		
	}
	
	//GETTER AND SETTER
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}
