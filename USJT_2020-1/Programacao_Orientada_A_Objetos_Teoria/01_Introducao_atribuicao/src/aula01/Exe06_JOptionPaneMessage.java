package aula01;

import javax.swing.JOptionPane;

public class Exe06_JOptionPaneMessage {

	public static void main(String[] args) {
		
		//MOSTRA UMA CAIXA DE DIÁLOGO QUE COLETA DADOS
		String z = JOptionPane.showInputDialog("Digite seu nome:");
		
		//MOSTRANDO O CONTEÚDO PELO 'JOptionPane'
		JOptionPane.showMessageDialog(null, "Resultado = " + z);

	}

}
