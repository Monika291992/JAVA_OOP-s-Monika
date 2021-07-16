package StaticKeyword;

//Static variables are shared among all the instances of class

public class StaticVariable2 {
	
	static int var1=77; //Static integer variable
	String var2; //non-static string variable

	public static void main(String[] args) {
		
		StaticVariable2 obj1 = new StaticVariable2();
		StaticVariable2 obj2 = new StaticVariable2();
		
		/* static variables can be accessed directly without
		 * any instances. Just to demonstrate that static variables
		 * are shared, I am accessing them using objects so that 
		 * we can check that the changes made to static variables
		 * by one object, reflects when we access them using other
		 * objects */
		 
		//Assigning the value to static variable using object ob1
		obj1.var1 = 88;
		obj1.var2 = "object 1";
		
		 /* This will overwrite the value of var1 because var1 has a single 
         * copy shared among both the objects.
         */
		obj2.var1 = 99;
		obj2.var2 = "object 2";
		
		System.out.println("obj1 integer:"+obj1.var1);//99
		System.out.println("obj1 String:"+obj1.var2);//object 1
		System.out.println("obj2 integer:"+obj2.var1);//99
		System.out.println("obj2 STring:"+obj2.var2);//object 2
		
		
	}

}
