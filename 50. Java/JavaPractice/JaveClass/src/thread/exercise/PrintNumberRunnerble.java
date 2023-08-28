package thread.exercise;

public class PrintNumberRunnerble implements Runnable {
	
	String name;
	int start;
	int end;
	
	public PrintNumberRunnerble(String name, int start, int end) {
		
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		for(int i=start; i<=end; i++) {
			System.out.print(name + "(" + i + ") ");
		}
	}
}
