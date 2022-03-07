import java.util.ArrayDeque;

class LearnArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();

		adq.offer(23); //add the element in last

		adq.offerFirst(12); //add the element in first

		adq.offerLast(45); //add the element in last

		adq.offer(26);

		System.out.println(adq);

		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());

		System.out.println(adq.poll());
		System.out.println("Poll() "+ adq);

		System.out.println(adq.pollFirst());
		System.out.println("PollFirst() "+ adq);

		System.out.println(adq.pollLast());
		System.out.println("PollLast() "+ adq);
	}
}