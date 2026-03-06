import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] real = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			real[i] = sc.nextInt();
		}
		
		maior = real[0];
		posmaior = 0;
		
		for (int i=1; i<n; i++) {
			if (real[i] > maior) {
				maior = real[i];
				posmaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		
		
		
		sc.close();
	}

}
