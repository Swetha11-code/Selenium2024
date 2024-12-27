package collectionframework_Rameshsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Generic_Prog {

	public static void main(String[] args) {

List<String> list = new ArrayList<String>();
list.add("hike");
list.add("java");
list.add("job");
list.add("replacement");
//list.add(4567);
//System.out.println(list);

for(String str : list )
{
	System.out.println(str);
}

Set<Integer> set = new HashSet<Integer>();
set.add(765);
set.add(987);
set.add(123);
set.add(908);

Iterator<Integer> itr = set.iterator();

while(itr.hasNext())
{
	Integer i = itr.next();
	System.out.println(i);
}

Map<String, String> map = new HashMap<String, String>();
map.put("new", "old");
map.put("near", "far");
map.put("up", "down");
map.put("here", "there");
System.out.println(map);








	}

}
