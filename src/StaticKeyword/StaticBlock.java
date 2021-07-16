package StaticKeyword;

public class StaticBlock {
	
	static int a;
	static String b;
	
	static{
		
		a=10;
		b="Mishti";
	}
	
	//Static variables can be accessed directly in Static method
	public static void display(){
		
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
	}

	public static void main(String[] args) {
                
		display();
	}

}
