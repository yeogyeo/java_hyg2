package p0907;

import java.util.Scanner;

public class J0907_05 {

	public static void main(String[] args) {
		// 주택복권 1조12345
		// 1: 0-9까지 조 00000-99999
		// 5 - 1000원 45-10000 345 - 1000000 - 2345 - 1000000 12345 - 10000000
		// 1-12345 1억원

		
		Scanner scan = new Scanner(System.in);

		// 1조 0-9
		int fNo = (int) (Math.random() * 9) + 1; // 0-9 -> 1-9
		// int firstNo = (int)(Math.random()*10); //0-9 -> 1-9

		int sNo = (int) (Math.random() * 100000); // 0-99999

		// String.format -> format을 넣어서 String타입으로 변경됨
		String strNo = String.format("%05d", sNo);
		String winNo = fNo + "조" + strNo;

		System.out.printf("당첨번번번호 : %s\n", winNo); // %d:정수, %f:실수, %s:문자열, %c:문자
		// ---- 복권입력
		System.out.println("조 단위를 입력하세요. (1-9조까지)");
		int input1 = scan.nextInt();

		System.out.println(input1 + "조");
		System.out.println("뒤 5자리를 입력하세요.(00000-99999까지)");
		String input2 = scan.next();

		String inputNo = input1 + "조" + input2;

		System.out.println("----- 복권확인 -----");
		System.out.println("입력번호 : " + inputNo);

		int count = 0; // 일치횟수
		if (inputNo.charAt(6) == winNo.charAt(6)) {
			count++;
		}
		if (inputNo.charAt(5) == winNo.charAt(5)) {
			count++;
		}
		if (inputNo.charAt(4) == winNo.charAt(4)) {
			count++;
		}
		if (inputNo.charAt(3) == winNo.charAt(3)) {
			count++;
		}
		if (inputNo.charAt(2) == winNo.charAt(2)) {
			count++;
		}
		if (inputNo.charAt(0) == winNo.charAt(0)) {
			count++;
		}
		// if

		if (count == 0) {
			System.out.println("꽝입니다. 돈만 버렸습니다.!");
		} else if (count == 1) {
			System.out.println("1개 맞췄습니다. 당첨:1000원!");
		} else if (count == 2) {
			System.out.println("2개 맞췄습니다. 당첨:10000원!");
		} else if (count == 3) {
			System.out.println("3개 맞췄습니다. 당첨:100,000원!");
		} else if (count == 4) {
			System.out.println("4개 맞췄습니다. 당첨:1,000,000원!");
		} else if (count == 5) {
			System.out.println("5개 맞췄습니다. 당첨:10,000,000원!");
		} else if (count == 6) {
			System.out.println("6개 맞췄습니다. 당첨:100,000,000원!");
		}

	}

}
