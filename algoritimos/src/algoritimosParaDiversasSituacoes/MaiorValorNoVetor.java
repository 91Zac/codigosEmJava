package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MaiorValorNoVetor {

	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de
	 * uma atividade e o escreva em seguida. Encontre após a maior pontuação e a
	 * apresente.
	 * 
	 */

	public static void main(String[] args) {

//instanciando teclado e instanciando array de 5 posições
		Scanner ler = new Scanner(System.in);
		int pontuacoes[] = new int[5], maiorP = 0;
		System.out.println("---------------------------------------------------------");

//usando estrutura de repetição for para solicitar valores que vão popular o array
		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com a pontuacao " + (i + 1) + ": ");
			pontuacoes[i] = ler.nextInt();
			System.out.println("---------------------------------------------------------");

//usando if para fazer comparação entre valores inseridos e definir qual deles é maior.
			if (pontuacoes[i] > maiorP) {
				maiorP = pontuacoes[i];
			}
		}

//essa estrutura for é responsável por imprimir todos os itens do array
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + pontuacoes[i] + "]");
		}
		System.out.println("\n---------------------------------------------------------");

//imprimindo a maior potuação presente entre as digitadas 
		System.out.println("A maior pontuação é: " + maiorP);
		ler.close();
		System.out.print("---------------------------------------------------------");
	}

}
