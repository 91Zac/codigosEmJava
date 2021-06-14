package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CustoCarroNovoComTarifas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo
		 * ao consumidor.
		 */

//declarando variáveis já atribuindo valor às que os já tm definidos.
		double custoCarroNovo, custoDeFabrica, porcentDistrib = 0.28, impostos = 0.45;

//coletando informação necessária para o cáculo final.
		System.out.println("Qual o custo de fábrica? ");
		custoDeFabrica = read.nextDouble();
		System.out.println("____________________________________________________________\n");

//realizando cáculo para obter o valor repassado ao cliente do carro incluindo tarifas.
		custoCarroNovo = ((custoDeFabrica * porcentDistrib) + (custoDeFabrica * impostos) + custoDeFabrica);

//imprimindo string final contendo a informação esperada.
		System.out.println("O custo ao consumidor do carro novo é: " + custoCarroNovo);
		System.out.println("____________________________________________________________\n");
	}

}
