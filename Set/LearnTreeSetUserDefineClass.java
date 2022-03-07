import java.util.Set;
import java.util.TreeSet;

class LearnTreeSetUserDefineClass {
	public static void main(String[] args) {
		Set <Student> students = new TreeSet<>();

		Student s1 = new Student(101,"Ajay");
		Student s2 = new Student(102, "Jay");
		Student s3 = new Student(103, "Vijay");
		Student s4 = new Student(104, "Raj");
		Student s5 = new Student(101, "LRaj");

		students.add(s1);
		students.add(s4);
		students.add(s2);
		students.add(s3);
		students.add(s5);

		System.out.println(students);
	}
}

class Student implements Comparable<Student> {
	int roll;
	String name;
	Student(int roll, String name) {
		this.name = name;
		this.roll = roll;
	}

	public String toString() {
		return "Student " + roll +" "+ name;
	}

	@Override
	public int compareTo(Student obj)
	{
		// System.out.println("this: " +this);
		// System.out.println("that: " +obj);
		return (this.roll - obj.roll);
	}

}