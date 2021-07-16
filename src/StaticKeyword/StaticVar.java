package StaticKeyword;

//example: for memory management
public class StaticVar {

	int age;
	String name;
	static String city = "Pune"; // When a variable is declared as static then single copy of variable is shared
                                 // among all objects at class level & every obj can access it								
	public StaticVar(int age, String name) {
		
		//static int a =10; static is used with only class variables
		this.age=age;
		this.name=name;
		
		
	}

	public static void main(String[] args) {
		
//		StaticVar sv= new StaticVar(29,"Max","Pune"); // Same city is being used in both the cases
//		sv.display();
//		StaticVar sv1=new StaticVar(30,"Sam","Pune"); // Same city is being used in both the cases, hence 
//		sv1.display();                                // We can assign city variable as static, So that memory
													  // Can be allocated once only and sv & sv1 obj can refer	
													  // Same variable all the time
	
		StaticVar sv= new StaticVar(29,"Max");
		sv.display();
		StaticVar sv1= new StaticVar(30,"Sam");
		sv1.display();
		//System.out.println(sv.name);
			
	}												   			
													  	
		public void display()
	{
		System.out.println(age+" "+name+" "+city);;
	}
	
}
