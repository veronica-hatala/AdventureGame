//The LIBRARY inherits GenericRoom. The user can interact with the right or left bookshelves, the armoire, or the desk.
public class Library extends GenericRoom{
	
	//Right Bookshelf Variables
	public String rightBookShelfMenuDecision;
	public boolean rightBookShelfMenuLoop;
	
	//Left Bookshelf Variables
	public String leftBookShelfMenuDecision;
	public boolean leftBookShelfMenuLoop;
	
	//Desk Variables
	public String deskMenuDecision;
	public boolean deskMenuLoop;
	
	public String armoireMenuDecision;
	public boolean armoireMenuLoop;
	
	/*
	 * LIBRARY ROOM MENU
	 */
	public void roomMenu ()
	{
		roomMenuLoop = true;
		
		System.out.println("\n-------------------LIBRARY-------------------");
		System.out.println("The bare remnants of a library stand in the room. There are two bookshelves lining the left and right walls. "
				+ "\nThere is a desk with no chair. Beside the desk, there is an armoire. It looks out of place compared to the rest of the room.");		
		System.out.println("---------------------------------------------");
		
		while (roomMenuLoop) {
				
			System.out.println("\n1) Check Left Bookshelf, 2) Check Right Bookshelf, 3) Check Armoire, 4) Check Desk, 5) Leave Room");
		
			System.out.println("Enter a value for Library Room Menu: ");
				roomMenuDecision = keyboard.nextLine();
		
			switch (roomMenuDecision.charAt(0))
			{
				case '1':
					System.out.println("\nYou check the left bookshelf.");
					leftBookShelfMenu();
					break;
				case '2':
					System.out.println("\nYou check the right bookshelf.");
					rightBookShelfMenu();
					break;
				case '3':
					System.out.println("\nYou check the armoire.");
					armoireMenu();
					break;
				case '4':
					System.out.println("\nYou check the desk.");
					deskMenu();
					break;
				case '5':
					System.out.println("\nYou leave the room");
					roomMenuLoop = false;
					exitRoomMenu();
					break;
				case 'I':
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.");
			}//end of switch roomMenuDecision
		}//end of while loop roomMenuLoop
	}//End of Library roomMenu()
	
	/*
	 * EXIT ROOM MENU
	 */
	public void exitRoomMenu ()
	{
		System.out.println("\nYou leave the library. You go to the:");
		
		System.out.println("1) Main Hallway");
		
		System.out.println("Enter a Value: ");
		exitRoomMenuDecision = keyboard.nextLine();
		
		switch (exitRoomMenuDecision)
		{
			case "1":
				System.out.println("\nYou go to the Main Hallway.");
				mainHall.roomMenu();
				break;
			default:
				System.out.println("\nPlease enter a valid value.");
		}
		
	}
	
	

	/*
	 * LEFT BOOKSHELF MENU
	 * Gives a description of the left bookshelf. Gives user options to interact with books.
	 */
	public void leftBookShelfMenu()
	{
		leftBookShelfMenuLoop = true;
		
		System.out.println("\n~~~~~~~~LEFT BOOKSHELF~~~~~~~~");
		System.out.println("\nThis bookshelf lines the left wall of the library. There are several books that stand out on this book shelf.");
		
		while (leftBookShelfMenuLoop)
		{
			System.out.println("\n1) 'Lodore', 2) 'Northanger Abbey', 3) 'Lyrical Ballads', 4) 'Le Rameur', 5) Leave Right Bookshelf");
			System.out.print("Enter a value for LEFT BOOK SHELF Menu: ");
		
			leftBookShelfMenuDecision = keyboard.nextLine();
			
			switch (leftBookShelfMenuDecision.charAt(0))
			{
				case '1':
					System.out.println("\nIn the flattest and least agreeable part of the county of Essex, about five miles from the sea, is situated a village or small town,"
							+ " which may be known in these pages by the name of Longfield.\n");
					break;
				case '2':
					System.out.println("\nNo one who had ever seen Catherine Morland in her infancy would have supposed her born to be an heroine. \n");
					break;
				case '3':
					System.out.println("\nWater, water, everywhere, nor any drop to drink. \n");
					break;
				case '4':
					System.out.println("\nJamais, charmes du jour, jamais vos grâces n’ont. Tant souffert d’un rebelle essayant sa défense.\n");
					break;
				case '5':
					System.out.println("\nYou leave the left bookshelf.\n");
					leftBookShelfMenuLoop = false;
					break;
				case 'I':
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.");
			}//End of switch leftBookShelfMenuDecision
		}//End of leftBookShelfMenuLoop Loop
	
	}//End of Left Bookshelf Menu
	
