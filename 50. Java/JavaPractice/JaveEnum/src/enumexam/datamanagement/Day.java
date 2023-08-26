package enumexam.datamanagement;

// sunday, monday, tuesday, wednesday, thursday, friday, saturday 
public enum Day {
	SUNDAY("일요일"),
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"),
	THURSDAY("목요일"),
	FIRDAY("금요일"),
	SATURDAY("토요일");
	
	private final String KoreanDayOfWeek;

	Day(String koreanDayOfWeek) {
		this.KoreanDayOfWeek = koreanDayOfWeek;
	}

	public String getKoreanDayOfWeek() {
		return KoreanDayOfWeek;
	}
}
