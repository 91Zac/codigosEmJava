package Aplicacao;

import java.util.Scanner;

import Entidades.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Empregado E1 = new Empregado();
		
		System.out.print("Entre com o valor do Sal�rio Base ");
		E1.setSalarioBase(ler.nextDouble());
		System.out.print("Entre com a percentagem de imposto ");
		E1.setImposto(ler.nextDouble());
		
		System.out.println();
		System.out.print("O sal�rio l�quido �: "+E1.calcularSalario());

	}

}
