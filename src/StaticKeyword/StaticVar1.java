package StaticKeyword;

//Static variables are shared among all the instances of class : in the same class

//Static variable can be call using className no need to create object for accessing the static variable: a variable from other class

public class StaticVar1 {
	
	static int i = 70;
	static String name = "BeginnerBooks";
	
	//This is a static method
	public static void main(String[] args) {
		
		System.out.println(StaticBlock.a); //Static variable can be call using className no need to create object for accessing the static variable
        System.out.println("i: " +i);
        System.out.println("name: " +name);
	}

}
