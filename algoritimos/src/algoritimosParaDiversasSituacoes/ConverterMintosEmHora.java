package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ConverterMintosEmHora {

	/* 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

	public static void main(String[] args) {

//definindo vari�veis a serem utilizadas e instanciando teclado
		int totalSegundos, horas, minutos, segundos;
		String tempoConvertido;
		Scanner read = new Scanner(System.in);

//solicitando informa��es ao usuarios
		System.out.println("Quantos segundos de dura��o total? ");
		totalSegundos = read.nextInt();
		System.out.println("-----------------------------------------------------------");
		read.close();

//efetuando c�lculos para obter o resultado requerido
		horas = (totalSegundos / 3600);
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos - (horas * 3600 + minutos * 60));

//gereando string com resultado final e apresentando na tela.
		tempoConvertido = ("\nA dura��o do evento foi: " + horas + " horas " + minutos + " minutos e " + segundos
				+ " segundos.");
		System.out.println(tempoConvertido);

	}

}
