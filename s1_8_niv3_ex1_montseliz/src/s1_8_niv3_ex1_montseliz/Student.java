package s1_8_niv3_ex1_montseliz;

public class Student {

	private String name; 
	private int age; 
	private String course; 
	private float grade; 
	
	public Student() {
	}
	
	public Student(String name, int age, String course, float grade) {
		this.name = name; 
		this.age = age; 
		this.course = course; 
		this.grade = grade; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "L'estudiant " + name + " té " + age + " anys, estudia " + course + " i té un " + grade + " de nota.";
	}
	
	
	
	
}
