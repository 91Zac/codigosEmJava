package Entidades;

public class Paciente {
	public int idade;
	public String nome;
	public String convenio;
	public String diagnostico;
	public String acompanhamento;
	
	public Paciente() {
	}

	public Paciente(int idade, String nome, String convenio, String diagnostico, String acompanhamento) {
		this.idade = idade;
		this.nome = nome;
		this.convenio = convenio;
		this.diagnostico = diagnostico;
		this.acompanhamento = acompanhamento;
	}
	
}
