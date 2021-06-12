package blackjack.player;

import java.util.Scanner;

import blackjack.deck.Deck;

public class Player extends Person {

	public void start(int playerNumber) {
		setPlayerNumber(playerNumber);
		int money; money = (int) (Math.random() * (5000 - 500 + 1) + 500);
		setMoneyOwned(money);
	}

	@Override
	public void play(Deck deck) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		stats();
		System.out.println(" 1: Increase bet \n 2: Hit \n 3: Hold" );
		switch(sc.nextInt()) {
		case 1: 
			increaseBet(deck);
			play(deck);
		break;
		case 2:
			addCard(deck);
		break;
		case 3:
		break;
		default:
		System.out.println("Invalid choice.");
		play(deck);
		break;
		}
		sc.close();
		
	}
	
	public void stats() {
		System.out.println("Money: " + getMoneyOwned());
		System.out.println("Cards: " + getPlayerHand());
	}
	
	public void increaseBet(Deck deck) {
		Scanner sj = new Scanner(System.in);
		System.out.println("How much more will you bet? Enter numerical amount: $");
		int betAmount = sj.nextInt();
		boolean moneyCheck = betAmount > getMoneyOwned();
		if (moneyCheck == true) {
			System.out.println("Invalid amount");
			play(deck);
		} else {
			setMoneyOwned((getMoneyOwned() - betAmount));
			sj.close();
		}
		
	}
	
}
