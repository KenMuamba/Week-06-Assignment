package week6_finalProject_warCard;
//1.b

//Let's import some randomizer

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
//*Deck constructor populates cards List w/ 52.
	private List<String> cardNames= List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Queen", "King", "Ace");
	protected List<card_>cards;
	final int TOP_CARD = 0;
	
	public Deck() {
		cards = new ArrayList<card_>();
		for(int cardName = 0; cardName<4; cardName++) {
			for(int cardvalue = 2; cardvalue <=14; cardvalue++) {
				cards.add(new card_());
			}
		}
	}
	public List<card_> getCards(){
		return cards;
	}
	
	/**
	 * Randomizes
	*/
	public void shuffles() {
		Collections.shuffle(cards);
	}
	
	public card_ draw() {
		card_ drawnCard = cards.get(TOP_CARD);
		cards.remove(TOP_CARD);
		return drawnCard;
	}
}
