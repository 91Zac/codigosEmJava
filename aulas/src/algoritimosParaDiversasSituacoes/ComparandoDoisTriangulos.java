package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ComparandoDoisTriangulos {
	
	/*Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
	 * (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo. 
	 * Em seguida solicite base e altura de um segundo triangulo e diga qual dos dois triangulos � o maior*/

	public static void main(String[] args) {
		
// Decla��o de vari�veis
		double base1, altura1, base2=0,altura2=0;
		double area1 =0,area2 = 0;
		Scanner leia = new Scanner(System.in);
	
//solicitando dados do primeiro tri�ngulo
		System.out.println("Entre com o valor da base do primeiro tri�ngulo ");
		base1 = leia.nextInt();
		System.out.println("Entre com o valor da altura do primeiro tri�ngulo ");
		altura1 = leia.nextInt();
		System.out.println("----------------------------------------------------------------------");

//validando dados informados e calculando a �rea do primeiro tri�ngulo.
		if (base1 > 0 && altura1 > 0) {
			area1 = ((base1 * altura1) / 2);
			System.out.println("A �rea desse tri�ngulo � " + area1 + ".");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Entre com um valor v�lido.");
		}

//solicitando dados do segundo tri�ngulo
		System.out.println("Entre com o valor da base do segundo tri�ngulo ");
		base2 = leia.nextInt();
		System.out.println("Entre com o valor da altura do segundo tri�ngulo ");
		altura2 = leia.nextInt();
		System.out.println("----------------------------------------------------------------------");

//validando dados informados e calculando a �rea do segundo tri�ngulo.
		if (base2 > 0 && altura2 > 0) {
			area2 = ((base2 * altura2) / 2);
			System.out.println("A �rea desse tri�ngulo � " + area2 + ".");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Entre com um valor v�lido.\n");
		}
		
//informanda a �rea de cada um dos dois tria�ngulos e revelando qual dos dois � o maior.
		System.out.println("A �rea do primeiro tri�ngulo � " + area1 + ".");
		System.out.println("A �rea do segundo tri�ngulo � " + area2 + ".");
		System.out.println("----------------------------------------------------------------------");
		if(area1>area2) {
			System.out.println("O primeiro tri�ngulo � maior. ");
		}
		else if(area1<area2){
			System.out.println("O segundo tri�ngulo � maior. ");
		}
		else {
			System.out.println("Os dois tri�ngulos tem o mesmo tamanho. ");
		}
		System.out.println("----------------------------------------------------------------------");
	}

}
