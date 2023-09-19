package apiexam.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {

	public static void main(String[] args) {
		
		// List String
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Strawberry");
		
		// 1. filter: fruit의 이름의길이가 6 이상인 과일만 선택
		fruits.stream().filter((fruit) -> fruit.length() >= 6)
					   .forEach((fruit) -> System.out.println("Filter(): " + fruit));
		
		// 2. distinct: 중복된 과일 제거
		List<String> fruitList =  fruits.stream().distinct().collect(Collectors.toList());
					   
		
		System.out.println("Distinct() 적용 전: " + fruits);
		System.out.println("Distinct() 적용 후: " + fruitList);
		
		// 3. map: 과일 이름을 대문자로 변환
		List<String> fruitListMap = fruits.stream().map((fruit) -> fruit.toUpperCase())
												   .collect(Collectors.toList());
		
		List<Integer> fruitListLen = fruits.stream().map((fruit) -> fruit.length())
				   								 .collect(Collectors.toList());
		
		System.out.println("Map() 적용 전: " + fruits);
		System.out.println("Map() 적용 후: " + fruitListMap);
		System.out.println("Map(): " + fruitListLen);
		
		// 4. limit: 처음 3개의 과일만 선택
		List<String> fruitList3 = fruits.stream().limit(3).collect(Collectors.toList());
		
		System.out.println("List() 적용 전: " + fruits);
		System.out.println("List() 적용 후: " + fruitList3);
		
		// 5. skip: 처음 2개의 과일을 제외한 나머지 과일 선택
		List<String> fruitList4 = fruits.stream().skip(3).collect(Collectors.toList());
		
		System.out.println("Skip() 적용 전: " + fruits);
		System.out.println("Skip() 적용 후: " + fruitList4);
		
		// 6. sorted: 과일을 알파벳 순으로 정렬
		List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted() 적용 전: " + fruits);
		System.out.println("Sorted() 적용 후: " + sortedFruits);
		
		// 7. sorted: String 짧은 순으로 정렬
		List<String> sortedLenFruits = fruits.stream().sorted((fruit1st, fruit2nd) -> fruit1st.length() - fruit2nd.length() ).collect(Collectors.toList());
		
		System.out.println("Sorted(): " + sortedLenFruits);
		
	}

}
