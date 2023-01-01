package s1_8_niv1_ex4_montseliz;

import java.util.List;

public class Main_Lambdas4 {

	public static void main(String[] args) {
		List<String> months = List.of("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"); 

		months.forEach(System.out::println);

	}

}
