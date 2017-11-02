package SMCE;

import java.util.Scanner;

public class CSE extends SMCE_COLLEGE {

	int std_id;
	String std_name;
	String branch;
	
	public static void CSE_MARKS(){
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		System.out.println(" enter theLast 3 Digits of CSE_HALL_TICKET number ");
		int i= scan.nextInt();
	if (i>500 && i<600){
		System.out.println();
		
		switch(i){	
case 500:
	System.out.println();
case 501:
	if(i==501){
	CSE c1 = new CSE();
	c1.std_id=501;
	c1.std_name= "Raja";
	c1.branch= "cse";
	System.out.println("ID"+ "  "+"Branch"+ " "+"name");
	System.out.println(c1.std_id+ " "+c1.branch+ " "+c1.std_name);
	}break;

case 502:
	CSE c2 = new CSE();
	c2.std_id=502;
	c2.std_name= "Manoj";
	c2.branch= "cse";
	System.out.println(c2.std_id+ " "+c2.branch+ " "+c2.std_name);
break;

case 503:
	CSE c3 = new CSE();
	c3.std_id=503;
	c3.std_name= "Manasa";
	c3.branch= "cse";
	System.out.println(c3.std_id+ " "+c3.branch+ " "+c3.std_name);
break;

case 504:
	CSE c4 = new CSE();
	c4.std_id=504;
	c4.std_name= "Anusha";
	c4.branch= "cse";
	System.out.println(c4.std_id+ " "+c4.branch+ " "+c4.std_name);
break;

case 505:
	CSE c5 = new CSE();
	c5.std_id=505;
	c5.std_name= "Jyothi";
	c5.branch= "cse";
	System.out.println(c5.std_id+ " "+c5.branch+ " "+c5.std_name);
break;

case 506:
	CSE c6 = new CSE();
	c6.std_id=506;
	c6.std_name= "Navya";
	c6.branch= "cse";
	System.out.println(c6.std_id+ " "+c6.branch+ " "+c6.std_name);
break;

case 507:
	CSE c7 = new CSE();
	c7.std_id=507;
	c7.std_name= "Kalyani";
	c7.branch= "cse";
	System.out.println(c7.std_id+ " "+c7.branch+ " "+c7.std_name);
break;
case 508:
	CSE c8 = new CSE();
	c8.std_id=508;
	c8.std_name= "Bindhu";
	c8.branch= "cse";
	System.out.println(c8.std_id+ " "+c8.branch+ " "+c8.std_name);
break;
case 509:
	CSE c9 = new CSE();
	c9.std_id=509;
	c9.std_name= "Gouthami";
	c9.branch= "cse";
	System.out.println(c9.std_id+ " "+c9.branch+ " "+c9.std_name);
break;

case 510:
	CSE c10 = new CSE();
	c10.std_id=510;
	c10.std_name= "kejiya";
	c10.branch= "cse";
	System.out.println(c10.std_id+ " "+c10.branch+ " "+c10.std_name);
break;

case 511:
	CSE c11 = new CSE();
	c11.std_id=511;
	c11.std_name= "Anjali";
	c11.branch= "cse";
	System.out.println(c11.std_id+ " "+c11.branch+ " "+c11.std_name);
break;

case 512:
	CSE c12 = new CSE();
	c12.std_id=512;
	c12.std_name= "Gayatri";
	c12.branch= "cse";
	System.out.println(c12.std_id+ " "+c12.branch+ " "+c12.std_name);
	break;
	
case 513:
	CSE c13 = new CSE();
	c13.std_id=513;
	c13.std_name= "Chaitanya";
	c13.branch= "cse";
	System.out.println(c13.std_id+ " "+c13.branch+ " "+c13.std_name);
	break;
case 514:
	CSE c14 = new CSE();
	c14.std_id=514;
	c14.std_name= "Harish";
	c14.branch= "cse";
	System.out.println(c14.std_id+ " "+c14.branch+ " "+c14.std_name);
	break;
	
}
}else
{
	System.out.println(" THISA IS NOT A CSE HALL TICKET, PLEASE CHECK AND TRY AGAIN ");
	}
}
}
