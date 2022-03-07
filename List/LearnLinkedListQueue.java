import java.util.Queue;
import java.util.LinkedList;

class LearnLinkedListQueue{
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(12); // adds element to the queue
		queue.offer(24);
		queue.offer(36);

		System.out.println(queue);
		System.out.println(queue.poll()); // removes the element from the queue

		System.out.println(queue);
		System.out.println(queue.peek()); // give next element in a queue to remove

		queue.clear();
		System.out.println(queue);

		System.out.println(queue.poll()); // return null
		// System.out.println(queue.remove()); // throws an exception

		System.out.println(queue.peek()); // return null
		// System.out.println(queue.element()); // throws an exception

	}
}

// Some commonly used method of queue interface:

// 1)Add(): insert the specified element into the queue. If the task is successfull add() returns true, if not throws an exception.

// 2)offer(): insert the specified element into the queue. If the task is successfull add() returns true, if not returns false.

// 3)element(): Returns the head of the queue. Throws an exception if the queue is empty;

// 4)peek(): Returns the head of the queue. Returns null if the queue is empty;

// 5)remove(): Returns and remove the head of the queue. Throws an exception if the queue is empty

// 6)poll(): Returns and remove the head of the queue. Returns null if the queue is empty
