package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ConverterMintosEmHora {

	/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

	public static void main(String[] args) {

//definindo variáveis a serem utilizadas e instanciando teclado
		int totalSegundos, horas, minutos, segundos;
		String tempoConvertido;
		Scanner read = new Scanner(System.in);

//solicitando informações ao usuarios
		System.out.println("Quantos segundos de duração total? ");
		totalSegundos = read.nextInt();
		System.out.println("-----------------------------------------------------------");
		read.close();

//efetuando cálculos para obter o resultado requerido
		horas = (totalSegundos / 3600);
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos - (horas * 3600 + minutos * 60));

//gereando string com resultado final e apresentando na tela.
		tempoConvertido = ("\nA duração do evento foi: " + horas + " horas " + minutos + " minutos e " + segundos
				+ " segundos.");
		System.out.println(tempoConvertido);

	}

}
