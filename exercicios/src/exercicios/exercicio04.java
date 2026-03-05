package exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int D;
		int firstMult;
		int secondMult;
		int formula;
		
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		firstMult = A * B; 
		secondMult = C * D;
		formula = firstMult - secondMult;
		
		System.out.printf("O resultado da operação matemática é: %d", formula);
		
		
		sc.close();
	}

}

