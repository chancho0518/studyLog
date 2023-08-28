package datamanagement.exercise;

import java.util.Optional;

public class OptionalDefault {

	public static void main(String[] args) {
		
		String str = null;
		Optional<String> optionalStr = Optional.ofNullable(str);
		
		int length = optionalStr.orElseGet(() -> "")
								.length();

		System.out.println(length);
	}

}
