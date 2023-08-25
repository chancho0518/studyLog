package exceptionexam.exercise;

import java.io.FileInputStream;
import java.io.IOException;

public class HandleExceptionAtOnce {

	public static void main(String[] args) {
		
		try {
			printCsvFile("src/exceptionexem/exercise/test.csv");
			printTextFile("src/exceptionexem/exercise/test.txt");
		} catch (IOException e) {
			System.out.println("fileName IOException 발생!!!");
			e.printStackTrace();
		}
		
	}
	
	public static void printTextFile(String fileName) throws IOException {
		
		if(!fileName.contains(".txt")) {
			System.out.println(".txt 파일이 아닙니다.");
			return;
		}
		
		FileInputStream fs = new FileInputStream(fileName);
		
		int i;
		while((i=fs.read()) != -1) {
			System.out.write(i);
		}
	}
	
	public static void printCsvFile(String fileName) throws IOException {
		
		if(!fileName.contains(".csv")) {
			System.out.println(".csv 파일이 아닙니다.");
			return;
		}
		
		FileInputStream fs = new FileInputStream(fileName);
		
		int i;
		while((i=fs.read()) != -1) {
			System.out.write(i);
		}
	}
}
