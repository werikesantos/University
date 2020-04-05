package aula05_00;

import javax.swing.JOptionPane;

public class CanetaMain {

	public static void main(String[] args) {
		
		String rabisco;
		
		Caneta caneta0 = new Caneta();
		
		caneta0.setTipo("Hidrográfica");
		
		rabisco = caneta0.getTipo();
		
		JOptionPane.showMessageDialog(null, "Tipo: " + rabisco);
		
		
		
		
		System.exit(0);
	}

}
