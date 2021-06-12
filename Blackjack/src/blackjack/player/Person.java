package blackjack.player;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

import blackjack.deck.Deck;

public class Person {

	private int moneyOwned = 0;
	private int playerNumber = 0;
	private LinkedHashMap<String, Integer> playerHand = new LinkedHashMap<String, Integer>();
	private HashMap<String, Integer> ref;
	
	public Person() {
		
	}
	
	public Person(int playerNumber, int moneyOwned) {
		this.playerNumber = playerNumber;
		this.moneyOwned = moneyOwned;
	}
	
	public int getMoneyOwned() {
		return moneyOwned;
	}
	public void setMoneyOwned(int moneyOwned) {
		this.moneyOwned = moneyOwned;
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public LinkedHashMap<String, Integer> getPlayerHand() {
		System.out.println(playerHand.keySet());
		return playerHand;
	}
	public void setPlayerHand(LinkedHashMap<String, Integer> playerHand) {
		this.playerHand = playerHand;
	}
	
	public void play(Deck deck) {}
	
	public void addCard(Deck deck) {
		String tem = deck.deck.pollFirst();
		if (Pattern.matches("Ace", tem) == true) {
			playerHand.put(tem, 11); 
			if (handCheck(deck) == true) {
				playerHand.replace(tem, 11, 1);
			} else {}
		} else if (Pattern.matches("Two", tem) == true) {
			playerHand.put(tem, 2); handCheck(deck);
		} else if (Pattern.matches("Three", tem) == true) {
			playerHand.put(tem, 3); handCheck(deck);
		} else if (Pattern.matches("Four", tem) == true) {
			playerHand.put(tem, 4); handCheck(deck);
		} else if (Pattern.matches("Five", tem) == true) {
			playerHand.put(tem, 5); handCheck(deck);
		} else if (Pattern.matches("Six", tem) == true) {
			playerHand.put(tem, 6); handCheck(deck);
		} else if (Pattern.matches("Seven", tem) == true) {
			playerHand.put(tem, 7); handCheck(deck);
		} else if (Pattern.matches("Eight", tem) == true) {
			playerHand.put(tem, 8); handCheck(deck);
		} else if (Pattern.matches("Nine", tem) == true) {
			playerHand.put(tem, 9); handCheck(deck);
		} else if (Pattern.matches("Ten", tem) == true) {
			playerHand.put(tem, 10); handCheck(deck);
		} else if (Pattern.matches("Jack", tem) == true) {
			playerHand.put(tem, 10); handCheck(deck);
		} else if (Pattern.matches("Queen", tem) == true) {
			playerHand.put(tem, 10); handCheck(deck);
		} else if (Pattern.matches("King", tem) == true) {
			playerHand.put(tem, 10); handCheck(deck);
		} else {}
		
	}
	
	public Boolean handCheck(Deck deck) {
		int count = 0;
		for (int va : playerHand.values()) {
			count = count + va;
		}
		boolean check = count > 21;
		if (check) {
			System.out.println("Bust");
		} else {
			play(deck);
		}
		
		return check;
	}
	
	public void startingCard(Deck deck) {
		String tem = deck.deck.pollFirst();
		if (Pattern.matches("Ace", tem) == false) {
			playerHand.put(tem, 11); 
		} else if (Pattern.matches("Two", tem) == false) {
			playerHand.put(tem, 2); 
		} else if (Pattern.matches("Three", tem) == false) {
			playerHand.put(tem, 3); 
		} else if (Pattern.matches("Four", tem) == false) {
			playerHand.put(tem, 4); 
		} else if (Pattern.matches("Five", tem) == false) {
			playerHand.put(tem, 5); 
		} else if (Pattern.matches("Six", tem) == false) {
			playerHand.put(tem, 6); 
		} else if (Pattern.matches("Seven", tem) == false) {
			playerHand.put(tem, 7); 
		} else if (Pattern.matches("Eight", tem) == false) {
			playerHand.put(tem, 8); 
		} else if (Pattern.matches("Nine", tem) == false) {
			playerHand.put(tem, 9); 
		} else if (Pattern.matches("Ten", tem) == false) {
			playerHand.put(tem, 10);
		} else if (Pattern.matches("Jack", tem) == false) {
			playerHand.put(tem, 10); 
		} else if (Pattern.matches("Queen", tem) == false) {
			playerHand.put(tem, 10);
		} else if (Pattern.matches("King", tem) == false) {
			playerHand.put(tem, 10);
		} else {}
		
	}
	
	public HashMap<String, Integer> fillRef() {
		ref.put("Ace", 1);
		ref.put("Two", 2);
		ref.put("Three", 3);
		ref.put("Four", 4);
		ref.put("Five", 5);
		ref.put("Six", 6);
		ref.put("Seven", 7);
		ref.put("Eight", 8);
		ref.put("Nine", 9);
		ref.put("Ten", 10);
		ref.put("Jack", 10);
		ref.put("Queen", 10);
		ref.put("King", 10);
		return ref;
	}
	
}
