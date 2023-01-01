package s1_8_niv2_ex4_montseliz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Lambdas12 {

	public static void main(String[] args) {
		List<String> numbersAndStrings = Arrays.asList("1", "Girona", "45", "Barcelona", "964", "Lleida", "3567", "Tarragona", "10345", "Bilbao");

		System.out.println(sortedAlphabetically(numbersAndStrings));
		System.out.println(sortedE(numbersAndStrings));
		System.out.println(modifyA(numbersAndStrings));
		System.out.println(showNumbers(numbersAndStrings));
		
	}
	
	public static List<String> sortedAlphabetically (List<String> numbersAndStrings) {
		List<String> sortedAlphabetically = new ArrayList<>(); 
		
		sortedAlphabetically = numbersAndStrings.stream()
				.sorted((s1, s2) -> s1.charAt(0) - s2.charAt(0))
				.collect(Collectors.toList());
		
		return sortedAlphabetically; 
	}
	
	public static List<String> sortedE (List<String> numbersAndStrings) {
		List<String> sortedE = new ArrayList<>(); 
		
		sortedE = numbersAndStrings.stream()
				.sorted((s1, s2) -> {
					boolean s1E = s1.contains("e");
					boolean s2E = s2.contains("e");
					if (s1E && !s2E) {
						return -1;
					} else if (!s1E && s2E) {
						return 1; 
					} else {
						return 0; 
					}
				})
				.collect(Collectors.toList());
		
		return sortedE; 
	}
	
	public static List<String> modifyA (List<String> numbersAndStrings) {
		List<String> modifyA = new ArrayList<>(); 
		
		modifyA = numbersAndStrings.stream()
				.map(s -> s.replace('a', '4'))
				.collect(Collectors.toList());
				
		return modifyA;
	}
	
	public static List<String> showNumbers (List<String> numbersAndStrings) {
		List<String> showNumbers = new ArrayList<>(); 
		
		showNumbers = numbersAndStrings.stream()
				.filter(s -> s.chars().allMatch(Character::isDigit))
				.collect(Collectors.toList());
		
		return showNumbers;
	}

}
