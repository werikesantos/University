package exemploPOO1;

import javax.swing.JOptionPane;

public class Five {
	
	private char caracter;
	
	//CONSTRUTOR
	public Five() {
					
					
						
	}
		
	//MÉTODO: LER CARACTER E IMPRIMIR A PALAVRA FORMADA.
	public void imprimirPalavra() {
		
		JOptionPane.showInternalMessageDialog(null,"Será aceito somente caracteres!", "ATENÇÃO!!!", 0, null);
		
		setCaracter(JOptionPane.showInputDialog("Digite dez caracteres, para formar uma palavra:").charAt(0));
		String palavra = Character.toString(getCaracter());
			
		for(int i = 0; i <= 8 ; i++) {
						
			setCaracter(JOptionPane.showInputDialog("Digite dez caracteres, para formar uma palavra:").charAt(0));
			palavra = palavra + Character.toString(getCaracter());
			
		}
			
		JOptionPane.showMessageDialog(null, "A palavra formada é: \n" + palavra);	
		
	}
	
	//GETTER AND SETTER
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
}
