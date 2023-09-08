package p0908;

import java.util.Scanner;

public class J0908_01_로또 {

	public static void main(String[] args) {
		
		//Arrays.sort -> 1,13,2,5,22,30
		//               1,13,2,22,30,50
	
		//선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNo = new int[6];
		int[] myNo = new int[6];
		int[] myWinNo = new int[6]; // 당첨된 번호
		int temp = 0,count=0;
		
		//로또번호 순차입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		//로또번호 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		for(int i=0;i<6;i++) {
			winNo[i] = lotto[i];
		}
		
		
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("------------로또번호 입력-------------------");
		System.out.println("-----------------------------------------");
		
		
		for(int i=0;i<6;i++) {
			System.out.println(" 로또번호 입력 : ");
			myNo[i] = scan.nextInt();
		}
		
		//6개 당첨번호 추출
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("------------당첨번호 확인-------------------");
		System.out.println("-----------------------------------------");
		
		System.out.print("당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winNo[i]);
		}
		
		//
		System.out.println();
		System.out.print("입력한번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNo[i]);
		}
		System.out.println();
		
		//당첨개수확인 출력
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(winNo[i]==myNo[j]) {
					myWinNo[count] = winNo[i]; // 마이윈넘에 [i] 넣으면 번호가 똑바로 안들어감.
					count++;
					break; //j 
				}
			}
		}//for
		System.out.println(" 당첨개수 : "+count);
		
		System.out.print("맞춘 당첨번호 : ");
		
		// 본인 맞춘 당첨번호 출력
		
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",myWinNo[i]);
			
		}
		System.out.println();
		
		
		

	}//main

}//class
