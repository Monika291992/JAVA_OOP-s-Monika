package StaticKeyword;

public class StaticCounterWithConstructor {
	
	//will get memory each time when the instance is created  
	 int age=0; 
	//static int age=0; // on keeping the value as static, after ++ the age on 2nd time when object is created or //will get memory only once and retain its value
	 	public StaticCounterWithConstructor() // value of age would be increment by + i.e 2 next 3....
	{
		age++;
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		StaticCounterWithConstructor sc = new StaticCounterWithConstructor(); //Object is created, Instance variable is get memory allocated 
		StaticCounterWithConstructor sc1 = new StaticCounterWithConstructor(); // When object is created
		StaticCounterWithConstructor sc2 = new StaticCounterWithConstructor();
	}
 }
