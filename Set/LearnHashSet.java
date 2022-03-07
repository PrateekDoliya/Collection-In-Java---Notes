import java.util.Set;
import java.util.HashSet;

class LearnHashSet{
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<> ();

		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);

		// set.add(54);

		System.out.println(set);

		set.remove(54);

		System.out.println(set);

		System.out.println(set.contains(21));

		System.out.println(set.isEmpty());

		System.out.println(set.size());

		set.clear();

		System.out.println(set);

		System.out.println(set.isEmpty());
	}
}