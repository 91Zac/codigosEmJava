package algoritimosParaDiversasSituacoes;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

//Converter Graus Célsius em fahrenheit,

	public static void main(String[] args) {

		double celsius, fahrenheit;
		Scanner leia = new Scanner(System.in);

		System.out.println("Insira os graus em celsius: ");
		celsius = leia.nextDouble();
		leia.close();
		fahrenheit = (celsius * 1.8) + 32;

		System.out.println("\nTemperatura em Graus Célsius: " + celsius + "°");
		System.out.println("Temperatura em fahrenheit: " + fahrenheit + "°");

	}
}
