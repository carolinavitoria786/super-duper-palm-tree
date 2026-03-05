package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id;
		int horas;
		double valorHora;
		double calculo;
		
		id = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		calculo = (horas * valorHora);
		
		System.out.printf("id do funcionario: %d%n", id);
		System.out.printf("Horas trabalhadas: %d%n", horas);
		System.out.printf("Valor a hora: %.2f%n", valorHora);
		System.out.printf("Salário total: %.2f%n", calculo);
		

		sc.close();
	}

}

