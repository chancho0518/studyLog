package apiexem.exercise;

import apiexem.model.BookArray;
import apiexem.vo.BookVO;

public class BookArrayTest {
	public static void main(String[] args) {
		// 3권의 Book 데이터를 배열에 저장하여 출력
		BookArray list = new BookArray();
		
		list.add(new BookVO("Java", 15000, "한빛", "홍길동"));
		list.add(new BookVO("JavaScript", 17000, "대림", "나길동"));
		list.add(new BookVO("Python", 16000, "정보", "김길동"));
		
		// vo.toString()
		BookVO vo = list.get(0);
		System.out.println(vo);
		
		vo = list.get(1);
		System.out.println(vo);
		
		vo = list.get(2);
		System.out.println(vo);
		
		vo = list.get(-1);
		System.out.println(vo);
		
		vo = list.get(3);
		System.out.println(vo);
	}
}
