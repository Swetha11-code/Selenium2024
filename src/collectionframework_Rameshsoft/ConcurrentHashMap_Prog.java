package collectionframework_Rameshsoft;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_Prog {

	public static void main(String[] args) {
		ConcurrentHashMap map = new ConcurrentHashMap();
	//	Map map = new Map();
		
		map.put(567, "yes");
		map.put(879, "new");
	//	map.put(null, null); //concurrentHashMap does not allow null
		map.put(9, "987");
		map.put("no", "selenium");
		
		System.out.println(map);

		Object obj1 = map.get("java");
		System.out.println(obj1);
		
		Object obj2 = map.getOrDefault("java4", "JOB");
		System.out.println(obj2);
		
		boolean status = map.containsKey("java");
		System.out.println(status);
		
		boolean status1 = map.containsKey("java");
		System.out.println(status1);
		
		Set setKeys = map.keySet();
		System.out.println(setKeys);
		
		for(Object obj : setKeys)
		{
			System.out.println(setKeys);
		}
		
		Set entries = map.keySet();
		System.out.println(entries);
		
		Collection values = map.values();
		System.out.println(values);
		
	}

}
