package collectionframework_Rameshsoft;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProg {

	public static void main(String[] args) {
		//Collection collection = new PriorityQueue();
		//Queue queue = new PriorityQueue();
		
		PriorityQueue queue = new PriorityQueue();

		queue.add(456);
	//	queue.add(null); // PriorityQueue does not allow null 
		queue.add(8456);
		queue.add(45678);
		queue.add(45);
		queue.add(6);
		queue.add(456098);
		//queue.add("java"); //PriorityQueue does not allow heterogenous elements
		
		System.out.println(queue);
		
		PriorityQueue queue1 = new PriorityQueue();
		
		queue1.add("java");
		queue1.add("array list");
		queue1.add("treeset");
		queue1.add("queue");
		
		System.out.println(queue1);
		
		
		
	}

}
