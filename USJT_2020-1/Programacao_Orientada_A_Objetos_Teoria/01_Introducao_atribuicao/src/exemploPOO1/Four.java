package exemploPOO1;

import javax.swing.JOptionPane;

public class Four {
	
	private double peso;

	//CONSTRUTOR
	public Four() {
					
				
					
	}
	
	//MÉTODO: 
	public void seuPeso() {
		
		setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso")));
		
		JOptionPane.showMessageDialog(null, "O peso informado foi " + getPeso() + " kg.");
	
	}
	
	//GETTER AND SETTER	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
