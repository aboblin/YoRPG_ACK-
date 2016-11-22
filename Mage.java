// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20

public class Mage extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Mage(String n)
    {
	name = n;
	HP = 100;
	str = 50;
	def = 30;
	dmg = 0.7;
    }

    public String toString()
    {
	return "Mage Class:\n" + about();
    } 


}

