package com.hk.over;

public class CardMain {

	public static void main(String[] args) {
		
		Card_One  card1 = new Card_One();
		card1.setCard("♠A");
		
		Card_One  card2 = new Card_One();
		card2.setCard("♠A");
		
		
		
	    System.out.println(card1.getCard()); // 객체 안에 값을 가져와서 출력 
     	System.out.println(card1);
		System.out.println(card1.equals(card2)); //false //두개의 객체가 만들어지므로 해쉬코드가 다르기때문에 ,  //오버라이딩 된다음에는 true로 바뀜
		System.out.println(card1.getCard() == card2.getCard()); //true/ //값을 비교하기때문에
		
		System.out.println("card1 = " + card1.hashCode()); //이렇게 hashCode 드로 호출할경우 같은해쉬코드를 가지게됨.
		System.out.println("card2 =" + card2.hashCode());
		//card1 == card2 출력되는 값은 같지만 비교할수 없음 -> 객체니까
		System.out.println(card1);
		System.out.println(card2);
		
		//그래서 객체를 비교하는 equals를 사용해서 비교해 보자
		//그렇다면 equals는 hashcode 객체 안의 값으로 hashcode를 생성하면 비교하기 쉽지않을까?
		
	}

}
