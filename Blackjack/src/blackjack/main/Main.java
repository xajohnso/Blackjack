package blackjack.main;

import blackjack.deck.Deck;
import blackjack.player.Dealer;
import blackjack.player.Player;

public class Main {
	
	static Player playerOne = new Player();
	static Dealer dealer = new Dealer();
	static Deck deck = new Deck();
	static int round = 0;
	static int turn = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck.makeDeck();
		deck.shuffleDeck();
		playerOne.start(1);
		playerOne.startingCard(deck);
		
		boolean tusw = turn % 2 == 0;
		System.out.println(tusw);
		
		do {
			if (tusw == true) {
			playerOne.play(deck); round++;
			} else {
			dealer.play(deck); round++; turn++;
			}

		} while (round < 3);

	}

}
