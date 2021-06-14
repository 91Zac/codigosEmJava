package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MedirNivelPoluicao {

	/*
	 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3
	 * grupos de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice
	 * de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as
	 * ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o
	 * �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a
	 * suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem
	 * ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o
	 * �ndice de polui��o medido e emita a notifica��o adequada aos diferentes
	 * grupos de empresas.
	 */

	public static void main(String[] args) {

//Declarando Vari�veis
		double indice;
		Scanner leia = new Scanner(System.in);

//Solicitando valores de entrada
		System.out.println("Qual o �ndice atual? ");
		indice = leia.nextDouble();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

//Estrutura condicional e suas respectivas sa�das
		if (indice > 0.05 && indice < 0.25) {
			System.out.println("A polui��o est� em um n�vel aceitavel.");
			System.out.println("----------------------------------------------------------------------");

		} else if (indice >= 0.3 && indice < 0.4) {
			System.out.println("Intimar empresas do 1� Grupo a suspenderem suas atividades.");
			System.out.println("----------------------------------------------------------------------");

		} else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("Intimar empresas do 1� e 2� Grupo a suspender suas atividades.");
			System.out.println("----------------------------------------------------------------------");

		} else if (indice > 0.5) {
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades.");
			System.out.println("----------------------------------------------------------------------");
		}

	}

}
