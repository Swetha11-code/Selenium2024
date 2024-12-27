package collectionframework_Rameshsoft;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetProg {

	public static void main(String[] args) {

		//Collection collection = new LinkedHashSet();
				//Set set = new LinkedHashSet();
		LinkedHashSet set = new LinkedHashSet(); //object created with size 16-default 
				
				set.add(5678);
				set.add(5678);
				set.add("PROGRAM");
				set.add(null);
				set.add("java");
				set.add("java");
				set.add("PACKAGE");
				set.add(6656);
				set.add(null);
				set.add(456.456);
				
				System.out.println(set);

				//insertion order is preserved
				
	}

}
