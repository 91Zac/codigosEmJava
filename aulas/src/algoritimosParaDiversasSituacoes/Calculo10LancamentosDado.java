package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class Calculo10LancamentosDado {

	/*
	 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um
	 * programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir
	 * determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e
	 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
	 */

	public static void main(String[] args) {

//instanciando teclado, array e declarando vari�veis 
		Scanner ler = new Scanner(System.in);
		int lancamentos[] = new int[10], maiorPonto = 0, cont = 0;
		double soma = 0.0;
		System.out.println("--------------------------------------------------------------------------");

//for respons�vel por popular o array com inform��es fornecidas pelo usu�rio
		for (int i = 0; i < 10; i++) {
			System.out.println("Qual o valor do lancamento " + (i + 1));
			lancamentos[i] = ler.nextInt();
			System.out.println("--------------------------------------------------------------------------");

//este wile dentro do for tem a fun��o de verificar que s� foram considerados valores de 1 a 6.
			while (lancamentos[i] < 1 || lancamentos[i] > 6) {
				System.out.println("Entre com um valor v�lido.");
				lancamentos[i] = ler.nextInt();
				System.out.println("--------------------------------------------------------------------------");
			}

//esse if ainda dentro do for faz a soma dos lan�amentos para depois calcular a media e tamb�m define o maior valor entre os lan�amentos.
			soma += lancamentos[i];
			if (lancamentos[i] >= maiorPonto) {
				if (lancamentos[i] != maiorPonto) {
					cont = 0;
				}
				maiorPonto = lancamentos[i];
				cont++;
			}
		}

//esse for tem por objetivo imprimir todos os lan�amentos armazenados no array
		System.out.print("Valores dos lan�amentos: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + lancamentos[i] + "] ");

		}
		System.out.println("\n--------------------------------------------------------------------------");
//imprimindo todas as sa�das solicitadas na proposta
		System.out.println("Maior valor " + maiorPonto);
		System.out.println("A maior pontua��o ocorreu " + cont + " vezes");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("A m�dia dos valores � " + (soma / 10));
		ler.close();
		System.out.println("--------------------------------------------------------------------------");

	}

}
