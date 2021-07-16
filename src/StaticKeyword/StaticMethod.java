package StaticKeyword;

public class StaticMethod {
	
	static String JetPlanes = "FifthGeneration";
	static int SukhoiSpeed = 3200;
	int EnginePower;
	
	public static void main(String[] args) {
		
		Helicopter(); //Since this ie static method i.e we can call this "Helicopter" method directly using method name
		StaticMethod st = new StaticMethod();
		st.FighterPlane(); //Since this is non static method this can be call simply by obj.classname
		StaticMethod.Helicopter();//Since this is static method this can be call using class name only
		StaticMethod.JetPlanes = "FifthGenerationFighterPlane";//Calling static variable using class name as below
		StaticMethod.SukhoiSpeed = 3200; ////Calling static variable using class name 	
		StaticMethod.PlaneSpeed(3200, "Sukhoi");// Calling static method and asssigning value at run time	
	} 
    
	//Below are non static variable hence can't be called using class name.
	String RussianPlane = "Sukhoi"; //
	String AmericanPlane = "FRaptor";
	String Plane = RussianPlane + AmericanPlane;
	
	//This is non static method
	//This method can be called using object.classname as usual 
	public void FighterPlane()
	{
		EnginePower = 3350;// Accessing Instance variable
		System.out.println("These are thebest fighter lane in the world " + Plane);
		System.out.println("Engine HorsePower is "+ EnginePower);
	}
	//This static method
	//Static method can be called directly by class name instead of object.
	public static void Helicopter()
	{
		String RussianHelicopter = "RTR";
		String AmericnaHelicopter = "Apache";
		String Copter = RussianHelicopter + AmericnaHelicopter;
		
		System.out.println("These are the two best Helicopter in the world " + Copter );
	}
	
	public static void PlaneSpeed(int SukhoiSpeed, String JetPlanes)
	{
		System.out.println(SukhoiSpeed);
	}
}
