package datamanagement.exercise;

public class StringNullDefault {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
			int length = str.length();
			System.out.println(length);
		} catch (Exception e) {
			System.out.println("NullPointException이 발생!! 기본 값 사용!!");
			str = "";
			int length = str.length();
			System.out.println(length);
		} 

	}
}