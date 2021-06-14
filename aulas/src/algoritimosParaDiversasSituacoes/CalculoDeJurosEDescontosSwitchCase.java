package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

/*
 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal 
 * de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a 
 * condi��o de pagamento escolhida e efetuar o c�lculo adequado.

C�digo Condi��o de pagamento
1 � vista em dinheiro ou cheque, recebe 20% de desconto
2 � vista no cart�o de cr�dito, recebe 15% de desconto
3 Em duas vezes, pre�o normal de etiqueta sem juros (mostrar as parcelas)
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10% (mostrar as parcelas com juros)
 */

public class CalculoDeJurosEDescontosSwitchCase {
	public static void main(String[] args) {
		
//instanciando teclado para entrada de dados e definindo vari�veis necess�rias
		Scanner read = new Scanner(System.in);
		double valorFinalProduto, valorDeEtiqueta;
		int opcaoPagamento = 0;
		boolean continua = false;
		char continuar = 'S';

//estrutura condicional do while combinada com estrutura condiciona switch case para determinar qual sa�da 
//corresponde � op��o escolhida pelo usu�rio e repetindo quantas vezes forem solicitadas at� que o usuario encerre o la�o de repeti��o.
		do {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("qual o valor do produto  ");
			valorDeEtiqueta = read.nextDouble();
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(
					"\nDigite 1 para pagar a vista no dinheiro ou cheque;\n\nDigite 2 para a vista no cart�o de cr�dito,\n\nDigite 3 para parcelar em duas vezes;\n\nOu digite 4 para parcelar em tr�s vezes  ");
			opcaoPagamento = read.nextInt();
			System.out.println("--------------------------------------------------------------------------");
			switch (opcaoPagamento) {
			case 1:
				valorFinalProduto = valorDeEtiqueta * 0.8;
				System.out.printf("O produto ter� desconto de 20%% , sair� por: %.2f reias\n", valorFinalProduto);
				System.out.println("--------------------------------------------------------------------------");
				break;
			case 2:
				valorFinalProduto = valorDeEtiqueta * 0.85;
				System.out.printf("O produto ter� desconto de 15%% por cento, sair� por: %.2f reias\n",
						valorFinalProduto);
				System.out.println("--------------------------------------------------------------------------");
				break;
			case 3:
				valorFinalProduto = valorDeEtiqueta;
				System.out.printf("O produto sair� no valor de etiqueta sem juros: %.2f reias\n", valorFinalProduto);
				System.out.println("--------------------------------------------------------------------------");
				break;
			case 4:
				valorFinalProduto = valorDeEtiqueta * 1.1;
				System.out.printf("O produto ter� acr�scimo de uma taxa de 10%%, sair� por: %.2f reias\n",
						valorFinalProduto);
				System.out.println("--------------------------------------------------------------------------");
				break;
			default:
				System.out.println("Op��o inv�lida, por favor reinicie o processo");
				System.out.println("--------------------------------------------------------------------------");
			}
			System.out.println("Deseja continuar S/N");
			continuar = read.next().toUpperCase().charAt(0);
			if (continuar == 'S') {
				continua = true;
			} else {
				continua = false;
			}
		} while (continua);
		read.close();
		/*
		 * if (opcaoPagamento == 1){ valorFinalProduto = valorDeEtiqueta*80/100;
		 * System.out.println("O produto ter� desconto de 20%, sair� por: "+
		 * valorFinalProduto+"\reais n"); } else if(opcaoPagamento == 2){
		 * valorFinalProduto = valorDeEtiqueta*85/100;
		 * System.out.println("O produto ter� desconto de 15%, sair� por: "+
		 * valorFinalProduto+"reais \n"); } else if(opcaoPagamento == 3){
		 * valorFinalProduto = valorDeEtiqueta;
		 * System.out.println("O produto sair� no valor de etiqueta sem juros: "+
		 * valorFinalProduto+"reais \n"); } else if(opcaoPagamento == 4){
		 * valorFinalProduto = valorDeEtiqueta*110/100;
		 * System.out.println("O produto ter� acr�scimo de uma taxa de 10%, sair� por: "
		 * + valorFinalProduto+" reais\n"); } else{
		 * System.out.println("Op��o inv�lida, por favor reinicie o processo"+"\n");
		 * 
		 * }
		 */
	}

}
