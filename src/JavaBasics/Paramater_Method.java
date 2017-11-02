package JavaBasics;

//import org.omg.Messaging.SyncScopeHelper;

public class Paramater_Method {

	public static void main(String[] args) {
		add(10,25,225);
		mystring("venkata reddy", "challa");
		mystring("veera reddy", "challa");
		mystring ("jagga reddy","gayam");
		
		

	}

	public static void mystring(String name,String surname ){
		System.out.println(" print the given name ");
		System.out.println(name+" "+surname);
		
	}
	
	public static void add(int a, int b,int c ){
		int d=c-a+b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a+b="+(a+b));
		System.out.println(c);
		System.out.println(d);
		
	}
}
