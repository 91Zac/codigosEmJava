
/* 1. Faça um sistema que leia a idade de uma pessoa expressa em 
 * anos, meses e dias e mostre-a expressa apenas em dias. 

 *Primeiro código Deenvolvido:
 * 
 * int anos, meses, dias, totalEmDias; Scanner leia = new Scanner(System.in);
 * System.out.println("Quantos anos? "); anos = leia.nextInt();
 * System.out.println("Quantos meses? "); meses = leia.nextInt();
 * System.out.println("Quantos dias? "); dias = leia.nextInt(); leia.close();
 * totalEmDias = ((anos * 365) + (meses * 30) + dias);
 * System.out.println("O total em dias é: " + totalEmDias + " dias.");*/

package algoritimosParaDiversasSituacoes;
import java.util.Calendar;
import java.util.Scanner;

public class CalcularDiasVividosPorDataNasc {
//código desenvolvido considerando uma data de nascimento para fazer o cálculo
	public static void main(String[] args) {
		
//instanciando calendário e teclado
		Calendar cal = Calendar.getInstance();
		Scanner read = new Scanner(System.in);
		
//declarando váriáveis e atribuindo valor a algumas delas
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		int anoAtual = cal.get(Calendar.YEAR);
		int dn[] = new int[3], totalEmDias, totalDiasMeses, dias = 0;
		
//solicitando informações do usuário para tornar possível oter o resultado soliciado
		System.out.println("Informe dia de Nascimento ");
		dn[0] = read.nextInt();
		System.out.println("informe mes de Nascimento? ");
		dn[1] = read.nextInt();
		System.out.println("informe ano de Nascimento? ");
		dn[2] = read.nextInt();
		
//usando condicionais para definir qual calculo usar para obter o resultado correto
		if (mesAtual > dn[1]) {
			totalDiasMeses = (mesAtual - dn[1]) * 30;
			//Essse if verifica se a data inserida possui um mes que já passsou do mês atual,
			//ou seja se o usuário já pode ter completado aniversário no ano atual.	
			
			if (dn[0] > diaAtual) {
				dias = 30 - (dn[0] - diaAtual);
			} else {
				dias = diaAtual - dn[0];
// esses if e else presentes aqui verificam se o dia de nascimento é maior ou menor que o dia na
//data atual para poder calcular corretamente os dias passados.
			}
			
			totalDiasMeses = (mesAtual - dn[1]) * 30;
			totalEmDias = (((anoAtual - dn[2]) * 365) + totalDiasMeses + dias);
			System.out.println("-----------------------------------------------------------");
			System.out.println("O total de dias vividos até hoje é: " + totalEmDias);
			read.close();
//Aqui é dada a resposta ao usuário caso a data digitada se enquadre nessa primeira condição
			
		} else if (mesAtual == dn[1]) {
//Essse else if verifica se a data inserida possui o mesmo mes que o mês atual,
//ou seja se o usuário completa ou completou aniversário no mês atual.
			
			if (dn[0] <= diaAtual) {
				totalDiasMeses = 0;
				dias = diaAtual - dn[0];
				totalDiasMeses = (mesAtual - dn[1]) * 30;
				totalEmDias = (((anoAtual - dn[2]) * 365) + totalDiasMeses + dias);
				System.out.println("-----------------------------------------------------------");
				System.out.println("O total de dias vividos até hoje é: " + totalEmDias);
				read.close();
			} else {
				totalDiasMeses = 11 * 30;
				dias = 30 - (dn[0] - diaAtual);
				totalEmDias = (((anoAtual - dn[2] - 1) * 365) + totalDiasMeses + dias);
				System.out.println("O total de dias vividos até hoje é: " + totalEmDias);
				read.close();
// A estrutura if e else acima verifica se o dia atual é igual ou não ao da data 
//digitada para poder calcular a quantidade de dias exata em cada situação e no final
//é dada a resposta ao usuário caso a data digitada se enquadre nessa estrutura condicional.
			}
			
		} else {
//No else só entra na última condição que é caso a data de nascimento corresponda  a algúem
// que ainda não completou aniversário e não completará no mes atual.
			
			if (dn[0] >= diaAtual) {
				totalDiasMeses = (mesAtual - dn[1] + 11) * 30;
				dias = 30 - (dn[0] - diaAtual);
			} else {
				totalDiasMeses = (mesAtual - dn[1] + 1) * 30;
				dias = diaAtual - dn[0];
			}
// esses if e else presentes aqui verificam se o dia de nascimento é maior ou menor que o dia na
//data atual para poder calcular corretamente os dias passados.
			
			totalEmDias = (((anoAtual - dn[2] - 1) * 365) + totalDiasMeses + dias);
			System.out.println("-----------------------------------------------------------");
			System.out.println("O total de dias vividos até hoje é: " + totalEmDias);
//Aqui é dada a resposta ao usuário caso a data digitada se enquadre nessa última condição
			read.close();
		}
	}

}