package Exercise_1;

public class SMCE {
	int RollNum;
	String section;
	String Firstname ;
	String lastname;
	String year;
	
	 static void FirstyearStudents(){
	 SMCE fys = new SMCE();
	 fys.RollNum= 401;
	 fys.Firstname="Ravindhra";
	 fys.lastname="A";
	 fys.section="ECE-A";
	 fys.year="1stYear-1stSEM";

	 System.out.println("RollNum"+" "+"Firstname     "+" "+"lastname"+" "+"section"+" "+"Year");
	 System.out.println(fys.RollNum+"     "+fys.Firstname+"      "+fys.lastname+"         "+fys.section+"  "+fys.year);
	
	 SMCE fys2= new SMCE();
	 fys2.RollNum=402;
	 fys2.Firstname= "Anusha";
	 fys2.lastname="A";
	 fys2.section="ECE-A";
	 fys2.year="1stYear-1stSEM";
	 System.out.println(fys2.RollNum+"     "+fys2.Firstname+"         "+fys2.lastname+"         "+fys2.section+"  "+fys2.year);
	
	 SMCE fys3= new SMCE();
	 fys3.RollNum=403;
	 fys3.Firstname= "Vasavi";
	 fys3.lastname="A";
	 fys3.section="ECE-A";
	 fys3.year="1stYear-1stSEM";
	 System.out.println(fys3.RollNum+"     "+fys3.Firstname+"         "+fys3.lastname+"         "+fys3.section+"  "+fys3.year);
	 
	 SMCE fys4= new SMCE();
	 fys4.RollNum=404;
	 fys4.Firstname= "Padhmaja";
	 fys4.lastname="A";
	 fys4.section="ECE-A";
	 fys4.year="1stYear-1stSEM";
	 System.out.println(fys4.RollNum+"     "+fys4.Firstname+"       "+fys4.lastname+"         "+fys4.section+"  "+fys4.year);
	 
	 SMCE fys5= new SMCE();
	 fys5.RollNum=405;
	 fys5.Firstname= "SivaKumarReddy";
	 fys5.lastname="A";
	 fys5.section="ECE-A";
	 fys5.year="1stYear-1stSEM";
	 System.out.println(fys5.RollNum+"     "+fys5.Firstname+" "+fys5.lastname+"         "+fys5.section+"  "+fys5.year);
	 
	 SMCE fys6= new SMCE();
	 fys6.RollNum=406;
	 fys6.Firstname= "Sudhakar Reddy";
	 fys6.lastname="A";
	 fys6.section="ECE-A";
	 fys6.year="1stYear-1stSEM";
	 System.out.println(fys6.RollNum+"     "+fys6.Firstname+" "+fys6.lastname+"         "+fys6.section+"  "+fys6.year);
	 
	 SMCE fys7= new SMCE();
	 fys7.RollNum=407;
	 fys7.Firstname= "Anjali";
	 fys7.lastname="A";
	 fys7.section="ECE-A";
	 fys7.year="1stYear-1stSEM";
	 System.out.println(fys7.RollNum+"     "+fys7.Firstname+"         "+fys7.lastname+"         "+fys7.section+"  "+fys7.year);
	 
	 System.out.println( );
	}
	public static void main(String[] args){
	int i=12;
	if (i>10){
	
	for(i=0;i<13;i++)	
			
		FirstyearStudents();
		
	}
	
	
}}
