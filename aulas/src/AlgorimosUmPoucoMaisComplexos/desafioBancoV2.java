package AlgorimosUmPoucoMaisComplexos;

import java.util.Scanner;

public class desafioBancoV2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String tipoConta;
		String nc = "CC-1";
		double saldo = 0.0;
		final int mov = 5;
		String cpf = "372.443.792-55";
		double movimentacao[] = new double[10];
		boolean tpTransacao[] = new boolean[10];
		int x = 0, talaoCheque = 1, qtd = 0;
		char tipo, novoTalao;

		System.out.println("Insira o tipo de conta CP/CC/CE/CB:");
		tipoConta = leia.nextLine();

		if (tipoConta.equals("CC") || tipoConta.equals("cc")) {
			System.out.println("------------------------------------------------");
			System.out.println("NUMERO CONTA: " + nc);
			System.out.println("\nSALDO: R$ " + saldo);
			System.out.println("\nCPF: " + cpf);
			System.out.println("------------------------------------------------\n");

			for (x = 0; x < mov; x++) {

				System.out.print("\n\nINSIRA A " + (x + 1) + "� MOVIMENTA��O \n");
				System.out.print("\nCREDITO (C) OU D�BITO (D) ? ");
				tipo = leia.next().toUpperCase().charAt(0);
				if (tipo == 'C') {
					tpTransacao[x] = true;
					System.out.print("\nINSIRA O VALOR DA TRANSA��O: R$ ");
					movimentacao[x] = leia.nextDouble();
					saldo = saldo + movimentacao[x];
				} else if (tipo == 'D') {
					tpTransacao[x] = false;
					System.out.print("\nINSIRA O VALOR DA TRANSA��O: R$ ");
					movimentacao[x] = leia.nextDouble();
					if (saldo == 0 || saldo < movimentacao[x]) {
						System.out.print("Voc� N�o tem Saldo suficiente para concluir essa opera��o. ");
						x--;
					} else {

						saldo = saldo - movimentacao[x];
					}
				}
			}
			System.out.println("\nTRANSA��ES");

			for (x = 0; x < mov; x++) {
				if (tpTransacao[x] == true) {
					System.out.printf("\nCr�dito de R$ %.2f", movimentacao[x]);
				} else if (tpTransacao[x] == false) {
					System.out.printf("\nD�bito de R$ %.2f", movimentacao[x]);
				}
			}

			System.out.printf("\n\nSALDO RESTANTE NA CONTA: R$ " + saldo);
			System.out.println("\nN�mero Tal�o de cheque atual: 00-" + talaoCheque);
			System.out.print("Solicitar novo Tal�o de cheque? S/N ? ");
			novoTalao = leia.next().toUpperCase().charAt(0);
			if (novoTalao == 'S') {
				System.out.print("Quantos Tal�es voc� deseja? ");
				qtd = leia.nextInt();
				for (qtd = qtd + 1; qtd > 1; qtd--) {
					talaoCheque++;
					System.out.println("N�mero do novo Tal�o de cheque: 00-" + talaoCheque);
				}
				System.out.println("\nObrigado por utilizar nossos servi�os.");
			}
		} else {
			System.out.println("Obrigado por utilizar nossos servi�os.");
		}

	}
}
