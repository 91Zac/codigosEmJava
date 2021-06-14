package Entidades;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, char genero, int anoNascimento, String endereco, int telefone, double valorVendas,
			double comissao) {
		super(nome, genero, anoNascimento, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
