import java.util.Map;
import java.util.TreeMap;

class LearnTreeMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new TreeMap<>();

		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);

		// if(!numbers.containsKey("Two"))
		// 	numbers.put("Two", 23);

		// numbers.putIfAbsent("Two", 23);

		// System.out.println(numbers);

		// System.out.println(numbers.containsValue(3));

		// System.out.println(numbers.isEmpty());

		// numbers.remove("Three");

		// numbers.clear();

		System.out.println(numbers);


		// for(Map.Entry<String, Integer> i : numbers.entrySet()){
		// 	System.out.println(i.getKey()+" " +i.getValue());
		// }

		// for(String i: numbers.keySet()){
		// 	System.out.println(i);
		// }

		// for(Integer i: numbers.values()){
		// 	System.out.println(i);
		// }

	}
}