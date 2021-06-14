package Entidades;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	public Operario() {
		super();
	}

	public Operario(String nome, char genero, int anoNascimento, String endereco, int telefone, double valorProducao,
			double comissao) {
		super(nome, genero, anoNascimento, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
