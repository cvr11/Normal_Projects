package SMCE;

import java.util.Scanner;

public class ECE extends SMCE_COLLEGE {


	int std_id;
	String std_name;
	String branch;
	public static void ECE_MARKS(){
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		System.out.println(" Enter the Last 3 Digits of ECE-Branch_HALL_TICKET number ");
		i= scan.nextInt();
	if (i>400 && i<500)
//for (i=400; i<500;i++){		
	switch(i){
	case 400:
		if(i==400){
		ECE e = new ECE();
		e.std_id=401;
		e.std_name= "ravi";
		e.branch= "ece";
		System.out.println("ID"+ "  "+"Branch"+ " "+"Std_name");
		}break;
	case 401:
		if(i==401){ECE e1 = new ECE();
		e1.std_id=401;
		e1.std_name= "Ravi";
		e1.branch= "ece";
		System.out.println(e1.std_id+ " "+e1.branch+ " "+e1.std_name);
		}break;	
	case 402:
		if (i==402){ECE e2 = new ECE();
		e2.std_id=402;
		e2.std_name= "Vasavi";
		e2.branch= "ece";
		System.out.println(e2.std_id+ " "+e2.branch+ " "+e2.std_name);
		}break;
	case 403:
		ECE e3 = new ECE();
		e3.std_id=403;
		e3.std_name= "Anusha";
		e3.branch= "ece";
		System.out.println(e3.std_id+ " "+e3.branch+ " "+e3.std_name);
break;
	case 404:
		ECE e4 = new ECE();
		e4.std_id=404;
		e4.std_name= "Padhu";
		e4.branch= "ece";
		System.out.println(e4.std_id+ " "+e4.branch+ " "+e4.std_name);
break;
	case 405:
		ECE e5 = new ECE();
		e5.std_id=405;
		e5.std_name= "Siva";
		e5.branch= "ece";
		System.out.println(e5.std_id+ " "+e5.branch+ " "+e5.std_name);
break;
	case 406:
		ECE e6 = new ECE();
		e6.std_id=406;
		e6.std_name= "Sudha";
		e6.branch= "ece";
		System.out.println(e6.std_id+ " "+e6.branch+ " "+e6.std_name);
break;

	case 407:
		ECE e7 = new ECE();
		e7.std_id=407;
		e7.std_name= "Anjali";
		e7.branch= "ece";
		System.out.println(e7.std_id+ " "+e7.branch+ " "+e7.std_name);
break;
	case 408:
		ECE e8 = new ECE();
		e8.std_id=408;
		e8.std_name= "Ashok";
		e8.branch= "ece";
		System.out.println(e8.std_id+ " "+e8.branch+ " "+e8.std_name);
break;
	case 409:
		ECE e9 = new ECE();
		e9.std_id=409;
		e9.std_name= "Narisi";
		e9.branch= "ece";
		System.out.println(e9.std_id+ " "+e9.branch+ " "+e9.std_name);
break;
	case 410:
		ECE e10 = new ECE();
		e10.std_id=410;
		e10.std_name= "Sandeep";
		e10.branch= "ece";
		System.out.println(e10.std_id+ " "+e10.branch+ " "+e10.std_name);
break;
	case 411:
		ECE e11 = new ECE();
		e11.std_id=411;
		e11.std_name= "Viaya";
		e11.branch= "ece";
		System.out.println(e11.std_id+ " "+e11.branch+ " "+e11.std_name);
break;
	case 412:
		ECE e12 = new ECE();
		e12.std_id=412;
		e12.std_name= "Raju";
		e12.branch= "ece";
		System.out.println(e12.std_id+ " "+e12.branch+ " "+e12.std_name);
break;
	case 413:
		ECE e13 = new ECE();
		e13.std_id=413;
		e13.std_name= "Divya";
		e13.branch= "ece";
		System.out.println(e13.std_id+ " "+e13.branch+ " "+e13.std_name);
break;
	case 414:
		ECE e14 = new ECE();
		e14.std_id=414;
		e14.std_name= "Venkat";
		e14.branch= "ece";
		System.out.println(e14.std_id+ " "+e14.branch+ " "+e14.std_name);
default:
	if(i>414){
		System.out.println("INVALID HALL TICKETR NUMBER, PLEASE CHECK AND TRY AGAIN");
	}
	}}
	//}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	

}
