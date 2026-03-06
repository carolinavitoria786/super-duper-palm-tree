import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite os valores do vetor A: ");
			a[i] = sc.nextInt();			
		}
		
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.println("Digite os valores do vetor B: ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			soma = a[i] + b[i];
			System.out.printf("%d ", soma);
		}
		
					
		sc.close();
	}

}
