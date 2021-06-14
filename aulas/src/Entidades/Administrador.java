package Entidades;

public class Administrador extends Pessoa{
	private double ajudaDecusto;

	public Administrador() {
		super();
	}

	public Administrador(String nome, char genero, int anoNascimento, String endereco, int telefone,
			double ajudaDecusto) {
		super(nome, genero, anoNascimento, endereco, telefone);
		this.ajudaDecusto = ajudaDecusto;
	}

	public double getAjudaDecusto() {
		return ajudaDecusto;
	}

	public void setAjudaDecusto(double ajudaDecusto) {
		this.ajudaDecusto = ajudaDecusto;
	}
	

}
