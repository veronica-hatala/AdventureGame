import java.util.Scanner;

//ADVENTURE GAME starts the game, as well as outputs the introduction paragraphs.
public class AdventureGame{
	
	//Declare all rooms used in game
	public static Library library;
	public static SecretRoom secretRoom;
	public static SittingRoom sittingRoom;
	public static MainHallway mainHall;
	
	//Declare the inventory Bag
	public static ResizableArrayBag<Item> inventory;
	
	//Instantiate Scanner to read from keyboard
	public Scanner keyboard = new Scanner(System.in);
	
	//Declare Items used in game
	public static Item fireplaceKey;
	public static Item armoireKey;
	public static Item secretNote;
	
	/*
	 * START GAME
	 * Initialize all rooms and inventory.
	 * Hops to Room Menu of Main Hallway, starting the game.
	 */
	public static void startGame()
	{
		library = new Library();
		secretRoom = new SecretRoom();
		mainHall = new MainHallway();
		sittingRoom = new SittingRoom();
		inventory = new ResizableArrayBag<>();
		
		
		mainHall.roomMenu();
	}

/*
 * Main Method
 */
	public static void main(String[] args) 
	{
		
		//Output introduction paragraphs.
		System.out.println("No one lives in the house by the pond, and no one ever has for as long as anyone in the village could remember. \nThere were the elderly that claim remembering a family once living there when they were children, but you’re unsure if they were recalling a false memory or simply making things up.");
		System.out.println("\nYou heard a story from one of them once, when you were younger – there was a family, a wife, husband and a young child, who disappeared without a trace overnight. "
				+ "\nThere was an investigation, but no answers were surfaced, and the house has been abandoned since.\r\n" + 
		
				"\n \nThe house itself lay near the shortcut road through the forest between your house and the center of the village. You make use of the shortcut sometimes,\nand sometimes in the winter when the trees are bare you see the old dilapidated house two centuries out of style by the murky pond. You imagine that at some point it may have been fit to swim in."
				+ "\nOtherwise, you think nothing of the house – it’s just an old house, after all. There certainly were stories told about people going to explore the house and never coming back. "
				+ "\nThey scared you as a child, but now that you’re grown, you know they’re just stories meant to keep curious children away from a decrepit house rife with danger from the aging structure. There were no such thing as ghosts. \r\n" + 
				"\n \nYou recall this now, walking down the shortcut path from the center of the village to your house, as you see a man bypassing the numerous ‘NO TRESPASSING’ signs and walking up the overgrown drive of the old house." + 
				
				"\n \nYour compulsion to follow overrules your inner instinct to flee. What if those stories of people disappearing weren’t just stories after all? "
				+ "\nThen is it not a moral obligation to let this man know what he’s getting into? Or maybe you’re just curious?\r\n" 
				+"But you follow, no matter the reason, and enter through the main entrance.\r\n" + 
				"\nThe inside is less dilapidated than it looks from out. Although the roof's shingles are falling off and so is the siding, the vestibule looks good for the house's abandonment. "
				+ "\nThere is a small table inside, on it a candle and small purse. The purse is empty, and you wear it over your shoulder. You light the candle with the oil nearby.\r\n" + 
				"Past the vestibule is the main hallway.\r\n");
		
		//Start Game Method
		startGame();
	}
}
/*OUTPUT:
 * 
 * No one lives in the house by the pond, and no one ever has for as long as anyone in the village could remember. 
There were the elderly that claim remembering a family once living there when they were children, but you’re unsure if they were recalling a false memory or simply making things up.

You heard a story from one of them once, when you were younger – there was a family, a wife, husband and a young child, who disappeared without a trace overnight. 
There was an investigation, but no answers were surfaced, and the house has been abandoned since.

 
The house itself lay near the shortcut road through the forest between your house and the center of the village. You make use of the shortcut sometimes,
and sometimes in the winter when the trees are bare you see the old dilapidated house two centuries out of style by the murky pond. You imagine that at some point it may have been fit to swim in.
Otherwise, you think nothing of the house – it’s just an old house, after all. There certainly were stories told about people going to explore the house and never coming back. 
They scared you as a child, but now that you’re grown, you know they’re just stories meant to keep curious children away from a decrepit house rife with danger from the aging structure. There were no such thing as ghosts. 

 
You recall this now, walking down the shortcut path from the center of the village to your house, as you see a man bypassing the numerous ‘NO TRESPASSING’ signs and walking up the overgrown drive of the old house.
 
Your compulsion to follow overrules your inner instinct to flee. What if those stories of people disappearing weren’t just stories after all? 
Then is it not a moral obligation to let this man know what he’s getting into? Or maybe you’re just curious?
But you follow, no matter the reason, and enter through the main entrance.

The inside is less dilapidated than it looks from out. Although the roof's shingles are falling off and so is the siding, the vestibule looks good for the house's abandonment. 
There is a small table inside, on it a candle and small purse. The purse is empty, and you wear it over your shoulder. You light the candle with the oil nearby.
Past the vestibule is the main hallway.


-------------------MAIN HALLWAY-------------------
The main hallway once hosted several tables and sofas, but now it is empty. The focal point 
of the room is a large silver chandelier, but the shine has faded and it is coated with cobwebs.
--------------------------------------------------

The Main Hallway leads to a Sitting Room to your left and a Library to your right.
1) Leave Room
Enter a value: 1

You decide to go to the:

1) Sitting Room, 2) Library
Enter a value: 1

You go to the Sitting Room.

-------------------SITTING ROOM-------------------
The sitting room is spacious and bright, with windows on the left and right walls. 
The main attraction of the room is the sofa and chairs surrounding a low coffee table. 
The sun has faded the dyes on the carpet, wallpaper, and upholstery on the seating arrangements, 
but the patterns still look beautiful in their decay. There is a fireplace on the wall directly opposite of the threshold. 
--------------------------------------------------

1) Check Sofa, 2) Check Fireplace, 3) Leave Room
Enter a value: 
2

You check the fireplace.

~FIREPLACE~

There is a large pile of ashes still left in the fireplace. 
The hearthstone once had a nice pattern engraved into it, but it is now blackened by soot and illegible. 
There is a poker beside the fireplace. You sense a dark aura coming from within. 
It entrances you and draws you closer. It sounds like a child crying. 

1) Check pile of ashes, 2) Leave Fireplace
Enter a value for fireplaceMenu: 1

You place your candle on the coffee table nearby. The ash will get your dress dirty,
 and the aura is more than a little terrifying. This is one of your nicer dresses, too. 

1) Who cares, 2) I'll use the poker
Enter a value for: 
2

You poke around the ashes with the poker. It takes awhile, probably longer than it would have with your hands, 
but you find something shining in the light of your candle. 
You uncover a small key, once engraved and painted but now stained with spots of black from the fire.
You place the key in your purse.

1) Check pile of ashes, 2) Leave Fireplace
Enter a value for fireplaceMenu: 2

You leave the fireplace.
1) Check Sofa, 2) Check Fireplace, 3) Leave Room
Enter a value: 
2

You check the fireplace.

~FIREPLACE~

There is a large pile of ashes still left in the fireplace. 
The hearthstone once had a nice pattern engraved into it, but it is now blackened by soot and illegible. 
There is a poker beside the fireplace. You sense a dark aura coming from within. 
It entrances you and draws you closer. It sounds like a child crying. 

1) Check pile of ashes, 2) Leave Fireplace
Enter a value for fireplaceMenu: 1

You have already looked through the ashes. There's nothing else here.

1) Check pile of ashes, 2) Leave Fireplace
Enter a value for fireplaceMenu: 2

You leave the fireplace.
1) Check Sofa, 2) Check Fireplace, 3) Leave Room
Enter a value: 
3

You leave the room.

You leave the sitting room. You go to the:
1) Main Hallway
Enter a Value: 
1
You go to the Main Hallway.

-------------------MAIN HALLWAY-------------------
The main hallway once hosted several tables and sofas, but now it is empty. The focal point 
of the room is a large silver chandelier, but the shine has faded and it is coated with cobwebs.
--------------------------------------------------

The Main Hallway leads to a Sitting Room to your left and a Library to your right.
1) Leave Room
Enter a value: 1

You decide to go to the:

1) Sitting Room, 2) Library
Enter a value: 2

You go to the Library.

-------------------LIBRARY-------------------
The bare remnants of a library stand in the room. There are two bookshelves lining the left and right walls. 
There is a desk with no chair. Beside the desk, there is an armoire. It looks out of place compared to the rest of the room.
---------------------------------------------

1) Check Left Bookshelf, 2) Check Right Bookshelf, 3) Check Armoire, 4) Check Desk, 5) Leave Room
Enter a value for Library Room Menu: 
4

You check the desk.

~~~~~~~~DESK~~~~~~~~

The desk surface is covered in dust. It seemed that at one point, it was meant to blend seamlessly with the bookshelves before it was severed apart.
There is nothing on top of it, but there are several small compartments, although most are missing their drawers.
The cavities without drawers are empty. There are only two drawers remaining.

1) Open Top Drawer, 2) Open Bottom Drawer, 3) Leave Desk
Enter a value: 2

There are several sheets of blank paper here.

1) Open Top Drawer, 2) Open Bottom Drawer, 3) Leave Desk
Enter a value: 1

You attempt to open the drawer.

You open the drawer with There is a Note in this drawer. You take it. It reads: This note is very old. It reads,: “I did not want to do it, at first. But I was left no other option. Do not try to find me – you will not find me.
I know that you will find him. I have faith that you will. And if not in the flesh, then in the resonance of his essence,
 which has become as vital to the existence of this house as the substructure or the baseboards. 
Also, I burned the body. If you wanted to know. She would have cried and screamed as I tried to escape. That is the only part I regret.”


1) Open Top Drawer, 2) Open Bottom Drawer, 3) Leave Desk
Enter a value: 3

You leave the desk.

1) Check Left Bookshelf, 2) Check Right Bookshelf, 3) Check Armoire, 4) Check Desk, 5) Leave Room
Enter a value for Library Room Menu: 
1

You check the left bookshelf.

~~~~~~~~LEFT BOOKSHELF~~~~~~~~

This bookshelf lines the left wall of the library. There are several books that stand out on this book shelf.

1) 'Lodore', 2) 'Northanger Abbey', 3) 'Lyrical Ballads', 4) 'Le Rameur', 5) Leave Right Bookshelf
Enter a value for LEFT BOOK SHELF Menu: 2

No one who had ever seen Catherine Morland in her infancy would have supposed her born to be an heroine. 


1) 'Lodore', 2) 'Northanger Abbey', 3) 'Lyrical Ballads', 4) 'Le Rameur', 5) Leave Right Bookshelf
Enter a value for LEFT BOOK SHELF Menu: 5

You leave the left bookshelf.


1) Check Left Bookshelf, 2) Check Right Bookshelf, 3) Check Armoire, 4) Check Desk, 5) Leave Room
Enter a value for Library Room Menu: 
2

You check the right bookshelf.

~~~~~~~~RIGHT BOOKSHELF~~~~~~~~
This bookshelf lines the right wall of the library. There are several books that stand out on this book shelf.

1) 'Anna Karenina', 2) 'Et dukkehjem', 3) 'Resurrection', 4) 'Les Voix Intérieures', 5) Leave Right Bookshelf
Enter a value: 1

Alexey Alexandrovitch had gained a brilliant victory at the sitting of the Commission of the 17th of August, but in the sequel this victory cut the ground from under his feet.


1) 'Anna Karenina', 2) 'Et dukkehjem', 3) 'Resurrection', 4) 'Les Voix Intérieures', 5) Leave Right Bookshelf
Enter a value: 3

The cell in which Maslova was imprisoned was a large room 21 feet long and 10 feet broad; it had two windows and a large stove. 

There is a small key in this book. You take it and put it in your bag.


1) 'Anna Karenina', 2) 'Et dukkehjem', 3) 'Resurrection', 4) 'Les Voix Intérieures', 5) Leave Right Bookshelf
Enter a value: 5

You leave the right bookshelf.


1) Check Left Bookshelf, 2) Check Right Bookshelf, 3) Check Armoire, 4) Check Desk, 5) Leave Room
Enter a value for Library Room Menu: 
3

You check the armoire.

~~~~~~~~ARMOIRE~~~~~~~~
The armoire is large and looks heavy. Upon inspecting it further, you see it is bolted to the floor. 
There is a dark aura surrounding it. You feel a sense of dread and fear as you approach.

There are no windows in the library, and your small candle reveals nothing by sight. 
You place your candle on the floor beside you and run your hands along the sides, but you feel nothing suspicious. While investigating the base,
just as you are about to give up, you feel cold metal and a slot that feels like it could be filled with a key.
Luckily, you have a key in your purse that seems like it will fit this lock.

~

You feel a rush of relief and exhilaration as the key slips into place and you hear the satisfying click of the lock as you turn it.
 The trap door falls open, as if on its own. There is a narrow staircase leading down. 

1) Run! It's a trap!, 2) Go down the staircase
Enter a value
1
You for the vestibule and attempt to open the main entrance, but time seems to slow as you reach for the doorknob.
 Just as you are about to make contact, a blinding light clouds your vision and you close your eyes.
 When you open them again, you are staring down at staircase in the armoire.

1) Run! It's a trap!, 2) Go down the staircase
Enter a value
2
You compose yourself and descend into the darkness. 

“He’s no longer here,” you hear someone say as you make your way down the staircase. Her voice echoes. She is distant. 
“And I am long gone from this place, too. In distance, that is. I assure you, I am very much alive.”
“It was a shame, too. I never wanted this. But his violent nature only responded to violence in return, so I did what I must. I’m sure anyone would have done the same.”

 “I regret nothing.”
“As I said, his cruelty defined who he was, and I wish I could have extracted it, so others won’t have to suffer like I did. But the process to do so takes time, and I needed that time to escape.” 
 
 You reach the last step of the staircase. Your candle illuminates a small, dark room. The walls have absorbed the smell of rotting flesh, but all the room contains is a bare skeleton and some scraps of cloth. 
 
The voice returns. “I am so sorry, I wish it could have been different.” 
“His spirit lives on, unrepressed, and it feeds on those too curious for their own good.”
You feel a pull on your hair and a hand that isn’t yours cupping your mouth.


~~~~~~~~~~~THE END~~~~~~~~~~~

 * 
 */



