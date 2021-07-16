package Object;

public class ObjRefVariable {
	
	//Object Initialization using Reference variable
	
	String name; //field or data member or instance variable  
	int age;
	int rollno;

	 //creating main method inside the  class  
	public static void main(String[] args) {
		
		  //Creating an object or instance  
		ObjRefVariable obj = new ObjRefVariable();
		
//if we don’t initialized values of class fields then they are initialized with their default values.
		
		// Accessing and property value or Initializing objects  
		
		obj.name = "Tanisha"; 
		obj.age = 20;
		obj.rollno = 37787;
		
		// Calling method
		obj.info();

	}
	
	void info(){
		
		System.out.println("Name is " +name);
		System.out.println("Age is " +age);
		System.out.println("Rollno is " +rollno);
	}

}
