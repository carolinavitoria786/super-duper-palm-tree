package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class list02ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer: ");
		
		double valorQualquer;
		
		valorQualquer = sc.nextDouble();
		
		if (valorQualquer >= 0 && valorQualquer<= 25) {
			System.out.printf("O valor %.2f esta entre os números: [0,25]", valorQualquer);
		}
		else if (valorQualquer >= 25 && valorQualquer <= 50) {
			System.out.printf("O valor %.2f esta entre os números: [25,50]", valorQualquer);
		}
		else if (valorQualquer >= 50 && valorQualquer <= 75) {
			System.out.printf("O valor %.2f esta entre os números: [50,75]", valorQualquer);
		}
		else if (valorQualquer >= 75 && valorQualquer <= 100) {
			System.out.printf("O valor %.2f esta entre os números: [75,100]", valorQualquer);
		}
		else {
			System.out.printf("O valor %.2f não corresponde a nenhum dos intervalos descritos!",valorQualquer);
		}
		 
		
		sc.close();
	}

}