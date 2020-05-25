package vetores;

import javax.swing.JOptionPane;

public class VetoresJava {

	public static void main(String agrs[]) {
		int[] x = new int[10];

		int maior = 0, posMaior = 0;
		int menor = 0, posMenor = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + i + " do vetor!"));

			if (i == 0) {
				maior = x[i];
				menor = x[i];
				posMaior = i;
				posMenor = i;
			}
			if (x[i] > maior) {
				maior = x[i];
				posMaior = i;
			}
			if (x[i] < menor) {
				menor = x[i];
				posMenor = i;
			}

		}

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				if (x[j] > x[j + 1]) {
					int aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
		}

		System.out.println("Vetor ordenado!!");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		System.out.println("O maior valor digitado foi: " + maior + " na posição: " + posMaior);
		System.out.println("O menor valor digitado foi: " + menor + " na posição: " + posMenor);
	

	// Matrizes -----

	int[][] array1 = new int[2][3];// = { { 1,2,3 }, { 4, 5, 6 } };

	for(
	int linha = 0;linha<array1.length;linha++)
	{
		for (int coluna = 0; coluna < array1[linha].length; coluna++) {
			array1[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Matriz!"));
		}
	}

	System.out.println("Valores no array1 passados na linha são");
	outputArray(array1);
	}
	public static void outputArray(int[][] array) {
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array[linha].length; coluna++) {
				System.out.printf("%d ", array[linha][coluna]);
			}
			System.out.println();
		}
	}
}
