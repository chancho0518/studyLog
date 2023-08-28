package thread.exercise;

public class JavaThreadingExam {

	public static void main(String[] args) {
		// Thread 실행
		Thread thread1 = new Thread(new MyRunnable());
		Thread thread2 = new Thread(new MyRunnable());
		
		// 익명 클래스
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread - " + Thread.currentThread().getName() + " 를 실행하고 있습니다!!");
			}
		});
		
		// 람다식
		Thread thread4 = new Thread(() -> System.out.println("Thread - " + Thread.currentThread().getName() + " 를 실행하고 있습니다!!"));
		
		System.out.println("Thread - " + Thread.currentThread().getName() + " 를 실행하고 있습니다!!");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("Thread - " + Thread.currentThread().getName() + " 를 실행하고 있습니다!!");
	}
	
	static class MyRunnable implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Thread - " + Thread.currentThread().getName() + " 를 실행하고 있습니다!!");
		}
	}

}
