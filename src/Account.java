import java.util.Scanner;

public class Account {

	private String name;
	private int balance;
	private int pin;
	private static int numAccounts=0;

	public Account(String inputName, int inputPin)
	{
		this.name=inputName;
		this.pin=inputPin;
		this.balance=0;

		numAccounts++;
	}
	public String getName(){
		return this.name;
	}
	public void addMoney(int input){
		this.balance=this.balance+input;
	}

	public void addMoney(){
		Scanner kb= new Scanner(System.in);
		System.out.println("How much money would you like to deposit: ");
		int input = kb.nextInt();
		if(input>0){
		this.balance=this.balance+input;}
		else
		{ 
			System.out.println("Please Try Again");
			}
	}
	public int getBalance(){
		return this.balance;
	}
	public void withdrawMoney(int x){
		Scanner kb=new Scanner(System.in); 
		System.out.print("Please input PIN: ");
		int pin= kb.nextInt();
		if(pin==this.pin){
			if(this.balance>=x){
				this.balance=this.balance-x;
				System.out.println("Your balance is now: " +this.balance);
			}
			else {
				System.out.print("Not enough money");
			}
		}
		else
		{
			System.out.println("Error incorrect PIN");	
		}
	}
}



