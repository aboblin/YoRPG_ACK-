// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Peasant extends Player
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

    //heals the person by a quarter of their max HP
    public void heal()
    {
	if(potions <= 0){
	    System.out.println("Out of potions. :(");
	}
	else{
	    HP += 800/4;
	    if(HP > 800){
		HP = 800;
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
	def -= 100;
	dmg += 1;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 100*counter;
	dmg -= 1*counter;
	counter = 0;
    }

    //about
    //couldn't override the about() in Character if it's static
    public String about()
    {
	return "Peasant Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }


}

