package p0912;

import java.util.Scanner;

public class J0912_03 {

	public static void main(String[] args) {
		// 3명의 성적을 입력받아 출력하시오. StuScore2객체를 활용
		//StuScore2
		
		Scanner scan = new Scanner(System.in);
		int stuNo = 0;
		String name = "";
		int kor=0,eng=0,math=0;
		int[] score = new int[3];
		String[] subject = {"국어","영어","수학"};
		
		
		StuScore2[] s = new StuScore2[3];
		
//		for(int j=0;j<score.length;j++) {
//			System.out.println(subject[j]+"점수를 입력하세요.");
//		    score[j] = scan.nextInt();
//		    s[i] = new StuScore2(stuNo,name,score[0],score[1],score[2]);
//		}
		
		
		for(int i=0;i<s.length;i++) {
			stuNo = i+1;
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			s[i] = new StuScore2(stuNo,name,kor,eng,math);
		
		}
		for(int i=0;i<s.length;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].stuNo,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
	
		

	}

}
