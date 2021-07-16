package Object;

//Object Initialization using method

public class ObjMethod {
	
	String Car; //Instance Variable
	int Speed;  //Instance Variable

	public static void main(String[] args) {
		
		ObjMethod obj = new ObjMethod();
		obj.Car("BMW", 500);
		obj.display();
	}
	
	public void Car(String Name, int MaxSpeed)
	{
		Car = Name;    // Assigning value to instance variable Car & Speed, Now BMW & 500 is assigned to Car & Speed. 
		Speed = MaxSpeed;  // Instance variable, which can be access anywhere in the class.
		
		//System.out.println(Name+" "+Speed);
	}
	
	public void display()
	{
		System.out.println(Car+" "+Speed); // Car & Speed is instance variable, hence can be access anywhere in class
	}
}	
