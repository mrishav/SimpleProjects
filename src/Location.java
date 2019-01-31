public class Location {
	String description;
	boolean north;
	boolean south;
	boolean east;
	boolean west;
	public Location(String description,Boolean north,Boolean south,Boolean east,Boolean west)
	{
		this.description=description;
		this.north=north;
		this.south=south;
		this.west=west;
		this.east=east;
	}
	public boolean[] movement()
	{
		boolean[]Direction={this.north,this.south,this.east,this.west};
		return Direction;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

}