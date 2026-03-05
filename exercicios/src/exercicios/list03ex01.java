package exercicios;

import java.util.Scanner;

public class list03ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha;

		senha = 0;

		while (senha != 2002) {
			senha = sc.nextInt();

			if (senha == 2002) {
				System.out.println("Acesso Permitido!");
			} else {
				System.out.println("Senha Inválida!");
			}
		}

		sc.close();
	}

}

