package p0920;

public class J0920_01 {

	public static void main(String[] args) {
		Student s1 = new Student(1001);
		System.out.println(s1.getStuNum());
		
		Student s2 = new Student(1001);
		Student s3 = new Student(1003);
		
		if(s1.getStuNum()==s2.getStuNum()) { //학번을 비교해서 같다고 나옴
			System.out.println("s1,s2는같은 학생입니다.");
		}else {
			System.out.println("s1,s2는다른 학생입니다.");
		}
		
		System.out.println("-------------------------");
		
		
		if(s1.equals(s2)) { //(s1==s2)주소값으로 비교해서 다르다고 나옴  
			// if(s1.equals(s2) 이 경우에는 object를 호출해서 주소값 비교하므로 다르다고 나옴 따라서 스튜 클래스에서 오버라이딩 생성
			System.out.println("s1,s2는 같은 학생입니다.");
		}else {
			System.out.println("s1,s2는 다른 학생입니다.");
		}
		

	}//main

}//class
