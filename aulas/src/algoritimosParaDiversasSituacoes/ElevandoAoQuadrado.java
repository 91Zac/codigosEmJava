package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ElevandoAoQuadrado {

	/*
	 * Desenvolva um sistema em que: Leia 4 (quatro) n�meros; Calcule o quadrado de
	 * cada um; Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o
	 * e finalize; Caso contr�rio, imprima os valores lidos e seus respectivos
	 * quadrados.
	 */

	public static void main(String[] args) {

//declarando variaveis
		double num1, num2, num3, num4;
		Scanner leia = new Scanner(System.in);

//solicitando entrada de valores para atribuir �s vari�veis
		System.out.println("Qual o primeiro n�mero? ");
		num1 = leia.nextDouble();
		System.out.println("Qual o segundo n�mero? ");
		num2 = leia.nextDouble();
		System.out.println("Qual o terceiro n�mero? ");
		num3 = leia.nextDouble();
		System.out.println("Qual o quarto n�mero? ");
		num4 = leia.nextDouble();
		leia.close();
		System.out.println("------------------------------------------------------------------------------");

//elaborando condi��o para trazer resultado dentro do solicitado no enunciado.
		if (Math.pow(num3, 2) >= 1000) {
			System.out
					.println("O resutado � do terceiro n�mero � acima de 1000 mais exatamente: " + (Math.pow(num3, 2)));
			System.out.println("------------------------------------------------------------------------------");

		} else {
			System.out.println("O primeiro N�mero � = " + num1 + " e seu quadrado � " + Math.pow(num1, 2));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("O segundo N�mero � = " + num2 + " e seu quadrado � " + Math.pow(num2, 2));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("O terceiro N�mero � = " + num3 + " e seu quadrado � " + Math.pow(num3, 2));
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("O quarto N�mero � = " + num4 + " e seu quadrado � " + Math.pow(num4, 2));
			System.out.println("------------------------------------------------------------------------------");
		}

	}

}
