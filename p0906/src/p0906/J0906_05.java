package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_05 {

	public static void main(String[] args) {
		//선언 부분
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];   //전체번호
		int[] winlotto = new int[6]; //당첨번호
		int[] myNum = new int[6];    //입력번호
		
		

		// 1-45 번호 입력 부분
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // for
		
		//번호섞기 부분
		for(int i=0;i<200;i++) {
			int random = (int)(Math.random()*45); //0-44
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}//for
		
		//당첨번호 입력부분
		for(int i=0;i<6;i++) {
			winlotto[i] = lotto[i]; //당첨번호
		}//for
		Arrays.sort(winlotto); //순차정렬
		
		//나의 번호 부분
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.(1-45)");
			myNum[i] = scan.nextInt();
		}
		Arrays.sort(myNum); //순차정렬 - 낮은 숫자가 처음에 옴
		

		// 번호출력
		System.out.println("------------------------------");
		System.out.println("      로또 105호차 번호");
		System.out.println("------------------------------");
		// 나의번호출력
		System.out.print("◆ 나의입력번호 : ");
		for(int i=0;i<myNum.length;i++) {
			System.out.print(myNum[i]+"  ");
		}
		System.out.println();
		
		//당첨번호출력
		System.out.print("★ 당첨번호 : ");
		for (int i = 0; i < 6; i++) { // 렝스가 아닌 6을 넣으면 숫자 6개만 나옴
				System.out.print(winlotto[i]+"  ");
				
		}//for
		System.out.println();

	}// main

}// class
