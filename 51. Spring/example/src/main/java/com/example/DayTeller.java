package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

// 년, 월, 일을 입력하면 요일을 출력
@Controller
public class DayTeller {

    @RequestMapping("getDay")
    public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 1. 입력
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        // 2. 연산(요일 반환)
        Calendar cal = Calendar.getInstance();  // 현재 날짜와 시간을 갖음
        cal.clear();  // cal의 모든 필드를 초기화
        cal.set(yyyy, mm-1, dd);  // 월(mm)은 0~11d을 반환하기 때문에 1을 뺌

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  // 1~7을 반환(1: 일요일, 2: 월요일 ...)
        char yoli = "일월화수목금토".charAt(dayOfWeek - 1);

        // 3. 출력(연산 내용을 브라우저에 전송)
        response.setCharacterEncoding("ms949");  // 한글 윈도우 MS 949

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println(    "Year: " + year + "<br>");
        out.println(    "Month: " + month  + "<br>");
        out.println(    "Day: " + day  + "<br>");
        out.println(    "Yoli: " + yoli  + "<br>");
        out.println("</body>");
        out.println("</html>");
    }
}
