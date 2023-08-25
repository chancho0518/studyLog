package collectionapiexem.exercise;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 3, 2, 4, 6, 7, 8, 4, 3, 4};
		
		// HashSet 객체생성
		Set<Integer> uniqueNums = new HashSet<>();
		
		// 중복되지 않은 숫자들을 HashSet에 추가
		for(int numbers: nums) {
			uniqueNums.add(numbers);
		}
		
		System.out.println("uniqueNums: " + uniqueNums);
		System.out.println("uniqueNums.toString(): " + uniqueNums.toString());
		
		// 중복되지 않은 숫자 출력
		System.out.println("Unique Numbers:");
		for(int number: uniqueNums) {
			System.out.println(number);
		}
	}
}
