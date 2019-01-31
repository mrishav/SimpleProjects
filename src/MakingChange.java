import java.util.Scanner;

public class MakingChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insert amout of money: ");
		int amount=keyboard.nextInt();
		int quarters=amount/25;
		System.out.print(quarters);
		System.out.println(" quarters");
		amount=amount-quarters*25;
		int dime=amount/10;
		System.out.print(dime);
		System.out.println(" dime");
		amount=amount-dime*10;
		int nickel=amount/5;
		System.out.print(nickel);
		System.out.println(" nickel");
		amount=amount-nickel*5;
		int penny = amount;
		System.out.print(penny);
		System.out.println(" penny");
		
			
		
		
	}


}
