package p0913;

public class Card {
	
	Card(){}
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
		
	}
	
	final int NUMBER_MAX = 13;
	String kind; //모양 스페이드 하트 다이아 클로버
	int number; // 1-13
	private int flag;
	
	
	String[] CardShape = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public String toString() {
		return String.format(" [%s, %s ]",kind,CardShape[number]);
	}

}
