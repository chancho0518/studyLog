package datamanagement.exercise;

public class PTMember {

	public static void main(String[] args) {
		
		PTMemberVO member = new PTMemberVO("홍길동", 180, 93, "Male");
		
		try {
			member.setId("abcdefdsd");
		} catch (Exception e) {
			// 고객에게 알람 보내기
		}
		
		System.out.println(member);

	}

}
