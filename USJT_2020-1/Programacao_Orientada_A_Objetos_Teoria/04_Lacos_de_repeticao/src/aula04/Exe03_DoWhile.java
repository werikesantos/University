package aula04;

import javax.swing.JOptionPane;

public class Exe03_DoWhile {

	public static void main(String[] args) {
		
		/* O loop do while ( faz enquanto ), primeiro executa o código que está dentro do
		 * loop e depois testa condição lógica; se for verdadeira, executa novamente e
		 * testa de novo; se for verdadeira, executa de novo; e assim sucessivamente até
		 * que a condição se torne falsa.
		 * 
		 ****USANDO QUANDO SE QUER QUE O CÓDIGO QUE ESTÁ NO LOOP SEJA EXECUTADO PELO MENOS UMA VEZ. 
		 * 
		 * Ex: para validar uma entrada de dados, ler valores até que o
		 * usuário digite um número maior ou igual a 0 para evitar uma raiz quadrada de
		 * número negativo.
		 * 
		 */
		
		//TEM QUE DECLACAR A VARIÁVEL ANTES POIS O 'while' SOLICITA
		int x;
		
		//'do' PEDE PARA (FAZER) ESTA AÇÃO.
		do {
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número maior que zero:"));
		
		//'while' (ENQUANTO) A VARIÁVEL 'x' FOR MENOR QUE ZERO (0)
		}while (x >= 0); //OBS: DENTRO DA CONDIÇÃO 'while' EXE:.(x < 0), PODEMOS PERCEBER QUE QUE A VARIÁVEL PRECISA OBTER UM VALOR, ONDE É DECLARADO NO 'do'.

	}

}
