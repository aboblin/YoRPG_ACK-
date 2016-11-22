// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20

public class Peasant extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Peasant(String n)
    {
	name = n;
	HP = 90;
	str = 20;
	def = 10;
	dmg = 0.2;
    }

    public String toString()
    {
	return "Peasant Class:\n" + about();
    } 


}

