package p0906;

public class J0906_07 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int[] num = { 1,2,3 };
		num = score; //주소를 복사 -> 값을 복사한것은 아니다.
		
		
		
		System.out.println("score : "+score);
		System.out.println("num : "+num);
		
		
		

}
}
