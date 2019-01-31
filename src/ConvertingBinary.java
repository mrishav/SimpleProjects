import java.util.Scanner;
public class ConvertingBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a Binary Number: ");
		String input = keyboard.next();
		int sum = 0;	
		int x = 1;	

		for(int i = input.length()-1; i >= 0; i = i-1)
		{
			if (input.charAt(i) =='1')
			{
				sum = sum+x;	
			}
			x = x*2;
		}
		System.out.print("Here is your converted number: "+ sum);




	}


}
