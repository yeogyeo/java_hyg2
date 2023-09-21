package p0921;

public class J0921_10 {

	public static void main(String[] args) {
		// 52장의 카드를 출력하시오.
		
		ColAction2 col2 = new ColAction2();
		
		Card[] c = col2.cardInsert();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].getKind());
			System.out.println(c[i].getNumber());
		}

	}

}
