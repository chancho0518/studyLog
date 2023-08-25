package interfaceexam.exercise;

public interface HusbandRole {
	
	String getName();
	void takeCareWife(Wife wife);
	default void sayILoveYouEveryday() {
		System.out.println("나의 아내 사랑합니다~~");
	};
	
}
