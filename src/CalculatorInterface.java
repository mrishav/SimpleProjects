import java.util.Scanner;

public class CalculatorInterface { 
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("________________________________________________________________________");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                 Welcome                              |");
		System.out.println("|                                                                      |");
		System.out.println("________________________________________________________________________");

		boolean y=true;
		while(y)
		{


			System.out.println("Addition");
			System.out.println("Subtraction");
			System.out.println("Multiplication");
			System.out.println("Power");
			System.out.println("Factorial");
			System.out.println("Prime Checker");



			System.out.println("Pick which function you want to perform: ");


			boolean x=true;
			while(x) 
			{

				String input = keyboard.nextLine();
				if (input.equalsIgnoreCase("addition"))
				{
					addition ();
					x= false;
				}
				else if (input.equalsIgnoreCase("subtraction"))	
				{
					subtraction ();
					x=false;
				}
				else if (input.equalsIgnoreCase("multiplication"))
				{
					multiplication ();
					x=false;
				}
				else if (input.equalsIgnoreCase("power"))
				{
					power ();
					x=false;
				}
				else if (input.equalsIgnoreCase("factorial"))
				{
					factorial ();
					x=false;
				}
				else if (input.equalsIgnoreCase("prime checker"))
				{
					primechecker ();
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
			keyboard.nextLine();
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
	public static void addition ()
	{
		System.out.println("Enter two numbers: ");
		int input=keyboard.nextInt();
		int input2=keyboard.nextInt();
		System.out.println(input+input2);
	}	
	public static void subtraction ()
	{
		System.out.println("Enter two numbers: ");
		int input=keyboard.nextInt();
		int input2=keyboard.nextInt();
		System.out.println(input-input2);
	}	
	public static void multiplication ()
	{
		System.out.println("Enter two numbers: ");
		int input=keyboard.nextInt();
		int input2=keyboard.nextInt();
		System.out.println(input*input2);
	}	
	public static void power ()
	{
		System.out.println("Enter the base: ");
		int input=keyboard.nextInt();
		System.out.println("Enter the power: ");
		int input2=keyboard.nextInt();
		int x = 1;
		for (int i=0; i<input2; i++)
		{
			x = x*input; 
		}		

		System.out.println(x);
	}	
	public static void factorial ()
	{
		System.out.println("Enter a number: ");
		int input=keyboard.nextInt();
		for (int i=input-1; i>0; i--)
		{
			input = input*i; 
		}		

		System.out.println(input);
	}	
	public static void primechecker ()
	{
		System.out.println("Enter a number: ");
		boolean z=false;
		int input=keyboard.nextInt();
		for (int i=input/2;i>1;i--)
		{
			if (input%i==0)
				z=true;
		}

		if (z)
		{
			System.out.println("not prime");
		}
		else 
		{
			System.out.println("prime");
		}	
	}
}
