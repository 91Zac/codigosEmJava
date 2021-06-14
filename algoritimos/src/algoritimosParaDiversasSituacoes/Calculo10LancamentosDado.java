package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class Calculo10LancamentosDado {

	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
	 * programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
	 * determine e imprima a média aritmética dos lançamentos, contabilize e
	 * apresente também quantas foram as ocorrências da maior pontuação.
	 */

	public static void main(String[] args) {

//instanciando teclado, array e declarando variáveis 
		Scanner ler = new Scanner(System.in);
		int lancamentos[] = new int[10], maiorPonto = 0, cont = 0;
		double soma = 0.0;
		System.out.println("--------------------------------------------------------------------------");

//for responsável por popular o array com informções fornecidas pelo usuário
		for (int i = 0; i < 10; i++) {
			System.out.println("Qual o valor do lancamento " + (i + 1));
			lancamentos[i] = ler.nextInt();
			System.out.println("--------------------------------------------------------------------------");

//este wile dentro do for tem a função de verificar que só foram considerados valores de 1 a 6.
			while (lancamentos[i] < 1 || lancamentos[i] > 6) {
				System.out.println("Entre com um valor válido.");
				lancamentos[i] = ler.nextInt();
				System.out.println("--------------------------------------------------------------------------");
			}

//esse if ainda dentro do for faz a soma dos lançamentos para depois calcular a media e também define o maior valor entre os lançamentos.
			soma += lancamentos[i];
			if (lancamentos[i] >= maiorPonto) {
				if (lancamentos[i] != maiorPonto) {
					cont = 0;
				}
				maiorPonto = lancamentos[i];
				cont++;
			}
		}

//esse for tem por objetivo imprimir todos os lançamentos armazenados no array
		System.out.print("Valores dos lançamentos: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + lancamentos[i] + "] ");

		}
		System.out.println("\n--------------------------------------------------------------------------");
//imprimindo todas as saídas solicitadas na proposta
		System.out.println("Maior valor " + maiorPonto);
		System.out.println("A maior pontuação ocorreu " + cont + " vezes");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("A média dos valores é " + (soma / 10));
		ler.close();
		System.out.println("--------------------------------------------------------------------------");

	}

}
