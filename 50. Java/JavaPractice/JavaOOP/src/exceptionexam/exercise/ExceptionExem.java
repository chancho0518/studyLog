package exceptionexam.exercise;

import java.io.*;

public class ExceptionExem {
	public static void main(String[] args) {
		System.out.println("메인메소드 시작!!!");
		
		// Error: ArrayIndexOutOfBoundsException
		makeUncheckException(); 
		
		
		System.out.println("메인메소드 종료!!!");
	}
	
	public static void makeUncheckException() {
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int index = 10;
		
		System.out.println("Value: " + intArr[index]);
	}
	
	public static void makeCheckException() throws FileNotFoundException {
		// CheckException → throws FileNotFoundException 추가
		File file = new File("src/exceptionexem/exercise/test.txt");
		FileInputStream fs = new FileInputStream(file);
		
		System.out.println("FS 실행!!!");
	}
}
