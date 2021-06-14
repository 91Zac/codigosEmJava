package AlgorimosUmPoucoMaisComplexos;

import java.util.Scanner;

public class MontandoGruposDeAlunos {

	/*
	 * Elaborar progra que possua o nome de todos os alunos da turma assim como
	 * dados de genero e o código do aluno. Depois faça com que o programa liste o
	 * nome de cada um com seu respectivo código e pergunte ao usuário o tamanho dos
	 * grupos que ele deseja dividir a turma. Com essa informação o programa deve
	 * imprimir os grupos e também a quantidade de homens e de mulheres que há nessa
	 * tuma.
	 */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

// Variáveis simples e vetor Composto do nome de todos o alunos:
		int tamanho = 0;
		int grupo = 1;
		String nomes[] = { "Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos",
				"Daniel Ferreira", "Dayane de Oliveira", "Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva ",
				"Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex",
				"Guilherme Fidelis Pereira", "Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira",
				"Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane", "Joao Pedro Sena",
				"Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves",
				"Mariana  de Cássia Antunes Oliveira", "Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes",
				"RICARDO MAGALHAES FINKELSTEIN", "Thiago dos Anjos", "Vitória Gonçalves de Freitas", "William Xavier" };

//vetor  vazio com 29 posições para ser populado com o código e vetor booleano para identificar Genero do aluno.
		String codigos[] = new String[29];
		boolean masculinos[] = { false, true, true, true, false, true, true, true, true, true, true, true, true, true,
				true, false, false, true, false, true, true, false, false, false, true, true, true, false, true };

// estrutura de repetição para alimentar o vetor de código.
		for (int x = 0; x < 29; x++) {
			codigos[x] = "A0" + (x + 1);
		}

// para mostra no console o código e nome correspondente de cada aluno.
		System.out.println("COD \t NOME"); // CABEÇALHO
		System.out.println("------------------------------------------------------------------------------");
		for (int x = 0; x < 29; x++) {
			System.out.printf("%s \t %s\n", codigos[x], nomes[x]);

		}

//solicitando do usuário a quantidade de integrante que ele quer em cada grupo
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\nDigite o tamanho do grupo de 2 a 10 integrantes:");
		tamanho = leia.nextInt();

//Verificando se o valor digitado correponde ao intervalo solicitado		
		while (tamanho < 2 || tamanho > 10) {
			System.out.println("Número inválido!!");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Digite o tamanho do grupo de 2 a 10 integrantes:");
			System.out.println("------------------------------------------------------------------------------");
			tamanho = leia.nextInt();
		}
//imprimindo os dados de cada Aluno separando em grupos coma quantidade de componentes solicitada pelo usuário.
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("COD \t GRUPO \t NOME\n"); // CABEÇALHO
		for (int x = 0; x < 29; x++) {
			System.out.printf("%s \t %d \t %S\n", codigos[x], grupo, nomes[x]);

//esse if compara o resto da divião de "x+1",(que corresponde ao número no código do aluno),por tamanho.(que corresponde
//ao número de integrantes por grupo) é igual ao zero, pois só será zero quando o grupo estiver completo.
			if (((x + 1) % tamanho) == 0) {
				grupo++;
				System.out.println("------------------------------------------------------------------------------");
			}
		}

//Estrutura responsável por imprimir apenas os alunos do gênero masculino e o total de homens no final.
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("LISTAGEM MASCULINOS:");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("COD \t GENERO \t\t NOME"); // CABEÇALHO
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

//Estrutura responsável por imprimir apenas os alunos do gênero feminino e o total de mulheres no final.
		System.out.println("LISTAGEM FEMININAS:");
		System.out.println("------------------------------------------------------------------------------");
		int mulheres = 0;
		System.out.println("COD \t GENERO \t\t NOME"); // CABEÇALHO
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