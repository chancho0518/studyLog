package oopparam.exercise;

class DataPrimitive {
	int x;
}

class DataReference {
	int x;
}

class DataReferReturn {
	int x;
}

public class ParamExam {

	public static void main(String[] args) {
		// 기본형 매개변수(PrimitiveParam): 변수의 값을 읽기만 가능(Read Only)
		DataPrimitive dp = new DataPrimitive();  // 객체 생성
		dp.x = 10;
		System.out.println("main(): dp.x(Primitive) = " + dp.x);
		
		changePrimitive(dp.x);
		System.out.println("After changePrimitive(dp.x)");
		System.out.println("main(): dp.x(Primitive) = " + dp.x);
		
		System.out.println("\n-----------------------------\n");
		
		// 참조형 매개변수(ReferenceParam): 변수의 값을 읽고 변경 가능(Read & Write)
		DataReference dr = new DataReference();
		dr.x = 10;
		System.out.println("main(): dr.x(Reference) = " + dr.x);
		
		changeReference(dr);
		System.out.println("After changeReference(dr.x)");
		System.out.println("main(): dr.x(Reference) = " + dr.x);
		
		System.out.println("\n-----------------------------\n");
		
		// 참조형 반환타입
		// - https://youtu.be/c9rXj3b9rKI?si=7hZojpFg-2Hyv8HF 
		DataReferReturn drr1 = new DataReferReturn();
		drr1.x = 10;
		
		DataReferReturn drr2 = copy(drr1);
		System.out.println("drr1.x = " + drr1.x);
		System.out.println("drr2.x = " + drr2.x);
	}
	
	static void changePrimitive(int x) {  // 기본형 매개변수(Read Only)
		x = 100;  // 지역변수
		System.out.println("changePrimitive(): x = " + x);
	}
	
	static void changeReference(DataReference dr) {  // 참조형 매개변수(Read & Write)
		dr.x = 1000;
		System.out.println("changeReference(): x = " + dr.x);
	}
	
	static DataReferReturn copy(DataReferReturn drr) {  // copy 매소드의 지역변수
		DataReferReturn tmp = new DataReferReturn();  // 새로운 객체 tmp를 생성
		
		tmp.x = drr.x;  // drr.x의 값을 tmp.x에 복사
		
		return tmp;  // 복사한 객체의 주소(또는 객체)를 반환
	}
}
