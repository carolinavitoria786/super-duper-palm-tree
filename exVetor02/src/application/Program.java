package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Registros;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Registros[] quartos = new Registros[10];

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println();
			System.out.println("Registro #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			quartos[roomNumber] = new Registros(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (quartos[i] != null) { // imprime somente os que não sao nulos(quartos ocupados)
				System.out.println(i + ": " + quartos[i]);
			}
		}

		sc.close();
	}

}
