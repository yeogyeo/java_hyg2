package p0913;

public class Deck {
	 
	String[] shape = {"Heart","Spade","Diamond","Clover"};
	Card[] c = new Card[52];
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13],i%13+1);
			System.out.println(c[i]);
		}//for
		
	}//Deck
	
	//특정번호 카드
	Card pick(int no) {
		if(no>52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");
			return c[no%52];
		}
		return c[no]; //c:주소값
	}
	
	//랜덤
	Card pick() {
		int random = (int)(Math.random()*52);
		return c[random];
	}

	//카드 섞기
	void shuffle() {
		Card temp;
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*52);
			
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
	}
	
	void CardPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]); // 0-51
		}
	}
	
}







