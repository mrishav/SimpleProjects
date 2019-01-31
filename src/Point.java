
public class Point {
	int x;
	int y;

	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int quadrant(){
		if(this.x>0&&this.y>0){
			return 1;
		}
		if(this.x<0&&this.y>0){
			return 2;
		}
		if(this.x>0&&this.y<0){
			return 4;
		}
		if(this.x<0&&this.y<0)
			return 3;
		else{
			return 0;
		}
	}

	public double distance(Point other){
		double d=Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y));	
		return d;
	}
	public double slope(Point other){
		double d=(double)(other.y-this.y)/(other.x-this.x);	
		return d;
	}
}
