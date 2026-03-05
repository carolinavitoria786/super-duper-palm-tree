package exercicios;

import java.util.Scanner;

public class list03ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		x = ' ';
		y = ' ';

		while (x != 0 || y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else {
				System.out.println("F!");
			}
		}

		sc.close();
	}

}