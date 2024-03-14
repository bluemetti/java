package tentei;

public class Tentei {

	public static void main(String[] args) {
		Pessoa p;
		p = new Pessoa("nome", 20, 80);
		System.out.println("nome: "+p.getNome()+p.getIdade()+p.getPeso());

	}

}
