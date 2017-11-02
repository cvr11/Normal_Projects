package JavaBasics;

import java.util.Scanner;

public class Exaple1 {

		
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		System.out.println(" enter the value ");
		double a= scan.nextDouble();
		float b= scan.nextFloat();
		int c= scan.nextInt();
		
		System.out.println("printed values are as bellow ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
