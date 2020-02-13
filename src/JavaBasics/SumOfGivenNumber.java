package JavaBasics;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		
		int sum=0;
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		num=scan.nextInt();
		
		while(num>=0){
			int lastnum = num%10; //1	//2	//5
			num = num/10;	//52	//5	//0
			sum = sum+lastnum;	//1	//3	//8
			
		}

		System.out.println(sum);
	}

}
