package Exercise_1;

public class Cvr_Company {

	public static void main(String[] args) {
		EMP venkat= new EMP();
		EMP_ADD v= new EMP_ADD();
		EMP venkat1= new EMP();
		EMP_ADD v1= new EMP_ADD();
		EMP john=new EMP();
		EMP_ADD j= new EMP_ADD();
		
				
		venkat.setID(1);
		venkat.setFirst_name("venkata teddy");
		venkat.setLast_name("challa");
		venkat.setAge(25); 
		venkat.setPosition("java Developer");
		 System.out.println(venkat.getID()+" "+venkat.getFirst_name()+ " "+venkat.getLast_name()+" "+venkat.getAge()+" "+venkat.getPosition() );
				
		v.setDoor_num(547);
		v.setStreet_name("Writers way");
		v.setCity("MOrissivelle");
		v.setState("North Corolina");
		v.setPincode(27560);
		System.out.println(v.getDoor_num()+" "+v.getStreet_name()+" "+v.getCity()+" "+v.getState()+" "+ v.getPincode());
		System.out.println();

		salary();
				
		venkat1.setID(2);
		venkat1.setFirst_name("Anji reddy");
		venkat1.setLast_name("Annapureddy");
		venkat1.setAge(38); 
		venkat1.setPosition("java Developer");
		 System.out.println(venkat1.getID()+" "+venkat1.getFirst_name()+ " "+venkat1.getLast_name()+" "+venkat1.getAge()+" "+venkat1.getPosition() );
		
		v1.setDoor_num(255);
		v1.setStreet_name("Afeespeta");
		v1.setCity("Meyapoor chorasta");
		v1.setState("Telangana");
		v1.setPincode(522400);
		System.out.println(v1.getDoor_num()+" "+v1.getStreet_name()+", "+v1.getCity()+", "+v1.getState()+", "+ v1.getPincode());
		System.out.println();
		
		john.setID(3);
		john.setFirst_name("john");
		john.setLast_name("mic");
		john.setAge(45); 
		john.setPosition(".net Developer");
		 System.out.println(john.getID()+" "+john.getFirst_name()+ " "+john.getLast_name()+" "+john.getAge()+" "+john.getPosition() );
				
		j.setDoor_num(39800);
		j.setStreet_name("path finder");
		j.setCity("Fremont");
		j.setState("California");
		j.setPincode(94538);
		System.out.println(j.getDoor_num()+" "+j.getStreet_name()+" "+j.getCity()+" "+j.getState()+" "+ j.getPincode());
		System.out.println();
		
		}

	public static void salary(){
		String salary;
		String tax;
		salary ="7586";
		tax=".076";
		//wapper class 
		//EMP venkat= new EMP();
		//venkat.salary s; 
		double s=Double.parseDouble(salary);
		double t=Double.parseDouble(tax);
		double total_salary =(s-(s*t));
		System.out.println("salary=" +salary);
		System.out.println("tax"+tax);
		System.out.println("total Salary="+total_salary);
		System.out.println();
		
		
		
	}

}
