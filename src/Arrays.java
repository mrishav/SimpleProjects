
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {0,1,6,100};
		scores = Sort(scores);

		for(int i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}

	}
	public static int Average(int[] scores)
	{
		int sum=0;
		for(int i=0;i<scores.length;i++)
		{
			sum=sum+scores[i];
		}
		return sum/scores.length;
	}


	public static int Maximum(int[] x)
	{
		boolean found = true;
		for(int i=0;i<x.length;i++)
		{
			found = true;
			for(int j=0; j<x.length;j++)
			{
				if (x[i]<x[j])
				{
					found = false;	
				}
			}
			if (found)
			{
				return i;
			}
		}
		return 	-1;
	}

	public static int[] Sort(int[]x)
	{
		int[] sorted = new int[x.length];
		for (int i=0;i<x.length;i++)
		{
			sorted[i]=x[Maximum(x)];
			x[Maximum(x)]=0;
		}
		return sorted;		
	}
}