
public class BankTesting {

	public static void main(String[] args)
	{
		Account a= new Account("Alice",0000);
		Account b= new Account("Bob",1012);

		System.out.println(a.getBalance());
		a.addMoney();
		System.out.println(a.getBalance());
		a.withdrawMoney(50);
	}

}
