package exceptionexam.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyClose {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Main 매소드가 실행됩니다.");
		
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream("src/exceptionexem/exercise/test.txt");
			
			int i;
			while((i=fs.read()) != -1) {
				System.out.write(i);
			}
			
			int myInt = 10;
			int data = 100 / myInt;
			
			// fs.close();
		} catch (FileNotFoundException e) {
			System.out.println("File을 찾을 수 없습니다!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 과정에서 문제가 발생했습니다!!");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException이 발생했습니다!!");
			e.printStackTrace();
		} finally {
			fs.close();
		}
		
		System.out.println("Main 매소드를 종료합니다.");
		
		while (true) {
			Thread.sleep(1000);
		}
		
		// lsof -c java | grep text.txt → finally 추가
		
		// * try with resource
		// - try(FileInputStream fs = new FileInputStream("src/exceptionexem/exercise/test.txt")) {
		// - 이후 finally 제거
	}
}
