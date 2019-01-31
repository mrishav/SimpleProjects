
public class FizzBuzz {

	public static void main(String[] args) {


		Helper2(10);
	}



	//		for (int i = 0; i<101; i++) 
	//			
	//			
	//			
	//{ if (i%3==0 && i%5==0)
	//		{
	//
	//			System.out.println("FizzBuzz");
	//		}
	//
	//
	//
	//		else if(i%3==0)
	//		{
	//			System.out.println("Fizz");
	//
	//		}
	//
	//		else if (i%5==0)
	//		{
	//			System.out.println("Buzz");
	//		}
	//
	//		else {
	//			System.out.println(i);
	//		}
	//		}
	//	}


	public static String Helper(int a)
	{
		{ if (a%3==0 && a%5==0)
		{

			return("FizzBuzz");
		}



		else if(a%3==0)
		{
			return("Fizz");

		}

		else if (a%5==0)
		{
			return("Buzz");
		}
		else 
		{
			return ""+a;
		}
		}
	}
	

public static void Helper2(int b)
{
	for (int i = 0; i <= b; i++)
	{
	System.out.println(Helper(i));
	}
}

}
