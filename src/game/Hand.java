package game;

public class Hand {

	Card cardOne;
	Card cardTwo;
	private int handValue = 0;
	private int aceCount = 0;
	
	public Hand(Card cardOne, Card cardTwo) {
		this.cardOne = cardOne;
		this.cardTwo = cardTwo;
		InitializeHandValues();
	}
	
	public void InitializeHandValues() {
		handValue += cardOne.getCardValue() + cardTwo.getCardValue();
		
		if (cardOne.getValue() == 1) {
			aceCount++;
		}
		
		if (cardTwo.getValue() == 1) {
			aceCount++;
		}
		
		while (handValue > 21 && aceCount > 0) {
			handValue = handValue - 10;
			aceCount--;
		}
	}
	
	public void hit(Card nextCard) {
		handValue += nextCard.getCardValue();
		if (nextCard.getValue() == 1) {
			aceCount++;
		}
		
		while (handValue > 21 && aceCount > 0) {
			handValue = handValue - 10;
			aceCount--;
		}
	}
	
	public int getHandValue() {
		return handValue;
	}
	
}
