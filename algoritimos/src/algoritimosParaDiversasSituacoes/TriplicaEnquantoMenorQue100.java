package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class TriplicaEnquantoMenorQue100 {

	public static void main(String[] args) {
		/*
		 * Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar
		 * ele por tr�s (imprimindo o novo valor) at� que ele seja maior do que 100.
		 * Ex.: se o usu�rio digita 5, deveremos observar na tela a seguinte sequ�ncia:
		 * 5 15 45 135.
		 */

//instanciando teclado e declarando vari�vel e inicializando a mesma
		Scanner read = new Scanner(System.in);
		int numero = 0;

//solicitando um n�mero para ser atribu�do � vari�vel para o posterior c�lculo solicitado.
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("Digite um n�mero positivo: ");
		numero = read.nextInt();
		System.out.println("\n----------------------------------------------------------------------");

//nessa estrutura while � realizado o c�lculo at� que a condi��o seja atingida.
		while (numero < 100) {
			numero = numero * 3;
			System.out.println(numero);
			System.out.println("----------------------------------------------------------------------");
		}

	}

}
