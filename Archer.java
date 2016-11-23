// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Archer extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Archer(String n)
    {
	name = n;
	HP = 1000;
	str = 600;
	def = 450;
	dmg = 0.6;
    }

    public String toString()
    {
	return "Archer Class:\n" + about();
    }
	

}

