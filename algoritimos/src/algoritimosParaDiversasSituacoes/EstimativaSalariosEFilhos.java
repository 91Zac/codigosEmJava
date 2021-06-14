package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class EstimativaSalariosEFilhos {

	/*
	 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	 * coletando dados sobre o salário e número de filhos. A prefeitura deseja
	 * saber: a) média do salário da população; b) média do número de filhos; c)
	 * maior salário; d) percentual de pessoas com salário até R$100,00.
	 */

	public static void main(String[] args) {

//instanciando teclado e declarando variáveis a serem ultilizadas.
		Scanner read = new Scanner(System.in);
		double sal, maiorSal = 0, percSalAteCem = 0, somaSals = 0, somaFilhos = 0;
		int numFilhos, n = 0;
		char porcento = '%';

		System.out.println("----------------------------------------------------------------------");

//estrutura de repetição que tem por objetivo coletar informação de 20 habitantes.
		for (int i = 0; i < 20; i++) {
			System.out.println("Qual o seu salário? ");
			sal = read.nextDouble();
			System.out.println("----------------------------------------------------------------------");

//esse if compara o último salário com o atual por 20 vezes para definir qual o maior salário e 
//depois soma todos os salários para ser possível no fim calcular a média de salários
			if (sal > maiorSal) {
				maiorSal = sal;
				somaSals += sal;
			}
//esse if e responável por calcular a porcentagem de sálarios com valor até 100 reais
			if (sal <= 100) {
				n++;
				percSalAteCem = ((n * 100) / 20);
			}

//ainda dentro do for é coletado dados sobre o numero de filhos e realizado calculo correspondente.
			System.out.println("Qual o seu número de filhos? ");
			numFilhos = read.nextInt();
			somaFilhos += numFilhos;
			System.out.println("----------------------------------------------------------------------");
		}

//imprimindo valores finais como solicitado no enunciado
		System.out.printf("A média de salário é: %.2f", ((somaSals / 20)));
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nA média de filhos é: %.2f", (somaFilhos / 20), 2);
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nO maior salário é: %.2f ", maiorSal);
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nO percentual de pessoas que recebem até 100 reais é: %.2f %c ", percSalAteCem, porcento);
		System.out.print("\n----------------------------------------------------------------------");

	}

}
