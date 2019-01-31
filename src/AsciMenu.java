import java.util.Scanner;

public class AsciMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("________________________________________________________________________");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                 Welcome                              |");
		System.out.println("|                                                                      |");
		System.out.println("________________________________________________________________________");
		Scanner keyboard = new Scanner(System.in);
		boolean y=true;
		while(y)
		{


			System.out.println("Free Gift Cards");
			System.out.println("Free Bank Accounts");
			System.out.println("Free Life");


			System.out.println("Type your selection: ");


			boolean x=true;
			while(x) 
			{

				String input = keyboard.nextLine();
				if (input.equalsIgnoreCase("Free Gift Cards"))
				{
					FreeGiftCards();
					x= false;
				}
				else if (input.equalsIgnoreCase("Free Bank Accounts"))	
				{
					FreeBankAccounts();
					x=false;
				}
				else if (input.equalsIgnoreCase("Free Life"))
				{
					 FreeLife ();
					x=false;
				}
				else
				{
					System.out.println("You Messed Up....");
					System.out.println("Type your selection: ");
					x=true;
				}
			}

			System.out.println("Would you like to try again?");
			String input = keyboard.nextLine();
			if (input.equalsIgnoreCase("yes"))
			{
				y=true;
			}
			else
			{
				y=false;
			}
		}
	}
	public static void FreeGiftCards ()
	{
		System.out.println("ERROR");
	}	
	public static void FreeBankAccounts ()
	{
		System.out.println("Virus Installed");
	}	public static void FreeLife ()
	{
		System.out.println("GoodBye");
	}	

}
