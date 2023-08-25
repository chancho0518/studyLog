package exceptionexam.exercise;

public class ThrowUncheckException {
	public static void main(String[] args) {
		System.out.println("---------- main 메소드 실행!!");
		
		int myInt = 0;
		int myDivide = 0;
		
		try {	
			myInt = getIntElement(3);
			myDivide = getDivide(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Int: " + myInt);
		System.out.println("Divide: " + myDivide);
		
		System.out.println("---------- main 메소드 종료!!");
	}
	
	static int getIntElement(int index) throws Exception {
		int[] arrInt = {1, 2, 3, 4, 5, 6};
		
		if(index >= arrInt.length) {
			throw new Exception("Index는 arrInt.length를 넘길 수 없음");
		}
		return arrInt[index];
	}
	
	static int getDivide(int num) throws Exception {
		if(num == 0) {
			throw new Exception("0으로 나눌 수 없음");
		}
		
		int data = 100 / num;
		return data;
	}
}
