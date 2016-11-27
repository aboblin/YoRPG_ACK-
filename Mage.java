// Team ACK!! -- Brian Kwong, Elaina Chung, Adrian Boylan
// APCS1 pd1
// HW34 -- Ye Olde Role Playing Game, Unchained 
// 2016-11-22

public class Mage extends Player
{  
    //constructor, initializes values for all the instance variables above
    public Mage(String n)
    {
	name = n;
	HP = 1200;
	str = 400;
	def = 500;
	dmg = 0.7;
    }

    //heals the person by a quarter of their max HP
    public void heal()
    {
	if(potions <= 0){
	    System.out.println("Out of potions. :(");
	}
	else{
	    HP += 1200/4;
	    if(HP > 1200){
		HP = 1200;
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
	def -= 300;
	dmg += 0.8;
	counter += 1;
    }

    //def and dmg reset
    public void normalize()
    {
	def += 300*counter;
	dmg -= 0.8*counter;
	counter = 0;
    }

    public String about()
    {
	return "Mage Class:\n" + "Name: " + name + "\n HP: " + HP + "\n Strength: " + str + "\n Defense: " + def + "\n Attack Rating: " + dmg;
    }
    
    public String toString()
    {
	return "Mage Class:\n" + about();
    } 


}

