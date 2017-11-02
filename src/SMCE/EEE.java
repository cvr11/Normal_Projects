package SMCE;

import java.util.Scanner;

public class EEE extends SMCE_COLLEGE {

	int std_id;
	String std_name;
	String branch;
	
	public static void EEE_MARKS(){
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		System.out.println(" enter theLast 3 Digits of EEE_HALL_TICKET number ");
		i= scan.nextInt();
	if (i>300 && i<400)
		
		switch(i){	
case 300:
	System.out.println();
case 301:
	if(i==301){
	EEE ee1 = new EEE();
	ee1.std_id=301;
	ee1.std_name= "Ramireddy";
	ee1.branch= "eee";
	System.out.println("ID"+ "  "+"Branch"+ " "+"name");
	System.out.println(ee1.std_id+ " "+ee1.branch+ " "+ee1.std_name);
	}break;
case 302:
	EEE ee2 = new EEE();
	ee2.std_id=302;
	ee2.std_name= "Amar";
	ee2.branch= "eee";
	System.out.println(ee2.std_id+ " "+ee2.branch+ " "+ee2.std_name);
break;
case 303:
	EEE ee3 = new EEE();
	ee3.std_id=303;
	ee3.std_name= "Kiran";
	ee3.branch= "eee";
	System.out.println(ee3.std_id+ " "+ee3.branch+ " "+ee3.std_name);
break;
case 304:
	EEE ee4 = new EEE();
	ee4.std_id=304;
	ee4.std_name= "Srikanth";
	ee4.branch= "eee";
	System.out.println(ee4.std_id+ " "+ee4.branch+ " "+ee4.std_name);
break;

case 305:
	EEE ee5 = new EEE();
	ee5.std_id=305;
	ee5.std_name= "Manikanta";
	ee5.branch= "eee";
	System.out.println(ee5.std_id+ " "+ee5.branch+ " "+ee5.std_name);
break;
case 306:
	EEE ee6 = new EEE();
	ee6.std_id=306;
	ee6.std_name= "Ravi";
	ee6.branch= "eee";
	System.out.println(ee6.std_id+ " "+ee6.branch+ " "+ee6.std_name);
break;
case 307:
	EEE ee7 = new EEE();
	ee7.std_id=307;
	ee7.std_name= "Naresh";
	ee7.branch= "eee";
	System.out.println(ee7.std_id+ " "+ee7.branch+ " "+ee7.std_name);
break;
case 308:
	EEE ee8 = new EEE();
	ee8.std_id=308;
	ee8.std_name= "Subba";
	ee8.branch= "eee";
	System.out.println(ee8.std_id+ " "+ee8.branch+ " "+ee8.std_name);
break;
case 309:
	EEE ee9 = new EEE();
	ee9.std_id=309;
	ee9.std_name= "jhani";
	ee9.branch= "eee";
	System.out.println(ee9.std_id+ " "+ee9.branch+ " "+ee9.std_name);
break;
case 310:
	EEE ee10 = new EEE();
	ee10.std_id=310;
	ee10.std_name= "Reka";
	ee10.branch= "eee";
	System.out.println(ee10.std_id+ " "+ee10.branch+ " "+ee10.std_name);
break;
}
}}