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

     //def is decreased and dmg is increased, counter idea credits given to Ishtiaque Mahdi!
    public void specialize()
    {
	def -= 150;
	dmg += 0.6;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 150*counter;
	dmg -= 0.6*counter;
    }

    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Rouge Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }


}

