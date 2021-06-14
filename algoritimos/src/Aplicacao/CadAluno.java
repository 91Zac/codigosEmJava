package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class CadAluno {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	String nome;
	int matricula;
	System.out.println("Escreva o nome do aluno:");
	nome = leia.next();
	System.out.println("Escreva a matrícula:");
	matricula = leia.nextInt();
	
	
	Aluno aluno1 = new Aluno(1587,"Paulo Roberto");
	System.out.println("Digite o gênero:");
	aluno1.setGenero(leia.next().toUpperCase().charAt(0));
	aluno1.obterGenero();
	System.out.println(aluno1.getGenero());
	System.out.println("Digite o ano de nascimento:");
	aluno1.setAnoNascimento(leia.nextInt());
	aluno1.idade();
	System.out.printf("Bem-vindo %s %s! ",
			aluno1.obterGenero(), aluno1.getNome());
	
	if (aluno1.idade() < 13) {
		System.out.println("Você está matriculado no ensino fundamental");
	} else if (aluno1.idade(0) >= 13 && aluno1.idade() <= 17) {
		System.out.println("Você está matriculado no ensino médio");
	} else if (aluno1.idade() > 17) {
		System.out.println("Você está matriculado no ensino superior");
	}
	}
}
