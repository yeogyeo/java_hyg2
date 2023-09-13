package p0913;

public class Buyer {
	String id="aaa";
	String name="hong";
	int money = 10000000;
	int bonusPoint = 0;
	
	
	//Tv를 구매했을대 사용하는 메소드
	void buy(Product p) { //다형성
		money = money - p.price;
		bonusPoint += p.bonusPoint;
	}
	
//	//Computer 구매 메소드
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += bonusPoint;
//
//}
}