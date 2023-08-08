package api.test;

public class IntArrayBasic {
	public static void main(String[] args) {
		// 정수 5개를 배열로 저장하고 출력하기
		
		// 1. 배열 생성동작
		// → 고정길이의 단점은 가변길이로 개선 
		int[] numbers = new int[5];
		
		// 2. 배열 저장 동작: 입력 또는 추가
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		// 3. 배열 길이를 구하는 동작
		int len = numbers.length;
		System.out.println(len);
		
		// 4. 데이터를 반환동작: for문
		for(int i=0; i<numbers.length; i++) {
			int data = numbers[i];
			System.out.println(data);
		}
		
		// 5. 데이터를 반환동작: foreach문
		for(int data: numbers) {
			System.out.println(data);
		}
	}
}
