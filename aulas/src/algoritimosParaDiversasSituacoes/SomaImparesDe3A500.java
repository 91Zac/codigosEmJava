package algoritimosParaDiversasSituacoes;

public class SomaImparesDe3A500 {

	/*
	 * Desenvolver um sistema que efetue a soma de todos os números ímpares que são
	 * múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	 */
	public static void main(String[] args) {
		int soma = 0;

//essa estrutura de repetição associada ao if fará todo o cáculo nessário desconsiderando os números pares múltiplos de 3.
		for (int i = 3; i < 500; i += 3) {
			if (i % 2 == 1) {
				soma += i;
			}

		}
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("A soma dos números ímpares múltiplos de 3 de 1 a 500 é: %d", soma);
		System.out.println("\n----------------------------------------------------------------------");

	}

}
