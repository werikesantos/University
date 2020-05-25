package aula07_02;

import java.util.ArrayList;

public class BlocoDeNotas {

	private ArrayList<String> notas;
	
	//CONTRUTOR
	public BlocoDeNotas() {
		
		setNotas(new ArrayList<>());//<> COLOCAR DENTRO A CLASSE QUE VAI PERCORRER
		
	}
	
	
	//MÉTODO QUE (ADICIONA) NA VARIÁVEL 'AMIGO' DO CONSTRUTOR
	public void inserir() {
			
		
			
	}

	//MÉTODO (BUSCAR)
	private int buscar(String nome) {
		
		return buscar(nome);
	}

	//MÉTODO QUE (REMOVE) NA VARIÁVEL 'AMIGO' DO CONSTRUTOR
	public boolean remover(String nome) {
			
		int posicao = buscar(nome);
			
		if (posicao >= 0) {
				
			//.remove(posicao);NOME DA CLASSE
			return true;
				
		} else {
				
			return false;
		}
			
	}
	
	//MÉTODO QUE IMPRIMI DADOS PASSADOS PARA AS VARIÁVEIS
	public String toString() {
		
		return "[Nome: " + nome + "] [Sexo: " + sexo + "] [Idade: " + idade + "]\n[Mensagem: " + mensagem + "]";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	//GETTER E SETTER
	public ArrayList<String> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<String> notas) {
		this.notas = notas;
	}
			
	
}
