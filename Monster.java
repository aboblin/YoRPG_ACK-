// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW32 -- Ye Olde Role Playing Game, Expanded
// 2016-11-20

public class Monster extends Character
{
    //constructor, initializes values for all the instance variables above
    public Monster()
    {
	HP = 150;
	def = 20;
	str = (int)(Math.random()*45)+20;
	dmg = 1.0;
    }

    public String toString()
    {
	return "Monster Class:\n" + about();
    } 

}
