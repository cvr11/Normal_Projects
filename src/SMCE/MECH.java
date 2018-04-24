package SMCE;

import java.util.Scanner;

public class MECH extends SMCE_COLLEGE 
{
	
	int std_id; // Local variable
	String std_name;
	String branch;
	
	public static void MECH_MARKS(){
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		System.out.println(" enter theLast 3 Digits of HALL_TICKET number ");
		i= scan.nextInt();
	if (i>200 && i<300){	
		switch(i){	
case 200:
	System.out.println();
case 201:
	if (i==201){MECH M1 = new MECH();
	M1.std_id=201;
	M1.std_name= "Gyatri";
	M1.branch= "Mech";
	System.out.println(M1.std_id+ " "+M1.branch+ " "+M1.std_name);
	}break;
case 202:
	MECH M2 = new MECH();
	M2.std_id=202;
	M2.std_name= "Shekar";
	M2.branch= "Mech";
	System.out.println(M2.std_id+ " "+M2.branch+ " "+M2.std_name);
break;
case 203:
	MECH M3 = new MECH();
	M3.std_id=203;
	M3.std_name= "Rajesh";
	M3.branch= "Mech";
	System.out.println(M3.std_id+ " "+M3.branch+ " "+M3.std_name);
break;
case 204:
	MECH M4 = new MECH();
	M4.std_id=204;
	M4.std_name= "Katya";
	M4.branch= "Mech";
	System.out.println(M4.std_id+ " "+M4.branch+ " "+M4.std_name);
break;
case 205:
	MECH M5 = new MECH();
	M5.std_id=205;
	M5.std_name= "Venkatesh";
	M5.branch= "Mech";
	System.out.println(M5.std_id+ " "+M5.branch+ " "+M5.std_name);
break;
case 206:
	MECH M6 = new MECH();
	M6.std_id=206;
	M6.std_name= "Philips";
	M6.branch= "Mech";
	System.out.println(M6.std_id+ " "+M6.branch+ " "+M6.std_name);
break;
case 207:
	MECH M7 = new MECH();
	M7.std_id=207;
	M7.std_name= "Keerthi";
	M7.branch= "Mech";
	System.out.println(M7.std_id+ " "+M7.branch+ " "+M7.std_name);
break;
case 208:
	MECH M8 = new MECH();
	M8.std_id=208;
	M8.std_name= "Chaithanya";
	M8.branch= "Mech";
	System.out.println(M8.std_id+ " "+M8.branch+ " "+M8.std_name);
break;
case 209:
	MECH M9 = new MECH();
	M9.std_id=209;
	M9.std_name= "Teja";
	M9.branch= "Mech";
	System.out.println(M9.std_id+ " "+M9.branch+ " "+M9.std_name);
break;
case 210:
	MECH M10 = new MECH();
	M10.std_id=210;
	M10.std_name= "Bhaskar";
	M10.branch= "Mech";
	System.out.println(M10.std_id+ " "+M10.branch+ " "+M10.std_name);
break;
case 211:
	MECH M11 = new MECH();
	M11.std_id=211;
	M11.std_name= "Chandra";
	M11.branch= "Mech";
	System.out.println(M11.std_id+ " "+M11.branch+ " "+M11.std_name);
break;
case 212:
	MECH M12 = new MECH();
	M12.std_id=212;
	M12.std_name= "Suresh";
	M12.branch= "Mech";
	System.out.println(M12.std_id+ " "+M12.branch+ " "+M12.std_name);
break;
case 213:
	MECH M13 = new MECH();
	M13.std_id=213;
	M13.std_name= "Sumalatha";
	M13.branch= "Mech";
	System.out.println(M13.std_id+ " "+M13.branch+ " "+M13.std_name);
break;
	
}
}else
{
	System.out.println("INVALID HALL TICKET");
}
	}}