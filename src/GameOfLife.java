import java.util.Random;
public class GameOfLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]start=new int [12] [12];
	Random rand= new Random();
	
	for(int j=0; j<100; j++)
	{
	start[rand.nextInt(11)+1][rand.nextInt(11)+1]=1;
	}
	
		for(int i=0;i<100;i++)
		{
			printBoard(start);
			start = step(start);
			
			
		}
		printBoard(start);
		printBoard(step(start));
		
	}
	public static void printBoard(int[][] start)
	{
		for(int z=0;z<start.length-1;z++)
		{
			System.out.println();
			for(int i=1;i<start[z].length-1;i++)
			{
				if (start[z][i]==1)
				{
					System.out.print("x");
				}
				else
					System.out.print(" ");
				System.out.print(" | ");
			}
		}
	}
	public static int[][] step (int[][]oldBoard) 
	{
		int[][]newBoard= new int[12][12];
		for(int i=1;i<oldBoard.length-1;i++)
		{
			for(int j=1;j<oldBoard[i].length-1;j++)
			{
				if(oldBoard[i][j]==1)
				{
					if(countNeighbors(oldBoard,i,j)==2||countNeighbors(oldBoard,i,j)==3)
					{
						newBoard[i][j]=1;
					}
				}
				else
				{
					if(countNeighbors(oldBoard,i,j)==3)
					{
						newBoard[i][j]=1;
					}
				}
			}
		}

		return newBoard;
	}
	public static int countNeighbors(int[][] board, int row, int col) {
		int sum=0;

		sum += board[row][col-1];
		sum += board[row][col+1];
		sum +=board[row-1][col];
		sum +=board[row+1][col];
		sum +=board[row-1][col-1];
		sum +=board[row-1][col+1];
		sum +=board[row+1][col-1];
		sum +=board[row+1][col+1];

		return sum;
	}
}