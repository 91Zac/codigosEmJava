package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CalcularSalario {

	/*
	 * Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e
	 * n�mero de horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se
	 * que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50
	 * calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio
	 * zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do
	 * processamento imprimir o sal�rio total e o sal�rio excedente.
	 */

	public static void main(String[] args) {
//declarando vari�veis
		double n, e, salarioTotal;
		int horaDeReferncia = 50;
		Scanner teclado = new Scanner(System.in);

//solicitando informa��o e atribuinda � variavel
		System.out.println("Qual foi o n�mero de horas trabalhadas? ");
		System.out.println("----------------------------------------------------------------------");
		n = teclado.nextDouble();
		teclado.close();
		System.out.println("----------------------------------------------------------------------");

//comparando valor de vari�veis para definir se houve horas excedentes e fazendo c�lculo em caso positivo.
		if (n > horaDeReferncia) {
			e = n - horaDeReferncia;
			salarioTotal = (horaDeReferncia * 10) + (e * 20);
			System.out.println(
					"O salario total � " + salarioTotal + " reais e excedente foi de " + (e * 20) + " reais.");
		}

//fazendo calculo caso o valor informado n�o se enquadre na primeira condi��o.
		else {
			salarioTotal = (n * 10);
			System.out.println("O salario total � " + salarioTotal + " reais e n�o teve sal�rio excedente");
		}
		System.out.println("----------------------------------------------------------------------");

	}

}
