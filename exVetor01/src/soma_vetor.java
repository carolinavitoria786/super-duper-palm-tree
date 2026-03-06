import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] num = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			num[i] = sc.nextDouble();
		}

		int soma = 0;
		for (int i = 0; i < n; i++) {
			soma += num[i];
		}

		double media = soma / n;

		System.out.print("VALORES = ");
		
		for(int i=0;i<n;i++) {
			System.out.printf("%.1f ", num[i]);
		}
		System.out.printf("\nSOMA = %.2f\n" + soma);
		System.out.printf("\nMEDIA = %.2f\n" + media);

		sc.close();
	}
}
