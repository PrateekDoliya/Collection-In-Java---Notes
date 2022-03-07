import java.util.Stack;

class LearnStack {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();

		animals.push("Lion");
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		System.out.println("Stack: "+ animals);

		System.out.println(animals.peek());  // show the topmost element of stack

		animals.pop(); 

		System.out.println(animals.peek());

		System.out.println("Stack: "+ animals);

	}
}