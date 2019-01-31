import java.util.Scanner;

public class Adventure1
{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		String Go, Look, Pantry, Eat;

		System.out.println( " WELCOME TO YOUR BIRTHDAY GAME ADVENTURE!!!!");
		System.out.println("  ");
		System.out.println( " You are coming home from a business trip and find a lottery ticket on the floor in the airport");
		{System.out.println("You may either 'take it' or 'leave it'. ");}

		Look = keyboard.next();


		if (Look.equalsIgnoreCase( "take it" ))
		{
			System.out.println("You decide might as well give it a shot. You go home and eagerly read the newspaper to see the winning ticket. You realize you were the WINNING TICKET!!!! Do you call the number to claim your prize 'Yes' or 'No'?");
			Eat = keyboard.next();

			if (Eat.equalsIgnoreCase("Yes"))
			{
				System.out.println("  ");
				System.out.println("You Wake Up !");
			}

			else if (Eat.equalsIgnoreCase("No"))
			{
				System.out.println("  ");
				System.out.println("You aren't smart enought to play this game -GOODBYE!");
			}
		}



		else if (Look.equalsIgnoreCase( "leave it" ))
		{
			System.out.println("...why would u leave a free ticket -GOODBYE");
		}
		System.out.print(">  ");
		Pantry = keyboard.next();



	}
}