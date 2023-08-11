package exercise.salessystem;

public class GoldCustomer extends Customer {
	// 속성
	private float discountRatio;
	
	// 행위
	@Override
	public int calculatePrice(int price) {
		this.bonusPoint += price * bonusPointRatio;
		price -= price * discountRatio;
		
		return price;
	}
	
	public GoldCustomer() {	
	}
	
	public GoldCustomer(String name) {
		this.customerID = "Customer" + Customer.serialNums;
		this.name = name;
		this.customerGrade = "GOLD";
		this.bonusPoint = 0;
		this.bonusPointRatio = 0.03f;
		this.discountRatio = 0.03f;
	}
}
