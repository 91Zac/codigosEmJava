package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class SomaDiagonalPrincipalMatriz {

	/*
	 * Crie um programa que receba valores aleatoreamente para preencher uma matriz
	 * 5X5, e em seguida, exiba a soma dos valores dela e a soma dos valores da
	 * primeira diagonal, ou seja, diagonal principal.
	 * 
	 */
	public static void main(String[] args) {

		final int LINHA = 5;
		final int COLUNA = 5;
		int quad[][] = new int[LINHA][COLUNA];
		int somaDiagonal = 0;
		System.out.println("\n--------------------------------------------------------------------------");

//estrutura de repetição usada para atribuir valores aleatórios na matriz e calcular diagonal principal.
		for (int i = 0; i < LINHA; i++) {
			for (int j = 0; j < COLUNA; j++) {
				quad[i][j] = (int) (Math.random() * 100); // x = 2 = y= 2
				if (i == j) {
					somaDiagonal = somaDiagonal + quad[i][j];
				}
			}
		}

//estrutura de repetição usada para imprimir a matriz
		for (int i = 0; i < LINHA; i++) // LINHA
		{
			for (int j = 0; j < COLUNA; j++) // coluna
			{
				System.out.print("[ " + quad[i][j] + " ]");
			}
			System.out.print("\n");

		}

//imprimindo saida com a informação solicitada: a somatoria da diagonal principal
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("TOTAL DA SOMA DOS VALORES DA DIAGONAL PRINCIPAL DA MATRIZ " + somaDiagonal);
		System.out.println("--------------------------------------------------------------------------");

	}

}
