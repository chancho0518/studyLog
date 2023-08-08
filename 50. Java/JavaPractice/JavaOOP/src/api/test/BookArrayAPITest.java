package api.test;

import model.api.BookArrayAPI;
import model.vo.BookVO;

public class BookArrayAPITest {
	public static void main(String[] args) {
		// 3권의 Book 데이터를 배열에 저장하여 출력
		BookArrayAPI list = new BookArrayAPI();
		
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
