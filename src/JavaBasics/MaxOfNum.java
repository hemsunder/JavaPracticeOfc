package JavaBasics;

import java.util.Scanner;

public class MaxOfNum {

	/*public static void main(String[] args) {
		
		
		int a=10, b=15, c=20;
		
		if (a>b && a>c){
			System.out.println("a is greater value");
		}
		
		else if (b>a && b>c){
			System.out.println("b is greater value");
		}
		
		else
		{
			System.out.println("c is greater value");
		}

	}*/
	

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a value " );
		a=scan.nextInt();
		
		System.out.println("enter b value " );
		b=scan.nextInt();
		
		System.out.println("enter c value " );
		c=scan.nextInt();
		
		if (a>b && a>c){
			System.out.println("a is greater value");
		}
		
		else if (b>a && b>c){
			System.out.println("b is greater value");
		}
		
		else
		{
			System.out.println("c is greater value");
		}
		
		
		
	}
}
