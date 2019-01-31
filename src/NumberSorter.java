import java.util.Scanner;

public class NumberSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Insert 3 Numbers");
		a=keyboard.nextInt();
		b=keyboard.nextInt();
		c=keyboard.nextInt();
		if(a<b && a<c)
		{
			System.out.println(a);
			if(b<c)
			{
				System.out.println(b);
				System.out.println(c);
			}
			else
			{
				System.out.println(c);
				System.out.println(b);
			}
		} 
		if(b<a && b<c)
		{
			System.out.println(b);
			if(a<c)
			{
				System.out.println(a);
				System.out.println(c);
			}
			else
			{
				System.out.println(c);
				System.out.println(a);

			}
		}


		if(c<b && c<a)
		{
			System.out.println(c);
			if(b<a)
			{
			System.out.println(b);
			System.out.println(a);
			
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
		}
		}





	}


}
