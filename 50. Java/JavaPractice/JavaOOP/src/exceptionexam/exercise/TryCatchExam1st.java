package exceptionexam.exercise;

public class TryCatchExam1st {

	public static void main(String[] args) {
		System.out.println("메인 메소드 실행!!!");
		
		try {
			int i = 0;
			// Error: ArithmeticException → Catch문 실행
			int data = 50 / i;
			System.out.println("data: " + data);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			System.out.println("data: " + 0);
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드 종료!!!");
	}
}
