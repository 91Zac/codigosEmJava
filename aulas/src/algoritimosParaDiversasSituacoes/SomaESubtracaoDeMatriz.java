package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class SomaESubtracaoDeMatriz {

	/*
	 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
	 * matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
	 * matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
	 * elementos de mesma posição das matrizes N1 e N2.
	 */
	public static void main(String[] args) {

//instanciando matrizes
		int n1[][] = new int[4][6], n2[][] = new int[4][6];
		int m1[][] = new int[4][6], m2[][] = new int[4][6];

//populando matriz N1 aleatoriamente através do método Math.random e imprimindo a matriz no console
		System.out.println("Matriz N1: \n");
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				n1[lin][col] = (int) (Math.random() * 10);
				System.out.print("[" + n1[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("_________________________________\n");
		System.out.println("Matriz N2: \n");

//populando matriz N2 aleatoriamente através do método Math.random e imprimindo a matriz no console
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				n2[lin][col] = (int) (Math.random() * 10);
				System.out.print("[" + n2[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("_________________________________\n");
		System.out.println("Matriz M1(Soma de N1 e N2): \n");

//populando matriz M1 com valores resultantes da soma dos respectivos indices na matrizes N1 e N2 e imprimindo esses valores.
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				m1[lin][col] = n1[lin][col] + n2[lin][col];
				System.out.print("[" + m1[lin][col] + "]");
			}

			System.out.println("\n");
		}
		System.out.println("__________________________________\n");
		System.out.println("Matriz M2(Subtração de N1 e N2): \n");

//populando matriz M1 com valores resultantes da subtração dos respectivos indices na matrizes N1 e N2 e imprimindo esses valores.
		for (int lin = 0; lin < 4; lin++) {
			for (int col = 0; col < 6; col++) {
				m2[lin][col] = n1[lin][col] - n2[lin][col];
				System.out.print("[" + m2[lin][col] + "]");
			}
			System.out.println("\n");
		}
		System.out.println("\n_________________________________");
	}

}
