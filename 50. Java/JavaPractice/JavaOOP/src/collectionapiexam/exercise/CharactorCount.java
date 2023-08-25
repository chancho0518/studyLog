package collectionapiexem.exercise;

import java.util.HashMap;
import java.util.Map;

public class CharactorCount {
	public static void main(String[] args) {
		String str = "Hello, World!!";
		Map<Character, Integer> charCountMap = new HashMap<>();
		char[] strArray = str.toCharArray();
		
		for(char c: strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		System.out.println("Charactor Counts:");
		for(char c: charCountMap.keySet()) {
			System.out.println(c + ": " + charCountMap.get(c));
		}
	}
}
