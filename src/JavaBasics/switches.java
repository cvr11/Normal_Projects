package JavaBasics;

public class switches {

	public static void main(String[] args) {
		
		int i=2;
		String mas = "one";
		System.out.println(mas);
		
		switch(i)
		{
		case 0:
			System.out.println("i0=" + i);
			break;
			
		case 1:
			System.out.println("i1=" + i);
			break;
			
		case 2:
			System.out.println("i2=" +i);
			break;
			
		case 3:
			System.out.println("i=" +i);
			break;
		default:
			System.out.println("null");
			break;
		
		/*in another way of representation
		 * 
			*String mas = "four";
		
		
		switch(mas)
		{
		case "zero":
			System.out.println("i0=" + i);
			break;
			
		case "one":
			System.out.println("i1=" + i);
			break;
			
		case "two":
			System.out.println("i2=" +i);
			break;
			
		case "three":
			System.out.println("i=" +i);
			break;
		default:
			System.out.println("null");
			break;
			*/
		}

	}

}
