package s1_8_niv1_ex8_montseliz;

public class Main_Lambdas8 {

	public static void main(String[] args) {
		 String city = "Barcelona"; 
		
		 Reverse cityReverse = s -> new StringBuilder(s).reverse().toString();
		 System.out.println(cityReverse.reverse(city));

	}

}
