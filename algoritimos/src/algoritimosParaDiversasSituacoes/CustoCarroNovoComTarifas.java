package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CustoCarroNovoComTarifas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		/*
		 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo
		 * ao consumidor.
		 */

//declarando vari�veis j� atribuindo valor �s que os j� tm definidos.
		double custoCarroNovo, custoDeFabrica, porcentDistrib = 0.28, impostos = 0.45;

//coletando informa��o necess�ria para o c�culo final.
		System.out.println("Qual o custo de f�brica? ");
		custoDeFabrica = read.nextDouble();
		System.out.println("____________________________________________________________\n");

//realizando c�culo para obter o valor repassado ao cliente do carro incluindo tarifas.
		custoCarroNovo = ((custoDeFabrica * porcentDistrib) + (custoDeFabrica * impostos) + custoDeFabrica);

//imprimindo string final contendo a informa��o esperada.
		System.out.println("O custo ao consumidor do carro novo �: " + custoCarroNovo);
		System.out.println("____________________________________________________________\n");
	}

}
