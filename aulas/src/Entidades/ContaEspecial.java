package Entidades;

public class ContaEspecial extends ContaCorrente {

	// atributo
	private double limite;

	// construtor
	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}

	public ContaEspecial(int numero, String cpf_cnpj, double limite) {
		super(numero, cpf_cnpj);
		this.limite = limite;
	}

	// encapsulamento
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// metodo
	public void usarLimite(double valor) {
		if (super.getSaldo() <= 0 && this.limite <= valor) {
			super.creditar(valor);
			this.limite -= valor; // operadores
			// o de cima é isso aqui this.limite = this.limite - valor;

		}

	}
	public void reporLimite(double valor) {
		this.limite += valor;

		if (this.limite > 500) {
			this.limite = 500;
		}
	}
}
