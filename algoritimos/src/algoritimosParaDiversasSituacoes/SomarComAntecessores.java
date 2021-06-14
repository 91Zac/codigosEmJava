package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class SomarComAntecessores {
	/*
	 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
	 * n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois
	 * 1+2+3+4+5+6+7=28.
	 */
	public static void main(String[] args) {

//instanciando teclado, declarando vari�veis e solicitando valor de entrada.
		Scanner ler = new Scanner(System.in);
		int i = 1, num, soma = 0;

//solicitando um valor para o usu�rio para atribuir � vari�vel
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Entre com um numero ");
		num = ler.nextInt();
		ler.close();
		System.out.println("\n---------------------------------------------------------");
		System.out.print("0");

//usando estrutura de repeti��o para resolver situa��o proposta 
		do {
			soma += i;
			System.out.print(" + " + i);
			i++;
			
		} while (i <= num);
		System.out.println("\n---------------------------------------------------------");
		System.out.println("A soma do n�mero digitado com seus antecessores �: "+soma);
		System.out.println("---------------------------------------------------------");

	}

}
