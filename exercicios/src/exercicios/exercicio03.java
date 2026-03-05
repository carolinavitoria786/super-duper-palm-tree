package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi;
		double raio;
		double area;
		int elevado;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		elevado = 2;
		
		area = pi * Math.pow(raio,elevado);
		
		System.out.printf("O resultado da operação matemática é: %.4f",area);
		
		sc.close();
	}

}
