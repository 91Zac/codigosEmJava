package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class TriplicaEnquantoMenorQue100 {

	public static void main(String[] args) {
		/*
		 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar
		 * ele por três (imprimindo o novo valor) até que ele seja maior do que 100.
		 * Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência:
		 * 5 15 45 135.
		 */

//instanciando teclado e declarando variável e inicializando a mesma
		Scanner read = new Scanner(System.in);
		int numero = 0;

//solicitando um número para ser atribuído à variável para o posterior cálculo solicitado.
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("Digite um número positivo: ");
		numero = read.nextInt();
		System.out.println("\n----------------------------------------------------------------------");

//nessa estrutura while é realizado o cálculo até que a condição seja atingida.
		while (numero < 100) {
			numero = numero * 3;
			System.out.println(numero);
			System.out.println("----------------------------------------------------------------------");
		}

	}

}
