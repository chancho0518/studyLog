package apiexam.exercise;

import apiexam.model.OuterClass;
import apiexam.model.OuterStaticClass;

public class OuterClassTest {

	public static void main(String[] args) {
		// 일반 중첩 클래스
		OuterClass outerClass = new OuterClass(20);
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass(10);
		
		innerClass.display();

		// 정적 중첩 클래스
		OuterStaticClass outerStaticClass = new OuterStaticClass(50);
		
		OuterStaticClass.InnerClass innerStaticClass = new OuterStaticClass.InnerClass(40);
		
		innerStaticClass.display();
	}

}
