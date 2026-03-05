package exercicios;

import java.util.Scanner;

public class list04ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i <= N; i++) {
			int x = sc.nextInt();
			
			if (i >= 10 && i <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.printf(in + "in");
		System.out.printf(out + "out");

		sc.close();
	}

}

