package Object;

public class ObjMethod1 {
	
	//Object Initialization using method
	
	String name;
	int age;
	int rollno;
	
	void getData(String a, int b, int c){ //Parameter is variable defined by a method that receives value when the method is called
		
		//System.out.println(a+ " " +b+ " " +c);
		
		name = a;
		age = b;
		rollno = c;
	}
	
	void display(){
		
		System.out.println(name+ " " +age+ " " +rollno); //printing members with a white space  
		
	}
	

	public static void main(String[] args) {
		
		ObjMethod1 obj = new ObjMethod1();
		obj.getData("Sangeeta", 22, 786723); // argument is a value that is passed to a method when it is called.
		obj.display();

	}

}
