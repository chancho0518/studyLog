package exceptionexem.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchExam3rd {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("src/exceptionexem/exercise/test.txt");
			
			int i;
			while((i=fs.read()) != -1) {
				System.out.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File을 찾을 수 없습니다!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 과정에서 문제가 발생했습니다!!");
			e.printStackTrace();
		}
	}

}
