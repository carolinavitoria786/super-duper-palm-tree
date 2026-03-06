
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Numeros negativos: ");

		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.printf("%%n", numeros[i]);
			}
		}
		sc.close();
	}

}
