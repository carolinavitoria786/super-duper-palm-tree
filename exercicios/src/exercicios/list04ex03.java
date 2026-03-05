package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class list04ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defina a quantidade de casos de teste: ");
		int n = sc.nextInt();
		System.out.println("Agora escolha selecione um conjunto de três valores: ");
		
		for (int i = 0; i <= n; i++) {
			
			double a = sc.nextDouble() * 2;
			double b = sc.nextDouble() * 3;
			double c = sc.nextDouble() * 5;

			double soma = (a) + (b) + (c);

			double mediaPonderada = soma / 10;
			
			System.out.printf("A media ponderada correspondente é: %.1f%n", mediaPonderada);
			
			sc.close();
		}

	}

}

