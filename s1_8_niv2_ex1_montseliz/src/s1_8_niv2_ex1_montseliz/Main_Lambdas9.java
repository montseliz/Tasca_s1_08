package s1_8_niv2_ex1_montseliz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Lambdas9 {

	public static void main(String[] args) {
		List<String> names = List.of("Ana", "Pau", "Albert", "Elisabeth", "Aurora", "Ricard", "Joan", "Clara", "Miquel", "Ani"); 
		System.out.println(resultMethod(names));

	}
		public static List<String> resultMethod(List<String> names) {
			List<String> result = new ArrayList<>(); 
			
			result = names.stream()
					.filter(name -> name.contains("A"))
					.filter(name -> name.length() == 3)
					.collect(Collectors.toList());
			
			return result; 
		}

}
