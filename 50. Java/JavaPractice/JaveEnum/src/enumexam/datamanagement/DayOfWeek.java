package enumexam.datamanagement;

import java.util.Arrays;

public class DayOfWeek {

	public static void main(String[] args) {
		
		// 열커타입 변수 = 열거타입.열거상수;
		Day monday = Day.MONDAY;
		
		System.out.println("요일: " + monday);
		System.out.println("요일: " + monday.getKoreanDayOfWeek());
		
		Day day = Day.WEDNESDAY;
		
		switch (day) {
		case MONDAY:
			System.out.println("한 주의 시작입니다. " + day.getKoreanDayOfWeek());
			break;
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			System.out.println("오늘은 평일 입니다. " + day.getKoreanDayOfWeek());
			break;
		case FIRDAY:
			System.out.println("오늘만 지나면 주말입니다. " + day.getKoreanDayOfWeek());
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("오늘은 주말 입니다. " + day.getKoreanDayOfWeek());
			break;
		}
		
		// ordinal: 열거 타입을 정의 할 때 주어진 순번을 리턴
		System.out.println(day + " 순서: " + day.ordinal());
		
		// compareTo: 열거 객체를 비교하여 순법 차이를 리턴
		System.out.println("두 값의 비교(" + day + " - " + Day.MONDAY + ")" + ": " + day.compareTo(Day.MONDAY));
		
		// values: 열커 타입의 모든 열거 객체를 배열로 만들어 리턴
		Day[] days = Day.values();
		System.out.println("Days 출력: " + Arrays.toString(days));
	}

}
