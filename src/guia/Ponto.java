package guia;

public class Ponto {
	private int x, y, z;
	Ponto(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	Ponto(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
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
