package datamanagement.exercise;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeManagement {

	public static void main(String[] args) {
		// 현재시간 출력
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 특정 일/월/년/요일 가져오기
		LocalDate past = LocalDate.of(2022, 12, 7);
		System.out.println(past);
		System.out.println(past.getDayOfWeek());
		
		// 날짜 포맷 변경
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		String dateStr = past.format(dateTimeFormatter);
		
		System.out.println(past);
		System.out.println(dateStr);
	}

}
