package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class VetorOrdemDiretaOuInversa {

	/*
	 * Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e,
	 * depois, um c�digo inteiro. Se o c�digo for zero, finalize o programa; se for
	 * 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
	 * Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que o
	 * c�digo inv�lido.
	 */

	public static void main(String[] args) {

//instanciando teclado,vetor e declarando vari�vel.
		Scanner read = new Scanner(System.in);
		double vetor[] = new double[5];
		int codigo = 1;

//solicitando entrada de dados para popular o array
		System.out.println("--------------------------------------------------------------------------");
		for (int x = 0; x < 5; x++) {
			System.out.print("Digite o valor " + (x + 1) + " : ");
			vetor[x] = read.nextDouble();
		}
		
//estrutara de repeti��o associado a estrutura de condi��o para prosseguir ou encerrar a execu��o do programa 
//e em cada caso imprimir sa�da correspondente.
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
				System.out.print("C�digo inv�lido, tente novamente");
			}
			System.out.println("\n--------------------------------------------------------------------------");
		}
		read.close();
	}
}
