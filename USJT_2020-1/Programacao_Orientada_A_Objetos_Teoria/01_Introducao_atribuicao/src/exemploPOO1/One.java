package exemploPOO1;

import javax.swing.JOptionPane;

public class One {
	
	private String palavra1;
	private String palavra2;
	private String palavra3;
	
	//CONSTRUTOR
	public One() {
		
		
		
	}
	
	//MÉTODO: "APRESENTA NA TELA NA ORDEM CONTRÁRIA EM QUE FORAM DIGITADAS"
	public void ordemContraria() {
		
		setPalavra1(JOptionPane.showInputDialog("Digite a primeira palavra:"));
		setPalavra2(JOptionPane.showInputDialog("Digite a segunda palavra:"));
		setPalavra3(JOptionPane.showInputDialog("Digite a terceira palavra:"));
		
		JOptionPane.showMessageDialog(null, getPalavra3() + " " + getPalavra2() + " " + getPalavra1());
		
	}

	//GETTER AND SETTER
	public String getPalavra1() {
		return palavra1;
	}
	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}
	public String getPalavra2() {
		return palavra2;
	}
	public void setPalavra2(String palavra2) {
		this.palavra2 = palavra2;
	}
	public String getPalavra3() {
		return palavra3;
	}
	public void setPalavra3(String palavra3) {
		this.palavra3 = palavra3;
	}
}
