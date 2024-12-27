package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CollectionProg2 {

	public static void main(String[] args) {
		// TO ARRANGE IN ASCENDING ORDER
		
		int [] in = {567,8796,23,6,908,765};
		
		TreeSet set = new TreeSet();

		for(int i=0; i<in.length; i++)
		{
			set.add(in[i]);	
		}
		System.out.println(set);
		
		//TO FIND MIN AND MAX VALUE
		
		List list = new ArrayList<>(set);
		
		Object minVal = list.get(0);
		System.out.println("Min value is =  "+minVal);
		
		Object maxVal = list.get(list.size()-1);
		System.out.println("Max value is = "+maxVal);
	
	
	
	
	
	
	
	
	}

}
