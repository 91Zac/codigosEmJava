package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

/*Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
 * deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P 
 * (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel "e" (Excesso) e na vari�vel "m" o valor da multa 
 * que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.*/

public class CondicionalCalcExcessoPeso {

	public static void main(String[] args) {
//declarando vari�veis e instanciando teclado
		double p, m;
		String e;
		Scanner teclado = new Scanner(System.in);

//solicitando dado necess�rio para o c�lculo e atribuinda a variavel corrrespondente.
		System.out.println("Qual � o peso da carga? ");
		p = teclado.nextDouble();
		teclado.close();
		System.out.println("----------------------------------------------------------------------");

//verificando condi��o para cobran�a ou n�o de multa e calculando quando preciso e por fim imprimindo resultado em forma de String.
		if (p > 50) {
			e = "Excesso";
			m = 4 * (p - 50);
			System.out.println(e + " de peso," + " a multa ser� de " + m + " reais");
		} else {
			e = "0";
			m = 0;
			System.out.println(e + " de Excesso: " + " N�o haver� multa ou seja o valor dela ser�: " + m);
		}

	}

}