	/*
	 * RIGHT BOOKSHELF MENU
	 * Gives a description of the right bookshelf. Gives user options to interact with books.
	 */
	public void rightBookShelfMenu()
	{
		rightBookShelfMenuLoop = true;
		
		System.out.println("\n~~~~~~~~RIGHT BOOKSHELF~~~~~~~~");
		System.out.println("This bookshelf lines the right wall of the library. There are several books that stand out on this book shelf.");
		
		while (rightBookShelfMenuLoop)
		{
			System.out.println("\n1) 'Anna Karenina', 2) 'Et dukkehjem', 3) 'Resurrection', 4) 'Les Voix Intérieures', 5) Leave Right Bookshelf");
			System.out.print("Enter a value: ");
		
			rightBookShelfMenuDecision = keyboard.nextLine();
			
			switch (rightBookShelfMenuDecision.charAt(0))
			{
				case '1':
					System.out.println("\nAlexey Alexandrovitch had gained a brilliant victory at the sitting of the Commission of the 17th of August, "
							+ "but in the sequel this victory cut the ground from under his feet.\n");
					break;
				case '2':
					System.out.println("\nEn hyggeligt og smagfuldt men ikke kostbart indrettet stue. En dør tilhøjre i baggrunden fører ud til forstuen;"
							+ " en anden dør tilvenstre i baggrunden fører ind til Helmers arbejdsværelse.\n");
					break;
				case '3':
					System.out.println("\nThe cell in which Maslova was imprisoned was a large room 21 feet long and 10 feet broad;"
							+ " it had two windows and a large stove. \n");
					if (inventory.contains(armoireKey))
						System.out.println("There was a small key in this book before, but now it is in your bag.\n");
					else
					{
						inventory.add(armoireKey);
						System.out.println("There is a small key in this book. You take it and put it in your bag.\n");
					}
					break;
				case '4':
					System.out.println("\nDe quelque côté qu'on aille, partout un flot qui tressaille, partout un homme qui va.\n");
					break;
				case '5':
					System.out.println("\nYou leave the right bookshelf.\n");
					rightBookShelfMenuLoop = false;
					break;
				case 'I':
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.");
			}//End of switch rightBookShelfMenuDecision
		}//End of rightBookShelfMenu Loop
	}//End of Right Bookshelf Menu
	
	/*
	 * ARMOIRE MENU
	 * Outputs a description of the armoire. Gives user options to interact with the armoire. Leads to the secret room if armoireKey is within the Bag.
	 */
	public void armoireMenu()
	{
		System.out.println("\n~~~~~~~~ARMOIRE~~~~~~~~");
		System.out.println("The armoire is large and looks heavy. Upon inspecting it further, you see it is bolted to the floor. "
				+ "\nThere is a dark aura surrounding it. You feel a sense of dread and fear as you approach.");
		if (!inventory.contains(armoireKey))
		{
			System.out.println("\nThere are no windows in the library, and your small candle reveals nothing by sight. "
					+ "\nYou place your candle on the floor beside you and run your hands along the sides, but you feel nothing suspicious."
					+ "\nWhile investigating the base, just as you are about to give up, you feel cold metal and a slot that feels like it could be filled with a key.");
		}
		else 
		{
			System.out.println("\nThere are no windows in the library, and your small candle reveals nothing by sight. "
					+ "\nYou place your candle on the floor beside you and run your hands along the sides, but you feel nothing suspicious. While investigating the base,"
					+ "\njust as you are about to give up, you feel cold metal and a slot that feels like it could be filled with a key.");
			System.out.println("Luckily, you have a key in your purse that seems like it will fit this lock.");
			secretRoom.roomMenu();
		}
	}//End of Armoire Menu
	
	/*
	 * DESK MENU
	 * Outputs a description of the desk. Gives the user options to open drawers in the desk.
	 */
	public void deskMenu()
	{
		deskMenuLoop = true;
		
		System.out.println("\n~~~~~~~~DESK~~~~~~~~");
		System.out.println("\nThe desk surface is covered in dust. It seemed that at one point, it was meant to blend seamlessly with the bookshelves before it was severed apart."
				+ "\nThere is nothing on top of it, but there are several small compartments, although most are missing their drawers."
				+ "\nThe cavities without drawers are empty. There are only two drawers remaining.");
		
		while (deskMenuLoop)
		{
			System.out.println("\n1) Open Top Drawer, 2) Open Bottom Drawer, 3) Leave Desk");
			System.out.print("Enter a value: ");
		
			deskMenuDecision = keyboard.nextLine();
			
			switch (deskMenuDecision.charAt(0))
			{
				case '1':
					System.out.println("\nYou attempt to open the drawer.");
					
					if (!inventory.contains(secretNote)) //(inventory.contains(fireplaceKey) && inventory.contains(secretNote) )
						if (!inventory.contains(fireplaceKey))
							System.out.println("\nYou can't open this. You need a key.");
						else
						{
							inventory.add(secretNote);
							System.out.println("\nYou open the drawer with There is a Note in this drawer. You take it. It reads: "+ secretNote.getDescription());
						}
					else
					{
						System.out.println("\nThere was a note here before, but now this drawer is empty."); 
					}
					break;
				case '2':
					System.out.println("\nThere are several sheets of blank paper here.");
					break;
				case '3':
					System.out.println("\nYou leave the desk.");
					deskMenuLoop = false;
					break;
				case 'I':
					displayInventory();
					break;
				default: 
					System.out.println("\nPlease enter a valid value.");
			}//End of switch deskMenuDecision
		}//End of deskMenuLoop Loop
	}//End of Desk Menu
	
	/*
	 * LIBRARY CONSTRUCTOR
	 * Defines the furniture menu loops, as well as creates the armoireKey and secretNote objects.
	 */
	public Library()
	{
		super("LIBRARY");
		
		armoireKey = new Item("Small Key", "This key is very small and ornate.");
		secretNote = new Item("Old Note", "This note is very old. It reads,: “I did not want to do it, at first. But I was left no other option. Do not try to find me – you will not find me.\r\n" + 
				"I know that you will find him. I have faith that you will. And if not in the flesh, then in the resonance of his essence,"
				+ "\n which has become as vital to the existence of this house as the substructure or the baseboards. \r\n" + 
				"Also, I burned the body. If you wanted to know. She would have cried and screamed as I tried to escape. That is the only part I regret.”\r\n");
		
		secretRoom = new SecretRoom();
		
		rightBookShelfMenuLoop = true;
		leftBookShelfMenuLoop = true;
		deskMenuLoop = true;
	}//End of Library Constructor
	
}
