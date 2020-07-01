package aula01;

//IMPORTANDO A CLASE RESPONSÁVEL PELO MÉTODO 'JOptionPane'
import javax.swing.JOptionPane;

public class Exe05_JOptionPaneDialogo {

	public static void main(String[] args) {
		
		//MOSTRA UMA CAIXA DE DIÁLOGO QUE COLETA DADOS COM 'JOptionPane'
		String z = JOptionPane.showInputDialog("Digite seu nome:");
		
		//MOSTRANDO O CONTEÚDO GUARDADO NA CAIXA DE DIÁLOGO NO CONSOLE:
		System.out.println(z);
		
	}

}
