import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		String mercadoria[] = { "ps4\t", "ps4 Pro\t", "xbox 360", "xbox X Series", "ps3\t", "controle Xbox",
				"Controle PS4", "Pc Gamer", "Controle PC", "Teclado Gamer" }, continuar, continuar2,
				comprador[] = new String[2];
		int unidades[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, compras[] = new int[10], codigo, qntd = 0, x;
		double preco[] = { 2000.15, 4000.87, 899.99, 3000.50, 900.45, 120.99, 140.99, 129.01, 200.99, 140.99 },
				total = 0.0, parcelas = 0.0, imposto;
		boolean continua = true, continua2 = true;
		char pagamento = '0';
		Scanner read = new Scanner(System.in);

		System.out.print("Bem Vindo a MIIJ Games, A maior loja de Games da internet!\n");

		while (continua2) {

			System.out.print("Digite seu nome: ");
			comprador[0] = read.nextLine();
			System.out.print("\nDigite seu CPF: ");
			comprador[1] = read.nextLine();

			System.out.printf("Temos os seguintes produtos a sua disposi��o: \n");

			for (x = 0; x < 10; x++) {
				System.out.printf("\n %d - %s o valor do produto R$ %.2f em estoque %d", (x + 1), mercadoria[x],
						preco[x], unidades[x]);
				System.out.print("\n");
			}
			System.out.print("\n");
			System.out.print("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!\n");

			while (continua) {
				System.out.print("\nDigite o C�digo do produto que deseja comprar ");
				codigo = read.nextInt();
				if (codigo >= 1 && codigo <= 10) {
					codigo--;
					for (x = 0; x < 10; x++) {
						if (codigo == x && unidades[x] == 0) {
							System.out.print("\nO produto n�o est� dispon�vel no estoque!\n");
						} else if (codigo == x) {

							qntd = 0;
							while (qntd > 10 || qntd < 1) {
								System.out.print("\nDigite a Quantidade que deseja ");
								qntd = read.nextInt();
								if (qntd > 10 || qntd < 1) {
									System.out.print("\nDigite uma quantidade v�lida de estoque [1-10].\n");
								}

							}
							if (qntd <= unidades[x]) {
								compras[x] = compras[x] + qntd;
								unidades[x] = unidades[x] - qntd;
								total += (preco[x] * qntd);
								System.out.println("Voc� selecionou " + qntd + " unidades de " + mercadoria[x] + "\n");
							} else {
								System.out.println("N�o h� unidades o suficiente dispon�vel em estoque.\n");
								System.out.println("Estoque: " + unidades[x] + " unidades de " + mercadoria[x] + "\n");
							}
						}
					}
				} else {
					System.out.println("\nO c�digo digitado n�o corresponde � um produto!");
				}

				System.out.println("\nDeseja continuar comprando? Sim / N�o");
				continuar = read.next();

				// Alterar o valor da vari�vel continua de verdadeiro para falso, caso o usu�rio
				// decida n�o continuar comprando
				// fazendo assim que o loop do carrinho se quebre
				continua = (continuar.toUpperCase().charAt(0) == 'N') ? false : true;
			}
			System.out.println("\nVoc� finalizou suas compras!\n");
			System.out.println("Seu carrinho:\n\n");

			// Listar as compras no carrinho
			for (x = 0; x < 10; x++) {
				if (compras[x] != 0) {
					System.out.printf(compras[x] + " unidades de " + mercadoria[x] + "\n");
					System.out.println("\n ------------------ \n");
				}
			}

			// Calcular imposto e mostrar op��es de pagamento
			imposto = total * 0.09;
			System.out.println("O valor total de sua compra foi: R $ " + Math.round(total) + "e R $ "
					+ Math.round(imposto) + "de impostos\n");
			System.out.println("Op��es de pagamento:");
			System.out.println("\n1 - � vista em dinheiro ou cheque (20% de desconto)");
			System.out.println("\n2 - A vista no cart�o de cr�dito (15% de desconto)");
			System.out.println("\n3 - Em duas vezes (sem desconto)");
			System.out.println("\n4 - 3x no cart�o (10% de juros)\n");

			do {
				System.out.print("\nDigite a forma de pagamento ");
				pagamento = read.next().charAt(0);
				if (pagamento == '1') {
					total = total - (total * 0.2);
				} else if (pagamento == '2') {
					total = total - (total * 0.15);
				} else if (pagamento == '3') {
					continue;
				} else if (pagamento == '4') {
					total = total + (total * 0.1);
				} else {
					System.out.println("Escolha uma forma de pagamento v�lida");
				}
			} while (pagamento != '1' && pagamento != '2' && pagamento != '3' && pagamento != '4');

			System.out.println("---------------------------------------");
			System.out.println("\n\nMIIJ Games - 143.944.583/0001-52\n");
			System.out.println("---------------------------------------");
			System.out.println("Comprador " + comprador[0] + " - CPF: " + comprador[1]);
			System.out.println("---------------------------------------");
			System.out.println("Qtd:\tProduto:\tValor:\n ");
			for (int i = 0; i < 10; i++) {
				if (compras[i] != 0) {
					System.out.println(compras[i] + "\t" + mercadoria[i] + "\t R$ " + preco[i] + "\n");
				}
			}
			System.out.println("**** Imposto de ICMS ****R$ " + Math.round(imposto));
			System.out.println("\n------------------------------------\n");
			System.out.println("Total da nota: R$ " + Math.round((total + imposto)) + "\n\n");
			System.out.println("\n------------------------------------\n");

			if (pagamento == '3') {
				parcelas = total / 2;
				System.out.println("Pagar em 2x de R$ " + Math.round(parcelas) + "\n");
			} else if (pagamento == '4') {
				parcelas = total / 3;
				System.out.println("Pagar em 3x de R$ " + Math.round(parcelas) + "\n");
			}

			System.out.println("Deseja comprar mais? Sim / N�o");
			continuar2 = read.next();
			continua2 = (continuar2.toUpperCase().charAt(0) == 'N') ? false : true;

		}

	}

}