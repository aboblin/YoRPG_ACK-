// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-27

public abstract class Player extends Character
{
    // instance vars
    protected int counter = 0;
    protected String name = "";
    protected int potions = 10;

    // returns name of player
    public String getName()
    {
        return name;
    }
    
    public int getPotions()
    {
        return potions;
    }
    
    //method for when a monster drops an item so you can 
    public void addItems(String item)
    {
	if ( item.equals("Potion") ) {
	    potions += 1;
        System.out.println("\nPotions: " + potions);
		}
        
	if ( item.equals("Shield") ) {
	    def += 100;
        System.out.println("Your DEF increased by 100! It is now " + def + ".");
		}
        
	if ( item.equals("Sword") ) {
	    str += 100;
        System.out.println("Your STR increased by 100! It is now " + str + ".");
		}
        
	if ( item.equals("Wristband") ) {
	    dmg += 0.1;
        System.out.println("Your DMG increased by 0.1! It is now " + dmg + ".");
		}      
    }  
    
    // player methods, to be defined for each subclass

    public abstract void heal();
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();
}
