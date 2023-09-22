package p0922_학생성적정렬;

public class StuScore {
	
	static int count=1;
	{ //초기화 블럭
		this.stNum = count;
		count++;
	}
	
	public StuScore() {} //기본생성자
	

	
	public StuScore(String name, int kor, int eng, int math) { //4개 매개변수
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
		
	}
	
	


     //전체 생성자
	public StuScore(int stNum, String name, int kor, int eng, int math, int total, double avg, int rank) { 
		super();
		this.stNum = stNum; //2번 stuNum입력이 되는 것임.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}



	private int stNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor>=0 && kor<=100) {
			this.kor = kor;
		}else if(kor<0){
			this.kor = 0;
			
		}else {
			this.kor = 100;
		}
	} //setKor
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	

}
