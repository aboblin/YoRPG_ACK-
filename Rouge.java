// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Rouge extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Rouge(String n)
    {
	name = n;
	HP = 1150;
	str = 700;
	def = 350;
	dmg = 0.6;
    }

    public String toString()
    {
	return "Rouge Class:\n" + about();
    } 


}

