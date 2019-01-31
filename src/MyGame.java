import java.util.Scanner;

public class MyGame {
	static Map map;
	static Player player;

	public static void main(String[] args) {
		createMap();
		createPlayer();
		welcomeScreen();
		boolean playing = true;
		Scanner keyboard= new Scanner(System.in);
		String input;
		String output;
		while (playing) {
			input = keyboard.nextLine().toLowerCase();
			output=processInput(input);
			System.out.println(output);
			if(output.equals("goodbye"))
			{
				playing=false;
			}
		}
	}
	public static void welcomeScreen(){
		System.out.println("________________________________________________________________________");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                 Welcome                              |");
		System.out.println("|                                                                      |");
		System.out.println("________________________________________________________________________");
		Scanner keyboard = new Scanner(System.in);
		boolean y=true;
		while(y)
		{


			System.out.println("Play");
			System.out.println("Instructions");
			System.out.println("Type your selection: ");


			boolean x=true;
			while(x) 
			{

				String input = keyboard.nextLine().toLowerCase();
				if (input.equalsIgnoreCase("Play"))
				{
					return;

				}

				else if (input.equalsIgnoreCase("Instructions"))
				{
					System.out.println("There are no instructions :(");
					Instructions();
					x=false;
				}

				else
				{
					System.out.println("Please try again: ");
					System.out.println("Type your selection: ");
					x=true;
				}
			}
		}
	}
	public static String movement(String direction)
	{
		boolean[] movementOptions=map.getLocation(player.getPosition()[0], player.getPosition()[1]).movement();
		if(direction.equals("north")&&movementOptions[0]){
			player.move(0);
			return "You have moved north!";
		}
		else if(direction.equals("west")&&movementOptions[2]){
			player.move(2);
			return "You have moved west!";
		}
		else if(direction.equals("east")&&movementOptions[3]){
			player.move(3);
			return "You have moved east!";
		}
		else if(direction.equals("south")&&movementOptions[1]){
			player.move(1);
			return "You have moved south!";
		}
		else {
			return "I dont know where to go";

		}
	}
	
	public static void createPlayer()
	{
		player= new Player(5,6);	
	}
	
	public static void createMap(){
		map=new Map(10);
		map.addLocation(new Location("A magical castle",true,false,false,false), 5,5);
		map.addLocation(new Location("Not a magical castle",false,true,false,false), 4,5);
		
	}
	
	

	public static void Play ()
	{

	}	

	public static void Instructions ()
	{
		System.out.println("");
	}	public static void FreeLife ()
	{
		System.out.println("GoodBye");
	}
	public static String processInput(String input){
		if(input.equals("quit")||input.equals("exit")){
			return "goodbye";
		}
		else if (input.startsWith("go "))
		{
			return movement(input.substring(3));
		}
		else if (input.startsWith("move "))
		{
			return movement(input.substring(5));
		}
		else if (input.startsWith("look"))
		{
			return look();
		}
		else
		{
			return "I don't know";
		}
	}
	public static String look(){
		int x =player.getPosition()[0];
		int y = player.getPosition()[1];
		Location l= map.getLocation(x,y);
		return l.getDescription();
	}
}
