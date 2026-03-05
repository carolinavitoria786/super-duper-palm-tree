package exercicios;

import java.util.Scanner;

public class list02ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		int duracao;
		int outroDia;
		
		System.out.printf("Digite a hora de inicio da partida: ");
		horaInicial = sc.nextInt();
		System.out.printf("Digite a hora de termino da partida: ");
		horaFinal = sc.nextInt();
		duracao = horaFinal - horaInicial;
		outroDia = (24 - horaInicial) + horaFinal;
		
		if (horaFinal > horaInicial) {
			System.out.printf("O jogo durou %d horas", duracao);
		} else if (horaFinal < horaInicial) {
			System.out.printf("O jogo durou %d horas", outroDia);
		} else {
			System.out.println("O jogo durou 24 horas");
		}
			
		sc.close();
	}
}

