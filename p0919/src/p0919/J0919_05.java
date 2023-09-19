package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_05 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
		//System.out.println(0/0);
		} catch(Exception e){ // Exception 이게 최고 조상
			e.printStackTrace();
		}finally {
			System.out.println("예외가 발생이 되어도, 예외가 발생이 되지 않아도 무조건 실행 됨.");
		}
			
		
			
			
		
		
		
		
		
		
		
		
		
		
//		File f = new File("c:/aaa/a.txt");
//		
//		if(!f.exists()) {
//			try {
//			
//				
//				f.createNewFile();
//			
//				
//			
//			} catch (IOException e) {
//				e.printStackTrace();
//				System.out.println("입출력 에러입니다. 아마도 파일저장에서 에러가 난듯합니다.");
//			} catch(ArithmeticException e2) {
//				e2.printStackTrace();
//				System.out.println("숫자부분에 에러가 난듯 합니다.");
//			} catch (ArrayIndexOutOfBoundsException e3) {
//				e3.printStackTrace();
//			}
//		}//if

		
		
	}

}
