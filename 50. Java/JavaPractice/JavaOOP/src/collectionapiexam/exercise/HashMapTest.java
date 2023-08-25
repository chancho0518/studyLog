package collectionapiexem.exercise;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		// Key-Value 형태의 데이터를 관리하는 Map 객체 생성
		Map<String, Integer> scores= new HashMap<>();
		
		// 데이터 추가(key는 중복X)
		scores.put("Kim", 95);
		scores.put("Lee", 93);
		scores.put("Park", 80);
		scores.put("Yun", 65);
		scores.put("Choi", 70);
		
		// 데이터 조회
		System.out.println(scores);
		System.out.println(scores.toString());
		System.out.println("Kim's score: " + scores.get("Kim"));
		System.out.println("park's score: " + scores.get("park"));
		System.out.println("Park's score: " + scores.get("Park"));
		
		// 데이터 수정
		scores.put("Lee", 100);
		System.out.println("Lee's score: " + scores.get("Lee"));
		
		// 데이터 삭제
		scores.remove("Choi");
		System.out.println("Choi's score after remove: " + scores.get("choi"));
		
		// 전체 데이터 출력
		for(Map.Entry<String, Integer> entry: scores.entrySet()) {
			System.out.println(entry.getKey() + "'s score: " + entry.getValue()) ;
		}
	}
}
