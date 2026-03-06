import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.println("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] nreais = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			nreais[i] = sc.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += nreais[i];
		}

		media = soma / n;

		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < n; i++) {
			if (nreais[i] < media) {
				System.out.printf("%.1f\n", nreais[i]);
			}
		}

		sc.close();
	}

}
