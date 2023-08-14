package interfaceexem.exercise;

public interface FamilyRole extends DaddyRole, HusbandRole {

	@Override
	default void sayILoveYouEveryday() {
		DaddyRole.super.sayILoveYouEveryday();
		HusbandRole.super.sayILoveYouEveryday();
	}

}
