package main;

import java.util.Locale;
import java.util.Scanner;

import notas.Calculo;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Calculo calculo = new Calculo();

		System.out.println("Escreva o nome do aluno: ");
		calculo.name = sc.nextLine();
		System.out.println("Escreva a nota do primeiro trimestre: ");
		calculo.nota0 = sc.nextDouble();
		System.out.println("Escreva a nota do segundo trimestre: ");
		calculo.nota1 = sc.nextDouble();
		System.out.println("Escreva a nota do terceiro trimestre: ");
		calculo.nota2 = sc.nextDouble();

		if (calculo.plus() > 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", calculo.plus());
		} else {
			System.out.printf(
					"FINAL GRADE = " + (60 - calculo.plus()) + "%nFAILED%n" + "MISSING " + calculo.plus() + " POINTS");
		}

		sc.close();
	}

}
