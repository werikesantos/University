package aula07_01;

public class Amigo {

	private String nome, sexo, mensagem;
	private int idade;
	
	//MÉTODO QUE IMPRIMI DADOS PASSADOS PARA AS VARIÁVEIS
	public String toString() {
		return "[Nome: " + nome + "] [Sexo: " + sexo + "] [Idade: " + idade + "]\n[Mensagem: " + mensagem + "]";
	}
	
	//GETTER
	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public int getIdade() {
		return idade;
	}
	
	//SETTER
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//MÉDOTO 'setMensagem' DESENVOLVIDO PARA PEGAR O TAMANHO DA VARIÁVEL E LIMITANDO A MESMA. 
	public void setMensagem(String mensagem) {
		
		// TAMANHO DA MENSAGEEM É NO MÁXIMO 144
		if (mensagem.length() <= 144) {
			
			this.mensagem = mensagem;
			
		} else {
			
			// SE FOR MAIOR QUE 144 NÃO ACEITA
			this.mensagem = mensagem.substring(0, 144);
			
		}
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
