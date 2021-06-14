package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class RaizEDistanciaEntreDoisPontos {
	
/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
 *  P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
 *  d = raiz de ((X2-X1) ao quadrado) somado a ((y2-y1) ao quadrado)*/

	public static void main(String[] args) {
		
//instanciando teclado para entrada de dados e declarando variáveis.
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d;

		System.out.println("Entre com o valor de X1 ");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valor de X2 ");
		x2 = leia.nextDouble();
		System.out.println("Entre com o valor de Y1 ");
		y1 = leia.nextDouble();
		System.out.println("Entre com o valor de y2 ");
		y2 = leia.nextDouble();
		leia.close();

//montando fórmula em JAVA usando classe nativa para calculos mais complexos.
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		
//imprimindo String concatenada com valor final da distancia dos dois pontos de acordo com aformula fornecida.
		System.out.println("A distacia entre os dois pontos é: " + d);
	}
}
