package operacoes;

public class Potenciacao {

	private int numero;
	private int potencia;

	public Potenciacao() {

	}

	public Potenciacao(int numero, int potencia) {
		this.numero = numero;
		this.potencia = potencia;
	}

	public int valorElevado(int x, int n) {
		this.numero = x;
		this.potencia = n;

		if (n == 0) { // verifica se o expoente nao é zero ja que daria um com qualquer numero
			return 1;
		}
		if (n == 1) { // verifica se o expoente nao é um ja que daria o proprio numero
			return x;
		}
		// vai reduzindo o expoente enquato faz a multiplicacao do numero
		return x * valorElevado(x, n - 1); // o expoente n serve apenas como um contador
	}

	public int getNumero() {
		return numero;
	}

	public int getPotencia() {
		return potencia;
	}

}
