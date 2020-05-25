package aula07;

import javax.swing.JOptionPane;

public class Exe00_ArrayList {

	public static void main(String[] args) {
		//DEFININDO A VARIÁVEL QUE SERÁ UTILIZADA
		int entrada;
		
		//CRIANDO VETOR DE 4 POSIÇÕES
		int[] vetor = new int[4];
		
		//CRIANDO LAÇO DE REPETIÇÃO
		for(int i = 0; i < vetor.length; i++) { //vetor.length = RETORNA O TAMANHO DO VETOR DEFINIDO!
			
			//ENTRADA DE DADOS DO USUÁRIO
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número:"));//ENVIANDO DADOS PELO JOPTION
			vetor[i] = entrada; //JOGANDO A VARIAVEL DENTRO DO VETOR[i]
			
			System.out.println(vetor[i]);// IMPRIMINDO NO CONSOLE
			
		}
		
		System.out.println("Os valores armazenados dentro do vetor são:");
		for (int i = 0; i < vetor.length; i++) {//SOLICITANDO A IMPRESSÃO DE TODOS OS VALORES DENTRO DO VETOR[i]
			
			System.out.println(vetor[i]);
			
		}
		
		//IMPRIMINDO UMA POSIÇÃO ESPECIFICA DO VETOR
		System.out.println("Resultado do valor localizado dentro do vetor na posição (2):\n"+vetor[2]);
	}

}
