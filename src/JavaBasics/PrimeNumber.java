package JavaBasics;

public class PrimeNumber {

	public static boolean isprimenumber(int N){
		
		if(N<2){
			return false;
		}
		
		for(int i=2;i<N;i++){
			if(N % i ==0){
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(isprimenumber(70));
		

	}

}
