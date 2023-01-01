package s1_8_niv2_ex3_montseliz;

public class Main_Lambdas11 {

	public static void main(String[] args) {
		
		Operation addition = (value1, value2) -> value1 + value2; 
		Operation subtraction = (value1, value2) -> value1 - value2; 
		Operation multiplication = (value1, value2) -> value1 * value2; 
		Operation division = (value1, value2) -> value1 / value2; 
		
		System.out.println(addition.operation(4.7f, 2.8f));
		System.out.println(subtraction.operation(4.7f, 2.8f));
		System.out.println(multiplication.operation(4.7f, 2.8f));
		System.out.println(division.operation(4.7f, 2.8f));
		
	}

}
