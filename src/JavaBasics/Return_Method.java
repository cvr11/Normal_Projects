package JavaBasics;

public class Return_Method {

	public static void main(String[] args) {
		 int sum=add(10,25,225);
		 System.out.println("sum="+sum);
		mystring("venkata reddy", "challa");
		mystring("veera reddy", "challa");
		mystring ("jagga reddy","gayam");
		
		

	}

	public static void mystring(String name,String surname ){
		System.out.println(" print the given name ");
		System.out.println(name+" "+surname);
		
	}
	
	public static int add(int a, int b,int c ){
		int d=c-a+b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a+b="+(a+b));
		System.out.println(c);
		System.out.println(d);
		return (c-a+b);//here this is the returning method
		

	}

}
