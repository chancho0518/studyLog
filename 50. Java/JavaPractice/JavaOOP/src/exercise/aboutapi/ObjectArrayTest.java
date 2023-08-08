package exercise.aboutapi;

import model.api.ObjectArray;
import model.vo.*;

public class ObjectArrayTest {
	public static void main(String[] args) {
		// A, B, C Object를 배열(Object[])에 저장하여 출력
		// BookVO 객체를 배열(Object[])에 저장하여 출력
		ObjectArray list = new ObjectArray();
		
		list.add(new ObjectA()); // Upcasting Object element = new a();
		list.add(new ObjectB()); // Upcasting Object element = new b();
		list.add(new ObjectC()); // Upcasting Object element = new c();
		list.add(new BookVO("Java", 15000, "한빛", "홍길동")); // Upcasting Object element = new BookVO();
		
		// TODO
		// Downcasing을 위해 instance값을 반환하는 코드 구현
		ObjectA a = (ObjectA)list.get(0);
		ObjectB b = (ObjectB)list.get(1);
		ObjectC c = (ObjectC)list.get(2);
		BookVO vo = (BookVO)list.get(3);
		
		a.display();
		b.display();
		c.display();
		System.out.println(vo.toString());
	}
}
