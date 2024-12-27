package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericMethods_Prog {

	public List hardwork() {
List list = new ArrayList<>();
for(int i=0; i<=5; i++)
{
	list.add(i);
}
return list;
	}
	public Set<String> practice() {
		Set<String> set = new HashSet<String>();
set.add("java");
set.add("new");
set.add("old");
set.add("far");
return set;
	}	

	public  void job(Map<String, Integer> map) {
System.out.println(map);
	}
		
	public static void main(String[] args) {
		GenericMethods_Prog prog = new GenericMethods_Prog();
List list = prog.hardwork();
System.out.println(list);

Set<String> set = prog.practice();
System.out.println(set);

Map<String, Integer> map1 = new HashMap<String, Integer>();
map1.put("java", 86);
map1.put("program", 987);
map1.put("school", 657);
map1.put("food", 6);
prog.job(map1);

	}

}
