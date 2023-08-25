package interfaceexem.exercise;

public class Male extends FamilyMan implements FamilyRole, EmployeeRole {
	
	// 속성
	private int age;
	private String job;
	
	@Override
	public void workTogether(EmployeeRole employee) {
		String name = employee.getName();
		System.out.println("직장 동료인 " + name + "와 업무를 하고 있습니다.");		
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public Male(String name) {
		this.name = name;
	}
	
}
