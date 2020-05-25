package materialAula04;

import javax.swing.*;

//Resolução do exercício proposto no Kata 1, utilizando os 3 laços while, do-while e for

public class Kata1 {
	public static void main(String args[]) {
		
		int i;

		JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20 com o laço while", "Kata 1",
				JOptionPane.PLAIN_MESSAGE);
		i = 1;
		while (i <= 20) {
			JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20: para i:" + i + " o quadrado de i é:" + (i * i),
					"Kata 1", JOptionPane.PLAIN_MESSAGE);
			i = i + 1;
		}

		JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20 com o laço do-while", "Kata 1",
				JOptionPane.PLAIN_MESSAGE);
		i = 1;
		do {
			JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20: para i:" + i + " o quadrado de i é:" + (i * i),
					"Kata 1", JOptionPane.PLAIN_MESSAGE);
			i = i + 1;
		} while (i <= 20);

		JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20 com o laço for", "Kata 1", JOptionPane.PLAIN_MESSAGE);
		for (i = 1; i <= 20; i = i + 1) {
			JOptionPane.showMessageDialog(null, "Quadrados de 1 a 20: para i:" + i + " o quadrado de i é:" + (i * i),
					"Kata 1", JOptionPane.PLAIN_MESSAGE);
		}

		System.exit(0);
	}
}