package algoritimosParaDiversasSituacoes;

import java.util.Random;
import java.util.Scanner;

public class NumerosEmCadaIntervalo {

	/*
	 * Escrever um programa que leia 100 números e conte
	 * quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e
	 * [76-100]. A entrada de dados deve terminar quando for lido um número
	 * negativo.
	 */

	public static void main(String[] args) {
		
//instanciando teclado e dec
		Scanner ler = new Scanner(System.in);
		int numero = 1, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0, contador = 0;

		Random aleatorio = new Random();
		while (contador < 100) {
			numero = aleatorio.nextInt(101);

			if (numero > 0 && numero < 25) {
				intervalo1++;
				contador++;
			} else if (numero > 25 && numero <= 50) {
				intervalo2++;
				contador++;
			} else if (numero > 50 && numero <= 75) {
				intervalo3++;
				contador++;
			} else if (numero > 75 && numero <= 100) {
				intervalo4++;
				contador++;
			}
			System.out.println(contador +"º Sorteado: " + numero + "\n");
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("No Intervalo 1, de 0 a 25, entraram " + intervalo1 + " números");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("No Intervalo 2, de 26 a 50, entraram " + intervalo2 + " números");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("No Intervalo 3, de 51 a 75, entraram " + intervalo3 + " números");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("No Intervalo 4, de 76 a 100, entraram " + intervalo4 + " números");
		System.out.println("--------------------------------------------------------------------------");
		ler.close();
	}

}
