package Aplicacao;

import java.util.Scanner;

import Entidades.Fornecedor;

public class TesteFornecedor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Fornecedor F1 = new Fornecedor();

		System.out.print("Entre com o valor da Dívida ");
		F1.setValorDivida(ler.nextDouble());
		System.out.print("Entre com o valor do credito ");
		F1.setValorCredito(ler.nextDouble());

		System.out.println();
		System.out.print("O saldo atual é: "+F1.obterSaldo());

	}

}
