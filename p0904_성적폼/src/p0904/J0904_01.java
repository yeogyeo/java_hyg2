package p0904;

import java.util.Scanner;

public class J0904_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 90점이상이면 A, 80점 이상이면 B, 70점이상 C, 60점이상 D, F
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
	}else {
		System.out.println("F");
	}
		
		System.out.println("점수 : "+score);
		
		
		//숫자를 입력받아 보다 크면 이상인 숫자입니다.
		// 0보다 작으면 0미만인 숫자입니다.
		// 0이면 0 입니다.
		
//		System.out.println("숫자를 입력하세요.");
//		int number = scan.nextInt();
//		if(number>0) {
//			System.out.println("0보다 큰수입니다.");
//		}else if(number<0) {
//			System.out.println("0보다 작은수입니다.");
//		}else {
//			System.out.println("0 입니다.");
//		}
//		
//		System.out.println("숫자 : "+number);
		
		
		
		
		
//      -----------------------------------------------
//		점수를 입력받아 60점이상 합격
//		System.out.println("점수를 입력하세요");
//		int score = scan.nextInt();
//		
//		if(score>=60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불랍격입니다.");
//		}//if
//		
//		
//		System.out.println("점수 : "+score);

		
	}//maic
	}//class
