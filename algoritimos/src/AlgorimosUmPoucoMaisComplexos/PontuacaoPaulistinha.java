package AlgorimosUmPoucoMaisComplexos;

import java.util.Scanner;

public class PontuacaoPaulistinha {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int linha=0, coluna=0, rodadas;
		int x=0;
		char opcao;
		
		System.out.println("Quantas rodadas terá o campeonato? ");
		rodadas = leia.nextInt();
		String times[] = {"CORINTHIANS ", "PALMEIRAS ", "SANTOS ", "SÃO PAULO"};
		int pontos[][] = new int[4][rodadas], total[]=new int [4]; 
		
		System.out.println("NOME DOS TIMES PARTICIPANTES: ");
		System.out.println("------------------------------------------------");
		for (x=0; x<4; x++)
		{
			System.out.println(times[x]);
		}
		System.out.println("------------------------------------------------");
		
		for(coluna=0; coluna<rodadas; coluna++) //tratar a coluna da matriz
		{
			
			System.out.println("RODADA "+(coluna+1)+":\n");
			
			for (linha=0; linha<4; linha++)  //trantando a linha
			{
				System.out.print(times[linha]);
				System.out.print(" G-ganhou, E-empatou ou P-perdeu: ");
				opcao = leia.next().toUpperCase().charAt(0);
				System.out.println("------------------------------------------------");
				if (opcao=='G') {
					pontos[linha][coluna] = 3;
					total[linha] = total[linha]+pontos[linha][coluna];
				} else if (opcao=='E') {
					pontos[linha][coluna] = 1;
					total[linha] = total[linha]+pontos[linha][coluna];
				} else if (opcao=='P') {
					pontos[linha][coluna] = 0;
					total[linha] = total[linha]+pontos[linha][coluna];
				} else {
					System.out.println("Valor inválido, Digite Novamente:");
					linha--;
				}
				
			}
		}
		System.out.println("RESULTADO FINAL: \n");
		for(coluna=0; coluna<4; coluna++) //tratar a coluna da matriz
		{
			System.out.print(times[coluna]+"|\t");
		}
		System.out.println();
		for(coluna=0; coluna<4; coluna++) //tratar a coluna da matriz
		{
			System.out.print(total[coluna]+"\t\t");
		}
		
		
	}
}