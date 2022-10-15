package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class h {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Akhsy");
		map.put(2, "jadhav");
		map.put(3, "chaudhary");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

}
}