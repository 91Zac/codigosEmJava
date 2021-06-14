package Entidades;

public class Cliente {
	public String nome;
	public String cpf;
	public String endereço;
	public int idade;
	
	public Cliente(){
		
	}

	public Cliente(String nome, String cpf, String endereço, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		this.idade = idade;
	}
	
	
}
