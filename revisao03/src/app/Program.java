package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Temp;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Temp> temp = new ArrayList<>();

		String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		for (int i = 0; i < 12; i++) {
			System.out.printf("Digite a temperatura media de %s: ", mes[i]);
			int med = sc.nextInt();
			System.out.println(i + 1 + " - " + mes[i] + ": " + med + " graus\n");

			Temp tp = new Temp(mes[i], med);

			temp.add(tp);

		}
		
		Temp maior = temp.get(0);
		Temp menor = temp.get(0);
		
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).getMed() > maior.getMed()) {
				maior = temp.get(i);
			}
			if (temp.get(i).getMed() < menor.getMed()) {
				menor = temp.get(i);
			}
		}

		System.out.println("Maior temperatura média do ano: " + maior.getMes() + " com " + maior.getMed() + " graus");
		System.out.println("Menor temperatura média do ano: " + menor.getMes() + " com " + menor.getMed() + " graus");
		
		
		sc.close();
	}

}
