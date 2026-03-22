package calculos;

public class Operacao {

	private int b;

	public Operacao() {

	}

	public Operacao(int b) {
		this.b = b;
	}

	public String convertBinary(int b) {
		if (b == 1) {
			return "1"; // se fosse zero ele calcularia mais um complemento para a esquerda ao envez da direita  
		}

		return convertBinary(b / 2) + (b % 2);

	}

	public int getB() {
		return b;
	}


}
