package exceptionexam.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushException {

	public static void main(String[] args) {
			
		try {
			printFile("src/exceptionexem/exercise/test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} 
	}
	
	static void printFile(String fileName) throws IOException {
		FileInputStream fs = getFileStream(fileName);
		
		int i;
		
		while ((i = fs.read()) != -1) {
			System.out.write(i);
		}
	}
	
	static FileInputStream getFileStream(String fileName) throws FileNotFoundException {
		FileInputStream fs = new FileInputStream(fileName);
		
		return fs;
	}

}
