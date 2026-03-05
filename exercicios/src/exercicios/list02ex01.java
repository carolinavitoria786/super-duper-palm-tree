package exercicios;

import java.util.Scanner;

public class list02ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
					
		System.out.printf("Digite um número inteiro: ");
		
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.printf("O número %d é Negativo!", numero);
		} else {
			System.out.printf("O número %d é Não negativo!", numero);
		}

		sc.close();
	}

}