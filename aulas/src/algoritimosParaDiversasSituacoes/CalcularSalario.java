package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CalcularSalario {

	/*
	 * Elabore um sistema que leia as variáveis C e N, respectivamente código e
	 * número de horas trabalhadas de um operário. E calcule o salário sabendo-se
	 * que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50
	 * calcule o excesso de pagamento armazenando-o na variável E, caso contrário
	 * zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do
	 * processamento imprimir o salário total e o salário excedente.
	 */

	public static void main(String[] args) {
//declarando variáveis
		double n, e, salarioTotal;
		int horaDeReferncia = 50;
		Scanner teclado = new Scanner(System.in);

//solicitando informação e atribuinda à variavel
		System.out.println("Qual foi o número de horas trabalhadas? ");
		System.out.println("----------------------------------------------------------------------");
		n = teclado.nextDouble();
		teclado.close();
		System.out.println("----------------------------------------------------------------------");

//comparando valor de variáveis para definir se houve horas excedentes e fazendo cálculo em caso positivo.
		if (n > horaDeReferncia) {
			e = n - horaDeReferncia;
			salarioTotal = (horaDeReferncia * 10) + (e * 20);
			System.out.println(
					"O salario total é " + salarioTotal + " reais e excedente foi de " + (e * 20) + " reais.");
		}

//fazendo calculo caso o valor informado não se enquadre na primeira condição.
		else {
			salarioTotal = (n * 10);
			System.out.println("O salario total é " + salarioTotal + " reais e não teve salário excedente");
		}
		System.out.println("----------------------------------------------------------------------");

	}

}
