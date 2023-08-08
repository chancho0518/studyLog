package exercise.aboutapi;

import java.util.ArrayList;

import model.vo.BookVO;

public class ArrayListTest {
	public static void main(String[] args) {
		// 3권의 BookVO 데이터를 배열에 저장하여 출력
		// Book[], Object[]
		// ArrayList =  ObjectArray
		
		// ArrayList의 DEFAULT_CAPACITY = 10: Object[]
		ArrayList list = new ArrayList();
		
		list.add(new BookVO("Java", 15000, "한빛", "홍길동"));
		list.add(new BookVO("JavaScript", 17000, "대림", "나길동"));
		list.add(new BookVO("Python", 16000, "정보", "김길동"));
		
		// BookVO ← (BookVO)Object
		BookVO vo = (BookVO)list.get(0); 
		System.out.println(vo.toString());
		
		vo = (BookVO)list.get(1); 
		System.out.println(vo.toString());
		
		vo = (BookVO)list.get(2); 
		System.out.println(vo.toString());
		
		for(int i=0; i<list.size(); i++) {
			// BookVO book = (BookVO)list.get(i);
			// Object → BookVO(JVM에서 자동으로 BookVO.toString())
			System.out.println(list.get(i));
		}
		
		vo = (BookVO)list.get(3); 
		System.out.println(vo);
	}
}
