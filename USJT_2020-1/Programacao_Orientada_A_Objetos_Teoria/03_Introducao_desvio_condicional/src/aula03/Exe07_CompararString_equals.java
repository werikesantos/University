package aula03;

import javax.swing.JOptionPane;

public class Exe07_CompararString_equals {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Você é um 'Aluno' ou 'Professor':");
		
		//ESSE MÉTODO É UTILIZADO SOMENTE PARA COMPARAR STRING
		if(s1.equals("Aluno")){
			
			JOptionPane.showMessageDialog(null, "São iguais");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "São diferentes");
		
		}

	}

}
