// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Mage extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Mage(String n)
    {
	name = n;
	HP = 1200;
	str = 400;
	def = 500;
	dmg = 0.7;
    }

    public String toString()
    {
	return "Mage Class:\n" + about();
    } 


}

