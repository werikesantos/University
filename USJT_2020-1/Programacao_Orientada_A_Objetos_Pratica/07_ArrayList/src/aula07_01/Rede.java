package aula07_01;

import java.util.ArrayList;

public class Rede {
	//CRIANDO ARRAYLIST DE 'AMIGO'
	private ArrayList<Amigo> amigos;

	//CRIANDO O CONSTRUTOR
	public Rede() {
		amigos = new ArrayList<Amigo>();
	}
	
	//MÉTODO QUE (ADICIONA) NA VARIÁVEL 'AMIGO' DO CONSTRUTOR
	public void addAmigo(Amigo amigo) {
		
		amigos.add(amigo);
		
	}

	//MÉTODO QUE (REMOVE) NA VARIÁVEL 'AMIGO' DO CONSTRUTOR
	public boolean blockAmigo(String nome) {
		
		int posicao = buscar(nome);
		
		if (posicao >= 0) {
			
			amigos.remove(posicao);
			return true;
			
		} else {
			
			return false;
		}
		
	}

	//MÉTODO QUE (PROCURA)
	public int procurarAmigo(String nome) {
		
		return buscar(nome);
	
	}

	//MÉTODO (ENVIA) MENSAGEM
	public boolean enviarMensagem(String nome, String mensagem) {
		
		int posicao = buscar(nome);
		
		if (posicao >= 0) {
			
			Amigo amigo = amigos.get(posicao); //.get(posicao) = É UM MÉTODO DO ARRAYLIST
			amigo.setMensagem(mensagem);
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	//CRIANDO O VETOR DE AMIGO
	public Amigo[] procurarVelhos(){
		
		if(amigos.size() == 0){
			
			return new Amigo[0]; 
			
		}
		
		//PEGAR TODAS AS IDADES DA CLASSE AMIGOS
		int maior = amigos.get(0).getIdade();
		
		//ENCONTRAR A MAIOR IDADE
		for(Amigo amigo:amigos){
			
			if(amigo.getIdade() > maior){
				maior = amigo.getIdade(); 
			} 
			
		}
		
		//CONTAR QUANTOS TEM A MAIOR IDADE
		int qtde = 0; 
		
		for(Amigo amigo:amigos){
			
			if(amigo.getIdade() == maior){
				
				qtde++; 
				
			} 
			
		}
		
		//CRIAR VETOR DE AMIGOS 
		Amigo[] velhos = new Amigo[qtde]; 
		
		//POPULAR O VETOR DE MAIS VELHOS 
		int k = 0;
		
		for(int i = 0; i < amigos.size(); i++){
			
			Amigo amigo = amigos.get(i);
			
			if(amigo.getIdade() == maior){
				
				velhos[k++] = amigo; 
				
			} 
			
		} return velhos; 
	}
	
	//MÉTODO BUSCAR
	private int buscar(String nome){
		
		for(int i = 0; i < amigos.size(); i++){
			
			Amigo amigo = amigos.get(i);
			String nomeAmigo = amigo.getNome();
			
			if(nome.equals(nomeAmigo)){
				
				return i;
				
			}
			
		} 
		return -1;//NÃO ACHOU 
	}
	
	//MÉTODO ADICIONAR
	public void addAmigo(String nome, String sexo, int idade){
		
		Amigo amigo = new Amigo();
		
		amigo.setNome(nome);
		amigo.setSexo(sexo);
		amigo.setIdade(idade);
		amigos.add(amigo);
		
	}
	
	//LISTAR TODOS CADASTRADOS
	public void listarAmigos(){
		
		for(Amigo amigo:amigos){
			
			System.out.println(amigo);
			
		} 
		
	}
	
}

