import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

class LearnHashSetUserDefineClass {

	public static void main(String[] args) {
		
		Student s1 = new Student(105, "Ajay");
		Student s2 = new Student(102, "Rohit");
		Student s3 = new Student(103, "Jay");
		Student s4 = new Student(104, "Vijay");
		Student s5 = new Student(101, "Ajay");
		Set<Student> students = new HashSet<>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		System.out.println(students);
		students.add(s5);
		System.out.println(students);

		// System.out.println(s1==s5);
		// System.out.println(s1.equals(s5));

	}

}

class Student {
	int roll;
	String name;
	Student(int roll, String name) {
		this.name = name;
		this.roll = roll;
	}

	public String toString() {
		return this.roll +" "+ this.name;
	}

	@Override
	public boolean equals(Object obj) {
		Student that = (Student) obj;
		// return this.name.equals(that.name);
		return this.roll == that.roll && this.name.equals(that.name);
	}

	@Override
	public int hashCode(){
		// return name.hashCode();
		// return Objects.hash(roll+name);
		return roll + name.hashCode();
	}

}