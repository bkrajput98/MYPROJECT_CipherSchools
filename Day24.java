import java.util.*;

class Test {
	public static void main(String[] args) {
		PriorityQueue <String> pq = new PriorityQueue <String> ();

		pq.add("Chirag");
		pq.add("Piyush");
		pq.add("Jitin");
		pq.add("Yuvraj");
		pq.add("Nithin");
		pq.add("Ghanshyam");

		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		//System.out.println(pq);
	}

}