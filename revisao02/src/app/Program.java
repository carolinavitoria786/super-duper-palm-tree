package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import operations.Calculos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Calculos> cal = new ArrayList<>();

		System.out.println("Insira o valor de x:  ");
		int x = sc.nextInt();
		System.out.println("Insira o valor de y:  ");
		int y = sc.nextInt();
		System.out.println("Insira o valor de z:  ");
		int z = sc.nextInt();

		Calculos op = new Calculos(x, y, z);

		cal.add(op);

		System.out.printf("O maior número dentre %d, %d e %d é: %d%n", x, y, z, op.maiorDTres());
		System.out.printf("O menor número dentre %d, %d e %d é: %d%n", x, y, z, op.menorDTres());

		if (op.dentroInter()) {
			System.out.printf("O número %d está dentro do intervalo de %d e %d! %n", x, y, z, op.dentroInter());
		} else {
			System.out.printf("O número %d não esta dentro do intervalo de %d e %d! %n", x, y, z, op.dentroInter());
		}
		
		if (op.div()) {
			System.out.printf("O número %d é divisivel por %d e %d! %n", x, y, z, op.div());
		} else {
			System.out.printf("O número %d não é divisivel por %d e %d! %n", x, y, z, op.div());
		}


		sc.close();
	}

}
