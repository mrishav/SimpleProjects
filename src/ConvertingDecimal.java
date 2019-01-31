import java.util.Scanner;
public class ConvertingDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int input = keyboard.nextInt();
		String output = "";
		int remainder;
		
		while (input>0)
		{
			remainder=input%2;
			output=remainder+output;
			input=input/2;
		}
		
		
		
		System.out.print("Here is your converted number: "+ output);
	
	}

}
