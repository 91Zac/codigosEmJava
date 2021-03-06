package AlgorimosUmPoucoMaisComplexos;

import java.util.Scanner;
import java.math.*;

public class DesafioEcommerce {

	public static void main(String[] args) {
		/*
		 * PROJETO ESPECIFICA??O DE PROGRAMA: NOME DE LOJA: CADA GRUPO INVENTAR OK QUERO
		 * 10 PRODUTOS DIFERENTES ? CADA GRUPO DEFINE OK QUERO SABE SE ? LITRO, KG, QDE,
		 * PE?A, UNIDADE ? CONFORME O PRODUTO OK VALOR UNITARIO POR UNIDADE OK O ESTOQUE
		 * MINIMO DE SAIDA ? 10 POR UNIDADE OK TUDO ISSO EM VETOR CRIAR UM CODIGO DE
		 * PRODUTO PARA CADA PRODUTO OK [O CARRINHO DE COMPRA ? UM VETOR DE COMPRAS] O
		 * CLIENTE S? PODE COMPRAR 10 PRODUTOS SEM REPETI??O O PROGRAMA DEVER: MOSTRA OS
		 * PRODUTOS COM TODOS OS DADOS DAR A OP??O DO USUARIO SELECIONAR UM PRODUTO E
		 * DIZER A QUANTIDADE A COMPRAR (N?O PODE SELECIONAR PRODUTO COM QTDE ZERO) DAR
		 * OP??O AO USUARIO DE CONTINUAR COMPRANDO CASO FINALIZADA A COMPRA MOSTRA O
		 * TOTAL, MOSTRA O IMPOSTO DE 9% TOTAL E AS OP??ES DE PAGAMENTO: C?digo Condi??o
		 * de pagamento 1 ? vista em dinheiro ou cheque, recebe 20% de desconto 2 ?
		 * vista no cart?o de cr?dito, recebe 15% de desconto 3 Em duas vezes, pre?o
		 * normal de etiqueta sem juros [ QUERO VER AS PARCELAS] 4 Em tr?s vezes, pre?o
		 * normal de etiqueta mais juros de 10% [QUERO VER AS PARCELAS COM JUROS] MOSTRA
		 * NOTA FISCAL NOME EMPRESA RELA??O DE PRODUTOS COMPRADOS IMPOSTO PAGO VALOR A
		 * PAGA NO TIPO SELECIONADO O PROGRAMA DEVER INFORMAR SE CONTINUA S OU N?O PARA
		 * O PROXIMO USUARIO, SEN?O SAIR DO PROGRAMA, SE SIM, RECOME?A MAIS J?
		 * CONSIDERAR A ALTERA??O DO ESTOQUE.
		 */

//declarando vetores e vari?veis
		String mercadoria[] = { "ps4  ", "ps4 Pro ", "xbox 360", "xbox X Series", "ps3  ", "controle Xbox",
				"Controle PS4", "Pc Gamer", "Controle PC", "Teclado Gamer" };
		String continuar, seguir;
		String comprador[] = new String[2];
		int unidades[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, compras[] = new int[10], codigo, qntd = 0, x;
		double preco[] = { 2000.15, 4000.87, 899.99, 3000.50, 900.45, 120.99, 140.99, 129.01, 200.99, 140.99 },
				total = 0.0, parcelas = 0.0, imposto = 0, totalItem[] = new double[10];
		boolean continua = true, prosseguir = true;
		int pagamento = '0';
		Scanner read = new Scanner(System.in);

		System.out.println("Bem Vindo a 91Zac_Games, A maior loja de Games da internet!\n");

		System.out.print("Digite seu nome: ");
		comprador[0] = read.nextLine();
		System.out.print("\nDigite seu CPF: ");
		comprador[1] = read.nextLine();

		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.printf("Temos os seguintes produtos a sua disposi??o: \n");
		System.out.println("-----------------------------------------------------------------------------");

		for (x = 0; x < 10; x++) {
			System.out.printf("\n %d - %s o valor do produto R$ %.2f em estoque %d", (x + 1), mercadoria[x], preco[x],
					unidades[x]);
			System.out.print("\n");
		}
		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!");
		System.out.println("-----------------------------------------------------------------------------");

		while (continua) {
			System.out.print("Digite o n?mero correspondente ao produto que deseja comprar ");
			System.out.println("\n-----------------------------------------------------------------------------");
			codigo = read.nextInt();
			if (codigo >= 1 && codigo <= 10) {
				codigo--;
				for (x = 0; x < 10; x++) {
					if (codigo == x && unidades[x] == 0) {
						System.out.print("\nO produto n?o est? dispon?vel no estoque!\n");
					} else if (codigo == x) {

						qntd = 0;
						while (qntd > 10 || qntd < 1) {
							System.out.print("\nDigite a Quantidade que deseja ");
							qntd = read.nextInt();
							if (qntd > 10 || qntd < 1) {
								System.out.println("\nDigite uma quantidade v?lida de estoque [1-10].\n");
							}

						}
						if (qntd <= unidades[x]) {
							compras[x] = compras[x] + qntd;
							unidades[x] = unidades[x] - qntd;
							total += (preco[x] * qntd);
							totalItem[x] += preco[x] * qntd;
							System.out.println("Voc? selecionou " + qntd + " unidades de " + mercadoria[x] + "\n");
						} else {
							System.out.println("N?o h? unidades o suficiente dispon?vel em estoque.\n");
							System.out.println("Estoque: " + unidades[x] + " unidades de " + mercadoria[x] + "\n");
						}
					}
				}
			} else {
				System.out.println("\nO c?digo digitado n?o corresponde ? um produto!");
			}

			System.out.println("\nDeseja continuar comprando? Sim / N?o");
			continuar = read.next();

			// Alterar o valor da vari?vel continua de verdadeiro para falso, caso o usu?rio
			// decida n?o continuar comprando
			// fazendo assim que o loop do carrinho se quebre
			continua = (continuar.toUpperCase().charAt(0) == 'N') ? false : true;
		}
		System.out.println("\nVoc? finalizou suas compras!\n");
		System.out.println("Seu carrinho:\n\n");

		// Listar as compras no carrinho
		for (x = 0; x < 10; x++) {
			if (compras[x] != 0) {
				System.out.printf(compras[x] + " unidades de " + mercadoria[x] + "\n");
				System.out.println("-----------------------------------------------------------------------------");
			}
		}

		// Calcular imposto e mostrar op??es de pagamento
		imposto = total * 0.09;
		System.out.println("O valor total de sua compra foi: R$ " + Math.round(total) + " e R$ " + Math.round(imposto)
				+ " de impostos\n");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Op??es de pagamento:");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("\n1 - ? vista em dinheiro ou cheque (20% de desconto)");
		System.out.println("\n2 - A vista no cart?o de cr?dito (15% de desconto)");
		System.out.println("\n3 - Em duas vezes (sem desconto)");
		System.out.println("\n4 - 3x no cart?o (10% de juros)\n");

		System.out.print("\nDigite a forma de pagamento ");
		pagamento = read.nextInt();

		while (pagamento < 1 || pagamento > 4) {
			System.out.println("Escolha uma forma de pagamento v?lida");
		}
		if (pagamento == 1) {
			total = total - (total * 0.2);
		} else if (pagamento == 2) {
			total = total - (total * 0.15);
		} else if (pagamento == 4) {
			total = total + (total * 0.1);
		}

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("\n91Zac_Games Games - 143.944.583/0001-52\n");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Comprador " + comprador[0] + " - CPF: " + comprador[1]);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Qtd:\tProduto:\tValor Unit?rio:\tTotal do Item ");

		for (int i = 0; i < 10; i++) {
			if (compras[i] != 0) {
				System.out.printf("%d\t%s\t%.2f\t\t%.2f\n", compras[i], mercadoria[i], preco[i], totalItem[i]);
			}
		}
		System.out.printf("\n**** Imposto de ICMS ****R$ %.2f", imposto);
		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.printf("Total da nota: R$ %.2f", (total + imposto));
		System.out.println("\n-----------------------------------------------------------------------------\n");

		if (pagamento == '3') {
			parcelas = total / 2;
			System.out.printf("Pagar em 2x de R$ %.2f\n", parcelas);
		} else if (pagamento == '4') {
			parcelas = total / 3;
			System.out.printf("Pagar em 3x de R$ %.2f\n", parcelas);
		}
		System.out.println("N?s da 91Zac_Games agradecemos a Prefer?ncia.");

	}
}