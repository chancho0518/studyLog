package thread.exercise;

public class IncrementRunnable implements Runnable {

	private String name;
	private Counter counter;
	
	public IncrementRunnable(Counter counter, String name) {
		this.name = name;
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			counter.increment();
			System.out.println("Count(" + name + "): " + counter.getCount());
		}
	}
}
