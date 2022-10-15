package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterating {

	public static void main(String[] args) {
		
		Map map= new HashMap<>();
		map.put(1, "Akshay");
		map.put(2, "Jadhav");
		map.put(3, "Chaudhary");
		map.put(4, "chaudhary baba");
		
		System.out.println("iterator using");
//		Iterator<Entry<Integer, String>> mp= map.entrySet().iterator();
//		while(mp.hasNext())
//		{
//			Entry<Integer, String> entry=mp.next();
//			System.out.print(entry.getKey()+" ");
//			System.out.println(entry.getValue());
//		}
//		Iterator<Entry<Integer, String>> mp=map.entrySet().iterator();
//		while(mp.hasNext())
//		{
//			Entry<Integer, String> it=mp.next();
//			System.out.println(it.getKey()+" "+it.getValue());
//		}
	Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
	while(it.hasNext()) {
	Entry<Integer, String> itr=it.next();
	System.out.println(itr.getKey()+" "+itr.getValue());
	
	}
	}
}
