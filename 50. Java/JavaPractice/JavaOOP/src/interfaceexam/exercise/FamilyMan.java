package interfaceexem.exercise;

public abstract class FamilyMan implements FamilyRole {
	
	protected String name;
	
	@Override
	public void educateBady(Baby baby) {
		String name = baby.getName();
		System.out.println(name + "를 열심히 교육하고 있습니다.");
	}
	
	@Override
	public void takeCareWife(Wife wife) {
		String name = wife.getName();
		System.out.println("아내인 " + name + "를 성심성의껏 케어 합니다.");
	}
	
}
