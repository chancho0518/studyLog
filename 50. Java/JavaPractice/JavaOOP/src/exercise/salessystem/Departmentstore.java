package exercise.salessystem;

public class Departmentstore {

	public static void main(String[] args) {
		// 상황
		int price = 10_000;
		Staff staff = new Staff();
		staff.setSalesAmount(1_000_000);
		
		Customer regularCustom = new Customer("이가자");
		Customer regularGold = new VIPCustomer("금사빠");
		Customer regularVip = new VIPCustomer("나길동");
				
		Customer[] customerQueue = {
			new Customer("홍길동"), regularCustom, regularVip, new Customer("삼길동"),
			regularVip, regularCustom, new VIPCustomer("하기자"), regularCustom,
			new Customer("홍삼사"), regularVip, regularCustom, regularVip,
			new GoldCustomer("금동이"), new Customer("정환용"), regularGold, new Customer("정상훈"),
			regularCustom, regularGold, new Customer("이길여"), new VIPCustomer("하기자")
		};
		
		// 시나리오
		for(Customer customer : customerQueue) {
			customer.printMyInfo();
			int cash = staff.assistPayment(customer, price);
			System.out.printf("내가 내는 금액은 %d 원%n", cash);
			staff.addSalesAmount(cash);
		}
		
		staff.printMySalesAmount();
	}

}
