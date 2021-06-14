package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class VetorOrdemDiretaOuInversa {

	/*
	 * Faça um programa que leia um vetor de 5 posições para números reais e,
	 * depois, um código inteiro. Se o código for zero, finalize o programa; se for
	 * 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
	 * Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o
	 * código inválido.
	 */

	public static void main(String[] args) {

//instanciando teclado,vetor e declarando variável.
		Scanner read = new Scanner(System.in);
		double vetor[] = new double[5];
		int codigo = 1;

//solicitando entrada de dados para popular o array
		System.out.println("--------------------------------------------------------------------------");
		for (int x = 0; x < 5; x++) {
			System.out.print("Digite o valor " + (x + 1) + " : ");
			vetor[x] = read.nextDouble();
		}
		
//estrutara de repetição associado a estrutura de condição para prosseguir ou encerrar a execução do programa 
//e em cada caso imprimir saída correspondente.
		while (codigo != 0) {
			System.out.print("Digite o codigo 0 /1 /2 : ");
			codigo = read.nextInt();
			System.out.println("--------------------------------------------------------------------------");

			if (codigo == 1) {
				for (int i = 0; i < 5; i++) {
					System.out.printf("[%.0f]", vetor[i]);
				}
			} else if (codigo == 2) {
				for (int i = 4; i >= 0; i--) {
					System.out.printf("[%.0f]", vetor[i]);
				}
			} else if (codigo == 0) {
				System.out.print("Programa Encerrado.");
				break;
			} else {
				System.out.print("Código inválido, tente novamente");
			}
			System.out.println("\n--------------------------------------------------------------------------");
		}
		read.close();
	}
}
