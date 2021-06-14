package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class AulasNatacaoFaixaEtaria {

	/*
	 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das
	 * seguintes categorias: Infantil A = 5 a 7 anos, Infantil B = 8 a 11 anos,
	 * Juvenil A = 12 a 13 anos, Juvenil B = 14 a 17 anos e Adultos = Maiores de 18
	 * anos
	 */

	public static void main(String[] args) {

// Declarando Variável
		int idade;
		Scanner leia = new Scanner(System.in);

// Solicitando entradas
		System.out.println("Sua idade?");
		idade = leia.nextInt();
		leia.close();
		System.out.println("----------------------------------------------------------------------");

// Estrutura condicional com respectivas saidas
		if (idade <= 4) {
			System.out.println("Olá, descupe não oferecemos aulas para pessoas menores de 4 anos.");

		} else if (idade >= 5 && idade <= 7) {
			System.out.println("Olá, pela sua idade voce se encaixa no perfil: Infantil A.");

		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Olá, pela sua idade voce se encaixa no perfil:infantil B.");

		} else if (idade >= 12 && idade <= 13) {
			System.out.println("Olá, pela sua idade voce se encaixa no perfil juvenil A.");

		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Olá, pela sua idade voce se encaixa no perfil Juvenil B.");

		} else if (idade >= 18) {
			System.out.println("Olá, pela sua idade voce se encaixa no perfil: Adulto.");
		}
		System.out.println("----------------------------------------------------------------------");
	}

}
