package p0915_학생성적;

public class Product {
	
	String name;
	int price;
	int bonusPoint;
	
	@Override
	public String toString() {
		return String.format("%S,%d,%d",name,price,bonusPoint);
	}

}



