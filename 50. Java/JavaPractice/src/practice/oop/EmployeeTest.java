package practice.oop;

//일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력
public class EmployeeTest {
	public static void main(String[] args) {
		RempVO vo = new RempVO();
		
		vo.name = "홍길동";
		vo.age = 42;
		vo.phone = "010-1111-2222";
		vo.dept = "홍보부";
		vo.empDate = "2023-07-11";
		vo.dept = "마케팅";
		vo.marriage = true;
		
		System.out.println(vo.toString());
	}
}
