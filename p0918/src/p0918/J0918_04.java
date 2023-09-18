package p0918;

public class J0918_04 {

	public static void main(String[] args) {
		A a = new A();
		//B b = new B();
		a.methodA(new C());// 이와 같이 만들면 위 B와 아래를 삭제하고 한줄로 간단히 만들수 있음
		//a.methodA(b);

	}

}

