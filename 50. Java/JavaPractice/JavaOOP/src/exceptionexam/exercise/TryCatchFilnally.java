package exceptionexam.exercise;

public class TryCatchFilnally {

	public static void main(String[] args) {
		System.out.println("Main 매소드가 실행됩니다.");
		
		try {
			Integer myInt = 0;
			Integer data = 100 / myInt;
			
			if(myInt == 14) return;
					
			System.out.println("data: " + data);
		} catch (ArithmeticException e) {
			System.out.println("myInt는 0이 될 수 없음!!");
			e.printStackTrace();
		} finally {
			System.out.println("Finally가 실행되는 영역입니다!!");
		}
		
		System.out.println("Main 매소드가 종료됩니다.");
	}

}
