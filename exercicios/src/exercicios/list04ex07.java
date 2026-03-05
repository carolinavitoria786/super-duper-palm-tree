package exercicios;

import java.util.Scanner;

public class list04ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int quad = i * i;
			int cube = i * i * i;
			System.out.printf("Linha %d%n Quadrado: %d%n Cubo: %d%n%n", i, quad, cube);
			
		}
		sc.close();

	}

}
