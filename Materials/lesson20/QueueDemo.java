package less.lesson20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		System.out.println("size: " + q.size());
		System.out.println(q.remove());
		System.out.println("size: " + q.size());
		System.out.println(q.peek());
		System.out.println("size: " + q.size());
		System.out.println(q.poll());
		System.out.println("size: " + q.size());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println("size: " + q.size());
		//q.remove();
		System.out.println(q.peek());
		System.out.println(q.poll());
		q.offer(null);
		System.out.println(q.size());
		System.out.println(q.remove());
	}
}
