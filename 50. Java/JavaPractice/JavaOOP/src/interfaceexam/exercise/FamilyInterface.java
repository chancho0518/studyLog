package interfaceexam.exercise;

public class FamilyInterface {

	public static void main(String[] args) {
		// Male 3개
		// 남편
		HusbandRole husband= new Male("Steve");
		Wife wife = new Female("Hyem");
		
		husband.sayILoveYouEveryday();
		husband.takeCareWife(wife);

		// 아빠
		DaddyRole daddy = (DaddyRole)husband;
		Baby baby = new Baby("깜찍이");
		
		daddy.educateBady(baby);
		daddy.sayILoveYouEveryday();
		
		// 회사원
		EmployeeRole employee = (EmployeeRole)daddy;
		EmployeeRole colleague = new Male("Ssan");
		EmployeeRole maleEmployee2nd = new Male2nd("민철");
		
		employee.workTogether(colleague);
		employee.workTogether(maleEmployee2nd);
	}
	
}
