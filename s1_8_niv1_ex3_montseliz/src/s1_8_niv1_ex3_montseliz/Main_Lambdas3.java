package s1_8_niv1_ex3_montseliz;

import java.util.List;

public class Main_Lambdas3 {

	public static void main(String[] args) {
		
		List<String> months = List.of("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"); 

		months.forEach(month -> System.out.println(month));
		
		/*Thread thread = new Thread(
			() -> System.out.println(months)
		);
		thread.run();*/
	}

}
