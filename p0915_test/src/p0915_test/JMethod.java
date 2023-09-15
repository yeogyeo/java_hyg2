package p0915_test;

public class JMethod {
	JMethod(){ //생성자는 객체선언할때만 사용할 수있고 호출은 절대불가
		
	}
	
	//인스턴스 메소드
//	int calculate(int n1,int n2) { // 이름이 같든 다르든 상관 없으나 이름이 다르므로 헷갈릴 수 있음
//		//입력받은 2개의 숫자를 4칙연산
//		int result = n1+n2;
//		int result2 = n1-n2;
//		int result3 = n1*n2;
//		int result4 = n1/n2;
//		
//		//위에 값을 모두 더한값을 J01 클래스로 보낼경우는 리턴값 단 딱 하나만 보낼수 있으나 콜렉션으로 담아서 보내줄수있음
//		
//		return result+result2+result3+result4; //메소드가 void는 리턴값이 없으므로 보낼수없으므로 변경
//		
//		
//	}//calculate
	
	int cal(int n1,int n2,int n3,int n4) {
		//입력받은 2개의 숫자를 4칙연산
		int result = n1+n2+n3+n4;
		int result2 = n1*n2*n3*n4;
		
		return result+result2;
		
		
		
	}
	
	int cal(int []n) {
		//입력받은 2개의 숫자를 4칙연산
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
		
		return result+result2;
		
		
		
	}
	
	

}
