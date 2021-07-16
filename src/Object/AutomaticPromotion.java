package Object;

public class AutomaticPromotion {

	public static void main(String[] args) {
		
		AutomaticPromotion p2 = new AutomaticPromotion();
		p2.grow('a'); // Passing char('a') as parameter neither integer nor String, then it is automatically promoted to int
					  // Hence grow(int a) is executed and printed
	}

	public void grow(String S) // String data Type
	{
		System.out.println("String S"); // Passing String data Type 
	}
	
	public void grow(int a) // int data Type
	{
		System.out.println("int a");  // Passing int data Type
	}
}
