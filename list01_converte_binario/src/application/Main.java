package application;

import java.util.Locale;
import java.util.Scanner;

import calculos.Operacao;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Digite o número a ser convertido para sua forma binária: ");
		int n = sc.nextInt();
		
		String binario = op.convertBinary(n);
		
		System.out.println( n + " = " + binario); 
		
		sc.close();
	}

}
