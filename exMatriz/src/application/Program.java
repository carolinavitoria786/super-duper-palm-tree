package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas e colunas para a matriz respectivamente: ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int[M][N];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite o numero que deseja verificar: ");
		int X = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == X) {
					System.out.println("Position" + i + "," + j + ":");

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

				}
			}
		}

		sc.close();
	}

}
