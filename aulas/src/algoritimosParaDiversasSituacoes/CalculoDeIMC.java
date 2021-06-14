package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CalculoDeIMC {
	/*
	 * O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de
	 * Sa�de para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A
	 * f�rmula � IMC = peso / ( altura )2 Elabore um programa que leia o peso e a
	 * altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo. IMC
	 * em adultos Condi��o Abaixo de 18,5 Abaixo do peso Entre 18,5 e 25 Peso normal
	 * Entre 25 e 30 Acima do peso Acima de 30 obeso
	 * 
	 */

	public static void main(String[] args) {

//declarando vari�veis e instanciando teclado.
		Scanner read = new Scanner(System.in);
		double imc = 0, peso = 0, altura = 0;

//coletando dados necess�rios para o c�lculo do IMC.
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Qual o seu peso? ");
		peso = read.nextDouble();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Qual a sua altura? ");
		altura = read.nextDouble();
		System.out.println("--------------------------------------------------------------------------");

//fazendo o calculo do IMC efetivamente a partir de dados fornecidos acima.
		imc = peso / (altura * altura);

//estrutura condicional para determinar qual o grupo nutricional a pessoa se encontra.
		if (imc < 18.5) {
			System.out.printf("IMC = %.2f : Voc� est� abaixo do peso ", imc);
			System.out.println("\n--------------------------------------------------------------------------");
		} else if (imc < 25) {
			System.out.printf("IMC = %.2f : Voc� est� com o peso normal ", imc);
			System.out.println("\n--------------------------------------------------------------------------");
		} else if (imc < 30) {
			System.out.printf("IMC = %.2f : Voc� est� acima do peso ", imc);
			System.out.println("\n--------------------------------------------------------------------------");
		} else {
			System.out.printf("IMC = %.2f : Seu IMC indica Obesidade ", imc);
			System.out.println("\n--------------------------------------------------------------------------");
		}
		read.close();
	}

}
