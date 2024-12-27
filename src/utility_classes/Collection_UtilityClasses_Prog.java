package utility_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_UtilityClasses_Prog {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add("telangana");
		list.add("karnataka");
		list.add("kashmir");
		list.add("punjab");
		list.add("uttar pradesh");
		
		System.out.println(list);
		
	// to sort in ascending order
		Collections.sort(list);
		System.out.println(list);
		
		int status = Collections.binarySearch(list, "java");
		System.out.println(status);
				if (status>=0)
		{
			System.out.println("Key/Value is available in that list");
		}
				else
				{
					System.out.println("Key/Value is not available in that list");
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
