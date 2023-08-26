package enumexam.exercise;

public class PTMemberVO {
	
	private String ID;
	private String name;
	private int height;
	private int weight;
	private Gender gender;
	
	public PTMemberVO() {
	}

	public PTMemberVO(String name, int height, int weight, String gender) {
		
		if(height <= 0) throw new PositiveNumberException("키는 0 보다 큰 수를 입력해야 합니다!!");
		if(weight <= 0) throw new PositiveNumberException("몸무게는 0 보다 큰 수를 입력해야 합니다!!");
		
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = Gender.valueOfTerm(gender);
	}

	public void setId(String id) {
		
		if(id == null) throw new IDFormatException("ID가 null 입니다!!");
		if(id.length() < 8 || id.length() > 20) throw new IDFormatException("ID는 8자 이상 20자 이하로 생성해야 합니다!!");

		this.ID = id;
	}

	@Override
	public String toString() {
		return "PTMember [id=" + ID + ", name=" + name + ", height=" + height + ", weight=" + weight + ", gender=" + gender + "]";
	}
	
}
