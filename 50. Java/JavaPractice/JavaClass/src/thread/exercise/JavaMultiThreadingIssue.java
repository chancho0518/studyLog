package thread.exercise;

public class JavaMultiThreadingIssue {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		Thread thread1 = new Thread(new IncrementRunnable(counter, "thread1"));
		Thread thread2 = new Thread(new IncrementRunnable(counter, "thread2"));
		Thread thread3 = new Thread(new IncrementRunnable(counter, "thread3"));
		Thread thread4 = new Thread(new IncrementRunnable(counter, "thread4"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
