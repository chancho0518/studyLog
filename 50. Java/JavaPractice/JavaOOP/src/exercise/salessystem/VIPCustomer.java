package exercise.salessystem;

public class VIPCustomer extends Customer {
	static int serialNums = 1;
	
	// 속성
	private String agentID;
	private float discountRatio;
	
	// 행위
	@Override
	public int calculatePrice(int price) {
		this.bonusPoint += price * bonusPointRatio;
		price -= price * this.discountRatio;
		
		return price;
	}
	
	public void callAgent() {
		System.out.println("담당직원 " + this.agentID + " 님에게 문의드릴게 있어요~~");
	}
	
	public VIPCustomer() {
	}
	
	public VIPCustomer(String name) {
		this.customerID = "VIP" + serialNums++;
		this.name = name;
		this.customerGrade = "VIP";
		this.bonusPoint = 0;
		this.bonusPointRatio = 0.05f;
		this.discountRatio = 0.1f;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
