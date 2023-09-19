package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Calendar;

// 년, 월, 일을 입력하면 요일을 출력
@Controller
public class DayTeller {

    @RequestMapping("getDay")
    public String main(int year, int month, int day, Model model) throws IOException {

        // 연산(요일 반환)
        Calendar cal = Calendar.getInstance();  // 현재 날짜와 시간을 갖음
        cal.clear();  // cal의 모든 필드를 초기화
        cal.set(year, month-1, day);  // 월(mm)은 0~11d을 반환하기 때문에 1을 뺌

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  // 1~7을 반환(1: 일요일, 2: 월요일 ...)
        char yoil = "일월화수목금토".charAt(dayOfWeek - 1);

        // 작업 결과를 Model에 저장(DS가 Model을 View로 전달)
        model.addAttribute("year",year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("yoil", yoil);

        return "yoil"; // View의 이름을 반환
    }
}
