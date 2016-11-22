// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20

public class Rouge extends Character 
{  
    //constructor, initializes values for all the instance variables above
    public Rouge(String n)
    {
	name = n;
	HP = 115;
	str = 70;
	def = 35;
	dmg = 0.5;
    }

    public String toString()
    {
	return "Rouge Class:\n" + about();
    } 


}

