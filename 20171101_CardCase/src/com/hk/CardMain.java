package com.hk;

public class CardMain {
	
	public static void main(String[] args) {
		CardCase cards = new CardCase();
		CardOne[] cardList = cards.getCardCase();
		
		for (int i = 0; i < cardList.length; i++) {
			System.out.println(cardList[i]+ ":0" + cardList[i].hashCode());
		}
	}

}
