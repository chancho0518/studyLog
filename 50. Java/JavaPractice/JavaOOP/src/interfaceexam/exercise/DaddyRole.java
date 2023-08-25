package interfaceexem.exercise;

public interface DaddyRole {
	
	void educateBady(Baby baby);
	default void sayILoveYouEveryday() {
		System.out.println("우리 아기 사랑합니다~~");
	};
	
}
