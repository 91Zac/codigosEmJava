package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CalculoDeFormulaComPotencia {

	/*
	 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	 * calcule a seguinte expressão: D=(R+S)/2, onde R = (A+B).(A+B) e S=(B+C).(B+C)
	 */

	public static void main(String[] args) {

//declarando variaveis e instanciando teclado para entrada de dados(scanner)
		double A, B, C, R, S, D;
		Scanner read = new Scanner(System.in);

//solicitando entrada de dados ao usuário e atribuindo às respectivas variáceis.
		System.out.println("Entre com o valor de A ");
		A = read.nextDouble();
		System.out.println("Entre com o valor de B ");
		B = read.nextDouble();
		System.out.println("Entre com o valor de C ");
		C = read.nextDouble();

//fechando o teclado de entrada de dados
		read.close();

//traduzindo a fórmula matemática para código JAVA para conseguir efetuar o calculo.
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S) / 2;

//Imprimindo String concatenada com valor final solicitado.
		System.out.println("O valor de D é " + D);
	}
}
