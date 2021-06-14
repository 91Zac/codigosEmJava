package Entidades;

public class ContaBancaria {
	public int numero;
	public String cpf;
	public double saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int numero, String cpf, double saldo) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
}
