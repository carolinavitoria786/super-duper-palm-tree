package exercicios;

import java.util.Scanner;

public class list04ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int resultado = 1;

		if (n == 0) {
			System.out.println("O fatorial de 0! é 1");
		} else {
			for (int i = n; i > 0; i--) {
				resultado = resultado * i;
			}
			System.out.printf("O fatorial de %d é: %d", n, resultado);
		}
		sc.close();
	}

}
