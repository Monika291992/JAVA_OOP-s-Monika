package Object;

// JAVATPOINT
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  
public class AccountProgram {
	
	int acc_no;
	String name;
	float amount;
	
	//Method to initialize object  
	void insert(int a, String n, float amt)
	{
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	//deposit method  
	void deposit(float amt)
	{
		amount = amount + amt;
		System.out.println(amt+ " deposited");
	}
	
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			amount = amount - amt;
			System.out.println(amt+ " withdrawn");
		}
	}
	
	//method to check the balance of the account  
	void checkBalance()
	{
		System.out.println("Balance is " +amount);
	}
	
	void display()
	{
		System.out.println(acc_no+ " " +name+ " " +amount);
	}
	
	
 	public static void main(String[] args) {
		
		AccountProgram ap = new AccountProgram();
		ap.insert(832345,"Ankit",1000);
		ap.deposit(40000);
		ap.withdraw(15000);
		ap.checkBalance();
		ap.display();

	}

}
