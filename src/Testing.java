
public class Testing {

	public static void main(String[] args) {
int[]bob={1,2,3,4,5,6,7,8,9};
System.out.println(search(bob,20));
		// TODO Auto-generated method stub
	}
		public static int search(int[]input,int x){
			for(int i=0;i<input.length;i++){
				if(input[i]==x)
					return i;
		}
			return -1;
		}
	}
