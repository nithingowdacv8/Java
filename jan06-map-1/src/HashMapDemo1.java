import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> countryMap=new HashMap<>();
		countryMap.put(12, "India");
		countryMap.put(1, "USA");
		countryMap.put(14, "China");
		countryMap.put(15, "Japan");
		countryMap.put(51, "Pakistan");
		countryMap.put(14, "Bangladesh");
		countryMap.put(40, "Nepal");
		countryMap.put(20, "Argentina");
		countryMap.put(1, "United States of America");
		countryMap.put(11, "UK");
		
//		System.out.println(countryMap.size());
//		System.out.println(countryMap);
//		for(Entry<Integer, String> entry:countryMap.entrySet())
//		{
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//		}
		
		Set<Integer> keys = countryMap.keySet();
//		for(Integer key:keys)
//			System.out.println(key+"\t"+countryMap.get(key));
		
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(key+"\t"+countryMap.get(key));
		}
	}

}
