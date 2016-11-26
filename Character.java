// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public abstract class Character
{
    // instance vars
    protected int counter = 0;
    protected String name = "";
    protected int HP;
    protected int str;
    protected int def;
    protected double dmg;
    protected int potions = 10;
   
    //returns boolean indicating living or dead when
    //true when HP is over 0, else false
    public boolean isAlive() 
    {
        return (HP > 0);
    }
    
    public String getName()
    {
        return name;
    }

    public int getHP()
    {
	return HP;
    }
    
    //returns defense attribute
    public int getDefense()
    {
	return def;
    }

    //decreases HP by HPlost
    public void lowerHP(int HPlost)
    {
	HP -= HPlost;
    }

    //lowers monster HP by int damage
    public int attack(Character c) 
    {
	int damage = (int)((str * dmg) - c.getDefense());
	if ( damage < 0 ){
	    damage = 0;
	}
	c.lowerHP(damage);
	return damage;
    }
    public abstract void heal();
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();
 
    //def is decreased and dmg is increased, counter idea credits given to Ishtiaque Mahdi!
    // public void specialize() 
    // {
    // 	def -= 30;
    // 	dmg += 0.5;
    // 	counter += 1;
    // }

    //def and dmg reset
    // public void normalize() 
    // {
    // 	def += 30*counter;
    // 	dmg -= 0.5*counter;
    // }

    // public static String about()
    // {
    //     return "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    // }
}
