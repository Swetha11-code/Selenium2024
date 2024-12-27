package collectionframework_Rameshsoft;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProg {

	public static void main(String[] args) {
		
		//Collection collection = new Collection();
		//List list = new List();
		//Collection collection = new LinkedList();
		//List list = new LinkedList();
		//ArrayList list = new ArrayList();
		LinkedList list = new LinkedList();
		
		list.add(345);
		list.add("PROGRAM");
		list.add(678.908);
		list.add("JOB");
		list.add(6789);
		list.add("PRACTICE");
		list.add(789);
		list.add("HIKE");
		list.add(280);
		list.add("PROGRAM1");
		list.add("PLACEMENT");
		list.add(0, "JOB");
		list.addFirst("PRACTICE WELL");
		list.addLast("GET JOB");
		
		
		System.out.println(list);
		
		Object obj0 = list.get(0);
		System.out.println(obj0);//JOB
		
		Object obj2 = list.get(2);
		System.out.println(obj2);//PROGRAM
		
		Object obj7= list.get(7);
		System.out.println(obj7);//789
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		
		
		
		
		
	}

}
