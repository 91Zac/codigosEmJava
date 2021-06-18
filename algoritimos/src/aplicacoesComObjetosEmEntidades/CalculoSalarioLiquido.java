package aplicacoesComObjetosEmEntidades;

import java.util.Scanner;

import Entidades.Empregado;

public class CalculoSalarioLiquido {

	public static void main(String[] args) {
		/*
		 * Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que
		 * cada instância da classe Empregado tem, para além dos atributos que
		 * caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase
		 * (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a
		 * classe Empregado com métodos seletores e modificadores e um método
		 * calcularSalario. Escreva um programa de teste adequado para a classe
		 * Empregado.
		 */
		Scanner read = new Scanner(System.in);
		Empregado E1 = new Empregado();

		System.out.print("Entre com o valor do Salário Base ");
		E1.setSalarioBase(read.nextDouble());
		System.out.print("Entre com a percentagem de imposto ");
		E1.setImposto(read.nextDouble());

		System.out.println();
		System.out.print("O salário líquido é: " + E1.calcularSalario());

	}

}
