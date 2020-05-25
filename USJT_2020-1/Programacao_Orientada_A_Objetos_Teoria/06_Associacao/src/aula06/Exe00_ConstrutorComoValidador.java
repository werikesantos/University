package aula06;

public class Exe00_ConstrutorComoValidador {

		/* ANOTAÇÃO:
		 * 
		 * COMO UTILIZAR O CONSTRUTOR COMO UM VALIDADOR DE DADOS!
		 * 
		 * SEGUE O EXEMPLO ABAIXO:
		 * 
		 */

		private String nome;
		private int idade;
		
		//CONSTRUTOR VALIDADOR DE DADOS!
		public Exe00_ConstrutorComoValidador(String nome, int idade) {
			
			//ESTÁ É A FORMA PARA VALIDAR OS DADOS PASSADOS PELO MÉTODO 'SET'
			setNome(nome);
			setIdade(idade);
		}
		
		//MÉTODO ALTERADOR
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		//MÉTODO DE MODIFICADOR
		public String getNome() {
			return this.nome;
		}
		
		//MÉTODO ALTERADOR
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		//MÉTODO DE MODIFICADOR
		public int getIdade() {
			return this.idade;
		}

}
