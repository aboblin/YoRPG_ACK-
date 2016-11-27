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

    // player methods, to be defined for each subclass
    public abstract void addItems(String s);
    public abstract void heal();
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();
}
