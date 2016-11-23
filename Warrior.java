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

    //def is decreased and dmg is increased, counter idea credits given to Ishtiaque Mahdi!
    public void specialize()
    {
	def -= 200;
	dmg += 0.5;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 200*counter;
	dmg -= 0.5*counter;
    }

    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Warrior Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }
}

