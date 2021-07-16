package Object;

public class RectangleObjMethod {
	
	int length;
	int width;
	
	public void insert(int a, int b)
	{
		length = a;
		width = b;
	}
	
	void calculateArea()
	{
		System.out.println("calculateArea: " +length*width);
	}

	public static void main(String[] args) {
		
		RectangleObjMethod rom = new RectangleObjMethod();
		rom.insert(5, 11);
		rom.calculateArea();

	}

}
