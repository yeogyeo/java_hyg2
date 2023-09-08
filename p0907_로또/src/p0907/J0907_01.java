package p0907;

public class J0907_01 {

	public static void main(String[] args) {
		int[][] num = new int [5][3]; //(3*i)+j+1 =3i+j+1
		
		//입력
		for(int i=0;i<num.length;i++) { // 렝스부분 5
			for(int j=0;j<num[i].length;j++) { //렝스부분3
				num[i][j] = (3*i)+j+1; //공식 중요 . [10][9] -> (9*i)+j+1
			}
		}
		
		
		
		//출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		
		
		
		
		//------- 1차원 배열 -------------
		int[] score = new int[10];
		
		//score 1-10까지 숫자입력, 출력하시오.
		
		for(int i=0;i<score.length;i++) {
			score[i] = i+1;
		}
		
		//출력
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}

		
		
		
		
	}//main

}//class
