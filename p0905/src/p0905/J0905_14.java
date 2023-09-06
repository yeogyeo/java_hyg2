package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int[] num = new int[10]; 
		int random = (int)(Math.random()*100)+1;
		int i = 0;
		
		while(i<10) {
			System.out.println("숫자를 입력하여라.>>");
			int input = scan.nextInt();
			num[i] = input;
			
			if(random==input) {
				System.out.println("맞췄다.");
				break;
			}else if(random>input) {
				System.out.println("틀렸다 더 큰수다.");
			}else {
				System.out.println("틀렸다 더 작은수다.");
			}
			if(i==8) {
				break;
			}
			i++;
		}
		
		
//		int[] num = new int[10]; // 배열 10개 생성
//
//		// 1-100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
//		// 1. 랜덤숫자 생성 
//		int random = (int)(Math.random()*100)+1; //1-100
//		//random=35;
//		int i = 0; //초기식
//		
//		// 2. while 무한반복
//		while(i<10) {
//			
//			// 3. num 숫자입력받기
//			System.out.println("숫자를 입력하세요.>>");
//			int input = scan.nextInt(); //입력한 숫자를 배열에 저장
//			num[i] = input; //입력한 숫자를 배열에 저장
//		    // 4. if를 사용해서 랜덤숫자와 입력숫자가 맞는지 비교
//			// 5. 큰수, 작은수, 정답 - berak;
//		if(random==input) {
//			
//			System.out.println("정답입니다.");
//			break;
//		}else if(random>input) {
//			
//			System.out.println("입력한 숫자보다 더 큰수입니다.");
//		}else {
//			
//			System.out.println("입력한 숫자보다 더 작은수 입니다.");
//		}
//		if(i==9) {
//			break;
//		}
//		   i++; //증감식
//		
//	}//while
		
//		System.out.print("입력한 숫자 : ");
//		for(int j=0;j<i;j++) {
//			System.out.printf("%d ",num[j]);
//		}
//		System.out.println();
//		
//		System.out.println("랜덤 숫자 : "+random);
		
//		int random = (int)(Math.random()*100)+1;
//		System.out.println(" 숫자 맞추기를 시작하지 ]");
//		
//		while(true) {
//			System.out.println("1-100사이 숫자를 입력해라.");
//		}
		
//		int random = (int)(Math.random()*100)+1;
//		System.out.println(" [숫자 맞추기 게임 ]");
//		
//		while(true) {
//			System.out.println("1-100사이의 숫자를 입력하세요.");
//			int i =scan.nextInt();
//			if(random==i) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(random>i) {
//				System.out.println("입력한 숫자보다 큰수입니다.!!");
//				System.out.println();
//			}else {
//				System.out.println("입력한 숫자보다 작은 수 입니다.!!");
//			}
//		}
		

//		int random = (int) (Math.random() * 100) + 1;
//
//		System.out.println("[ 숫자 맞추기 게임 ]");
//
//		// 숫자맞추기
//		while (true) {
//			System.out.println("1-100사이의 숫자를 입력하세요.");
//			int i = scan.nextInt();
//			if (random == i) {
//				System.out.println("정답입니다.");
//				break;
//			} else if (random > i) {
//				System.out.println("입력한 숫자보다 큰수입니다.!!");
//				System.out.println();
//			} else {
//				System.out.println("입력한 숫자보다 작은 수입니다.!!");
//			}
//		} // while

		// for(int i=0;i<3;i++)

		// System.out.println(num); //주소값이 출력
		// System.out.println(Arrays.toString(num)); //배열의 모든값을 출력

	}// main
}// class
