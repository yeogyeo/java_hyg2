package p0912;

public class Child extends Parent{
	int x = 20; //인스턴스 변수
	void method() { //인스턴스 메소드
		int x = 100;
		System.out.println("x : "+x); //지역변수를 받으나 지역변수가 없으면 인스턴스 변수 가져오고 인스턴스도 없으면 조상 클래스에서 가져오고 조상에서도 없으면 에러
		System.out.println("this.x : "+this.x);
		System.out.println("super.x : "+super.x);
	}

}
