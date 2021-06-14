package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ParOuImpar {
	/*
	 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se
	 * este número é par ou ímpar, e se é positivo ou negativo
	 */

	public static void main(String[] args) {
//declarando variável e instanciado teclado
		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.print("Qual o número? ");
		numero = leia.nextInt();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

//elaborando condições para determinar se o número é impar par ou neutro e até mesmo negativo.
		if (numero == 0) {
			System.out.println(" O número " + numero + " é neutro");
			System.out.println("----------------------------------------------------------------------");
		} else if (numero < 0) {
			System.out.println(" O número " + numero + " é negativo");
			System.out.println("----------------------------------------------------------------------");
		} else if (numero % 2 == 0) {
			System.out.println(" O número " + numero + " é par");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println(" O número " + numero + " é impar");
			System.out.println("----------------------------------------------------------------------");
		}

	}

}
