package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MaiorValorNoVetor {

	/*
	 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de
	 * uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a
	 * apresente.
	 * 
	 */

	public static void main(String[] args) {

//instanciando teclado e instanciando array de 5 posi��es
		Scanner ler = new Scanner(System.in);
		int pontuacoes[] = new int[5], maiorP = 0;
		System.out.println("---------------------------------------------------------");

//usando estrutura de repeti��o for para solicitar valores que v�o popular o array
		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com a pontuacao " + (i + 1) + ": ");
			pontuacoes[i] = ler.nextInt();
			System.out.println("---------------------------------------------------------");

//usando if para fazer compara��o entre valores inseridos e definir qual deles � maior.
			if (pontuacoes[i] > maiorP) {
				maiorP = pontuacoes[i];
			}
		}

//essa estrutura for � respons�vel por imprimir todos os itens do array
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + pontuacoes[i] + "]");
		}
		System.out.println("\n---------------------------------------------------------");

//imprimindo a maior potua��o presente entre as digitadas 
		System.out.println("A maior pontua��o �: " + maiorP);
		ler.close();
		System.out.print("---------------------------------------------------------");
	}

}
