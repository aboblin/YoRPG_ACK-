// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Monster extends Character
{
    //constructor, initializes values for all the instance variables above
    public Monster()
    {
	HP = 1500;
	def = 200;
	str = (int)(Math.random()*250)+400;
	dmg = 1.0;
    }

    public String toString()
    {
	return "Monster Class:\n" + about();
    } 

}
