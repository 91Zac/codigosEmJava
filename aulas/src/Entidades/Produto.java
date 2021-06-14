package Entidades;

public class Produto {
	public String nome;
	public String medida;
	public int quantidade;
	public double valorUnitario;
	
	public Produto(){
		
	}
	
	public Produto(String nome, String medida, int quantidade, double valorUnitario) {
		this.nome = nome;
		this.medida = medida;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
}
