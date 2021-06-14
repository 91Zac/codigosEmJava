package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MaiorOuMenorQue100 {
	/*
	 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se
	 * a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
	 */

	public static void main(String[] args) {
//declarando variável e atribuindo valor pelo scanner
		int numero;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o número ");
		numero = leia.nextInt();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

//Verificando se valor atribuído à variável atende à condição e imprimindo de acordo com o solicitado.
		if (numero > 100) {
			System.out.println(numero + " (número maior que 100)");
		} else {
			numero = 0;
			System.out.println(numero + " (número menor ou igual a 100)");
		}
		System.out.println("----------------------------------------------------------------------");
	}
}
