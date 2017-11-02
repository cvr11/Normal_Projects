package SMCE;

import java.util.Scanner;


//import org.omg.Messaging.SyncScopeHelper;

public class SMCE_COLLEGE {
	
	public static int i;
	public static String std_name;
	public static int std_id;
	public static String branch;
	
		
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		System.out.println(" Enter the Last 3 Digits of BRANCH CODE ");
		i= scan.nextInt();
	if (i>200 && i<600)
	{
		System.out.println();	
	    if(i>400 && i<500){
	    	ECE.ECE_MARKS();
	    	System.out.println( );
		}else if(i>500 && i<600){
			CSE.CSE_MARKS();
			System.out.println();
		}else if (i>300 && i<400){
		EEE.EEE_MARKS();
		System.out.println();
		}else if(i>200 && i<300){
		MECH.MECH_MARKS();
	    System.out.println();
		}else 
		{
			System.out.println("INALID BRANCH CODE, PLEASE CHECK AND TRY AGAIN");
		}
	}else
	{
	System.out.println("INVALID BRANCH CODE, PLEASE CHECK AND TRY AGAIN");	
	}
	}

}
