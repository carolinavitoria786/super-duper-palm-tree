package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo01;
		int codigo02;
		int numpiece01;
		int numpiece02;
		double value01;
		double value02;
		double total01;
		double total02;
		double precoTotal;
		
		codigo01 = sc.nextInt();
		codigo02 = sc.nextInt();
		numpiece01 = sc.nextInt();
		numpiece02 = sc.nextInt();
		value01 = sc.nextDouble();
		value02 = sc.nextDouble();
		
		total01 = numpiece01 * value01;
		total02 = numpiece02 * value02;
		precoTotal = (total01) + (total02);
		
		System.out.printf("Peça de código %d e peça de código %d%n", codigo01, codigo02);
		System.out.printf("Peça de número %d e peça de número %d%n", numpiece01, numpiece02);
		System.out.printf("Valor total de R$ %.2f%n", precoTotal);
		
		
		sc.close();
	}

}
