package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class SistemaDeEquacao {

	/*
	 * Um sistema de equa��es lineares do tipo: ax+by = c dx+ey = f pode ser
	 * resolvido segundo mostrado abaixo : x = (ce-bf) / (ae-bd) y = (af-cd) /
	 * (ae-bd)
	 */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
// declarando vari�veis
		double a, b, c, d, e, f, x, y;

//solicitando dados para atribuir �s respectivas vari�veis.
		System.out.println("Entre com o valor de a: ");
		a = read.nextDouble();
		System.out.println("Entre com o valor de b: ");
		b = read.nextDouble();
		System.out.println("Entre com o valor de c: ");
		c = read.nextDouble();
		System.out.println("Entre com o valor de d: ");
		d = read.nextDouble();
		System.out.println("Entre com o valor de e: ");
		e = read.nextDouble();
		System.out.println("Entre com o valor de f: ");
		f = read.nextDouble();

//montando c�digo Java para resolver sistema de eua��o proposto.
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

//imprimindo String contendo valores de x e y como solicitado no enunciado.
		System.out.println("_____________________________________________________________________________________\n");
		System.out.println("O valor de X �: " + x + " e o valor de Y �: " + y);
	}
}
