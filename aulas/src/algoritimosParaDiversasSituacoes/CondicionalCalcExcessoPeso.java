package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P 
 * (peso de tomates) e verifique se há excesso. Se houver, gravar na variável "e" (Excesso) e na variável "m" o valor da multa 
 * que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

public class CondicionalCalcExcessoPeso {

	public static void main(String[] args) {
//declarando variáveis e instanciando teclado
		double p, m;
		String e;
		Scanner teclado = new Scanner(System.in);

//solicitando dado necessário para o cálculo e atribuinda a variavel corrrespondente.
		System.out.println("Qual é o peso da carga? ");
		p = teclado.nextDouble();
		teclado.close();
		System.out.println("----------------------------------------------------------------------");

//verificando condição para cobrança ou não de multa e calculando quando preciso e por fim imprimindo resultado em forma de String.
		if (p > 50) {
			e = "Excesso";
			m = 4 * (p - 50);
			System.out.println(e + " de peso," + " a multa será de " + m + " reais");
		} else {
			e = "0";
			m = 0;
			System.out.println(e + " de Excesso: " + " Não haverá multa ou seja o valor dela será: " + m);
		}

	}

}
