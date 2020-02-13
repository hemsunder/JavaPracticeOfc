package JavaBasics;

public class NumberPermutations {
	
	public static int getCountdigits(int N){
		
		int count = 0;
		
		while(N>0){
			count++;
			N=N/10;
		}
		System.out.println(count);
		return count;
	}
	
	static void cyclic(int N) 
    { 
        int num = N; 
        int n = getCountdigits(N); 
  
        while (true) { 
            System.out.println(num);  
  
            // Following three lines generates a 
            // circular pirmutation of a number. 
            int rem = num % 10; 
            int dev = num / 10; 
            num = (int)((Math.pow(10, n - 1)) * 
                                rem + dev); 
  
            // If all the permutations are  
            // checked and we obtain original 
            // number exit from loop. 
            if (num == N)  
                break;  
        } 
    } 

	public static void main(String[] args) {
	
		/*int N=123456;
		cyclic(N);*/
		getcount();
		
		
	}

	
	public static void getcount(){
		String num = "1234";
		int count = 0;
		for(int i=0;i<num.length();i++){
			count++;
		}
		System.out.println(count);
	}
	
	
}
