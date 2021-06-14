package calculoCombustivel;

public class CalcularDesconto {

	public static void main(String[] args) {
		double precoGasolina=5;
		double quantidadeComprada = 20;
		double desconto;
		double valorCobrado;
		
		if(quantidadeComprada<=20) {
			desconto = 0.04;
			valorCobrado = (quantidadeComprada*precoGasolina)-(desconto*precoGasolina*quantidadeComprada);
			System.out.println("Desconto de 4%, valor a ser pago\n" + valorCobrado+" Reais");
		}else if(quantidadeComprada>20) {
			desconto = 0.06;
			valorCobrado = (quantidadeComprada*precoGasolina)-(desconto*precoGasolina*quantidadeComprada);
			System.out.println("\"Desconto de 6%, valor a ser pagon" + valorCobrado+" Reais");
		}else {
			System.out.println("Quantidade Menor que 20 litros não tem desconto");
		}
	}

}
