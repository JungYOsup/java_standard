package com.hk.over;

public class Card_One {

	private String card;

	@Override
	public String toString() {
		return "[" + card + "]";
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((card == null) ? 0 : card.hashCode()); //해쉬코드를 오버라이드 하려면 소수를 곱하거나 더해줘야함(조건)
		return result;*/
		
		return card.hashCode() +137;
	}

	@Override
	public boolean equals(Object obj) {
		
		/*// 객체 특징
		
		if (this == obj) //비교하는 객체가 자신(this)에서 만들어진 객체인지 확인한다.
			return true;
		
		
		if (obj == null)//
			return false;
		
		if (getClass() != obj.getClass()) //비교하는 객체의 클래스와 만들어진 객체의 클래스 위치 비교
			return false;
		
		Card_One other = (Card_One) obj;
		if (card == null) {
			if (other.card != null) //
				return false;
		} else if (!card.equals(other.card))
			return false;
		
		return true;*/
		
		boolean isc = false;
		Card_One other = (Card_One)obj;
		if (card.equals(other.getCard())) {
			isc =true;
			
		}
		return isc;
	}

	//equals를 사용하려면 당연히 hashcode를 오버라이딩 해야함 







}
