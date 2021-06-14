package Entidades;

public class ContaCorrente extends Conta {
	//atributos
	private int numeroTalao;
	
	//construtor
	public ContaCorrente(int numero)
	{
		super(numero);
	}
	public ContaCorrente(int numero, String cpf_cnpj)
	{
		super(numero, cpf_cnpj);
	}
	
	
	//encapsulamento
	public int getNumeroTalao() {
		return numeroTalao;
	}
	public void setNumeroTalao(int numeroTalao) {
		this.numeroTalao = numeroTalao;
	}
	
	
	//metodo
	public void emitirTalao()
	{
		this.numeroTalao = this.numeroTalao+1;
	}
	
	public void emitirTalao(int numeroDeTaloes)
	{
		this.numeroTalao += numeroDeTaloes;
	}
	
	
	
	
}