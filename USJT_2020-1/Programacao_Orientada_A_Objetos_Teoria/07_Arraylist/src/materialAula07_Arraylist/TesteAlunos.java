package materialAula07_Arraylist;
import javax.swing.JOptionPane;

public class TesteAlunos {
	public static void main(String[] args)
	{
		AlunosArray alunosArray = new AlunosArray();
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n0 - Sair \n1 - Inserir \n2 - Listar Todos \n3 - Remover"));
			
			if(op == 1)
			{	
				String nome = JOptionPane.showInputDialog("Digite seu nome");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
				int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA"));
				Alunos alunos = new Alunos(nome, idade, ra);
				alunosArray.inserir(alunos);		
			}
			else if(op == 2) {
				alunosArray.listarAlunos();
			}
			else if(op == 3)
			{
				String nome = JOptionPane.showInputDialog("Digite seu nome");
				alunosArray.remover(nome);
			}
			else if(op != 0)
			{
				System.out.println("Sistema finalizado com sucesso!!");
			}
			
		//alunos.imprirDados();
		/*Alunos aluno = new Alunos();
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		aluno.setNome(nome);
		aluno.setIdade(25);
		aluno.setRA(987654);
		
		alunosArray.inserir(aluno);
		alunos.imprirDados();*/
		
		
		}while(op!=0);
	}
}
