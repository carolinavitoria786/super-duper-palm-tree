package exercicios;

import java.util.Scanner;

public class list02ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor digite o codigo dos dois produtos que deseja: ");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}

