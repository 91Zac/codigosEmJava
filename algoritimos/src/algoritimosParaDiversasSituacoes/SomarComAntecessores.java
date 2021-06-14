package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class SomarComAntecessores {
	/*
	 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
	 * números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
	 * 1+2+3+4+5+6+7=28.
	 */
	public static void main(String[] args) {

//instanciando teclado, declarando variáveis e solicitando valor de entrada.
		Scanner ler = new Scanner(System.in);
		int i = 1, num, soma = 0;

//solicitando um valor para o usuário para atribuir à variável
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Entre com um numero ");
		num = ler.nextInt();
		ler.close();
		System.out.println("\n---------------------------------------------------------");
		System.out.print("0");

//usando estrutura de repetição para resolver situação proposta 
		do {
			soma += i;
			System.out.print(" + " + i);
			i++;
			
		} while (i <= num);
		System.out.println("\n---------------------------------------------------------");
		System.out.println("A soma do número digitado com seus antecessores é: "+soma);
		System.out.println("---------------------------------------------------------");

	}

}
