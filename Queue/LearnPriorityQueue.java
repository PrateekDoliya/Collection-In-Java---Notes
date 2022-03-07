import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

class LearnPriorityQueue {
	public static void main(String[] args) {
			
			// BY DEFAULT MIN HEAP IS IMPLEMENTED

		// Queue<Integer> pq = new PriorityQueue<>();
		
		// pq.offer(40);
		// pq.offer(12);
		// pq.offer(24);
		// pq.offer(36);

		// System.out.println(pq);

		// pq.poll();

		// System.out.println(pq);

		// System.out.println(pq.peek());



		//CONVERTING THE PRIORITY QUEUE TO MAX HEAP

		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);

		System.out.println(pq);
		pq.poll();

		System.out.println(pq);

		System.out.println(pq.peek());
	}
}