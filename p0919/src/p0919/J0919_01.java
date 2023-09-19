package p0919;

public class J0919_01 {

	public static void main(String[] args) {
		int[] n = {10,20,30,40,50};
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}//for

		System.out.println("----------------------");
		for(int a:n) { // 단순for문
			System.out.println(a);
		}//단순 for
		
		System.out.println("-----------------------");
		
	
	
	
	}//main

class JJJ{ // 같은 클래스 내 다른 클래스 생성 가능하나 패키지 네임과 같은 클래스 하나만 public을 붙힐 수 있음
	
}

class KKK{
	
}

}//class
