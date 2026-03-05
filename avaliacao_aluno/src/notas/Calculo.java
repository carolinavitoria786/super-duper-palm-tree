package notas;

public class Calculo {

	public String name;
	public double nota0 = 30;
	public double nota1 = 35;
	public double nota2 = 35;
	public double soma;

	public double firstOne(double avaliacao) {
		if (nota0 > 30) {
			double acima = avaliacao - nota0;
			return acima;
		}
		return nota0 - avaliacao;
	}

	public double secondOne(double avaliacao1) {
		if (nota1 > 35) {
			double acima = avaliacao1 - nota1;
			return acima;
		}
		return nota1 - avaliacao1;
	}

	public double thirdOne(double avaliacao2) {
		if (nota2 > 35) {
			double acima = avaliacao2 - nota2;
			return acima;
		}
		return nota2 - avaliacao2;
	}
	public double plus() {
		soma = nota0 + nota1 + nota2;
		if (soma > 60) {
			return soma;
		} 
		return 60 - soma;		
	}

}

