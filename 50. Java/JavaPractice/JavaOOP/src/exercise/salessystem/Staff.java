package exercise.salessystem;

public class Staff {
	// 속성
	private int salesAmount;
	
	// 행위
	public int assistPayment(Customer customer, int price) {
		int cash = customer.calculatePrice(price);
		return cash;
	}
	
	
	
	public void addSalesAmount(int cash) {
		salesAmount += cash;
	}
	
	public void printMySalesAmount() {
		System.out.println("오늘의 최종 판매액은 " + this.salesAmount + "원 입니다.");
	}

	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
}
