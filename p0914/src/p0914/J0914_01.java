package p0914;
public class J0914_01 {

	public static void main(String[] args) {
		
		//1. 기본생성자를 호출해서 값을 입력하는 방법
	    StuScore s1 = new StuScore(); //객체선언   기본생성자 호출  값이 들어가있지 않음
	    s1.setStuNo(1); //값입력
	    System.out.println("학생번호 : "+s1.getStuNo()); //직접값을 넣어야 들어감
//		s1.setName("홍길동");
//		s1.setKor(100); //100점 만점이나 200넣으면 들어감
//		s1.setEng(100);
//		s1.setMath(100);
//		s1.setTotal(s1.getKor()+s1.getEng()+s1.getMath());
//		s1.setAvg(s1.getTotal()/3.0);
		
		
		//생성자 - 객체생성때 초기화메소드 - 초기화란 데이터 입력
		//2. 전체 매개변수 생성자 제일 많이 사용
		StuScore s2 = new StuScore(1,"홍길동",100,100,100); // 넘버부터 매스까지 생성자 호출  값입력
		System.out.println("학생번호 : "+s2.getStuNo());//값이 들어감
		
	
		
		
		
		
		//3. 2개 매개변수 생성자
//		StuScore s1 = new StuScore(1,"홍길동"); // 넘버 이름 생성자 호출
//		s1.setKor(100); //100점 만점이나 200넣으면 들어감
//		s1.setEng(100);
//		s1.setMath(100);
		
		
		
		

	}//main

}//class
