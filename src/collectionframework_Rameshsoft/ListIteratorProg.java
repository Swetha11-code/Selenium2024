package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProg {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("program");
		list.add("java");
		list.add("selenium");
		list.add("testing");
		list.add("program");
		list.add("java");
		
		ListIterator itr = list.listIterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			String str = (String) obj;
			if(str.equalsIgnoreCase("hardwork"))
			{
				System.out.println("JOB");
			}
		System.out.println(str);
		
		
		
		
		}
		
		
		
		
		
		
	}

}
