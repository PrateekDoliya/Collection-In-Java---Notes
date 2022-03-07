import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class LearnArrayList {
	public static void main(String[] args) {
		
		// ADD ELEMENT TO THE LIST

		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		list.add(4); // this will add 4 at last or list
		System.out.println(list);

		list.add(1, 50); // this will add 50 at 1 index
		System.out.println(list);

		List<Integer> newList = new ArrayList<>();
		newList.add(150);
		newList.add(160);

		list.addAll(newList);
		System.out.println(list);

		System.out.println(list.get(1)); // return the element of 1 index


		// REMOVE THE ELEMENT FROM THE LIST



		// list.remove(1); // this will remove the element from 1 index
		// System.out.println(list);

		// // list.remove(new Integer(150)); // this will remove the element 150 from list
		// list.remove(Integer.valueOf(150)); // this will remove the element 150 from list
		// System.out.println(list);

		// list.clear();
		// System.out.println(list);



		// list.set(2, 100000); //this will update the value of 2 index
		// System.out.println(list);

		// System.out.println(list.contains(500)); // this will check thata 500 is present or not

		
		//Iterate To List

		// USING FOR LOOP

		// for(int i=0; i < list.size(); i++) {
		// 	System.out.println("Element is: "+ list.get(i));
		// }

		// USING  FOR EACH LOOP

		// for(Integer element : list) {
		// 	System.out.println("List Element is:" + element);
		// }

		 // USING ITERATOR 

		Iterator<Integer> it = list.iterator();

		while(it.hasNext()) {
			System.out.println("Iterator : "+ it.next());
		}

	}
}