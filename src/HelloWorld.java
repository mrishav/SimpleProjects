import java.util.Scanner;
public class BirthdayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		String Go, Look, Pantry, Eat;

		System.out.println( " THE HAUNTED HOTEL");
		System.out.println("  ");
		System.out.println( " You are in a creepy hotel! You go into the 'dinning room'? ");
		{System.out.println("There is a long table with dirty dishes everywhere. You go into the kitchen and see a refrigerator and pantries. You may either open the 'refrigerator' or look in the 'pantry'. ");}

		Look = keyboard.next();


		if (Look.equalsIgnoreCase( "refrigerator" ))
		{
			System.out.println("Inside the refrigerator you see some of the food. Do you eat it, 'Yes' or 'No'?");
			System.out.print(">  ");
			Eat = keyboard.next();

			if (Eat.equalsIgnoreCase("Yes"))
			{
				System.out.println("  ");
				System.out.println("You Die from poisoning !");
			}

			else if (Eat.equalsIgnoreCase("No"))
			{
				System.out.println("  ");
				System.out.println("You die of starvation !");
			}
		}



		else if (Look.equalsIgnoreCase( "pantry" ))
		{
			System.out.println("There is a motion activated bomb that blows up !");
		}
		System.out.print(">  ");
		Pantry = keyboard.next();



	}
}