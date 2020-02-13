package JavaBasics;

import java.util.Scanner;

public class SumUpto_n_Numbers {

	public static void main(String[] args) {
		
		int n;
		int temp=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the final number");
		n=scan.nextInt();
		
		for(int i=0;i<=n;i++){
			temp=temp+i;
			
		}

		System.out.println("Sum up to "+n+"is"+temp);
	}

}
