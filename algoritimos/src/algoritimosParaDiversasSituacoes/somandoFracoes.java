package algoritimosParaDiversasSituacoes;

public class somandoFracoes {

	/*
	 * Fa�a um programa que calcula e escreve a seguinte soma: 
	 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	 */
	public static void main(String[] args) {
		
//declarando vari�veis e inicializando-as de acordo com sua utiliza��o
		double soma = 0, numerador = 1, denominador = 1;
		
//estrutura de repeti��o programada para rodar somando as fra��es at� ser atingido valor indicado no enunciado
		for (denominador = 1; denominador <= 50; denominador++) {
			soma += numerador / denominador;
			System.out.printf("%.0f/%.0f soma parcial = %.2f \n", numerador, denominador, soma);
			numerador += 2;
		}
		
//impprimindo sama total.
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("Valor Final = %.2f \n", soma);
	}

}
