// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Warrior extends Character 
{      
    //constructor, initializes values for all the instance variables above
    public Warrior(String n)
    {
	name = n;
	HP = 1300;
	str = 1000;
	def = 400;
	dmg = 0.5;
    }

    public String toString()
    {
	return "Warrior Class:\n" + about();
    } 


}

