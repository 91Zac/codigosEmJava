package Aplicacao;

import Entidades.Aviao;
import Entidades.Cliente;
import Entidades.ContaBancaria;
import Entidades.Funcionario;
import Entidades.Paciente;
import Entidades.Patinete;
import Entidades.Produto;

public class RodandoClassesLista1POO {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Rubinalva", "333.222.111-44", "Rua 0 numero 1", 44);
		System.out.println(cliente1.nome + "\n" + cliente1.cpf + "\n" + cliente1.endereço + "\n" + cliente1.idade);
		System.out.println("----------------------------------------------------------------------");

		Aviao voador = new Aviao("airbus 380", "73m", 20);
		System.out.println(voador.modelo + "\n" + voador.tamanho + "\n" + voador.numeroViagensRealizadas);
		System.out.println("----------------------------------------------------------------------");

		Produto grampeador = new Produto("Grampeador", "Unidade", 5 ,15.85);
		System.out.println(grampeador.nome + "\n" + grampeador.medida + "\n" + grampeador.valorUnitario);
		System.out.println("----------------------------------------------------------------------");
		
		Funcionario programador = new Funcionario("Jorge", "Programador", 3.800, "PGM-23");
		System.out.println(programador.nome + "\n" + programador.cargo + "\n" + programador.salario+"\n" +programador.matricula);
		System.out.println("----------------------------------------------------------------------");
		
		Patinete infantil = new Patinete("Simples","6 Km/h",199.99);
		System.out.println(infantil.modelo + "\n" + infantil.velocidade + "\n" + infantil.preco);
		System.out.println("----------------------------------------------------------------------");
		
		ContaBancaria poupanca = new ContaBancaria(589142, "222.555.348-8",8597.25);
		System.out.println(poupanca.numero + "\n" + poupanca.cpf + "\n" + poupanca.saldo);
		System.out.println("----------------------------------------------------------------------");
		
		Paciente diabetico = new Paciente(58, "José Carlos", "Saude Plena", "Diabetes", "Semanal");
		System.out.println(diabetico.nome + "\n" +diabetico.convenio + "\n" + diabetico.diagnostico+ "\n" + diabetico.acompanhamento);
		System.out.println("----------------------------------------------------------------------");
	}

}
