package JavaBasics;
import java.util.Scanner;

public class AllBasicPrograms {

	
	public static void main(String[] args) {
	//int i=5;
	//double j=5;
	//System.out.println(i);
	@SuppressWarnings("resource")
	Scanner j= new Scanner (System.in);
	System.out.println(" enter the j value "+j);
	int a= j.nextInt();
	System.out.println("a=" +a);
	double i= j.nextDouble();
	System.out.println("i=" +i);
	
	switch(a){
	case 0:
		System.out.println("The value of a is "+ a);
		if(a>=i||a>=0){
			System.out.println("a is a positive value ");
		for (i=0;i<5;i++){
			System.out.println("the value of i is "+i);
			i++;
		}
			
		}else{
			System.out.println("the value a is negative"); 
		}
			
	
	}

	}

}
