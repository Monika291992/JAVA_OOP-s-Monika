package Object;

public class MainOverloaded {

	public static void main(String[] args) 
	{	
		//Programs p = new Programs();
		//p.main("Method Over Overloading");
		System.out.println("Sting S");
	}

	public static void main (String a)
	{	
		System.out.println("int a");
	}
	
	// Note: We can overload the main method as well 
	// Since above main method is following the condition of Method overloading both have different type of args
	// Always main (String[]args) method to be given preferences)
}
