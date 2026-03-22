package application;

import java.util.Locale;
import java.util.Scanner;

import operacoes.Potenciacao;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		int n;
		Potenciacao pot = new Potenciacao(); 
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		System.out.println("Digite a pontência pela qual o número deverá ser elevado: ");
		n = sc.nextInt();
		
		int result = pot.valorElevado(x, n);
		
		System.out.println();
		System.out.printf("O valor resultante de %d^%d é: %d", x, n, result);
		
		
		
		sc.close();
	}

}
