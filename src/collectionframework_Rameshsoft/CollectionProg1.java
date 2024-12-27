package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionProg1 {

	public static void main(String[] args) {
		//HOW TO REMOVE DUPLICATES IN SET PROG
		
		List list = new ArrayList();
		list.add("java");
		list.add("selenium");
		list.add("java");
		list.add(1234);
		list.add("program");
		list.add("java");
		list.add("new");
		list.add("list");
		System.out.println(list);
		
		//Set set = new HashSet(list);
		//System.out.println(set);
		
		/*Set set = new HashSet();
		set.addAll(list);
		System.out.println(set);
		*/
		
	/*	Set set = new HashSet<>();
		for(int i=0; i<list.size(); i++)
		{
		Object obj = list.get(i);
		set.add(obj);
		}
		System.out.println(set);
		*/
			
			
		Set set = new HashSet<>();
		List dup = new ArrayList<>();
		
				
		for(int i=0; i<list.size(); i++)
		{
		Object obj = list.get(i);
		boolean status = set.add(obj);
		if(status) {
			;;;;;
		}
		else {
			dup.add(obj);
			
		}
		}
		System.out.println("After removal elements are = "+set);
		System.out.println("Removed elements are = "+dup);
		

	}

}
