package JavaBasics;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		num = scan.nextInt();
		
		if(num%2==0){
			System.out.println("The entered number is a even number");
		}

		else {
			System.out.println("Entered number is odd number");
		}
	}

}
