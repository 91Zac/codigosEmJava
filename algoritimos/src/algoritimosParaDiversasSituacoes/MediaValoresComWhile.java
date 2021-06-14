package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MediaValoresComWhile {
	/*
	 * Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
	 * apresente no final o total do somat�rio, a m�dia e o total de valores lidos.
	 * O programa deve fazer as leituras dos valores enquanto o usu�rio estiver
	 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usu�rio
	 * fornecer um valor negativo.
	 */

	public static void main(String[] args) {
		
//instanciando teclado e declarando vari�veis
		Scanner ler = new Scanner(System.in);
		double numero = 0, somaNumero = 0, n = 0;
		System.out.println("----------------------------------------------------------------------");
		
//estrutura de repei��o que s� ter� fim quando digitado um n�mero negativo
		while (numero >= 0) {
			n++;
			somaNumero = somaNumero + numero;
			System.out.println("Digite um n�mero ");
			numero = ler.nextDouble();
			System.out.println("----------------------------------------------------------------------");
		}
//imprimindo sa�das com valores calculados e inseridos nas Strings de resposta.
		System.out.printf("A somat�ria dos n�meros digitados �: %.2f", somaNumero);
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nA m�dia desses n�meros �: %.2f", (somaNumero / n));
		System.out.println("\n----------------------------------------------------------------------");
	}

}
