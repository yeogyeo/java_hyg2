package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class ColAction {
	
	Card[] card = new Card[52];
	String[] shape = {"Spade","Heard","Diamond","Clover"}; 
	ArrayList<StuScore> list = new ArrayList();
	ArrayList<Car> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();
	
	//학생3명 리턴
	HashMap<String, Object> scoreAll() {
		//3명
		list.add(new StuScore("홍길동",100,100,99));
		list.add(new StuScore("유관순",100,100,99));
		list.add(new StuScore("이순신",100,100,99));
		
		
	
	    list2.add(new Car("white",5));
		list2.add(new Car("red",4));
		list2.add(new Car("black",5));
		
		map.put("list", list);
		map.put("list2", list2);
		
		return map;
	}
	
	
	//3대
//	ArrayList<Car> scoreAll() {
//		//3명
//		list.add(new StuScore("홍길동",100,100,99));
//		list.add(new StuScore("유관순",100,100,99));
//		list.add(new StuScore("이순신",100,100,99));
//		
//		
//	//3대
//	    list2.add(new Car("white",5));
//		list2.add(new Car("red",4));
//		list2.add(new Car("black",5));
//		
//		return list2;
//	}
	
	
	
 
	
	
	
	
	void cardAll() {
		//1-13
		//Spade,Heart,Diamond,Clover
		//52장의 카드를 생성하시오.
		for(int i=0;i<card.length;i++) {
			int number = i%13+1; // 1-13
			String kind = shape[i/13];
			card[i] = new Card(number,kind);
		}
	}
		
		//카드52장 리턴
		Card[] cardInsert() { //인스턴스 메소드
			cardAll(); //50장 card참조변수
		  return card;
		
	}
	
	
	//카드1장리턴
//	Card cardInsert() { //인스턴스 메소드
//		cardAll(); //50장 card참조변수
//		Card c = new Card();
//		c.setNumber(1);
//		c.setKind("Spade");
//	  return c;
//		
//	  
//	}

	
	
	
	
}//class
