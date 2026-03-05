package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		int elevado;
		double pi;
		
		pi = 3.14159;
		elevado = 2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = (A * C) / elevado;
		areaCirculo = pi * Math.pow(C,elevado);
		areaTrapezio = (A + B)* C / elevado;
		areaQuadrado = Math.pow(B,elevado);
		areaRetangulo = A * B;
		
		System.out.printf("Área do triângulo retângulo: %.3f%n",areaTriangulo);
		System.out.printf("Área do círculo: %.3f%n",areaCirculo);
		System.out.printf("Área do trapézio: %.3f%n",areaTrapezio);
		System.out.printf("Área do quadrado: %.3f%n",areaQuadrado);
		System.out.printf("Área do retângulo: %.3f%n",areaRetangulo);
		
		sc.close();
	}

}

