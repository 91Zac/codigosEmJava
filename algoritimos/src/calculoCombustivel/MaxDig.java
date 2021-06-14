package calculoCombustivel;

public class MaxDig {

	public static void main(String[] args) {
		int maxDigit = 8;
		 int gerar[] = new int[4];
	        int valorMaximo = 21;
	        for(int i=3;i>=0;i--) {
	            if(valorMaximo>=maxDigit){
	                gerar[i]=maxDigit;
	                System.out.print(gerar[i]);
	                valorMaximo = valorMaximo - maxDigit;
	            }
	                else{
	                    gerar[i]=valorMaximo;
	                    System.out.print(gerar[i]);
	                }	
	        }

	}

}
