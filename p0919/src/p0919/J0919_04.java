package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class J0919_04 {

	public static void main(String[] args) {
		File f = new File("C:\\download/aaa.txt");
		if(!f.exists()) {
			try {
				f.createNewFile(); //하드디스크에 저장  
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//if
		
		try {
			FileWriter fw = new FileWriter(f); //하나씩 저장
			BufferedWriter writer = new BufferedWriter(fw); //한줄씩 저장
			writer.write("안녕하세요. 반갑습니다. 다음에 뵙겠습니다.\r\n두번째 줄입니다.\r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일이 생성되었습니다.");

	}

}
