package exceptionexem.exercise;

import java.util.ArrayList;
import java.util.List;

public class TryCatchExem2nd {
	public static void main(String[] args) {
		System.out.println("메인 메소드 실행!!!");
		
		List<String> strList = new ArrayList<>();
		
		strList.add("Hello");
		strList.add("World!!");
		strList.add("I");
		strList.add(null);
		strList.add("Love");
		strList.add("Coding.");
		
		for(int i=0; i<strList.size() + 5; i++) {
			try {
				String str = strList.get(i);
				
				// Error: IndexOutOfBoundsException
				System.out.println("i: " + i);
				
				// Error: NullPointerException
				System.out.println(str.toUpperCase());
			} catch (NullPointerException e) {
				System.out.println("null 값은 들어갈 수 없음!!");
				e.printStackTrace();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index는 Array Bound를 넘길 수 없음!!");
				e.printStackTrace();
				break;
		}	}
	}
}
