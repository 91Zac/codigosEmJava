package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ParOuImpar {
	/*
	 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se
	 * este n�mero � par ou �mpar, e se � positivo ou negativo
	 */

	public static void main(String[] args) {
//declarando vari�vel e instanciado teclado
		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.print("Qual o n�mero? ");
		numero = leia.nextInt();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

//elaborando condi��es para determinar se o n�mero � impar par ou neutro e at� mesmo negativo.
		if (numero == 0) {
			System.out.println(" O n�mero " + numero + " � neutro");
			System.out.println("----------------------------------------------------------------------");
		} else if (numero < 0) {
			System.out.println(" O n�mero " + numero + " � negativo");
			System.out.println("----------------------------------------------------------------------");
		} else if (numero % 2 == 0) {
			System.out.println(" O n�mero " + numero + " � par");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println(" O n�mero " + numero + " � impar");
			System.out.println("----------------------------------------------------------------------");
		}

	}

}
