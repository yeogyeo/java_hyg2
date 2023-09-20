package p0920;

public class J0920_15 {

	public static void main(String[] args) {
		int a = -5;
		System.out.println(Math.abs(a)); //절대값
		System.out.println("1-----------------------");
		
		double b = 12.912;
		System.out.println(Math.ceil(b)); //소수첨 첫째자리 올림
		System.out.println(Math.floor(b)); // 소수첨 첫째자리 버림
		System.out.println(Math.round(b)); // 반올림
		
		System.out.println("2--------------------");
		
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;
		
		System.out.println(Math.max(no1,  no2)); //최대값 추출
		System.out.println(Math.min(no1,  no2)); // 최소값 추출
		
		System.out.println("3------------------------");
		//3개의 no1,no2,no3 최대값과 최소값을 출력하시오.
		System.out.println(Math.max(Math.max(no1, no2), no3));
		System.out.println(Math.min(Math.min(no1, no2), no3));
		
		
		//퀴즈
		// no1,no2,no3 적은숫자 순으로 출력하시오. 10,13,15
		
		String min = null;
			
		if(no1 < no2 && no1 < no3 && no2 < no3) {
			min = no1+"<"+no2+"<"+no3;
		} else if(no1 < no2 && no1 < no3 && no3 < no2) {
			min = no1+">"+no3+">"+no2;
		} else if(no2 < no1 && no2 < no3 && no1 < no3) {
			min = no2+"<"+no1+"<"+no3;
		} else if(no2 < no1 && no2 < no3 && no3 < no1) {
			min = no2+"<"+no3+"<"+no1;
		} else if(no3 < no1 && no3 < no2 && no1 < no2) {
			min = no3+"<"+no1+"<"+no2;
		} else {
			min = no3+"<"+no2+"<"+no1;
		}
		System.out.println("가장 작은 수부터 나열 : " + min);
		

	}

}
