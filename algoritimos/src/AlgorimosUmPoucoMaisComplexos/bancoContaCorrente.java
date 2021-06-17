package AlgorimosUmPoucoMaisComplexos;

import java.util.Scanner;

public class bancoContaCorrente {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		String nc = "CC-1";
		double saldo = 3000.00;
		final int mov = 3;
		String cpf = "372.443.792-55";
		double movimentacao[] = new double[10];
		boolean tpTransacao[] = new boolean[10];
		int x = 0, talaoCheque = 1, qtd = 0;
		char tipo, novoTalao;

		System.out.println("------------------------------------------------");
		System.out.println("NUMERO CONTA: " + nc);
		System.out.println("SALDO: R$ " + saldo);
		System.out.println("CPF: " + cpf);
		System.out.println("------------------------------------------------");

		for (x = 0; x < mov; x++) {

			System.out.println("INSIRA A " + (x + 1) + "� MOVIMENTA��O ");
			System.out.print("\nCREDITO (C) OU D�BITO (D) ? ");
			tipo = read.next().toUpperCase().charAt(0);
			if (tipo == 'C') {
				tpTransacao[x] = true;
				System.out.println("INSIRA O VALOR DA TRANSA��O: R$ ");
				movimentacao[x] = read.nextDouble();
				saldo = saldo + movimentacao[x];
			} else if (tipo == 'D') {
				tpTransacao[x] = false;
				System.out.println("\nINSIRA O VALOR DA TRANSA��O: R$ ");
				movimentacao[x] = read.nextDouble();
				if (saldo == 0 || saldo < movimentacao[x]) {
					System.out.println("Voc� N�o tem Saldo suficiente para concluir essa opera��o. ");
					x--;
				} else {

					saldo = saldo - movimentacao[x];
				}
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("TRANSA��ES:");

		for (x = 0; x < mov; x++) {
			if (tpTransacao[x] == true) {
				System.out.printf("\nCr�dito de R$ %.2f", movimentacao[x]);
			} else if (tpTransacao[x] == false) {
				System.out.printf("\nD�bito de R$ %.2f", movimentacao[x]);
			}
		}
		System.out.println("\n------------------------------------------------");
		System.out.printf("SALDO RESTANTE NA CONTA: R$ " + saldo);
		System.out.println("\n------------------------------------------------");
		System.out.println("\nN�mero Tal�o de cheque atual: 00-" + talaoCheque);
		System.out.println("Solicitar novo Tal�o de cheque? S/N ? ");
		novoTalao = read.next().toUpperCase().charAt(0);
		if (novoTalao == 'S') {
			System.out.println("Quantos Tal�es voc� deseja? ");
			qtd = read.nextInt();
			System.out.println("------------------------------------------------");
			for (qtd = qtd + 1; qtd > 1; qtd--) {
				talaoCheque++;
				System.out.println("N�mero do novo Tal�o de cheque: 00-" + talaoCheque);
				System.out.println("------------------------------------------------");
			}
			
		}
		System.out.println("*****Obrigado por utilizar nossos servi�os.*****");
		System.out.println("------------------------------------------------");
	}

}
