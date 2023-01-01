package s1_8_niv3_ex1_montseliz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Lambdas13 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>(); 
		students.add(new Student("Marta", 24, "PHP", 8.3f));
		students.add(new Student("Pau", 32, "JAVA", 7.8f));
		students.add(new Student("Aina", 17, "JAVA", 4.4f)); 
		students.add(new Student("Miquel", 45, "PHP", 4.8f));
		students.add(new Student("Paula", 16, "JAVA", 5.6f));
		students.add(new Student("Mariona", 19, "JAVA", 8.4f));
		students.add(new Student("Ricard", 35, "PHP", 9.2f));
		students.add(new Student("Guillem", 16, "PHP", 6.6f));
		students.add(new Student("Rita", 26, "JAVA", 7.8f));
		students.add(new Student("Albert", 30, "PHP", 7.3f));
		
		System.out.println("Nom i edat de cada alumne:");
		showList(students);
		
		System.out.println("\nAlumnes que comencen per A:");
		studentsA(students);
		
		System.out.println("\nAlumnes amb una nota de 5 o superior:");
		studentsHighGrade(students);
		
		System.out.println("\nAlumnes amb una nota de 5 o superior i que no són de PHP:");
		studentsHighGradeNotPHP(students);
		
		System.out.println("\nAlumnes de JAVA i majors d'edat:");
		studentsJava(students);
	}
	
	public static void showList(List<Student> students) {
		students.stream().forEach(s -> System.out.println(s.getName() + ", " + s.getAge()));		
	}
	
	public static void studentsA(List<Student> students) {
		List<Student> studentsA = new ArrayList<>(); 
		
		studentsA = students.stream()
				.filter(s -> s.getName().startsWith("A"))
				.collect(Collectors.toList());
		
		studentsA.forEach(s -> System.out.println(s.toString()));
	}
	
	public static void studentsHighGrade(List<Student> students) {
		students.stream()
		.filter(s -> s.getGrade() >= 5.0f)	
		.forEach(s -> System.out.println(s.toString()));
	}
	
	public static void studentsHighGradeNotPHP(List<Student> students) {
		students.stream()
		.filter(s -> s.getGrade() >= 5.0f)
		.filter(s -> s.getCourse() != "PHP")
		.forEach(s -> System.out.println(s.toString()));
	}
	
	public static void studentsJava(List<Student> students) {
		students.stream()
		.filter(s -> s.getCourse() == "JAVA")
		.filter(s -> s.getAge() >= 18)
		.forEach(s -> System.out.println(s.toString()));
	}
	
}
