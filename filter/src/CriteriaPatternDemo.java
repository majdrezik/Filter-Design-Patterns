
import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		int id = 0;
		students.add(new Student("Alex", "male", ++id, 79.5));
		students.add(new Student("Bob", "male", ++id, 60));
		students.add(new Student("Alice", "female", ++id, 55));
		students.add(new Student("Mark", "male", ++id, 100));
		students.add(new Student("Steve", "male", ++id, 95));
		students.add(new Student("Diana", "female", ++id, 29));
		students.add(new Student("Hans", "male", ++id, 38));
		students.add(new Student("Noemi", "female", ++id, 85));
		students.add(new Student("Laila", "female", ++id, 61));
		students.add(new Student("Elina", "female", ++id, 49));
		students.add(new Student("Ron", "male", ++id, 37));
	}

	public static void printStudents(List<Student> students) {

		for (Student student : students) {
			System.out.println("Student : [ Name : " + student.getName() + ", Gender : " + student.getGender()
					+ ", ID : " + student.getId() + ", Final Grade: " + student.getFinalGrade() + " ]");
		}
	}
}