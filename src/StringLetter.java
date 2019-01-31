import java.util.Scanner;
public class StringLetter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a string: ");
		String input = keyboard.nextLine();
		
	
		for (int i = 0; i<input.length(); i++) {
			System.out.println(input.charAt(i));
	}
	}
}