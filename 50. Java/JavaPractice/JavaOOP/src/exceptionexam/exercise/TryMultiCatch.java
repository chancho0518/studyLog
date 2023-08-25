package exceptionexam.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatch {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("src/exceptionexem/exercise/test.txt");
			
			int i = 10;
			int data = 100 / i;
			
			String str = "abc"	;
			System.out.println(str.toUpperCase());
			
			int index = 11;
			int[] intArr = new int[10];
			System.out.println(intArr[index]);
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException이 발생했습니다..");
			e.printStackTrace();
		} catch (ArithmeticException | NullPointerException e) {
			// System.out.println("ArithmeticException이 발생했습니다.");
			System.out.println("ArithmeticException 또는 NullPointerException이 발생했습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("최종 Exception 필터에 걸렸습니다.");
			e.printStackTrace();
		}
//		catch (NullPointerException e) {
//			System.out.println("NullPointerException이 발생했습니다.");
//			e.printStackTrace();
//		}
		
		System.out.println("Main 메소드가 종료되었습니다.");
	}

}
