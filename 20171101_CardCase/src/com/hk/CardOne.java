package com.hk;

import java.awt.Shape;

    public class CardOne {
	
    private String card;
	public  static final String[] SHAPE = {"♠","♥","♣","◆"}; 
	public  static final String[] NUM = {"1","2","3","4"};
	
	public CardOne() {
		this.cardOneMake();
	}
	
	
	private void cardOneMake() {
		
		int s = (int)(Math.random() * SHAPE.length);
		int n = (int)(Math.random()*NUM.length);
		card = SHAPE[s] + NUM[n];
		
		
		
	}

	@Override
	public int hashCode() {
	
		return card.hashCode()+137;
	}


	@Override
	public boolean equals(Object obj) {
		boolean isc =false;
		CardOne other= (CardOne)obj;
		
		if(this.card.equals(other.card)) {
			isc = true;
		}
		
		return isc;
	}


	@Override
	public String toString() {
		return "["+card+"]";
	

}
}
