package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class MediaPonderada {

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
 *Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */

	public static void main(String[] args) {

//declarando variáveis e instanciando teclado de entrada de dados
		double nota1, nota2, nota3, mediaFinal;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		Scanner leia = new Scanner(System.in);
		
//coletando dados a serem atribuídos às respecitivas variáveis e convertendo-os de acordo com o tipo desta.
		System.out.println("Entre com a primeira nota ");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota ");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota ");
		nota3 = leia.nextDouble();
		leia.close();
		
//calculando a média ponderada de acordo com o que foi proposto e apresentando o resultado concatenado com a String informativa.
		mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		System.out.println("A média do aluno é: " + mediaFinal);
	}

}
