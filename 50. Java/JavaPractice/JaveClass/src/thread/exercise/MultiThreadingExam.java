package thread.exercise;

public class MultiThreadingExam {

	public static void main(String[] args) {
		// 1 ~ 100까지 출력 / Multi Threading으로 분담하여 실행
		
		// 3개 Thread
		Thread thread1 = new Thread(new PrintNumberRunnerble("thread1", 1, 50));
		Thread thread2 = new Thread(new PrintNumberRunnerble("thread2", 51, 100));
		Thread thread3 = new Thread(new PrintNumberRunnerble("thread3", 101, 150));
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
