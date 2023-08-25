package apiexam.model;

import java.util.Arrays;

public class IntArray {
	private int arrayCapacity = 1;
	private int[] elements;
	private int size = 0;
	
	
	// Array 생성동작
	// TODO
	// 인수로 배열의 크기 설정
	public IntArray() {
		elements = new int[1];
	}
	
	// Array의 원소의 개수를 구하는 동작
	public int size() {
		return size;
	}
	
	// Array 저장동작
	public void add(int element) {
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	// Array 반환동작: index가 음수일 경우도 적용
	public int get(int index) {
		if(index < -size || index >= size) {
			throw new IndexOutOfBoundsException("Index 범위초과!!");
		} else if (index >= 0) {
			return elements[index];
		} else {
			return elements[index+size];
		}
	}
	
	// TODO
	// pop(): Array의 마지막 요소 삭제하며 삭제한 값은 출력하여 확인
	// shift(): Array의 첫 번재 요소 삭제하며 삭제한 값은 출력하여 확인
	// splice(): Array의 요소 삭제하며 첫 번째 인수는 인덱스를 설정하고 두 번째 인수는 삭제할 Array의 개수이고 삭제한 값은 Array로 출력   
	// delete(): Array의 전체 요소 삭제
	// toString(): Array의 요소 출력
	
	// Array 공간을 늘리는 동작
	public void ensureCapacity() {
		arrayCapacity++;
		elements = Arrays.copyOf(elements, arrayCapacity);
	}
}
