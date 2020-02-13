package JavaBasics;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		int radius;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius value: ");
		radius = scan.nextInt();
		
		double area=Math.PI*radius*radius;
		System.out.println(area);
	}

}
