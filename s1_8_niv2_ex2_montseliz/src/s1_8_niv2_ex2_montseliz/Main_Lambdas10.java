package s1_8_niv2_ex2_montseliz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Lambdas10 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 30, 46, 578, 653, 7496, 8452, 94553, 10433); 
		System.out.println(listMethod(numbers));
	}
	
	public static String listMethod(List<Integer> numbers) {
		
		String numbersToStr = numbers.stream()
				.map(number -> number % 2 == 0 ? "e" + number :"o" + number)
				.map(number -> number.toString())
				.collect(Collectors.joining(", ")); 
		
		return numbersToStr;
		
	}
	
}