package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class list04ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de algoritimos a serem lidos: ");
		double n = sc.nextInt();
		System.out.println("Agora digite o valor do divisor e do dividendo respectivamente: ");
		for (int i = 0; i < n; i++) {

			double d = sc.nextInt();
			double d2 = sc.nextInt();

			double divisao = d / d2;

			if (d2 == 0) {
				System.out.println("divisão impossivel");
			} else {
				System.out.printf("O resultado da sua divisão é: %.1f", divisao);
			}

		}
		sc.close();
	}

}
