package guia;

public class Main {

	public static void main(String[] args) {
		Ponto a = new Ponto();
		Ponto b = new Ponto(1, 2, 3);
		double d;
		d = Math.sqrt((a.getX()+b.getX())*(a.getX()+b.getX())+(a.getY()+b.getY())*(a.getY()+b.getY())+(a.getZ()+b.getZ())*(a.getZ()+b.getZ()));
		System.out.println(d);
	
	}

}
