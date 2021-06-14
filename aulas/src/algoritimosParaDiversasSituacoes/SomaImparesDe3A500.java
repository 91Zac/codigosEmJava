package algoritimosParaDiversasSituacoes;

public class SomaImparesDe3A500 {

	/*
	 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
	 * m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
	 */
	public static void main(String[] args) {
		int soma = 0;

//essa estrutura de repeti��o associada ao if far� todo o c�culo ness�rio desconsiderando os n�meros pares m�ltiplos de 3.
		for (int i = 3; i < 500; i += 3) {
			if (i % 2 == 1) {
				soma += i;
			}

		}
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("A soma dos n�meros �mpares m�ltiplos de 3 de 1 a 500 �: %d", soma);
		System.out.println("\n----------------------------------------------------------------------");

	}

}
