package week6_finalProject_warCard;

import java.util.HashMap;
import java.util.Map;

public class card_ {

//1.a

//setting members	
	private Map<Integer, String>cardValue;
	private Map<Integer, String>cardName;
	private int value;
	private int name;
	
//setting constructor
	public void card (int name, int value) {
		this.setName(name);
		this.setvalue(value);	
	}
	
// setting getters and setters
	
	
	public int getvalue() {
		return value;
		
	}
	
	public void setvalue(int value) {
		if(value <=14 && value >= 2) {
			this.value = value;
		}
		else {
			System.out.println("Error: card value needs to be between 2 and 14");
		}
	}
	
	public int getName() {
		return name;
	}

	public void setName(int name) {
		if(name >= 0 && name <4) {
		this.name = name;
		}
		else {
			System.out.println("Error: card value needs to be between 0 and 3");
		}
	}
	
	/**Let's print out information about cards
	*return
	*/
	
	public StringBuilder describe() {
		StringBuilder info = new StringBuilder();
		// TODO Auto-generated method stub
		cardValue = new HashMap<Integer,String>();
		cardName = new HashMap<Integer,String>();
		cardValue.put(2, "Two");
		cardValue.put(3, "Three");
		cardValue.put(4, "Four");
		cardValue.put(5, "Five");
		cardValue.put(6, "Six");
		cardValue.put(7, "Seven");
		cardValue.put(8, "Eight");
		cardValue.put(9, "Nine");
		cardValue.put(10, "Ten");
		cardValue.put(11, "Jack");
		cardValue.put(12, "Queen");
		cardValue.put(13, "King");
		cardValue.put(14, "Ace");
		
		cardName.put(0,"Clubs");
		cardName.put(1,"Diamonds");
		cardName.put(2,"Hearts");
		cardName.put(3, "Spades");
		
		return info.append(cardValue.get(getvalue())).append(" of ").append(cardName.get(getName()));
	}
}
