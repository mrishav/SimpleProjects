import java.util.Scanner;

public class Methods {

	public static void main(String[] args)
	{
		System.out.print(convert(13));
	}

	public static String convert(int input)
	{
		String output = "";
		int remainder;

		while (input>0)
		{
			remainder=input%2;
			output=remainder+output;
			input=input/2;
		}



		return("Here is your converted number: "+ output);

	}
}