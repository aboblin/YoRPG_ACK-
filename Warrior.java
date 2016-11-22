/* Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
   APCS1 pd01
   HW#32 -- Your Own Rocket-Propelled Grenade Expanded 
   2016-11-20 */

public class Warrior extends Character 
{      
    //constructor, initializes values for all the instance variables above
    public Warrior(String n)
    {
	name = n;
	HP = 125;
	str = 100;
	def = 40;
	dmg = 0.4;
    }

    public String toString()
    {
	return "Warrior Class:\n" + about();
    } 


}

