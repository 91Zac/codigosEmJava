package Aplicacao;

import java.util.Scanner;

import Entidades.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Empregado E1 = new Empregado();
		
		System.out.print("Entre com o valor do Salário Base ");
		E1.setSalarioBase(ler.nextDouble());
		System.out.print("Entre com a percentagem de imposto ");
		E1.setImposto(ler.nextDouble());
		
		System.out.println();
		System.out.print("O salário líquido é: "+E1.calcularSalario());

	}

}
