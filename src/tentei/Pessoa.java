package tentei;

public class Pessoa {
	private String nome = "abc";
	private int idade;
	private double peso;
	public Pessoa(String n, int ida, double p){
		this.idade = ida;
		this.nome = n;
		this.peso = p;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
