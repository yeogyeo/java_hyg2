package p0921;

import java.util.ArrayList;

public class ColAction2 {
	Card[] c = new Card[52];
	String[] shape = {"Spade","Haret","Diamond","Clover"};
	ArrayList<Card> list = new ArrayList();
	

	
	void cardAll() {
		//52장의 카드를 생성해서
		for(int i=0;i<c.length;i++) {
		    int number = i%13+1;
		    String kind = shape[i/13];
		    c[i] = new Card(number,kind);
		}
		

}//cardAll
	
	Card[] cardInsert() {
		cardAll();
		return c;
	}

	
	
	
	
}