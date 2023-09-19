package apiexam.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest {

	public static void main(String[] args) {
		
		// List String
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Strawberry");
		
		// 1. forEach(): 출력
		fruits.stream().forEach((fruit) -> System.out.println("forEach(): " + fruit));
		
		// 2. collect(): 다른 또는 같은 컬랙션 반환
		Set<String> fruitsSet = fruits.stream().collect(Collectors.toSet());
		System.out.println("collect(): " + fruitsSet);
		
		// 3. findFirst(): Stream의 첫 번째 값 반환, Optional
		Optional<String> fruitOptional = fruits.stream().findFirst();
		System.out.println("findFirst(): " + fruitOptional.orElseGet(() -> "기본 과일"));
		
		// List Integers
		List<Integer> intergers = new ArrayList<>();
		intergers.add(1);
		intergers.add(2);
		intergers.add(3);
		intergers.add(4);
		intergers.add(5);
		
		// 1. sum, average
		int sum = intergers.stream().mapToInt(i -> i).sum();
		OptionalDouble average = intergers.stream().mapToInt(i -> i).average();
		
		System.out.println("sum(): " + sum);
		System.out.println("average(): " + average);
		
		// 2. count(), max(), min()
		long count = intergers.stream().count();
		OptionalInt max = intergers.stream().mapToInt(i -> i).max();
		OptionalInt min = intergers.stream().mapToInt(i -> i).min();
		
		System.out.println("count(): " + count);
		System.out.println("max(): " + max);
		System.out.println("min(): " + min);
		
		// 3. reduce()로 소모 값 구하기
		int reduce = intergers.stream().reduce(1, (int1, int2) -> int1 * int2);
		
		System.out.println("reduce(): " + reduce);
	}

}
