package apiexam.model;

public class OuterStaticClass {

	private static int outerStaticData;
		
	public OuterStaticClass(int outerStaticData) {
//		this.outerData = outerData;
	}
	
	public static class InnerClass {
		private int innerStaticData;
		
		public InnerClass(int innerStaticData) {
			this.innerStaticData = innerStaticData;
		}
		
		public void display() {
			System.out.println("OuterStaticData: " + outerStaticData);
			System.out.println("InnerStaticData: " + innerStaticData);
		}
	}
}
