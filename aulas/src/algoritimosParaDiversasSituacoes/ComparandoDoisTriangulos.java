package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ComparandoDoisTriangulos {
	
	/*Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo. 
	 * Em seguida solicite base e altura de um segundo triangulo e diga qual dos dois triangulos é o maior*/

	public static void main(String[] args) {
		
// Declação de variáveis
		double base1, altura1, base2=0,altura2=0;
		double area1 =0,area2 = 0;
		Scanner leia = new Scanner(System.in);
	
//solicitando dados do primeiro triângulo
		System.out.println("Entre com o valor da base do primeiro triângulo ");
		base1 = leia.nextInt();
		System.out.println("Entre com o valor da altura do primeiro triângulo ");
		altura1 = leia.nextInt();
		System.out.println("----------------------------------------------------------------------");

//validando dados informados e calculando a área do primeiro triângulo.
		if (base1 > 0 && altura1 > 0) {
			area1 = ((base1 * altura1) / 2);
			System.out.println("A área desse triângulo é " + area1 + ".");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Entre com um valor válido.");
		}

//solicitando dados do segundo triângulo
		System.out.println("Entre com o valor da base do segundo triângulo ");
		base2 = leia.nextInt();
		System.out.println("Entre com o valor da altura do segundo triângulo ");
		altura2 = leia.nextInt();
		System.out.println("----------------------------------------------------------------------");

//validando dados informados e calculando a área do segundo triângulo.
		if (base2 > 0 && altura2 > 0) {
			area2 = ((base2 * altura2) / 2);
			System.out.println("A área desse triângulo é " + area2 + ".");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Entre com um valor válido.\n");
		}
		
//informanda a área de cada um dos dois triaângulos e revelando qual dos dois é o maior.
		System.out.println("A área do primeiro triângulo é " + area1 + ".");
		System.out.println("A área do segundo triângulo é " + area2 + ".");
		System.out.println("----------------------------------------------------------------------");
		if(area1>area2) {
			System.out.println("O primeiro triângulo é maior. ");
		}
		else if(area1<area2){
			System.out.println("O segundo triângulo é maior. ");
		}
		else {
			System.out.println("Os dois triângulos tem o mesmo tamanho. ");
		}
		System.out.println("----------------------------------------------------------------------");
	}

}
