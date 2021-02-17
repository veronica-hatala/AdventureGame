//The SITTING ROOM inherits GenericRoom. The user can interact with the sofa, the fireplace, or leave the room.
public class SittingRoom extends GenericRoom {
	
	//Takes input from within the fireplaceMenu() method
	public String fireplaceMenuDecision;
	//Maintains the fireplaceMenu() loop
	public boolean fireplaceMenuLoop;
	
	//Takes input from within the sofaMenu() method
	public String sofaMenuDecision;
	//Maintains the sofaMenu() loop
	public boolean sofaMenuLoop;
	
	/*
	 * SITTING ROOM ROOM MENU
	 * Outputs a description of the sitting room. Gives user options to visit the fireplace or sofa, or leave the room.
	 */
	public void roomMenu ()
	{
		System.out.println("\n-------------------SITTING ROOM-------------------");
		System.out.println("The sitting room is spacious and bright, with windows on the left and right walls. "
				+ "\nThe main attraction of the room is the sofa and chairs surrounding a low coffee table. "
				+ "\nThe sun has faded the dyes on the carpet, wallpaper, and upholstery on the seating arrangements, "
				+ "\nbut the patterns still look beautiful in their decay. There is a fireplace on the wall directly opposite of the threshold. ");
		System.out.println("--------------------------------------------------\n");
		
		
		roomMenuLoop = true;
		
		while (roomMenuLoop)
		{
			
			System.out.println("1) Check Sofa, 2) Check Fireplace, 3) Leave Room");
		
			System.out.println("Enter a value: ");
				roomMenuDecision = keyboard.nextLine();
		
			switch (roomMenuDecision)
			{
				case "1":
					System.out.println("\nYou check the sofa.");
					sofaMenu();
					break;
				case "2":
					System.out.println("\nYou check the fireplace.");
					fireplaceMenu();
					break;
				case "3":
					System.out.println("\nYou leave the room.");
					roomMenuLoop = false;
					exitRoomMenu();
					break;
				case "I":
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.");
			}
		}//End of roomMenuLoop loop
	}//End of SittingRoom Room Menu
	
	/*
	 * SITTING ROOM EXIT ROOM MENU
	 * Leaves the sitting room.
	 */
	public void exitRoomMenu()
	{
		System.out.println("\nYou leave the sitting room. You go to the:");
		
		System.out.println("1) Main Hallway");
		
		System.out.println("Enter a Value: ");
		exitRoomMenuDecision = keyboard.nextLine();
		
		switch (exitRoomMenuDecision)
		{
			case "1":
				System.out.println("You go to the Main Hallway.");
				mainHall.roomMenu();
				break;
			default:
				System.out.println("Please enter a valid value.");
		}
		
	}//End of SittingRoom Exit Room Menu
	
	/*
	 * SOFA MENU
	 * Outputs a description of the sofa, as well as interactions with the sofa from the user.
	 */
	public void sofaMenu()
	{
		sofaMenuLoop = true;
		
		System.out.println("\n~SOFA~");
		
		System.out.println("\nYou can still see remnants of bright red stripes and colorful flowers on the sofa’s upholstery."
				+ " Now, the stripes are an ugly dull pink and the flowers are dull.");
	
		while (sofaMenuLoop) {
			
			System.out.println("1) Check under cushions, 2) Check under the sofa, 3) Leave Sofa");
			System.out.print("Enter a value: ");
		
			sofaMenuDecision = keyboard.nextLine();
		
			switch (sofaMenuDecision.charAt(0))
			{
				case '1':
					System.out.println("\nYou flip up the cushions. "
							+ "It seems like a cockroach family has made residence inside the sofa. "
							+ "You return the cushions to their original state.\n");
					break;
				case '2':
					System.out.println("\nThere is nothing but dust and a few cockroach corpses under this sofa.\n");
					break;
				case '3':
					System.out.println("\nYou leave the sofa.\n");
					sofaMenuLoop = false;
					break;
				case 'I':
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.\n");
			} //end of switch (fireplaceMenuDecision)
		
		} 
	}//End of Sofa Menu
	
	/*
	 * FIREPLACE MENU
	 * Outputs a description of the fireplace, as well as interactions with the fireplace from the user.
	 */
	public void fireplaceMenu()
	{
		fireplaceMenuLoop = true;
		
		System.out.println("\n~FIREPLACE~");
		
		System.out.println("\nThere is a large pile of ashes still left in the fireplace. "
				+ "\nThe hearthstone once had a nice pattern engraved into it, but it is now blackened by soot and illegible. "
				+ "\nThere is a poker beside the fireplace. You sense a dark aura coming from within. "
				+ "\nIt entrances you and draws you closer. It sounds like a child crying. ");
		
		 while (fireplaceMenuLoop){
			
			System.out.println("\n1) Check pile of ashes, 2) Leave Fireplace");
		
			System.out.print("Enter a value for fireplaceMenu: ");
			fireplaceMenuDecision = keyboard.nextLine();
		
			switch (fireplaceMenuDecision)
			{
				case "1":
					if (!inventory.contains(fireplaceKey))
					{	
						System.out.println("\nYou place your candle on the coffee table nearby. The ash will get your dress dirty,"
								+ "\n and the aura is more than a little terrifying. This is one of your nicer dresses, too. ");
						System.out.println("\n1) Who cares, 2) I'll use the poker");
						System.out.println("Enter a value for: ");
						String checkAshesDecision = keyboard.nextLine();
						switch(checkAshesDecision)
						{
						case "1":
							System.out.println("\nYou get on your hands and knees and sift through the ashes. Your dress and hands turn grimy with ash. "
									+ "\nThe spirits don’t like this – the child crying is now shrieking, and ghostly black strands of smoke rise curl their way around your arms,"
									+ "\ntrying to grasp but always slipping. Not before long, you find something unusual. Hidden underneath the ashes is a collection of small bones,"
									+ "\nin disarray but certainly human. Near the smallest bones of all, probably belonging to the victim’s hands, there is a small key,"
									+ "\nonce engraved and painted but now stained with spots of black from the fire. You place the key in your purse.");
							//successfully gone through fireplace
							inventory.add(fireplaceKey);
							//add fireplace key to Bag
							break;
						case "2":
							System.out.println("\nYou poke around the ashes with the poker. It takes awhile, probably longer than it would have with your hands, "
									+ "\nbut you find something shining in the light of your candle. "
									+ "\nYou uncover a small key, once engraved and painted but now stained with spots of black from the fire."
									+ "\nYou place the key in your purse.");
							//successfully gone through fireplace
							inventory.add(fireplaceKey);
							//add fireplace key to Bag
							break;
						default:
							System.out.println("Please enter a valid value");
						}
						
					}//end of fireplaceKey if statement
					else 
						System.out.println("\nYou have already looked through the ashes. There's nothing else here.");
					
					break;
				case "2":
					System.out.println("\nYou leave the fireplace.");
					fireplaceMenuLoop = false;
					break;
				case "I":
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.");
			} //end of switch (fireplaceMenuDecision)
		
		}//end of fireplaceMenu Loop
		
	}//end of fireplaceMenu()

	/*
	 * SITTING ROOM CONSTRUCTOR
	 * Defines the furniture menu loops, as well as creates the fireplaceKey object.
	 */
	public SittingRoom()
	{
		 super("SITTING ROOM");
		 fireplaceMenuLoop = true;
		 sofaMenuLoop = true;
		
		 fireplaceKey = new Item("Burnt Key", "A key found in the fireplace. It is very small. It was once painted, but now there are small black spots on it.");
		 
	}//end of SittingRoom();
}

