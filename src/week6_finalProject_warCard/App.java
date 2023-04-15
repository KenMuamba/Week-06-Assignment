package week6_finalProject_warCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
//determine the random order of player and card
	
	static Scanner scan =new Scanner(System.in);

	public static List<Player>getPlayers(Scanner scan){
		List <Player>players = new ArrayList<Player>(2);
		for(int index = 0; index < 2; index++) {
			System.out.printf("Enter Player %d name: ", index+1);
			String name = scan.nextLine();
			if((name  == null)||(name.isEmpty())) {
				name = String.format("player %d", index+1);
			}
			Player player = new Player(name);
			players.add(player);
		}
		return players;
	}
	
	public static void main(String[]args) {
		List<Player>players = getPlayers(scan);
		Player player1 = players.get(0);
		Player player2 = players.get(1);
		Deck deck = new Deck();
		deck.shuffles();
		player1.draw(deck);
		player2.draw(deck);
		//Iterates 26 rounds of War between Player 1 and Player 2.
		for(int counter = 0; counter<26;counter++) { 
			card_ player1Card = player1.flip();
			card_ player2Card = player2.flip();
			
			if(player1Card.getvalue()>player2Card.getvalue()) {
				System.out.println("_______________________________________");
				System.out.println("Player 1 Card: "+ player1Card.describe());
				System.out.println("Player 2 Card: "+ player2Card.describe());
				System.out.println("Player 1 gets a point");
				player1.incrementScore();
				System.out.println("Player 1 Score: "+player1.getScore());
				System.out.println("Player 2 Score: "+player2.getScore());
				System.out.println("_______________________________________");
			}
			else if(player1Card.getvalue()<player2Card.getvalue()) {
				System.out.println("_______________________________________");
				System.out.println("Player 1 Card: "+ player1Card.describe());
				System.out.println("Player 2 Card: "+ player2Card.describe());
				System.out.println("Player 2 gets a point");
				player2.incrementScore();
				System.out.println("Player 1 Score: "+player1.getScore());
				System.out.println("Player 2 Score: "+player2.getScore());
				System.out.println("_______________________________________");
			}
			else {
				System.out.println("_______________________________________");
				System.out.println("Player 1 Card: "+ player1Card.describe());
				System.out.println("Player 2 Card: "+ player2Card.describe());
				System.out.println("Tie. No points awarded");
				System.out.println("Player 1 Score: "+player1.getScore());
				System.out.println("Player 2 Score: "+player2.getScore());
				System.out.println("_______________________________________");
			}
		}
		
		System.out.println("Player 1 Score: "+player1.getScore());
		System.out.println("Player 2 Score: "+player2.getScore());
		if(player1.getScore()>player2.getScore()) {
			System.out.println("Player 1 is the winner!");
		}
		else if(player1.getScore()<player2.getScore()) {
			System.out.println("Player 2 is the winner!");
		}
		else {
			System.out.println("Tie!");
		}
	} 
	
	
}
