package algoritimosParaDiversasSituacoes;

public class IncrementandoValoresConformeIntervalo {
	/*
	 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
	 * contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não
	 * estiver.
	 */

	public static void main(String[] args) {

//declarando variáveis e incializando-as
		int valorInicial = 233, valorFinal = 456;
		
//estruturas de repetição fazendo o cálculo diferente e imprimindo os números a cada intervalo citado no enunciado.
		do {
			System.out.println(valorInicial + "\n");
			valorInicial += 5;
		} while (valorInicial < 300);
		do {
			System.out.println(valorInicial + "\n");
			valorInicial += 3;
		} while (valorInicial < 400);
		do {
			System.out.println(valorInicial + "\n");
			valorInicial += 5;
		} while (valorInicial <= valorFinal);
		System.out.println(valorFinal);

	}

}
