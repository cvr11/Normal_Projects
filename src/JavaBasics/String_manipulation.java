package JavaBasics;

public class String_manipulation {

	public static void main(String[] args) {

		String x="Hanuman";
		
		System.out.println("JAi "+ x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(4));
		System.out.println(x.toLowerCase());
		System.out.println(x.substring(02, 5));
		System.out.println(x.charAt(2));
		String age ="25";
		String salary ="6899.59";
		String tax=".10";
		
	//wrapper class
		
		int a= Integer.parseInt(age);
		double s= Double.parseDouble(salary);
		float b= Float.parseFloat(tax);
		System.out.println(a);
		System.out.println(s);
		System.out.println( x +" |" + a +" | " + s);
		System.out.println(x + age +salary);
		System.out.println(tax);
		 //String total = salary*tax; 
		System.out.println("total salary=" +s*b );
	}
}