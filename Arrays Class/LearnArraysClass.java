import java.util.Arrays;

class LearnArraysClass {

	public static void main(String[] args) {
		int [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int index = Arrays.binarySearch(numbers, 4);

		System.out.println("Index of element 4 in ary is: "+ index);
	}
}