package apiexam.model;

public class OuterClass {

	private int outerData;
	
	public OuterClass(int outerData) {
		this.outerData = outerData;
	}
	
	public class InnerClass {
		private int innerData;
		
		public InnerClass(int innerData) {
			this.innerData = innerData;
		}
		
		public void display() {
			System.out.println("OuterData: " + outerData);
			System.out.println("InnerData: " + innerData);
		}
	}
}
