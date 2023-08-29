package apiexam.exercise;

import apiexam.model.StringUtils;

public class StringUtilTest {

	public static void main(String[] args) {
		String str = "Hello World!!";
		char target = 'o';
		
		// 1. 문자열이 비어 있는지 확인
		boolean isEmpty = StringUtils.isEmpty(str);
		System.out.println("1. isEmpty 확인: " + isEmpty);
		
		// 2. 문자열을 반대로 뒤집기
		String reverseStr = StringUtils.reverse(str);
		System.out.println("2. reverseString 확인: " + reverseStr);
		
		// 3. 주어진 문자열에서 특정 문자의 개수 세기
		// int countChar = StringUtils.countChar(str, target);
		int countChar = StringUtils.CharChecker.countChar(str, target);
		System.out.println("3. " + target + " 문자 개수: " + countChar);
		
		// 4. 주어진 문자열에 특정 문자가 있는지 확인
		// boolean containChar = StringUtils.containsChar(str, target);
		boolean containChar = StringUtils.CharChecker.containsChar(str, target);
		System.out.println("4. " + target +" 문자 포함 여부: " + containChar);
	}

}
