import java.util.Scanner;

public class Suminputs {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		while(input>=0) {	
			System.out.print("input your number: ");
			input = keyboard.nextInt();

			if(input>=0)	
			{
				sum=sum+input;
			}
			System.out.println(sum);
		}		 


	}

}
