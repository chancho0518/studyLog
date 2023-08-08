package exercise.aboutapi;

import model.api.IntArray;

public class IntArrayTest {
	public static void main(String[] args) {
		// 정수 3개를 배열에 저정하고 출력
		IntArray list = new IntArray();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.get(-1));
		System.out.println(list.get(-2));
		System.out.println(list.get(-3));
		
		System.out.println(list.get(-4));
		
		System.out.println(list.size());
	}
	
}
