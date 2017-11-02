package CVRBANK;
import java.util.Scanner;

public class FD extends BANK {
	
	public static void Customer_Details(){
		@SuppressWarnings("resource")
		Scanner cus=new Scanner(System.in);
		
		System.out.println("Login Id : ");
		String Customer_Login_Id = cus.nextLine();
		
		System.out.println("Enter Password : ");
		String Password = cus.nextLine();
		
		System.out.println("Customer Name : ");
		String Customer_Name= cus.nextLine(); 
		
		System.out.println("Acount Number : ");
		long Acount_Number= cus.nextLong();
		
		System.out.println(Acount_Number );
		int v=888655385;
		
		
		/*while(Acount_Number==v){
			System.out.println("skjsjjk");
			Fixed_deposit();
		}
		/*else{
			System.out.println("Login Fail, Invalid Password (or) Invalid Password please try again ");
		}*/
	}
	
	
	//formula A=p(1+R)^n
  
	public static void Fixed_deposit(){
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		
		double amount;
		System.out.print("Please Enter Your Principal : ");
		double principal=s.nextDouble();
		System.out.println();

		System.out.print("Please Enter The Rate Of Intrest % : ");
		double rate=s.nextDouble()/100;
		System.out.println();
		
		double termInt= principal*rate;
		System.out.print("Please Enter The Number Of Tearms (or) No.of Months : ");
		int TotalTearms=s.nextInt();
		System.out.println();
		
		double TotalIntrest= termInt*TotalTearms;
		
		amount = principal+TotalIntrest;
		
		System.out.println("Your Total Amount With Interest : "+ amount);
		
		System.out.println();
		
		for(int month=1; month<=TotalTearms;month++){
			
			amount = principal*Math.pow(1+rate, month);
			
			System.out.println("Total Amount With Intrest Upto Month "+ month+" : "+ amount);
			
			if (month>=TotalTearms){
				System.out.println("Your Total Amount With Compound Interest : "+amount);
			}
		}
		
		
	}
}
