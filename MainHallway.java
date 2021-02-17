
//The MAIN HALLWAY's only function is that it leads to other Rooms. It inherits GenericRoom.
public class MainHallway extends GenericRoom{
	
	/*
	 * MAIN HALLWAY ROOM MENU
	 */
	public void roomMenu()
	{
		roomMenuLoop = true;
		
		while (roomMenuLoop) {
			System.out.println("\n-------------------MAIN HALLWAY-------------------");
			System.out.println("The main hallway once hosted several tables and sofas, but now it is empty. The focal point "
					+ "\nof the room is a large silver chandelier, but the shine has faded and it is coated with cobwebs.");
			System.out.println("--------------------------------------------------\n");
			
			System.out.println("The Main Hallway leads to a Sitting Room to your left and a Library to your right.");
			System.out.println("1) Leave Room");
			
			System.out.print("Enter a value: ");
			roomMenuDecision = keyboard.nextLine();
		
			switch (roomMenuDecision)
			{
			case "1":
				roomMenuLoop = false;
				exitRoomMenu();
				break;
			default: 
				System.out.println("\nPlease enter a valid value.");
			}
		}
		
	}//end of MainHallway roomMenu()
	
	/*
	 * MAIN HALLWAY EXIT ROOM MENU
	 */
	public void exitRoomMenu()
	{
		System.out.println("\nYou decide to go to the:");
		System.out.println("\n1) Sitting Room, 2) Library");
		System.out.print("Enter a value: ");
		exitRoomMenuDecision = keyboard.nextLine();
		
		switch (exitRoomMenuDecision.charAt(0))
		{
			case '1':
				System.out.println("\nYou go to the Sitting Room.");
				sittingRoom.roomMenu();
				break;
			case '2':
				System.out.println("\nYou go to the Library.");
				library.roomMenu();
				break;
			default:
				System.out.println("\nPlease enter a valid value.");
		}
	}//end of MainHallway exitRoomMenu()
	
	/*
	 * MAIN HALLWAY CONSTRUCTOR
	 */
	public MainHallway()
	{
		super("MAIN HALLWAY"); //inherit GenericRoom
	}//end of MainHallway()
}
