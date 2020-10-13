package com.hk;

public class CardCase {
	
	//List<CardOne> lists = new ArrayList<CardOne>();
	
	private CardOne[] cardCase;
	
	public CardCase() {
		int caseSize = CardOne.NUM.length*CardOne.SHAPE.length;
		cardCase = new CardOne[caseSize];
		this.cardCaseMake();
		}
	
	private void cardCaseMake() {
		int index =0;
		while (true) {
			CardOne one = new CardOne();
			
			if(!duplicate(one, index)) {
				cardCase[index++] = one;
				
			}
			if(index == cardCase.length) {
				break;
			}
			
		}
	} // cardCase
	
	public CardOne[] getCardCase() {
		return cardCase; 
	}

	//객체의 중복 여부 판단
	private boolean duplicate(CardOne card, int index) {
		boolean isc = false;
		//List를 사용했다면 Contains를 사용하면됨
		//List를 사용했다면 입력되는 크기가 객체의 크기이기 때문에
		//List의 Size를 사용하면됨
		
		//하지만 기본배열의 경우 참조타입의 초기화는 null이다.
		//따라서 NullPointException이 발생 하기 때문에 위치 값도 받아야 함
		
	
		for (int i = 0; i <index ; i++) { //중복이면 true;
			if(cardCase[i].equals(card)) {
				isc =true;
				break;
			}
		}
		
		
		return isc;
	}
	

}
