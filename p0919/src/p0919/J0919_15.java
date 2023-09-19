package p0919;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		// lee1,lee2 -> bbb폴더 2개를 복사하시오.
		
		FileInputStream fis = new FileInputStream("c:/aaa/lee1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		
		FileOutputStream fos = new FileOutputStream("c:/bbb/lee1.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");
		
		while(true) {
			int read = fis.read();
			if(read==-1)break;
			fos.write(read);
		}
		while(true) {
			int read = fis2.read();
			if(read==-1)break;
			fos2.write(read);
		}
		fis.close();
		fis2.close();
		fos.close();
		fos2.close();
		
		System.out.println("파일이 복사되었습니다.");

	}

}
