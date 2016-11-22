// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20

public class Archer extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Archer(String n)
    {
	name = n;
	HP = 100;
	str = 60;
	def = 25;
	dmg = 0.6;
    }

    public String toString()
    {
	return "Archer Class:\n" + about();
    } 

}

