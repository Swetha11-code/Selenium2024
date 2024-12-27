package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorProg {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("program");
		list.add("java");
		list.add("selenium");
		list.add("testing");
		list.add("program");
		list.add("java");

	/*	Set set = new HashSet<>();
		set.add("program");
		set.add("java");
		set.add("selenium");
		set.add("testing");
		set.add("program");
		set.add("java");
		*/
		
        Iterator itr =list.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			String str = (String) obj;
		if(str.equalsIgnoreCase("hardwork"))
		{
			System.out.println("JOBS");
		}
		System.out.println(str);
		
		}
		
		
		
		
		
	}

}
