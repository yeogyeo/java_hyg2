package p0912;

public class Deck {
	
	String[] shape = {"Heart","Spade","Diamond","Clover"};
	Card[] c = new Card[52];
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[1/13],i%13+1);
			System.out.println(c[i]);
		}
	
	
//	String[] shape = {"Haert","Spade","Diamon","Clover"};
//	Card[] c = new Card[52];
//	
//	Deck() { //기본생성자
//		
//		for(int i=0;i<c.length;i++) {
//			c[i] = new Card(shape[i/13],(i%13)+1); 
//			//c[i].kind = shape[i/13];
//		//	c[i].number = (i%13)+1;
//			//System.out.println(c[i]);
//	}
	
	
		 
		
	}//Deck
	
	//특정번호 카드 가져오기
	Card pick(int no) {
		if(no>52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");
		    return c[no%52];
		}
		return c[no];
	}
	
	//랜덤으로 카드 가져요기
	Card pick() {
		int random = (int)(Math.random()*52);
		return c[random];
	}

	
	
	
	void shuffle() {
		Card temp;
		for(int i=0;i<1000;i++) {
			//52 -> 0-51
			int random = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
			
		} //for
	}
	
	//모든 카드 출력 메소드
	void cardPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
