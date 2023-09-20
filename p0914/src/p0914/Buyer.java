package p0914;

import java.util.ArrayList;

public class Buyer {
	
	Buyer(){}
	Buyer(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	
	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;
	
	//Product[] cart = new Product[10];
	//컬렉션 선언
	ArrayList list = new ArrayList(); 
	
	//int i=0;
	void buy(Product p) { // 다형성 // 매우중요
		//상품금액이 현재잔액보다 큰 경우 
		money -= p.price;
		bonusPoint += p.bonusPoint; 
		//cart[i] = p; //p 를 Product[]배열에 담음.
		list.add(p);
		//i++;
	}
	
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	
//}
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	
//	}
//	void buy(Washing w) {
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//	
//	}












}



