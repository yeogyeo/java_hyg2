package p0912;

public class StuScore3 {
	
	StuScore3(){}
	
	 StuScore3(int stuNo, String name, int kor, int eng, int math) {
		this.stuNo = stuNo; //this.은 인스턴스 변수 가리킴
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}
