package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class ConverterTotalDeDiasEmIdade {

	/* * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	 * expressa em anos, meses e dias.*/

	public static void main(String[] args) {
//Declarando variáveis e instanciando teclado
		int totalDias, anos, meses, dias;
		String idadeAtual;
		Scanner read = new Scanner(System.in);

//solicitando informações do usuário
		System.out.println("Quantos dias no total? ");
		totalDias = read.nextInt();
		System.out.println("-----------------------------------------------------------");
		read.close();

//fazendo cálculos necessário para obter informação olicitada
		anos = (totalDias / 365);
		meses = (totalDias % 365) / 30;
		dias = (totalDias - (anos * 365 + meses * 30));

//Criando condição caso seja digitado um valor acima de 365 dias e imprimindo resultado no console.
		if (anos > 0) {
			idadeAtual = ("\nA idade é: " + anos + " anos " + meses + " meses e " + dias + " dias.");
			System.out.println(idadeAtual);
			read.close();

//Criando condição caso seja digitado um valor abaixo de 365 dias e imprimindo resultado no console.
		} else {
			if (totalDias >= 360 && totalDias < 365) {
				meses = ((totalDias % 365) / 30) - 1;
				dias = (totalDias - (meses * 30));
			}
			idadeAtual = ("\nA idade é: " + meses + " meses e " + dias + " dias.");
			System.out.println(idadeAtual);
			read.close();
		}
	}
}
