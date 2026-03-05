package util;

public class Conversao {
	
	public static double TAXA = 6;
	
	public static double calculo (double cotacao, double qntd) {
		double valor = cotacao * qntd;
		double iof = valor * TAXA / 100.0;
		return valor + iof;
	}
	
	
}
