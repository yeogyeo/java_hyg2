package p0914;

public class J0914_03 {

	public static void main(String[] args) {
		Car c; //주소값만 존재
		FireEngine f1 = new FireEngine();
		
		System.out.println("[ f1 기능 ]");
		f1.go();
		f1.stop();
		f1.water();
		
		
		c = f1; //FireEngine Car 형변환 생략가능
		Ambulance a1 = new Ambulance();
		c = a1;//엠뷸련스 카 형변환
		
		System.out.println("[c 기능 ]");
		c.go();
		c.stop();
		// c에는 water()공간은 있지만 c참조변수는 water()를 사용할 수 없음
		//c.water;  사용불가
		FireEngine f2; //주소값
		Ambulance a2;
		if(c instanceof FireEngine) {
			System.out.println("[ f2 기능 ]");
			f2 = (FireEngine)c;
			f2.go();
			f2.stop();
			f2.water();
			
		}
		
		if(c instanceof Ambulance) {
			a2 = (Ambulance)c;
		}
		
		//a2 = (Ambulance)c; 
		//f2 = (FireEngine)c;
		
		f2 = (FireEngine)c;// FireEngine 형변환 생략 불가
	
		f2.go();
		f2.stop();
		f2.water();

	}

}
