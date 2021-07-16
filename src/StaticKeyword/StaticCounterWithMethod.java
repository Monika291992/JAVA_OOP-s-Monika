package StaticKeyword;

// both the objects are sharing a same copy of static variable that’s why they displayed the same value of count.

public class StaticCounterWithMethod {
	
	static int count = 0;
	
	public void increment()
	{
		count++;
	}

	public static void main(String[] args) {
		
		StaticCounterWithMethod sc = new StaticCounterWithMethod();
		StaticCounterWithMethod sc1 = new StaticCounterWithMethod();
		sc.increment();
		sc1.increment();
		//System.out.println(count);
		System.out.println(sc.count);
		System.out.println(sc1.count);
		
		//StaticCounterWithMethod sc1 = new StaticCounterWithMethod();
		//sc1.increment();
		//System.out.println(count);
		//System.out.println(sc1.count);
		

	}

}
