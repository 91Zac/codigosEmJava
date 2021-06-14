package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class EstimativaSalariosEFilhos {

	/*
	 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	 * coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja
	 * saber: a) m�dia do sal�rio da popula��o; b) m�dia do n�mero de filhos; c)
	 * maior sal�rio; d) percentual de pessoas com sal�rio at� R$100,00.
	 */

	public static void main(String[] args) {

//instanciando teclado e declarando vari�veis a serem ultilizadas.
		Scanner read = new Scanner(System.in);
		double sal, maiorSal = 0, percSalAteCem = 0, somaSals = 0, somaFilhos = 0;
		int numFilhos, n = 0;
		char porcento = '%';

		System.out.println("----------------------------------------------------------------------");

//estrutura de repeti��o que tem por objetivo coletar informa��o de 20 habitantes.
		for (int i = 0; i < 20; i++) {
			System.out.println("Qual o seu sal�rio? ");
			sal = read.nextDouble();
			System.out.println("----------------------------------------------------------------------");

//esse if compara o �ltimo sal�rio com o atual por 20 vezes para definir qual o maior sal�rio e 
//depois soma todos os sal�rios para ser poss�vel no fim calcular a m�dia de sal�rios
			if (sal > maiorSal) {
				maiorSal = sal;
				somaSals += sal;
			}
//esse if e respon�vel por calcular a porcentagem de s�larios com valor at� 100 reais
			if (sal <= 100) {
				n++;
				percSalAteCem = ((n * 100) / 20);
			}

//ainda dentro do for � coletado dados sobre o numero de filhos e realizado calculo correspondente.
			System.out.println("Qual o seu n�mero de filhos? ");
			numFilhos = read.nextInt();
			somaFilhos += numFilhos;
			System.out.println("----------------------------------------------------------------------");
		}

//imprimindo valores finais como solicitado no enunciado
		System.out.printf("A m�dia de sal�rio �: %.2f", ((somaSals / 20)));
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nA m�dia de filhos �: %.2f", (somaFilhos / 20), 2);
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nO maior sal�rio �: %.2f ", maiorSal);
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nO percentual de pessoas que recebem at� 100 reais �: %.2f %c ", percSalAteCem, porcento);
		System.out.print("\n----------------------------------------------------------------------");

	}

}
