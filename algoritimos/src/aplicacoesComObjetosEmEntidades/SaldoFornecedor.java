package aplicacoesComObjetosEmEntidades;

import java.util.Scanner;

import Entidades.Fornecedor;

public class SaldoFornecedor {

	/*
	 * Considere, como subclasse da classe Pessoa (desenvolvida no exercício
	 * anterior) a classe Fornecedor. Considere que cada instância da classe
	 * Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os
	 * atributos valorCredito (correspondente ao crédito máximo atribuído ao
	 * fornecedor) e valorDivida (montante da dívida para com o fornecedor).
	 * Implemente na classe Fornecedor, para além dos usuais métodos seletores e
	 * modificadores, um método obterSaldo() que devolve a diferença entre os
	 * valores dos atributos valorCredito e valorDivida. Depois de implementada a
	 * classe Fornecedor, crie um programa de teste adequado que lhe permita
	 * verificar o funcionamento dos métodos implementados na classe Fornecedor e os
	 * herdados da classe Pessoa.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Fornecedor F1 = new Fornecedor();

		System.out.print("Entre com o Nome Do Fornecedor ");
		F1.setNome(ler.nextLine());
		System.out.print("\nEntre com o valor da Dívida ");
		F1.setValorDivida(ler.nextDouble());
		System.out.print("Entre com o valor do credito ");
		F1.setValorCredito(ler.nextDouble());

		System.out.println();
		System.out.print(" O saldo atual de "+F1.getNome() +" é: "+ F1.obterSaldo());

	}

}
