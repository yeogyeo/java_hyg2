package p0915_test;

import java.util.Scanner;

public class JTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;
		
		while(true) {
			//성적프로그램에서 어떤 프로그램을 실행시켰는지 보여주는 것
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1:
				stuCount = stuAction.stuInput(stuCount);
				break;
			
			case 2:
				stuAction.stuOutput();
				break;
				
			case 3:
			
			     break;
			}//switch
		
		}//while

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main

}//class
