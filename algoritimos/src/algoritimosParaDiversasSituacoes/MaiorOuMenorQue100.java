package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MaiorOuMenorQue100 {
	/*
	 * Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se
	 * a mesma for maior que 100, caso contr�rio imprimi-la com o valor zero.
	 */

	public static void main(String[] args) {
//declarando vari�vel e atribuindo valor pelo scanner
		int numero;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o n�mero ");
		numero = leia.nextInt();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

//Verificando se valor atribu�do � vari�vel atende � condi��o e imprimindo de acordo com o solicitado.
		if (numero > 100) {
			System.out.println(numero + " (n�mero maior que 100)");
		} else {
			numero = 0;
			System.out.println(numero + " (n�mero menor ou igual a 100)");
		}
		System.out.println("----------------------------------------------------------------------");
	}
}
