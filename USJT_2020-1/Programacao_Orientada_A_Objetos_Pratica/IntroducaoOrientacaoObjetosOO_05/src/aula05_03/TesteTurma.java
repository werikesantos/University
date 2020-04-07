package aula05_03;

import javax.swing.JOptionPane;

public class TesteTurma {
	
	/* Resolva os exercícios desta seção para conquistar mais 0,5 pontos
	 * 
	 * 2) Crie a classe TesteTurma com o método main. De modo análogo ao exemplo, peça para o
	 * usuário entrar com os valores necessários para criar uma turma, instancie um objeto Turma
	 * e depois exiba os dados da turma criada. Depois, peça para o usuário uma nova quantidade
	 * de alunos, altere o valor do atributo e exiba os dados novamente.
	 * 
	 */
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu Nome:");
		String curso = JOptionPane.showInputDialog("Digite o curso:");
		int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
		int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie:"));
		
		Turma turma = new Turma(nome,curso,quantidadeDeAlunos,serie);
		
		turma.imprimir();
		
		nome = JOptionPane.showInputDialog("Digite o seu Nome:");
		curso = JOptionPane.showInputDialog("Digite o curso:");
		quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
		serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie:"));
		
		//Método MODIFICADOR
		turma.setNome(nome);
		turma.setCurso(curso);
		turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
		turma.setSerie(serie);
		
		turma.imprimir();
		
	}

}
