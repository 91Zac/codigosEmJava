package algoritimosParaDiversasSituacoes;

public class MultiplicarVetorPorMatriz {

	/*
	 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3
	 * elementos. Em seguida o programa deve fazer a multiplicação do vetor pelas
	 * colunas da matriz.
	 * 
	 */

	public static void main(String[] args) {
		
//instanciando vetor e matriz
		int vetor[] = new int[3];
		int matriz[][] = new int[3][3];
		int linha = 0, coluna = 0;
		
		
		System.out.println("VETOR:");
		System.out.println("--------------------------------");
		
//populando aleatoreamente o array de três posições com números de 1 a 10.
		for (int i = 0; i < 3; i++) {
			vetor[i] = (int) ((Math.random() * 10) + 1);
			System.out.print("["+vetor[i] + "]"+"\t");
		}
		System.out.println("\n--------------------------------");
		System.out.println("\nMATRIZ:");
		System.out.println("--------------------------------");
		
//populando aleatoreamente a matriz 3X3 com números de 1 a 10.
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = (int) ((Math.random() * 10) + 1);
				System.out.print("["+matriz[linha][coluna]+"]" + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("--------------------------------");
		System.out.println("\nRESULTADO DA MULTIPLICACAO:");
		System.out.println("--------------------------------");
		
//usando estrutura for para multiplicar item a item do vetor com os da matriz e imprimí-los um a um entregando o resultado esperado.
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print("["+vetor[coluna] * matriz[linha][coluna] +"]"+ "\t");
			}
			System.out.print("\n");
		}
		System.out.println("--------------------------------");
	}

}
