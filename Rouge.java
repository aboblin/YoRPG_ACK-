// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Rouge extends Player
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

    //heals the person by a quarter of their max HP
    public void heal()
    {
	if(potions <= 0){
	    System.out.println("Out of potions. :(");
	}
	else{
	    HP += 1150/4;
	    if(HP > 1150){
		HP = 1150;
	    }
	    potions -= 1;
	}
    }

    //method for when a monster drops an item so you can 
    public void addItems(String item)
    {
	if ( item.equals("Potion") ) {
	    potions += 1;
		}
        
	if ( item.equals("Shield") ) {
	    def += 100;
		}
        
	if ( item.equals("Sword") ) {
	    str += 100;
		}
        
	if ( item.equals("Wristband") ) {
	    dmg += 0.1;
		}      
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
	counter = 0;
    }

    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Rouge Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }


}

