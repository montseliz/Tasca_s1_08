package s1_8_niv1_ex6_montseliz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Lambdas6 {

	public static void main(String[] args) {
		System.out.println(listMethod());
	}
	
	public static List<String> listMethod() {
		List<String> generics = List.of("Anna", "Pau", "23", "46", "Meritxell", "Ricard", "8906", "25677", "Miquel", "Ona"); 
		
		List<String> sortedStrings = new ArrayList<>(); 
		
		sortedStrings = generics.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
	
		return sortedStrings; 
	}


}
