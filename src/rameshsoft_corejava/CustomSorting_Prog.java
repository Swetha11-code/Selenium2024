package rameshsoft_corejava;

import java.util.Comparator;
import java.util.TreeSet;

class CustSort implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (int) o1;
		Integer i2 = (int) o2;
		//System.out.println("76543");
		//return i1.compareTo(i2); // asc order
		//return -i1.compareTo(i2); // desc order
		//return i2.compareTo(i1); // desc order
		return -i2.compareTo(i1); // asc order
		
	}
	
}

public class CustomSorting_Prog {

	public static void main(String[] args) {
CustSort custSort = new CustSort();
		
TreeSet set = new TreeSet<>(custSort);
 set.add(765);
 set.add(987);
 set.add(876);
 set.add(56);
 set.add(7);
 
 System.out.println(set);

	}

}




