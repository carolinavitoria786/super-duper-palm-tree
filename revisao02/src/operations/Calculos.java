package operations;

public class Calculos {

	private int x;
	private int y;
	private int z;

	public Calculos() {

	}

	public Calculos(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int maiorDTres() {
		int maior;
		if (x > y && x > z) {
			maior = x;
		} else if (y > x && y > z) {
			maior = y;
		} else {
			maior = z;
		}

		return maior;
	}

	public int menorDTres() {
		int menor;
		if (x < y && x < z) {
			menor = x;
		} else if (y < x && y < z) {
			menor = y;
		} else {
			menor = z;
		}

		return menor;
	}

	public boolean dentroInter() {
		return (x > y && x < z);
	}

	public boolean div() {  
		return (x % y == 0 && x % z == 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
