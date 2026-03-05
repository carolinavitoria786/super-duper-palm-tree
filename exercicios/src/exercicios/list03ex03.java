package exercicios;

import java.util.Scanner;

public class list03ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idProduto;

		idProduto = 1;

		while (idProduto >= 1 && idProduto <= 4) {
			System.out.printf("Selecione um dos nossos produtos:%n 1 - Álcool%n 2 - Gasolina%n 3 - Diesel%n 4 - Fim%n");
			idProduto = sc.nextInt();

			if (idProduto != 0) {
				switch (idProduto) {
				case 1:
					System.out.printf("Alcool: %d%n", idProduto);
					break;
				case 2:
					System.out.printf("Gasolina: %d%n", idProduto);
					break;
				case 3:
					System.out.printf("Diesel: %d%n", idProduto);
					break;
				case 4:
					System.out.printf("Fim: %d%n", idProduto);
					break;
				}

			}

		}
		System.out.println("MUITO OBRIGADO");
		sc.close();
	}
}
