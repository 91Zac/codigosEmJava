package calculoCombustivel;

public class Multiplos {

	public static void main(String[] args) {
	
		 for(int n=27; n>1; n--){
		        if(n%3==0 && n%5==0){
		            System.out.println("FizzBuzz");
		        }
		        else if(n%3==0){
		            System.out.println("Fizz");
		        }
		         else if(n%5==0){
		            System.out.println("Buzz");
		        }
		        else{
		             System.out.println(n);
		        }
		        }
	}

}
