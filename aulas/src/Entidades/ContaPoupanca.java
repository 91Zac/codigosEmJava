package Entidades;

public class ContaPoupanca extends Conta {

	// atributo
	private int dataAniversario;
	// construtor
	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) {
		super(numero, cpf_cnpj);
		this.dataAniversario = dataAniversario;
	}

	public ContaPoupanca(int numero, int dataAniversario) {
		super(numero);
		this.dataAniversario = dataAniversario;
	}

	// metodo
	public void correcao(int data) {
		double novosaldo = 0.0;
		// saldo não pode ser vazio nem negativo
		// comparo a data de anivesario com a data informada se sim roda correcao
		if (super.getSaldo() > 0 && data == this.dataAniversario) {
			novosaldo = (super.getSaldo() * 0.005); // (saldo * 0,5%) = (saldo * 0.005)
			super.creditar(novosaldo);
		}

	}

	
}