package collectionapiexam.exercise;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		// HashSet 객체생성
		Set<String> set = new HashSet<String>();
		
		// 요소추가
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		// 중복되는 요수는 추가되지 않음
		set.add("Banana");
		set.add("Cherry");
		
		// 요수 개수 출력
		System.out.println("Set Size: " + set.size());
		System.out.println("----------");
		
		// 모든 요소 출력
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println("----------");
		
		// 요소 삭제
		set.remove("banana");
		
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println("----------");
		
		set.remove("Banana");
		
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println("----------");
		
		// 요소 포함여부 확인
		boolean contains = set.contains("Cherry");
		System.out.println("Set Contains Cherry? " + contains);
		System.out.println("----------");
		
		// Set 비우기
		set.clear();
		
		// 비어있는 Set 확인
		boolean empty = set.isEmpty();
		
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println("----------");
		
		System.out.println("Set is empty? " + empty);		
	}
}
