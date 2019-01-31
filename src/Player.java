
public class Player {

	int xPos;
	int yPos;
	public Player(int x, int y){
		this.xPos=x;
		this.yPos=y;
	}
	public int[]getPosition(){
		int[]x={this.xPos,this.yPos};
		return x;
	}
	public void move(int i) {
		if(i==0){
			this.xPos--;
			
		}
		else if (i==1){
			this.xPos++;
		}
else if (i==2){
	this.yPos++;
			
		}
else if (i==3){
	this.yPos--;
	
}
	}
}
