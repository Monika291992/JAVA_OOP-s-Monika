package StaticKeyword;

//Static method accessed directly in static and non-static method

public class StaticMethod1 {
	
	static int a=10;
	static String name="Monika";
	public static final int MY_VAR=27;
	
	static void display(){  //Static method
		
		System.out.println(a);
		System.out.println(name);
		//StaticMethod1.MY_VAR =22; It’s final so the value of this variable can never be changed in the current or in any class.
		System.out.println(MY_VAR);
	}
	 
	void show(){ //non-static method
		
		//Static method called in non-static method
		display();
	}

	public static void main(String[] args) {
		
		
		StaticMethod1 sm = new StaticMethod1();
		//You need to have object to call this non-static method
		sm.show();
		
		 //Static method called in another static method
		display();

	}

}
