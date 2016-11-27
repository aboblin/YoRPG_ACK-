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
    
    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Monster Class:\n" +  "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    } 

}
