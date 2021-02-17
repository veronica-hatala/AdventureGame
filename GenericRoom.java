import java.util.*;
import java.util.Scanner;

//GENERIC ROOM defines all the basic classes and variables that each room object MUST have in order to function.
public abstract class GenericRoom extends AdventureGame{ 
	
	//Input from the keyboard within the roomMenuDecision() method
	public String roomMenuDecision = "";
	
	//Input from the keyboard within the exitRoomMenu() method
	public String exitRoomMenuDecision = "";
	
	//Set to false when room is exited, ending the roomMenu() method loop
	public boolean roomMenuLoop = true;
	
	//The name of the room
	String roomName;
	
	/*
	 * CONSTRUCTOR
	 * Default
	 */
	public GenericRoom()
	{
		
	}
	
	/*
	 * CONSTRUCTOR
	 * @param The name of the room
	 */
	public GenericRoom(String name)
	{
		setRoomName(name);
	}
	
	/*
	 * SET ROOM NAME
	 * Sets the roomName variable. Sets the name to a default if the input is undefined.
	 * @param The name of the room
	 */
	public void setRoomName(String name)
	{
		if (name == null)
			roomName = "Undefined";
		else
			roomName = name;
	}
	
	/*
	 * GET NAME METHOD
	 * @return The name of the room
	 */
	public String getRoomName()
	{
		return roomName;
	}
	
	/*
	 * toString
	 * @return The name of the room
	 */
	public String toString()
	{
		return roomName;
	}
	
	/* ROOM MENU
	 * 
	 * The main menu of a room. Presents options to visit furniture, or to hop to the room's Exit Room Menu
	 */
	public void roomMenu()
	{
			
	}
	
	/* EXIT ROOM MENU
	 * 
	 * Exit the room. Presents options to hop to other Room Menus.
	 */
	public void exitRoomMenu()
	{
		
	}
	
	/* DISPLAY INVENTORY
	 * 
	 * Displays the bag (inventory).
	 * Displays output stating that there is nothing in the bag if there is nothing in the bag. 
	 */
	public void displayInventory()
	{
		
		if (inventory.isEmpty())
			System.out.println("Your purse is empty. /n");
		else
		{
			System.out.println("In your purse, you have: \n");
			Object[] itemArray = inventory.toArray();
			for (int i = 0; i < itemArray.length; i++)
			{
				Item thing = (Item)itemArray[i];
				System.out.println(thing);
			}//end of for loop
		}//end of else
	}//End of displayInventory()
}
