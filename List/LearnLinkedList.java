import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class LearnLinkedList{
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list);
		list.add(40); // this will add 40 in the last of the list
		System.out.println(list);

		list.add(1, 50); // this will add 50 on 2nd index of the list
		System.out.println(list);

		List<Integer> newList = new LinkedList<>();
		newList.add(200);
		newList.add(300);

		list.addAll(newList); // this will add the new list element to the list in the last
		System.out.println(list);

		System.out.println(list.contains(500));// check weather list contains 500 or not

		System.out.println(list.get(1));  // return the element of 1 index


		// REMOVE ELEMENTS FROM THE LIST 

		// System.out.println(list);
		
		// list.remove(1); // this will return the element of 1 index
		// list.remove(Integer.valueOf(200)); // this will remodve the 200 from the list
		// list.clear(); // the will remove all elements of the list

		System.out.println(list);

		list.set(1, 50000); // this will update the value of 1 index to 50000

		System.out.println(list);



		// ITERATE TO THE LIST

		// USING FOR LOOP 

		for( int i = 0; i < list.size(); i++) {
			System.out.println("Elements are: " +list.get(i));
		}

		// USING FOR LOOP 

		for( Integer element : list) {
			System.out.println("Elements are: "+ element);
		}
		
		// USING Iterator

		Iterator <Integer> it = list.iterator(); 

		while(it.hasNext()) {
			System.out.println("Iterator are: "+ it.next());
		}



	}
}