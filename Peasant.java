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
     //def is decreased and dmg is increased, counter idea credits given to Ishtiaque Mahdi!
    public void specialize()
    {
	def -= 100;
	dmg += 1;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 100*counter;
	dmg -= 1*counter;
    }

    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Peasant Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }


}

