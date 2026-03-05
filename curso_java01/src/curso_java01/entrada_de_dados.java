package curso_java01;

import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char primeiroCaractere;
		int x;
		double y;
		String z;
		
		primeiroCaractere = sc.next().charAt(0);	
		x = sc.nextInt();
		y = sc.nextDouble();
		z = sc.next();
		
		System.out.printf("O primeiro caracter é : %s%n", primeiroCaractere);
		System.out.println("Você digitou: " + x);
		System.out.printf("Você digitou o numero decimal: %.2f%n", y);
		System.out.println("Você digitou: " + z);
		
		
		sc.close();

	}

}