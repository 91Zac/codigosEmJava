package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ElevandoAoQuadrado {

	/*
	 * Desenvolva um sistema em que: Leia 4 (quatro) números; Calcule o quadrado de
	 * cada um; Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o
	 * e finalize; Caso contrário, imprima os valores lidos e seus respectivos
	 * quadrados.
	 */

	public static void main(String[] args) {

//declarando variaveis
		double num1, num2, num3, num4;
		Scanner leia = new Scanner(System.in);

//solicitando entrada de valores para atribuir às variáveis
		System.out.println("Qual o primeiro número? ");
		num1 = leia.nextDouble();
		System.out.println("Qual o segundo número? ");
		num2 = leia.nextDouble();
		System.out.println("Qual o terceiro número? ");
		num3 = leia.nextDouble();
		System.out.println("Qual o quarto número? ");
		num4 = leia.nextDouble();
		leia.close();
		System.out.println("------------------------------------------------------------------------------");

//elaborando condição para trazer resultado dentro do solicitado no enunciado.
		if (Math.pow(num3, 2) >= 1000) {
			System.out
					.println("O resutado é do terceiro número é acima de 1000 mais exatamente: " + (Math.pow(num3, 2)));
			System.out.println("------------------------------------------------------------------------------");

		} else {
			System.out.println("O primeiro Número é = " + num1 + " e seu quadrado é " + Math.pow(num1, 2));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("O segundo Número é = " + num2 + " e seu quadrado é " + Math.pow(num2, 2));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("O terceiro Número é = " + num3 + " e seu quadrado é " + Math.pow(num3, 2));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("O quarto Número é = " + num4 + " e seu quadrado é " + Math.pow(num4, 2));
			System.out.println("------------------------------------------------------------------------------");
		}

	}

}
