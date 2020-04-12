package aula06_00;

import javax.swing.JOptionPane;

public class TesteAtribuicao {

	public static void main(String[] args) {
		
		//SOLICITANDO DADOS
		String nome = JOptionPane.showInputDialog("Digite o seu Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
		String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
		boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("É uma matéria prática?"));
		
		//INSTÂNCIA DE PROFESSOR
		Professor professor = new Professor(nome,idade);
		
		//INSTÂNCIA DE DISCIPLINA
		Disciplina disciplina = new Disciplina(nomeDisciplina,pratica);
		
		//INSTÂNCIA ATRIBUIÇÃO
		Atribuicao atribuicao = new Atribuicao(professor, disciplina);
		
		//IMPRIMINDO DADOS PELA CLASSE 'Atribuicao'
		JOptionPane.showMessageDialog(null, atribuicao.setDados());
	
	}

}
