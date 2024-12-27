package collectionframework_Rameshsoft;

import java.util.HashSet;
import java.util.Set;

public class ForEachCollection_Prog {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add("program");
		set.add("java");
		set.add("selenium");
		set.add("testing");
		set.add("program");
		set.add("java");

		for(Object obj : set)
		{
			String str = (String) obj;
			if(str.contains("ja")) {
				System.out.println(" Do practice");
			}
			System.out.println(str);
		}
		
		
		
		
		
		
		
	}

}
