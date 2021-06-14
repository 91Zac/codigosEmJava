package calculoCombustivel;

import java.util.Scanner;

public class CalcularCombustivel {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double precoGasolina = 5.00;
		double precoEtanol = 3.50;
		double totalLitrosGasolina;
		double totalLitrosEtanol;
		
		
		System.out.println("Quantos litros de Gasolina foram vendidos? ");
		totalLitrosGasolina = leia.nextDouble();
		
		System.out.println("Quantos litros de Etanol foram vendidos? ");
		totalLitrosEtanol = leia.nextDouble();
		
		System.out.println("No dia de hoje o posto faturou:\n" + ((totalLitrosGasolina*precoGasolina)+(totalLitrosEtanol*precoEtanol))+"Reais");
	}

}
