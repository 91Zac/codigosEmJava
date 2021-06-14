package AlgorimosUmPoucoMaisComplexos;

import java.util.Scanner;

public class MontandoGruposDeAlunos {

	/*
	 * Elaborar progra que possua o nome de todos os alunos da turma assim como
	 * dados de genero e o c�digo do aluno. Depois fa�a com que o programa liste o
	 * nome de cada um com seu respectivo c�digo e pergunte ao usu�rio o tamanho dos
	 * grupos que ele deseja dividir a turma. Com essa informa��o o programa deve
	 * imprimir os grupos e tamb�m a quantidade de homens e de mulheres que h� nessa
	 * tuma.
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

// Vari�veis simples e vetor Composto do nome de todos o alunos:
		int tamanho = 0;
		int grupo = 1;
		String nomes[] = { "Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos",
				"Daniel Ferreira", "Dayane de Oliveira", "Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva ",
				"Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex",
				"Guilherme Fidelis Pereira", "Gustavo Miqu�ias Lopes Santana", "Isac Cordeiro de Oliveira",
				"Iuri Garcia Nunes", "Jenifer Lima Placido", "J�ssica Cristiane", "Joao Pedro Sena",
				"Larissa Moraes Ribeiro", "Leonardo de Moraes Magalh�es", "Lucas Santos Gon�alves",
				"Mariana  de C�ssia Antunes Oliveira", "Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes",
				"RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vit�ria Gon�alves de Freitas", "William Xavier" };

//vetor  vazio com 29 posi��es para ser populado com o c�digo e vetor booleano para identificar Genero do aluno.
		String codigos[] = new String[29];
		boolean masculinos[] = { false, true, true, true, false, true, true, true, true, true, true, true, true, true,
				true, false, false, true, false, true, true, false, false, false, true, true, true, false, true };

// estrutura de repeti��o para alimentar o vetor de c�digo.
		for (int x = 0; x < 29; x++) {
			codigos[x] = "A0" + (x + 1);
		}

// para mostra no console o c�digo e nome correspondente de cada aluno.
		System.out.println("COD \t NOME"); // CABE�ALHO
		System.out.println("------------------------------------------------------------------------------");
		for (int x = 0; x < 29; x++) {
			System.out.printf("%s \t %s\n", codigos[x], nomes[x]);

		}

//solicitando do usu�rio a quantidade de integrante que ele quer em cada grupo
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\nDigite o tamanho do grupo de 2 a 10 integrantes:");
		tamanho = leia.nextInt();

//Verificando se o valor digitado correponde ao intervalo solicitado		
		while (tamanho < 2 || tamanho > 10) {
			System.out.println("N�mero inv�lido!!");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Digite o tamanho do grupo de 2 a 10 integrantes:");
			System.out.println("------------------------------------------------------------------------------");
			tamanho = leia.nextInt();
		}
//imprimindo os dados de cada Aluno separando em grupos coma quantidade de componentes solicitada pelo usu�rio.
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("COD \t GRUPO \t NOME\n"); // CABE�ALHO
		for (int x = 0; x < 29; x++) {
			System.out.printf("%s \t %d \t %S\n", codigos[x], grupo, nomes[x]);

//esse if compara o resto da divi�o de "x+1",(que corresponde ao n�mero no c�digo do aluno),por tamanho.(que corresponde
//ao n�mero de integrantes por grupo) � igual ao zero, pois s� ser� zero quando o grupo estiver completo.
			if (((x + 1) % tamanho) == 0) {
				grupo++;
				System.out.println("------------------------------------------------------------------------------");
			}
		}

//Estrutura respons�vel por imprimir apenas os alunos do g�nero masculino e o total de homens no final.
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("LISTAGEM MASCULINOS:");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("COD \t GENERO \t\t NOME"); // CABE�ALHO
		System.out.println("------------------------------------------------------------------------------");
		int homens = 0;
		for (int x = 0; x < 29; x++) {
			if (masculinos[x]) {
				System.out.printf("%s \t M \t\t %s\n", codigos[x], nomes[x]);
				homens++;
			}
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Total de homens: " + homens);
		System.out.println("------------------------------------------------------------------------------");

//Estrutura respons�vel por imprimir apenas os alunos do g�nero feminino e o total de mulheres no final.
		System.out.println("LISTAGEM FEMININAS:");
		System.out.println("------------------------------------------------------------------------------");
		int mulheres = 0;
		System.out.println("COD \t GENERO \t\t NOME"); // CABE�ALHO
		for (int x = 0; x < 29; x++) {
			if (masculinos[x] == false) {
				System.out.printf("%s \t F \t\t %s\n", codigos[x], nomes[x]);
				mulheres++;
			}
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Total de mulheres " + mulheres);
		System.out.println("------------------------------------------------------------------------------");

	}
}