// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Peasant extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Peasant(String n)
    {
	name = n;
	HP = 800;
	str = 100;
	def = 100;
	dmg = 0.2;
    }

    public String toString()
    {
	return "Peasant Class:\n" + about();
    } 


}

