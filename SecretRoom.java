//The SECRET ROOM can only be accesses from the Armoire Menu of the Library. It outputs text and ends the program.
public class SecretRoom extends GenericRoom{
	
	/*
	 * SECRET ROOM
	 * Allows the user a choice, but the user is always forced to enter the Skeleton Menu.
	 */
	public void roomMenu ()
	{
		roomMenuLoop = true;
		
		System.out.println("\n~");
		
		System.out.println("\nYou feel a rush of relief and exhilaration as the key slips into place and you hear the satisfying click of the lock as you turn it."
				+ "\n The trap door falls open, as if on its own. There is a narrow staircase leading down. ");
		
		while (roomMenuLoop) {
			
			System.out.println("\n1) Run! It's a trap!, 2) Go down the staircase");
			
			System.out.println("Enter a value");
				roomMenuDecision = keyboard.nextLine();
			
			switch (roomMenuDecision.charAt(0))
			{
				case '1':
					System.out.println("You for the vestibule and attempt to open the main entrance, but time seems to slow as you reach for the doorknob."
							+ "\n Just as you are about to make contact, a blinding light clouds your vision and you close your eyes."
							+ "\n When you open them again, you are staring down at staircase in the armoire.");
					break;
				case '2':
					System.out.println("You compose yourself and descend into the darkness. ");
					roomMenuLoop = false;
					skeletonMenu();
					break;
			}
		}
	}
	
	/*
	 * SKELETON MENU
	 * Outputs ending paragraphs. Ends the game.
	 */
	public void skeletonMenu()
	{
		System.out.println("\n“He’s no longer here,” you hear someone say as you make your way down the staircase. Her voice echoes. She is distant. "
				+ "\n“And I am long gone from this place, too. In distance, that is. I assure you, I am very much alive.”\r\n" 
				+"“It was a shame, too. I never wanted this. But his violent nature only responded to violence in return, so I did what I must. I’m sure anyone would have done the same.”\r\n"  
				+"\n “I regret nothing.”" 
				+"\n“As I said, his cruelty defined who he was, and I wish I could have extracted it, so others won’t have to suffer like I did. But the process to do so takes time, and I needed that time to escape.” "
				+ "\n \n You reach the last step of the staircase. Your candle illuminates a small, dark room. The walls have absorbed the smell of rotting flesh, but all the room contains is a bare skeleton and some scraps of cloth. \n \n"
				+ "The voice returns. “I am so sorry, I wish it could have been different.” \r\n" + 
				"“His spirit lives on, unrepressed, and it feeds on those too curious for their own good.”\r\n" + 
				"You feel a pull on your hair and a hand that isn’t yours cupping your mouth.\r\n" + 
				"");
		
		System.out.println("\n~~~~~~~~~~~THE END~~~~~~~~~~~");
		
		System.exit(0);
	}
	
	/*
	 * SECRET ROOM CONSTRUCTOR
	 */
	public SecretRoom()
	{
		super("SECRET ROOM");
	}
}
