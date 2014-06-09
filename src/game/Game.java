package game;

public class Game {

	public Deck deck;
	public Hand dealerHand;
	public Hand userHand;
	
	private int wins;
	private int losses;
	
	public Game(Deck deck) {
		this.deck = deck;
		userHand = new Hand(deck.dealCard(), deck.dealCard());
		dealerHand = new Hand(deck.dealCard(), deck.dealCard());
	}
}
