
public class Calculator {

	public static void main(String[] args) 
	{
		System.out.println(power(5,3));

	}
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int subtract(int a, int b)
	{
		return a-b;
	}
	public static int division(int a, int b)
	{
		return a/b;
	}
	public static int multiplication(int a, int b)
	{
		return a*b;
	}
	public static int power(int a, int b)
	{
		int x = 1;
		for (int i=0; i<b; i++)
		{
			x = x*a; 
		}		
		return x;
	}
	public static int remainder(int a, int b)
	{
		return a%b;
	}
}
