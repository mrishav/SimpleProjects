public class Map {
	int size;
	Location[][] storeLocation;
	public Map(int size)
	{	
		this.storeLocation=new Location[size][size];
		this.size=size;

	}
	public void addLocation(Location addLocation,int x, int y)
	{
		storeLocation[x][y]=addLocation;
	}
	public boolean canMove(int x, int y, String direction)
	{
		if (direction.equals("north"))
		{
			return storeLocation[x][y].movement()[0];
		}
		if (direction.equals("south"))
		{
			return storeLocation[x][y].movement()[1];
		}
		if (direction.equals("east"))
		{
			return storeLocation[x][y].movement()[2];
		}
		if (direction.equals("west"))
		{
			return storeLocation[x][y].movement()[3];
		}
		else
		{
			return false;
		}
	}
	public Location getLocation(int x, int y) {
		return storeLocation[x][y];
	}
}
