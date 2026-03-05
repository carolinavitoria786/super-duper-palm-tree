package exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a; 
		int b;
		int soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.printf("A soma de %d + %d é : %d", a, b, soma);
		
		sc.close();
		

	}

}

