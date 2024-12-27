package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListProg {

	public static void main(String[] args) {
	//Collection collection = new Collection();
	//List list = new List();
	//Collection collection = new ArrayList();
	//List list = new ArrayList();
		ArrayList list = new ArrayList();
		
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
		System.out.println(list);
		
		Object obj0 = list.get(0);
		System.out.println(obj0);//JOB
		
		Object obj2 = list.get(2);
		System.out.println(obj2);//PROGRAM
		
		Object obj7= list.get(7);
		System.out.println(obj7);
		
		
		
	}

}
