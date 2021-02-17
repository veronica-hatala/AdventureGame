//ITEMS can be found within rooms and added to the user's Bag. Whether the Bag contains certain items determines whether the user can access certain parts of the game.
public class Item {
	
	/*
	 * itemName is the name of the item
	 */
	public String itemName;
	
	/*
	 * The itemDescription is a short description of the item. 
	 * It includes physical details and content that can be read on it
	 */
	public String itemDescription;
	
	/*
	 * getName returns the name of the item
	 */
	public String getName()
	{
		return itemName;
	}
	
	/*
	 * getDescription returns itemDescription, the description of the item
	 */
	public String getDescription()
	{
		return itemDescription;
	}
	
	/*
	 * The toString method returns the name and description of the item 
	 */
	public String toString()
	{
		return itemName + ": " + itemDescription + "\n";
	}
	
	
	/*
	 * CONSTRUCTOR
	 *	@param name, the name of the item. description, the description of the item
	 */
	public Item(String name, String description)
	{
		itemName = name;
		itemDescription = description;
	}
	
	/*
	 * EQUALS METHOD
	 * @param An object to be compared
	 * @return Whether the input matches the current Item
	 */
	public boolean equals(Object input) 
	{
		  
	    if (input instanceof Item) 
	    {
	      Item item = (Item)input;
	      if (this.itemDescription.equals(item.itemDescription))
	    	  return true;
	    }
	    return false;
	    
	 }
}
