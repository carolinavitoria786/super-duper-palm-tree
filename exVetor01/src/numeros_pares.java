import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] imparPar = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			imparPar[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES: ");

		int par = 0;
		for (int i = 0; i < n; i++) {
			if (imparPar[i] % 2 == 0) {	
				System.out.printf("%d ",imparPar[i]);
				par++;
			}
		}
		System.out.println();
		System.out.printf("\nQUANTIDADE DE PARES = %d", par);

		sc.close();
	}

}
