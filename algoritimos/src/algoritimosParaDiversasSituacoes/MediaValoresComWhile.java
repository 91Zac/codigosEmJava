package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MediaValoresComWhile {
	/*
	 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	 * apresente no final o total do somatório, a média e o total de valores lidos.
	 * O programa deve fazer as leituras dos valores enquanto o usuário estiver
	 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário
	 * fornecer um valor negativo.
	 */

	public static void main(String[] args) {
		
//instanciando teclado e declarando variáveis
		Scanner ler = new Scanner(System.in);
		double numero = 0, somaNumero = 0, n = 0;
		System.out.println("----------------------------------------------------------------------");
		
//estrutura de repeição que só terá fim quando digitado um número negativo
		while (numero >= 0) {
			n++;
			somaNumero = somaNumero + numero;
			System.out.println("Digite um número ");
			numero = ler.nextDouble();
			System.out.println("----------------------------------------------------------------------");
		}
//imprimindo saídas com valores calculados e inseridos nas Strings de resposta.
		System.out.printf("A somatória dos números digitados é: %.2f", somaNumero);
		System.out.print("\n----------------------------------------------------------------------");
		System.out.printf("\nA média desses números é: %.2f", (somaNumero / n));
		System.out.println("\n----------------------------------------------------------------------");
	}

}
