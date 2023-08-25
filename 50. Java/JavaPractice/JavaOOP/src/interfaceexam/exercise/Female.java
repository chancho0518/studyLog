package interfaceexam.exercise;

public class Female implements EmployeeRole, Wife {
	// 속성
	String name;
	int age;
	String job;
	
	@Override
	public void workTogether(EmployeeRole employee) {
		String name = employee.getName();
		System.out.println("직장 동료인 " + name + "와 업무를 하고 있습니다.");
	}
	
	@Override
	public void takeCareHusband(HusbandRole husband) {
		String name = husband.getName();
		System.out.println("남편인 "+ name + "을 케어해줍니다.");
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public Female(String name) {
		this.name = name;
	}
	
}
