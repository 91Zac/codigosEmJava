package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MedirNivelPoluicao {

	/*
	 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3
	 * grupos de indústrias que são altamente poluentes do meio ambiente. O índice
	 * de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
	 * indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o
	 * índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a
	 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem
	 * ser notificados a paralisarem suas atividades. Faça um sistema que leia o
	 * índice de poluição medido e emita a notificação adequada aos diferentes
	 * grupos de empresas.
	 */

	public static void main(String[] args) {

//Declarando Variáveis
		double indice;
		Scanner leia = new Scanner(System.in);

//Solicitando valores de entrada
		System.out.println("Qual o índice atual? ");
		indice = leia.nextDouble();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

//Estrutura condicional e suas respectivas saídas
		if (indice > 0.05 && indice < 0.25) {
			System.out.println("A poluição está em um nível aceitavel.");
			System.out.println("----------------------------------------------------------------------");

		} else if (indice >= 0.3 && indice < 0.4) {
			System.out.println("Intimar empresas do 1° Grupo a suspenderem suas atividades.");
			System.out.println("----------------------------------------------------------------------");

		} else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("Intimar empresas do 1° e 2° Grupo a suspender suas atividades.");
			System.out.println("----------------------------------------------------------------------");

		} else if (indice > 0.5) {
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades.");
			System.out.println("----------------------------------------------------------------------");
		}

	}

}
