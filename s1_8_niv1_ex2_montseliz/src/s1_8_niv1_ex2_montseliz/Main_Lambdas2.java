package s1_8_niv1_ex2_montseliz;

import java.util.*;
import java.util.stream.Collectors;

public class Main_Lambdas2 {
	
	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("Montse", "Anna", "Lluis", "Marc", "Carla", "Mario", "Mireia", "Roger", "Oscar", "Olivia");

		List<String> namesWithO = new ArrayList<>(); 
		
		namesWithO = names.stream()
				.filter(s -> s.toLowerCase().contains("o"))
				.filter(s -> s.length() > 5)
				.collect(Collectors.toList());
		
		System.out.println(namesWithO);
		
	}

}
