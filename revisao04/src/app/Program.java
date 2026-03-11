package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf(
				"Escolha a quantidade de valores para o primeiro elemento e para o segundo respectivamente: %n");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[m];
		int[] z = new int[n + m]; // vetor para a união de n e m

		int tamanhoZ = 0; // o tamanho de z

		System.out.println("Digite os valores para X: ");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		System.out.println("Digite os valores para Y: ");
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) { //copia os valores de x para o vetor z
			z[tamanhoZ] = x[i];
			tamanhoZ++; // acresce a posição dos indices de z
		}

		for (int i = 0; i < m; i++) {
			boolean sim = false; // assume inicialmente que nao tem valores iguais em y
			for (int j = 0; j < tamanhoZ; j++) {
				if (y[i] == z[j]) { // se tiver retorna verdadeiro e ignora o numero
					sim = true;
				}
			}

			if (!sim) { // se nao tiver adiciona o numero almentando a quantidade de indices do vetor z
				z[tamanhoZ] = y[i];
				tamanhoZ++;
			}

		}
		
		System.out.print("A união de X e Y resuta em: ");
		for (int i=0; i<tamanhoZ; i++) {
			System.out.print(z[i] + " ");
		}

		sc.close();
	}

}
