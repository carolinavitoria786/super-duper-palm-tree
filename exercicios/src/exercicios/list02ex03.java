package exercicios;

import java.util.Scanner;

public class list02ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		
		System.out.println("Digite dois número inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0 ) {
			System.out.printf("Os números %d e %d são multiplos!", A, B);
		} else {
			System.out.printf("Os números %d e %d não são multiplos!", A, B);
		}
		
		
		sc.close();
	}

}
