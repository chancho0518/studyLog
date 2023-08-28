package datamanagement.exercise;

import java.util.Optional;

public class OptionalThrow {

	public static void main(String[] args) {
		String str = null;
		Optional<String> stringOptional = Optional.ofNullable(str);

		int lenght = stringOptional.orElseThrow(() -> {throw new CustomException("CustomException 발생!!!");}).length();
		
		System.out.println(lenght);
	}
}
