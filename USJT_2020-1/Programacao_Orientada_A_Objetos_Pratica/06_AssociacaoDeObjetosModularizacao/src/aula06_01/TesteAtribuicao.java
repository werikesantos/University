package aula06_01;

import javax.swing.JOptionPane;

public class TesteAtribuicao {

	public static void main(String[] args) {
			
		//SOLICITANDO DADOS
		String nomeProfessor;
		nomeProfessor = JOptionPane.showInputDialog(null, "Digite o nome:","CADASTRO DE PROFESSOR",JOptionPane.PLAIN_MESSAGE);
		int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade:","CADASTRO DE PROFESSOR",JOptionPane.PLAIN_MESSAGE));
		String nomeDisciplina = JOptionPane.showInputDialog(null, "Matéria:","CADASTRO DE DISCIPLINA",JOptionPane.PLAIN_MESSAGE);
		boolean praticaDisciplina = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "true OR false","MATÉRIA PRÁTICA:",JOptionPane.PLAIN_MESSAGE));
		
		//INSTÂNCIA DE PROFESSOR
		Professor professor = new Professor(nomeProfessor, idadeProfessor);
		
		//INSTÂNCIA DE DISCIPLINA
		Disciplina disciplina = new Disciplina(nomeDisciplina, praticaDisciplina);
		
		//INSTÂNCIA ATRIBUIÇÃO
		Atribuicao atribuicao = new Atribuicao(professor, disciplina);
		
		//IMPRIMINDO DADOS PELA CLASSE 'Atribuicao'
		atribuicao.getDados();
	
	}

}
