package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CalculoDeFormulaComPotencia {

	/*
	 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
	 * calcule a seguinte express�o: D=(R+S)/2, onde R = (A+B).(A+B) e S=(B+C).(B+C)
	 */

	public static void main(String[] args) {

//declarando variaveis e instanciando teclado para entrada de dados(scanner)
		double A, B, C, R, S, D;
		Scanner read = new Scanner(System.in);

//solicitando entrada de dados ao usu�rio e atribuindo �s respectivas vari�ceis.
		System.out.println("Entre com o valor de A ");
		A = read.nextDouble();
		System.out.println("Entre com o valor de B ");
		B = read.nextDouble();
		System.out.println("Entre com o valor de C ");
		C = read.nextDouble();

//fechando o teclado de entrada de dados
		read.close();

//traduzindo a f�rmula matem�tica para c�digo JAVA para conseguir efetuar o calculo.
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S) / 2;

//Imprimindo String concatenada com valor final solicitado.
		System.out.println("O valor de D � " + D);
	}
}
